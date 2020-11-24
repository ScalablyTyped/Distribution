package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnaryOperator extends js.Object
@JSImport("@angular/compiler/src/output/output_ast", "UnaryOperator")
@js.native
object UnaryOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnaryOperator with Double] = js.native
  
  @js.native
  sealed trait Minus extends UnaryOperator
  /* 0 */ @js.native
  object Minus extends TopLevel[Minus with Double]
  
  @js.native
  sealed trait Plus extends UnaryOperator
  /* 1 */ @js.native
  object Plus extends TopLevel[Plus with Double]
}
