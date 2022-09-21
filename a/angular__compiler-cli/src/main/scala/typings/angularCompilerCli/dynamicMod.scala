package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliNumbers.`0`
import typings.angularCompilerCli.angularCompilerCliNumbers.`1`
import typings.angularCompilerCli.angularCompilerCliNumbers.`2`
import typings.angularCompilerCli.angularCompilerCliNumbers.`3`
import typings.angularCompilerCli.angularCompilerCliNumbers.`4`
import typings.angularCompilerCli.angularCompilerCliNumbers.`5`
import typings.angularCompilerCli.angularCompilerCliNumbers.`6`
import typings.angularCompilerCli.angularCompilerCliNumbers.`7`
import typings.angularCompilerCli.angularCompilerCliNumbers.`8`
import typings.angularCompilerCli.angularCompilerCliNumbers.`9`
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.srcHostMod.FunctionDefinition
import typings.angularCompilerCli.syntheticMod.SyntheticValue
import typings.typescript.mod.Declaration
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic", "DynamicValue")
  @js.native
  /* private */ open class DynamicValue[R] () extends StObject {
    
    def accept[R](visitor: DynamicValueVisitor[R]): R = js.native
    
    /* private */ var code: Any = js.native
    
    def isFromComplexFunctionCall(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.FunctionDefinition> */ Boolean = js.native
    
    def isFromDynamicInput(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<unknown>> */ Boolean = js.native
    
    def isFromDynamicString(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<unknown> */ Boolean = js.native
    
    def isFromDynamicType(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<unknown> */ Boolean = js.native
    
    def isFromExternalReference(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/imports.Reference<typescript.typescript.Declaration>> */ Boolean = js.native
    
    def isFromInvalidExpressionType(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<unknown> */ Boolean = js.native
    
    def isFromUnknown(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<unknown> */ Boolean = js.native
    
    def isFromUnknownIdentifier(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<unknown> */ Boolean = js.native
    
    def isFromUnsupportedSyntax(): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<unknown> */ Boolean = js.native
    
    val node: Node = js.native
    
    val reason: R = js.native
  }
  /* static members */
  object DynamicValue {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic", "DynamicValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromComplexFunctionCall(node: Node, fn: FunctionDefinition): DynamicValue[FunctionDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromComplexFunctionCall")(node.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[DynamicValue[FunctionDefinition]]
    
    inline def fromDynamicInput(node: Node, input: DynamicValue[Any]): DynamicValue[DynamicValue[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicInput")(node.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[DynamicValue[DynamicValue[Any]]]
    
    inline def fromDynamicString(node: Node): DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicString")(node.asInstanceOf[js.Any]).asInstanceOf[DynamicValue[Any]]
    
    inline def fromDynamicType(node: TypeNode): DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicType")(node.asInstanceOf[js.Any]).asInstanceOf[DynamicValue[Any]]
    
    inline def fromExternalReference(node: Node, ref: Reference[Declaration]): DynamicValue[Reference[Declaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExternalReference")(node.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[DynamicValue[Reference[Declaration]]]
    
    inline def fromInvalidExpressionType(node: Node, value: Any): DynamicValue[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInvalidExpressionType")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[DynamicValue[Any]]
    
    inline def fromSyntheticInput(node: Node, value: SyntheticValue[Any]): DynamicValue[SyntheticValue[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSyntheticInput")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[DynamicValue[SyntheticValue[Any]]]
    
    inline def fromUnknown(node: Node): DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknown")(node.asInstanceOf[js.Any]).asInstanceOf[DynamicValue[Any]]
    
    inline def fromUnknownIdentifier(node: Identifier): DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknownIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[DynamicValue[Any]]
    
    inline def fromUnsupportedSyntax(node: Node): DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnsupportedSyntax")(node.asInstanceOf[js.Any]).asInstanceOf[DynamicValue[Any]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.angularCompilerCliNumbers.`0`
    - typings.angularCompilerCli.angularCompilerCliNumbers.`1`
    - typings.angularCompilerCli.angularCompilerCliNumbers.`2`
    - typings.angularCompilerCli.angularCompilerCliNumbers.`3`
    - typings.angularCompilerCli.angularCompilerCliNumbers.`4`
    - typings.angularCompilerCli.angularCompilerCliNumbers.`5`
    - typings.angularCompilerCli.angularCompilerCliNumbers.`6`
    - typings.angularCompilerCli.angularCompilerCliNumbers.`7`
    - typings.angularCompilerCli.angularCompilerCliNumbers.`8`
    - typings.angularCompilerCli.angularCompilerCliNumbers.`9`
  */
  trait DynamicValueReason extends StObject
  object DynamicValueReason {
    
    /**
      * A function call could not be evaluated as the function's body is not a single return statement.
      */
    inline def COMPLEX_FUNCTION_CALL: `6` = 6.asInstanceOf[`6`]
    
    /**
      * A value could not be determined statically, because it contains a term that could not be
      * determined statically.
      * (E.g. a property assignment or call expression where the lhs is a `DynamicValue`, a template
      * literal with a dynamic expression, an object literal with a spread assignment which could not
      * be determined statically, etc.)
      */
    inline def DYNAMIC_INPUT: `0` = 0.asInstanceOf[`0`]
    
    /**
      * A string could not be statically evaluated.
      * (E.g. a dynamically constructed object property name or a template literal expression that
      * could not be statically resolved to a primitive value.)
      */
    inline def DYNAMIC_STRING: `1` = 1.asInstanceOf[`1`]
    
    /**
      * A value that could not be determined because it contains type information that cannot be
      * statically evaluated. This happens when producing a value from type information, but the value
      * of the given type cannot be determined statically.
      *
      * E.g. evaluating a tuple.
      *
      *   `declare const foo: [string];`
      *
      *  Evaluating `foo` gives a DynamicValue wrapped in an array with a reason of DYNAMIC_TYPE. This
      * is because the static evaluator has a `string` type for the first element of this tuple, and
      * the value of that string cannot be determined statically. The type `string` permits it to be
      * 'foo', 'bar' or any arbitrary string, so we evaluate it to a DynamicValue.
      */
    inline def DYNAMIC_TYPE: `7` = 7.asInstanceOf[`7`]
    
    /**
      * An external reference could not be resolved to a value which can be evaluated.
      * For example a call expression for a function declared in `.d.ts`, or accessing native globals
      * such as `window`.
      */
    inline def EXTERNAL_REFERENCE: `2` = 2.asInstanceOf[`2`]
    
    /**
      * A value could be resolved, but is not an acceptable type for the operation being performed.
      *
      * For example, attempting to call a non-callable expression.
      */
    inline def INVALID_EXPRESSION_TYPE: `5` = 5.asInstanceOf[`5`]
    
    /**
      * A value could not be determined because one of the inputs to its evaluation is a synthetically
      * produced value.
      */
    inline def SYNTHETIC_INPUT: `8` = 8.asInstanceOf[`8`]
    
    /**
      * A value could not be determined statically for any reason other the above.
      */
    inline def UNKNOWN: `9` = 9.asInstanceOf[`9`]
    
    /**
      * A declaration of a `ts.Identifier` could not be found.
      */
    inline def UNKNOWN_IDENTIFIER: `4` = 4.asInstanceOf[`4`]
    
    /**
      * Syntax that `StaticInterpreter` doesn't know how to evaluate, for example a type of
      * `ts.Expression` that is not supported.
      */
    inline def UNSUPPORTED_SYNTAX: `3` = 3.asInstanceOf[`3`]
  }
  
  trait DynamicValueVisitor[R] extends StObject {
    
    def visitComplexFunctionCall(value: DynamicValue[FunctionDefinition]): R
    
    def visitDynamicInput(value: DynamicValue[DynamicValue[Any]]): R
    
    def visitDynamicString(value: DynamicValue[Any]): R
    
    def visitDynamicType(value: DynamicValue[Any]): R
    
    def visitExternalReference(value: DynamicValue[Reference[Declaration]]): R
    
    def visitInvalidExpressionType(value: DynamicValue[Any]): R
    
    def visitSyntheticInput(value: DynamicValue[SyntheticValue[Any]]): R
    
    def visitUnknown(value: DynamicValue[Any]): R
    
    def visitUnknownIdentifier(value: DynamicValue[Any]): R
    
    def visitUnsupportedSyntax(value: DynamicValue[Any]): R
  }
  object DynamicValueVisitor {
    
    inline def apply[R](
      visitComplexFunctionCall: DynamicValue[FunctionDefinition] => R,
      visitDynamicInput: DynamicValue[DynamicValue[Any]] => R,
      visitDynamicString: DynamicValue[Any] => R,
      visitDynamicType: DynamicValue[Any] => R,
      visitExternalReference: DynamicValue[Reference[Declaration]] => R,
      visitInvalidExpressionType: DynamicValue[Any] => R,
      visitSyntheticInput: DynamicValue[SyntheticValue[Any]] => R,
      visitUnknown: DynamicValue[Any] => R,
      visitUnknownIdentifier: DynamicValue[Any] => R,
      visitUnsupportedSyntax: DynamicValue[Any] => R
    ): DynamicValueVisitor[R] = {
      val __obj = js.Dynamic.literal(visitComplexFunctionCall = js.Any.fromFunction1(visitComplexFunctionCall), visitDynamicInput = js.Any.fromFunction1(visitDynamicInput), visitDynamicString = js.Any.fromFunction1(visitDynamicString), visitDynamicType = js.Any.fromFunction1(visitDynamicType), visitExternalReference = js.Any.fromFunction1(visitExternalReference), visitInvalidExpressionType = js.Any.fromFunction1(visitInvalidExpressionType), visitSyntheticInput = js.Any.fromFunction1(visitSyntheticInput), visitUnknown = js.Any.fromFunction1(visitUnknown), visitUnknownIdentifier = js.Any.fromFunction1(visitUnknownIdentifier), visitUnsupportedSyntax = js.Any.fromFunction1(visitUnsupportedSyntax))
      __obj.asInstanceOf[DynamicValueVisitor[R]]
    }
    
    extension [Self <: DynamicValueVisitor[?], R](x: Self & DynamicValueVisitor[R]) {
      
      inline def setVisitComplexFunctionCall(value: DynamicValue[FunctionDefinition] => R): Self = StObject.set(x, "visitComplexFunctionCall", js.Any.fromFunction1(value))
      
      inline def setVisitDynamicInput(value: DynamicValue[DynamicValue[Any]] => R): Self = StObject.set(x, "visitDynamicInput", js.Any.fromFunction1(value))
      
      inline def setVisitDynamicString(value: DynamicValue[Any] => R): Self = StObject.set(x, "visitDynamicString", js.Any.fromFunction1(value))
      
      inline def setVisitDynamicType(value: DynamicValue[Any] => R): Self = StObject.set(x, "visitDynamicType", js.Any.fromFunction1(value))
      
      inline def setVisitExternalReference(value: DynamicValue[Reference[Declaration]] => R): Self = StObject.set(x, "visitExternalReference", js.Any.fromFunction1(value))
      
      inline def setVisitInvalidExpressionType(value: DynamicValue[Any] => R): Self = StObject.set(x, "visitInvalidExpressionType", js.Any.fromFunction1(value))
      
      inline def setVisitSyntheticInput(value: DynamicValue[SyntheticValue[Any]] => R): Self = StObject.set(x, "visitSyntheticInput", js.Any.fromFunction1(value))
      
      inline def setVisitUnknown(value: DynamicValue[Any] => R): Self = StObject.set(x, "visitUnknown", js.Any.fromFunction1(value))
      
      inline def setVisitUnknownIdentifier(value: DynamicValue[Any] => R): Self = StObject.set(x, "visitUnknownIdentifier", js.Any.fromFunction1(value))
      
      inline def setVisitUnsupportedSyntax(value: DynamicValue[Any] => R): Self = StObject.set(x, "visitUnsupportedSyntax", js.Any.fromFunction1(value))
    }
  }
}
