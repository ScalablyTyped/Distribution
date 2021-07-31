package typings.angularCompiler.outputAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryOperator extends StObject
@JSImport("@angular/compiler/src/output/output_ast", "BinaryOperator")
@js.native
object BinaryOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BinaryOperator & Double] = js.native
  
  @js.native
  sealed trait And
    extends StObject
       with BinaryOperator
  /* 9 */ val And: typings.angularCompiler.outputAstMod.BinaryOperator.And & Double = js.native
  
  @js.native
  sealed trait Bigger
    extends StObject
       with BinaryOperator
  /* 14 */ val Bigger: typings.angularCompiler.outputAstMod.BinaryOperator.Bigger & Double = js.native
  
  @js.native
  sealed trait BiggerEquals
    extends StObject
       with BinaryOperator
  /* 15 */ val BiggerEquals: typings.angularCompiler.outputAstMod.BinaryOperator.BiggerEquals & Double = js.native
  
  @js.native
  sealed trait BitwiseAnd
    extends StObject
       with BinaryOperator
  /* 11 */ val BitwiseAnd: typings.angularCompiler.outputAstMod.BinaryOperator.BitwiseAnd & Double = js.native
  
  @js.native
  sealed trait Divide
    extends StObject
       with BinaryOperator
  /* 6 */ val Divide: typings.angularCompiler.outputAstMod.BinaryOperator.Divide & Double = js.native
  
  @js.native
  sealed trait Equals
    extends StObject
       with BinaryOperator
  /* 0 */ val Equals: typings.angularCompiler.outputAstMod.BinaryOperator.Equals & Double = js.native
  
  @js.native
  sealed trait Identical
    extends StObject
       with BinaryOperator
  /* 2 */ val Identical: typings.angularCompiler.outputAstMod.BinaryOperator.Identical & Double = js.native
  
  @js.native
  sealed trait Lower
    extends StObject
       with BinaryOperator
  /* 12 */ val Lower: typings.angularCompiler.outputAstMod.BinaryOperator.Lower & Double = js.native
  
  @js.native
  sealed trait LowerEquals
    extends StObject
       with BinaryOperator
  /* 13 */ val LowerEquals: typings.angularCompiler.outputAstMod.BinaryOperator.LowerEquals & Double = js.native
  
  @js.native
  sealed trait Minus
    extends StObject
       with BinaryOperator
  /* 4 */ val Minus: typings.angularCompiler.outputAstMod.BinaryOperator.Minus & Double = js.native
  
  @js.native
  sealed trait Modulo
    extends StObject
       with BinaryOperator
  /* 8 */ val Modulo: typings.angularCompiler.outputAstMod.BinaryOperator.Modulo & Double = js.native
  
  @js.native
  sealed trait Multiply
    extends StObject
       with BinaryOperator
  /* 7 */ val Multiply: typings.angularCompiler.outputAstMod.BinaryOperator.Multiply & Double = js.native
  
  @js.native
  sealed trait NotEquals
    extends StObject
       with BinaryOperator
  /* 1 */ val NotEquals: typings.angularCompiler.outputAstMod.BinaryOperator.NotEquals & Double = js.native
  
  @js.native
  sealed trait NotIdentical
    extends StObject
       with BinaryOperator
  /* 3 */ val NotIdentical: typings.angularCompiler.outputAstMod.BinaryOperator.NotIdentical & Double = js.native
  
  @js.native
  sealed trait Or
    extends StObject
       with BinaryOperator
  /* 10 */ val Or: typings.angularCompiler.outputAstMod.BinaryOperator.Or & Double = js.native
  
  @js.native
  sealed trait Plus
    extends StObject
       with BinaryOperator
  /* 5 */ val Plus: typings.angularCompiler.outputAstMod.BinaryOperator.Plus & Double = js.native
}
