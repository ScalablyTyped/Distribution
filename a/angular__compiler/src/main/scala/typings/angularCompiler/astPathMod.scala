package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ast_path", JSImport.Namespace)
@js.native
object astPathMod extends js.Object {
  @js.native
  class AstPath[T] protected () extends js.Object {
    def this(path: js.Array[T]) = this()
    def this(path: js.Array[T], position: Double) = this()
    val empty: Boolean = js.native
    val head: js.UndefOr[T] = js.native
    var path: js.Any = js.native
    var position: Double = js.native
    val tail: js.UndefOr[T] = js.native
    def childOf(node: T): js.UndefOr[T] = js.native
    def first[N /* <: T */](ctor: AnonArgs[N]): js.UndefOr[N] = js.native
    def parentOf(): js.UndefOr[T] = js.native
    def parentOf(node: T): js.UndefOr[T] = js.native
    def pop(): T = js.native
    def push(node: T): Unit = js.native
  }
  
}

