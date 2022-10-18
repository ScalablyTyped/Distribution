package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscIncrementalApiMod.DependencyTracker
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterfaceMod.ForeignFunctionResolver
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.std.Map
import typings.typescript.mod.Expression
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorSrcInterpreterMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/interpreter", "StaticInterpreter")
  @js.native
  open class StaticInterpreter protected () extends StObject {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
    
    /* private */ var accessHelper: Any = js.native
    
    /* private */ var checker: Any = js.native
    
    /* private */ var dependencyTracker: Any = js.native
    
    /* private */ var evaluateFunctionArguments: Any = js.native
    
    /* private */ var getReference: Any = js.native
    
    /* private */ var getResolvedEnum: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var stringNameFromPropertyName: Any = js.native
    
    def visit(node: Expression, context: Context): ResolvedValue = js.native
    
    /* private */ var visitAmbiguousDeclaration: Any = js.native
    
    /* private */ var visitArrayLiteralExpression: Any = js.native
    
    /* private */ var visitBinaryExpression: Any = js.native
    
    /* private */ var visitBindingElement: Any = js.native
    
    /* private */ var visitCallExpression: Any = js.native
    
    /* private */ var visitConditionalExpression: Any = js.native
    
    /* private */ var visitDeclaration: Any = js.native
    
    /* private */ var visitElementAccessExpression: Any = js.native
    
    /* private */ var visitEnumDeclaration: Any = js.native
    
    /* private */ var visitExpression: Any = js.native
    
    /**
      * Visit an expression which was extracted from a foreign-function resolver.
      *
      * This will process the result and ensure it's correct for FFR-resolved values, including marking
      * `Reference`s as synthetic.
      */
    /* private */ var visitFfrExpression: Any = js.native
    
    /* private */ var visitFunctionBody: Any = js.native
    
    /* private */ var visitIdentifier: Any = js.native
    
    /* protected */ def visitObjectLiteralExpression(node: ObjectLiteralExpression, context: Context): ResolvedValue = js.native
    
    /* private */ var visitParenthesizedExpression: Any = js.native
    
    /* private */ var visitPrefixUnaryExpression: Any = js.native
    
    /* private */ var visitPropertyAccessExpression: Any = js.native
    
    /* private */ var visitSourceFile: Any = js.native
    
    /* private */ var visitSpreadElement: Any = js.native
    
    /* private */ var visitTemplateExpression: Any = js.native
    
    /* private */ var visitTupleType: Any = js.native
    
    /* private */ var visitType: Any = js.native
    
    /* private */ var visitVariableDeclaration: Any = js.native
  }
  
  trait Context extends StObject {
    
    /**
      * The module name (if any) which was used to reach the currently resolving symbols.
      */
    var absoluteModuleName: String | Null
    
    var foreignFunctionResolver: js.UndefOr[ForeignFunctionResolver] = js.undefined
    
    var originatingFile: SourceFile
    
    /**
      * A file name representing the context in which the current `absoluteModuleName`, if any, was
      * resolved.
      */
    var resolutionContext: String
    
    var scope: Scope
  }
  object Context {
    
    inline def apply(originatingFile: SourceFile, resolutionContext: String, scope: Scope): Context = {
      val __obj = js.Dynamic.literal(originatingFile = originatingFile.asInstanceOf[js.Any], resolutionContext = resolutionContext.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], absoluteModuleName = null)
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setAbsoluteModuleName(value: String): Self = StObject.set(x, "absoluteModuleName", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteModuleNameNull: Self = StObject.set(x, "absoluteModuleName", null)
      
      inline def setForeignFunctionResolver(value: ForeignFunctionResolver): Self = StObject.set(x, "foreignFunctionResolver", value.asInstanceOf[js.Any])
      
      inline def setForeignFunctionResolverUndefined: Self = StObject.set(x, "foreignFunctionResolver", js.undefined)
      
      inline def setOriginatingFile(value: SourceFile): Self = StObject.set(x, "originatingFile", value.asInstanceOf[js.Any])
      
      inline def setResolutionContext(value: String): Self = StObject.set(x, "resolutionContext", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Tracks the scope of a function body, which includes `ResolvedValue`s for the parameters of that
    * body.
    */
  type Scope = Map[ParameterDeclaration, ResolvedValue]
}
