package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.Component
import typings.angularCompilerCli.angularCompilerCliStrings.Directive
import typings.angularCompilerCli.angularCompilerCliStrings.Injectable
import typings.angularCompilerCli.angularCompilerCliStrings.Pipe
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcInjectableRegistryMod.InjectableClassRegistry
import typings.angularCompilerCli.srcNgtscDiagnosticsMod.FatalDiagnosticError
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.HostDirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscScopeMod.LocalModuleScopeRegistry
import typings.angularCompilerCli.srcNgtscScopeSrcLocalMod.DeclarationData
import typings.std.Set
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticWithLocation
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcDiagnosticsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkInheritanceOfInjectable(
    node: ClassDeclarationDeclarati,
    injectableRegistry: InjectableClassRegistry,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator,
    strictInjectionParameters: Boolean,
    kind: Directive | Component | Pipe | Injectable
  ): Diagnostic | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("checkInheritanceOfInjectable")(node.asInstanceOf[js.Any], injectableRegistry.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], strictInjectionParameters.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic | Null]
  
  inline def createValueHasWrongTypeError(node: Node, value: ResolvedValue, messageText: String): FatalDiagnosticError = (^.asInstanceOf[js.Dynamic].applyDynamic("createValueHasWrongTypeError")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[FatalDiagnosticError]
  
  inline def findInheritedCtor(
    node: ClassDeclarationDeclarati,
    injectableRegistry: InjectableClassRegistry,
    reflector: ReflectionHost,
    evaluator: PartialEvaluator
  ): ClassWithCtor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findInheritedCtor")(node.asInstanceOf[js.Any], injectableRegistry.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any])).asInstanceOf[ClassWithCtor | Null]
  
  inline def getDirectiveDiagnostics(
    node: ClassDeclarationDeclarati,
    injectableRegistry: InjectableClassRegistry,
    evaluator: PartialEvaluator,
    reflector: ReflectionHost,
    scopeRegistry: LocalModuleScopeRegistry,
    strictInjectionParameters: Boolean,
    kind: Directive | Component
  ): js.Array[Diagnostic] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirectiveDiagnostics")(node.asInstanceOf[js.Any], injectableRegistry.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], scopeRegistry.asInstanceOf[js.Any], strictInjectionParameters.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic] | Null]
  
  inline def getProviderDiagnostics(
    providerClasses: Set[Reference[ClassDeclarationDeclarati]],
    providersDeclaration: Expression,
    registry: InjectableClassRegistry
  ): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProviderDiagnostics")(providerClasses.asInstanceOf[js.Any], providersDeclaration.asInstanceOf[js.Any], registry.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
  
  inline def getUndecoratedClassWithAngularFeaturesDiagnostic(node: ClassDeclarationDeclarati): Diagnostic = ^.asInstanceOf[js.Dynamic].applyDynamic("getUndecoratedClassWithAngularFeaturesDiagnostic")(node.asInstanceOf[js.Any]).asInstanceOf[Diagnostic]
  
  inline def makeDuplicateDeclarationError(node: ClassDeclarationDeclarati, data: js.Array[DeclarationData], kind: String): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDuplicateDeclarationError")(node.asInstanceOf[js.Any], data.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  
  inline def validateHostDirectives(origin: Expression, hostDirectives: js.Array[HostDirectiveMeta], metaReader: MetadataReader): js.Array[DiagnosticWithLocation] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateHostDirectives")(origin.asInstanceOf[js.Any], hostDirectives.asInstanceOf[js.Any], metaReader.asInstanceOf[js.Any])).asInstanceOf[js.Array[DiagnosticWithLocation]]
  
  trait ClassWithCtor extends StObject {
    
    var isCtorValid: Boolean
    
    var isDecorated: Boolean
    
    var ref: Reference[ClassDeclarationDeclarati]
  }
  object ClassWithCtor {
    
    inline def apply(isCtorValid: Boolean, isDecorated: Boolean, ref: Reference[ClassDeclarationDeclarati]): ClassWithCtor = {
      val __obj = js.Dynamic.literal(isCtorValid = isCtorValid.asInstanceOf[js.Any], isDecorated = isDecorated.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassWithCtor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassWithCtor] (val x: Self) extends AnyVal {
      
      inline def setIsCtorValid(value: Boolean): Self = StObject.set(x, "isCtorValid", value.asInstanceOf[js.Any])
      
      inline def setIsDecorated(value: Boolean): Self = StObject.set(x, "isDecorated", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Reference[ClassDeclarationDeclarati]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
