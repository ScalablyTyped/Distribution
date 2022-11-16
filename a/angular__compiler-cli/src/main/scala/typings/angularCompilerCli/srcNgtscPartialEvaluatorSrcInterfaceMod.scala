package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.typescript.mod.CallExpression
import typings.typescript.mod.Expression
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.MethodDeclaration
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorSrcInterfaceMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/interface", "PartialEvaluator")
  @js.native
  open class PartialEvaluator protected () extends StObject {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
    
    /* private */ var checker: Any = js.native
    
    /* private */ var dependencyTracker: Any = js.native
    
    def evaluate(expr: Expression): ResolvedValue = js.native
    def evaluate(expr: Expression, foreignFunctionResolver: ForeignFunctionResolver): ResolvedValue = js.native
    
    /* private */ var host: Any = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ForeignFunctionResolver = (fn : @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/imports.Reference<typescript.typescript.FunctionDeclaration | typescript.typescript.MethodDeclaration | typescript.typescript.FunctionExpression>, callExpr : typescript.typescript.CallExpression, resolve : (expr : typescript.typescript.Expression): @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue, unresolvable : @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/dynamic.DynamicValue<unknown>): @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue
  }}}
  to avoid circular code involving: 
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/interface.ForeignFunctionResolver
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValue
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValueArray
  - @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result.ResolvedValueMap
  */
  @js.native
  trait ForeignFunctionResolver extends StObject {
    
    def apply(
      fn: Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression],
      callExpr: CallExpression,
      resolve: js.Function1[/* expr */ Expression, ResolvedValue],
      unresolvable: DynamicValue[Any]
    ): ResolvedValue = js.native
  }
}
