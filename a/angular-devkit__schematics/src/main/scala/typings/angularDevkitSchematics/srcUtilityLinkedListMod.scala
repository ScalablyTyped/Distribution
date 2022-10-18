package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.anon.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilityLinkedListMod {
  
  @JSImport("@angular-devkit/schematics/src/utility/linked-list", "LinkedList")
  @js.native
  open class LinkedList[T /* <: Next[T] */] protected () extends StObject {
    def this(_head: T) = this()
    
    /* private */ var _head: Any = js.native
    
    def find(predicate: js.Function2[/* value */ T, /* index */ js.UndefOr[Double], Boolean]): T | Null = js.native
    
    def forEach(visitor: js.Function2[/* value */ T, /* index */ js.UndefOr[Double], Unit]): Unit = js.native
    
    def get(l: Double): T | Null = js.native
    
    def head: T = js.native
    
    def length: Double = js.native
    
    def reduce[R](accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ js.UndefOr[Double], R], seed: R): R = js.native
  }
}
