package typings.angularCompilerCli

import typings.angularCompilerCli.incrementalApiMod.DependencyTracker
import typings.angularCompilerCli.referencesMod.OwningModule
import typings.angularCompilerCli.srcHostMod.FunctionDefinition
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.angularCompilerCli.srcInterfaceMod.ForeignFunctionResolver
import typings.angularCompilerCli.syntheticMod.SyntheticValue
import typings.std.Map
import typings.typescript.mod.Declaration
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrationsMod {
  
  @JSImport("@angular/compiler-cli/private/migrations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/private/migrations", "DynamicValue")
  @js.native
  /* private */ open class DynamicValue[R] ()
    extends typings.angularCompilerCli.partialEvaluatorMod.DynamicValue[R]
  /* static members */
  object DynamicValue {
    
    @JSImport("@angular/compiler-cli/private/migrations", "DynamicValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromComplexFunctionCall(node: Node, fn: FunctionDefinition): typings.angularCompilerCli.dynamicMod.DynamicValue[FunctionDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromComplexFunctionCall")(node.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[FunctionDefinition]]
    
    inline def fromDynamicInput(node: Node, input: typings.angularCompilerCli.dynamicMod.DynamicValue[Any]): typings.angularCompilerCli.dynamicMod.DynamicValue[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicInput")(node.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]]
    
    inline def fromDynamicString(node: Node): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicString")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromDynamicType(node: TypeNode): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicType")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromExternalReference(node: Node, ref: typings.angularCompilerCli.ngtscImportsMod.Reference[Declaration]): typings.angularCompilerCli.dynamicMod.DynamicValue[typings.angularCompilerCli.ngtscImportsMod.Reference[Declaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExternalReference")(node.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[typings.angularCompilerCli.ngtscImportsMod.Reference[Declaration]]]
    
    inline def fromInvalidExpressionType(node: Node, value: Any): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInvalidExpressionType")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromSyntheticInput(node: Node, value: SyntheticValue[Any]): typings.angularCompilerCli.dynamicMod.DynamicValue[SyntheticValue[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSyntheticInput")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[SyntheticValue[Any]]]
    
    inline def fromUnknown(node: Node): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknown")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromUnknownIdentifier(node: Identifier): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknownIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromUnsupportedSyntax(node: Node): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnsupportedSyntax")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "PartialEvaluator")
  @js.native
  open class PartialEvaluator protected ()
    extends typings.angularCompilerCli.partialEvaluatorMod.PartialEvaluator {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "Reference")
  @js.native
  open class Reference[T /* <: Node */] protected ()
    extends typings.angularCompilerCli.ngtscImportsMod.Reference[T] {
    def this(node: T) = this()
    def this(node: T, bestGuessOwningModule: OwningModule) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "StaticInterpreter")
  @js.native
  open class StaticInterpreter protected ()
    extends typings.angularCompilerCli.partialEvaluatorMod.StaticInterpreter {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "TypeScriptReflectionHost")
  @js.native
  open class TypeScriptReflectionHost protected ()
    extends typings.angularCompilerCli.reflectionMod.TypeScriptReflectionHost {
    def this(checker: TypeChecker) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/migrations", "forwardRefResolver")
  @js.native
  val forwardRefResolver: ForeignFunctionResolver = js.native
  
  inline def reflectObjectLiteral(node: ObjectLiteralExpression): Map[String, Expression] = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectObjectLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Map[String, Expression]]
}
