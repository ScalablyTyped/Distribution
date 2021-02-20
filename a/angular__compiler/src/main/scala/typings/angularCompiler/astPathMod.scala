package typings.angularCompiler

import typings.angularCompiler.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astPathMod {
  
  @JSImport("@angular/compiler/src/ast_path", "AstPath")
  @js.native
  class AstPath[T] protected () extends StObject {
    def this(path: js.Array[T]) = this()
    def this(path: js.Array[T], position: Double) = this()
    
    def childOf(node: T): js.UndefOr[T] = js.native
    
    def empty: Boolean = js.native
    
    def first[N /* <: T */](ctor: Instantiable[N, T]): js.UndefOr[N] = js.native
    
    def head: js.UndefOr[T] = js.native
    
    def parentOf(): js.UndefOr[T] = js.native
    def parentOf(node: T): js.UndefOr[T] = js.native
    
    var path: js.Any = js.native
    
    def pop(): T = js.native
    
    var position: Double = js.native
    
    def push(node: T): Unit = js.native
    
    def tail: js.UndefOr[T] = js.native
  }
}
