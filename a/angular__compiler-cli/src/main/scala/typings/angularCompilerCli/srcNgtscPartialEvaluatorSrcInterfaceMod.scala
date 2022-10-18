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
