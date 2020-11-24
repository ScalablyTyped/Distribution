package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryOperator extends js.Object
@JSImport("@angular/compiler/src/output/output_ast", "BinaryOperator")
@js.native
object BinaryOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryOperator with Double] = js.native
  
  @js.native
  sealed trait And extends BinaryOperator
  /* 9 */ @js.native
  object And extends TopLevel[And with Double]
  
  @js.native
  sealed trait Bigger extends BinaryOperator
  /* 14 */ @js.native
  object Bigger extends TopLevel[Bigger with Double]
  
  @js.native
  sealed trait BiggerEquals extends BinaryOperator
  /* 15 */ @js.native
  object BiggerEquals extends TopLevel[BiggerEquals with Double]
  
  @js.native
  sealed trait BitwiseAnd extends BinaryOperator
  /* 11 */ @js.native
  object BitwiseAnd extends TopLevel[BitwiseAnd with Double]
  
  @js.native
  sealed trait Divide extends BinaryOperator
  /* 6 */ @js.native
  object Divide extends TopLevel[Divide with Double]
  
  @js.native
  sealed trait Equals extends BinaryOperator
  /* 0 */ @js.native
  object Equals extends TopLevel[Equals with Double]
  
  @js.native
  sealed trait Identical extends BinaryOperator
  /* 2 */ @js.native
  object Identical extends TopLevel[Identical with Double]
  
  @js.native
  sealed trait Lower extends BinaryOperator
  /* 12 */ @js.native
  object Lower extends TopLevel[Lower with Double]
  
  @js.native
  sealed trait LowerEquals extends BinaryOperator
  /* 13 */ @js.native
  object LowerEquals extends TopLevel[LowerEquals with Double]
  
  @js.native
  sealed trait Minus extends BinaryOperator
  /* 4 */ @js.native
  object Minus extends TopLevel[Minus with Double]
  
  @js.native
  sealed trait Modulo extends BinaryOperator
  /* 8 */ @js.native
  object Modulo extends TopLevel[Modulo with Double]
  
  @js.native
  sealed trait Multiply extends BinaryOperator
  /* 7 */ @js.native
  object Multiply extends TopLevel[Multiply with Double]
  
  @js.native
  sealed trait NotEquals extends BinaryOperator
  /* 1 */ @js.native
  object NotEquals extends TopLevel[NotEquals with Double]
  
  @js.native
  sealed trait NotIdentical extends BinaryOperator
  /* 3 */ @js.native
  object NotIdentical extends TopLevel[NotIdentical with Double]
  
  @js.native
  sealed trait Or extends BinaryOperator
  /* 10 */ @js.native
  object Or extends TopLevel[Or with Double]
  
  @js.native
  sealed trait Plus extends BinaryOperator
  /* 5 */ @js.native
  object Plus extends TopLevel[Plus with Double]
}
