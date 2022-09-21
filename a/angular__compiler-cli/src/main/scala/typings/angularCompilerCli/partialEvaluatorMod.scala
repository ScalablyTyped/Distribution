package typings.angularCompilerCli

import typings.angularCompilerCli.incrementalApiMod.DependencyTracker
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.resultMod.ResolvedValue
import typings.angularCompilerCli.srcHostMod.FunctionDefinition
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.typescript.mod.Declaration
import typings.typescript.mod.DiagnosticRelatedInformation
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialEvaluatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "DynamicValue")
  @js.native
  /* private */ open class DynamicValue[R] ()
    extends typings.angularCompilerCli.dynamicMod.DynamicValue[R]
  /* static members */
  object DynamicValue {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "DynamicValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromComplexFunctionCall(node: Node, fn: FunctionDefinition): typings.angularCompilerCli.dynamicMod.DynamicValue[FunctionDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromComplexFunctionCall")(node.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[FunctionDefinition]]
    
    inline def fromDynamicInput(node: Node, input: typings.angularCompilerCli.dynamicMod.DynamicValue[Any]): typings.angularCompilerCli.dynamicMod.DynamicValue[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicInput")(node.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]]
    
    inline def fromDynamicString(node: Node): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicString")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromDynamicType(node: TypeNode): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDynamicType")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromExternalReference(node: Node, ref: Reference[Declaration]): typings.angularCompilerCli.dynamicMod.DynamicValue[Reference[Declaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExternalReference")(node.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Reference[Declaration]]]
    
    inline def fromInvalidExpressionType(node: Node, value: Any): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInvalidExpressionType")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromSyntheticInput(node: Node, value: typings.angularCompilerCli.syntheticMod.SyntheticValue[Any]): typings.angularCompilerCli.dynamicMod.DynamicValue[typings.angularCompilerCli.syntheticMod.SyntheticValue[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSyntheticInput")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[typings.angularCompilerCli.syntheticMod.SyntheticValue[Any]]]
    
    inline def fromUnknown(node: Node): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknown")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromUnknownIdentifier(node: Identifier): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnknownIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
    
    inline def fromUnsupportedSyntax(node: Node): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnsupportedSyntax")(node.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "EnumValue")
  @js.native
  open class EnumValue protected ()
    extends typings.angularCompilerCli.resultMod.EnumValue {
    def this(enumRef: Reference[Declaration], name: String, resolved: ResolvedValue) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "KnownFn")
  @js.native
  abstract class KnownFn ()
    extends typings.angularCompilerCli.resultMod.KnownFn
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "PartialEvaluator")
  @js.native
  open class PartialEvaluator protected ()
    extends typings.angularCompilerCli.srcInterfaceMod.PartialEvaluator {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "StaticInterpreter")
  @js.native
  open class StaticInterpreter protected ()
    extends typings.angularCompilerCli.interpreterMod.StaticInterpreter {
    def this(host: ReflectionHost, checker: TypeChecker) = this()
    def this(host: ReflectionHost, checker: TypeChecker, dependencyTracker: DependencyTracker[SourceFile]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator", "SyntheticValue")
  @js.native
  open class SyntheticValue[T] protected ()
    extends typings.angularCompilerCli.syntheticMod.SyntheticValue[T] {
    def this(value: T) = this()
  }
  
  inline def describeResolvedType(value: ResolvedValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("describeResolvedType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def describeResolvedType(value: ResolvedValue, maxDepth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("describeResolvedType")(value.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def traceDynamicValue(node: Node, value: typings.angularCompilerCli.dynamicMod.DynamicValue[Any]): js.Array[DiagnosticRelatedInformation] = (^.asInstanceOf[js.Dynamic].applyDynamic("traceDynamicValue")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiagnosticRelatedInformation]]
}
