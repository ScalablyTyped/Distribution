package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnaryOperator extends StObject
@JSImport("@angular/compiler", "UnaryOperator")
@js.native
object UnaryOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnaryOperator & Double] = js.native
  
  @js.native
  sealed trait Minus
    extends StObject
       with UnaryOperator
  /* 0 */ val Minus: typings.angularCompiler.mod.UnaryOperator.Minus & Double = js.native
  
  @js.native
  sealed trait Plus
    extends StObject
       with UnaryOperator
  /* 1 */ val Plus: typings.angularCompiler.mod.UnaryOperator.Plus & Double = js.native
}
