package typings
package atAngularCompilerLib.srcAstUnderscorePathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ast_path", "AstPath")
@js.native
class AstPath[T] protected () extends js.Object {
  def this(path: js.Array[T]) = this()
  def this(path: js.Array[T], position: scala.Double) = this()
  val empty: scala.Boolean = js.native
  val head: js.UndefOr[T] = js.native
  var path: js.Any = js.native
  var position: scala.Double = js.native
  val tail: js.UndefOr[T] = js.native
  def childOf(node: T): js.UndefOr[T] = js.native
  def first[N /* <: T */](ctor: atAngularCompilerLib.Anon_Args[N]): js.UndefOr[N] = js.native
  def parentOf(): js.UndefOr[T] = js.native
  def parentOf(node: T): js.UndefOr[T] = js.native
  def pop(): T = js.native
  def push(node: T): scala.Unit = js.native
}

