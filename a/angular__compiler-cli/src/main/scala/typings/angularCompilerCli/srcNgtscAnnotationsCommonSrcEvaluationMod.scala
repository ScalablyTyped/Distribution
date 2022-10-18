package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.std.Map
import typings.typescript.mod.Expression
import typings.typescript.mod.ObjectLiteralExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcEvaluationMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/evaluation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isArray(value: ResolvedValue): /* is std.Array<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue> */ Boolean]
  
  inline def isClassReferenceArray(resolvedValue: ResolvedValue): /* is std.Array<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/imports.Reference<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ClassDeclaration<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DeclarationNode>>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassReferenceArray")(resolvedValue.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/imports.Reference<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ClassDeclaration<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DeclarationNode>>> */ Boolean]
  
  inline def isStringArray(resolvedValue: ResolvedValue): /* is std.Array<string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringArray")(resolvedValue.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<string> */ Boolean]
  
  inline def resolveEnumValue(
    evaluator: PartialEvaluator,
    metadata: Map[String, Expression],
    field: String,
    enumSymbolName: String
  ): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveEnumValue")(evaluator.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], field.asInstanceOf[js.Any], enumSymbolName.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def resolveLiteral(decorator: Decorator, literalCache: Map[Decorator, ObjectLiteralExpression]): ObjectLiteralExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveLiteral")(decorator.asInstanceOf[js.Any], literalCache.asInstanceOf[js.Any])).asInstanceOf[ObjectLiteralExpression]
}
