package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryOperator extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "BinaryOperator")
@js.native
object BinaryOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryOperator with Double] = js.native
  
  @js.native
  sealed trait And extends BinaryOperator
  /* 9 */ val And: typings.angularCompiler.outputAstMod.BinaryOperator.And with Double = js.native
  
  @js.native
  sealed trait Bigger extends BinaryOperator
  /* 14 */ val Bigger: typings.angularCompiler.outputAstMod.BinaryOperator.Bigger with Double = js.native
  
  @js.native
  sealed trait BiggerEquals extends BinaryOperator
  /* 15 */ val BiggerEquals: typings.angularCompiler.outputAstMod.BinaryOperator.BiggerEquals with Double = js.native
  
  @js.native
  sealed trait BitwiseAnd extends BinaryOperator
  /* 11 */ val BitwiseAnd: typings.angularCompiler.outputAstMod.BinaryOperator.BitwiseAnd with Double = js.native
  
  @js.native
  sealed trait Divide extends BinaryOperator
  /* 6 */ val Divide: typings.angularCompiler.outputAstMod.BinaryOperator.Divide with Double = js.native
  
  @js.native
  sealed trait Equals extends BinaryOperator
  /* 0 */ val Equals: typings.angularCompiler.outputAstMod.BinaryOperator.Equals with Double = js.native
  
  @js.native
  sealed trait Identical extends BinaryOperator
  /* 2 */ val Identical: typings.angularCompiler.outputAstMod.BinaryOperator.Identical with Double = js.native
  
  @js.native
  sealed trait Lower extends BinaryOperator
  /* 12 */ val Lower: typings.angularCompiler.outputAstMod.BinaryOperator.Lower with Double = js.native
  
  @js.native
  sealed trait LowerEquals extends BinaryOperator
  /* 13 */ val LowerEquals: typings.angularCompiler.outputAstMod.BinaryOperator.LowerEquals with Double = js.native
  
  @js.native
  sealed trait Minus extends BinaryOperator
  /* 4 */ val Minus: typings.angularCompiler.outputAstMod.BinaryOperator.Minus with Double = js.native
  
  @js.native
  sealed trait Modulo extends BinaryOperator
  /* 8 */ val Modulo: typings.angularCompiler.outputAstMod.BinaryOperator.Modulo with Double = js.native
  
  @js.native
  sealed trait Multiply extends BinaryOperator
  /* 7 */ val Multiply: typings.angularCompiler.outputAstMod.BinaryOperator.Multiply with Double = js.native
  
  @js.native
  sealed trait NotEquals extends BinaryOperator
  /* 1 */ val NotEquals: typings.angularCompiler.outputAstMod.BinaryOperator.NotEquals with Double = js.native
  
  @js.native
  sealed trait NotIdentical extends BinaryOperator
  /* 3 */ val NotIdentical: typings.angularCompiler.outputAstMod.BinaryOperator.NotIdentical with Double = js.native
  
  @js.native
  sealed trait Or extends BinaryOperator
  /* 10 */ val Or: typings.angularCompiler.outputAstMod.BinaryOperator.Or with Double = js.native
  
  @js.native
  sealed trait Plus extends BinaryOperator
  /* 5 */ val Plus: typings.angularCompiler.outputAstMod.BinaryOperator.Plus with Double = js.native
}
