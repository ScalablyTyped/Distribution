package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscDiagnosticsMod.FatalDiagnosticError
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataMod.InjectableClassRegistry
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.srcNgtscScopeSrcLocalMod.DeclarationData
import typings.std.Set
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcDiagnosticsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkInheritanceOfDirective(
    node: ClassDeclaration[DeclarationNode],
    reader: MetadataReader,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator
  ): Diagnostic | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("checkInheritanceOfDirective")(node.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[Diagnostic | Null]
  
  inline def createValueHasWrongTypeError(node: Node, value: ResolvedValue, messageText: String): FatalDiagnosticError = (^.asInstanceOf[js.Dynamic].applyDynamic("createValueHasWrongTypeError")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[FatalDiagnosticError]
  
  inline def getDirectiveDiagnostics(
    node: ClassDeclaration[DeclarationNode],
    reader: MetadataReader,
    evaluator: PartialEvaluator,
    reflector: ReflectionHost,
    scopeRegistry: LocalModuleScopeRegistry,
    kind: String
  ): js.Array[Diagnostic] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectiveDiagnostics")(node.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], scopeRegistry.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic] | Null]
  
  inline def getProviderDiagnostics(
    providerClasses: Set[Reference[ClassDeclaration[DeclarationNode]]],
    providersDeclaration: Expression,
    registry: InjectableClassRegistry
  ): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProviderDiagnostics")(providerClasses.asInstanceOf[js.Any], providersDeclaration.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
  
  inline def getUndecoratedClassWithAngularFeaturesDiagnostic(node: ClassDeclaration[DeclarationNode]): Diagnostic = ^.asInstanceOf[js.Dynamic].applyDynamic("getUndecoratedClassWithAngularFeaturesDiagnostic")(node.asInstanceOf[js.Any]).asInstanceOf[Diagnostic]
  
  inline def makeDuplicateDeclarationError(node: ClassDeclaration[DeclarationNode], data: js.Array[DeclarationData], kind: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDuplicateDeclarationError")(node.asInstanceOf[js.Any], data.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
}
