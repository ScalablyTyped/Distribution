package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscPartialEvaluatorMod.SyntheticValue
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterfaceMod.ForeignFunctionResolver
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.typescript.mod.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsNgModuleSrcModuleWithProvidersMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createModuleWithProvidersResolver(reflector: ReflectionHost, isCore: Boolean): ForeignFunctionResolver = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleWithProvidersResolver")(reflector.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[ForeignFunctionResolver]
  
  inline def isResolvedModuleWithProviders(sv: SyntheticValue[Any]): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator.SyntheticValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers.ResolvedModuleWithProviders> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResolvedModuleWithProviders")(sv.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/partial_evaluator.SyntheticValue<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/ng_module/src/module_with_providers.ResolvedModuleWithProviders> */ Boolean]
  
  trait ResolvedModuleWithProviders extends StObject {
    
    var mwpCall: CallExpression
    
    var ngModule: Reference[ClassDeclaration[DeclarationNode]]
  }
  object ResolvedModuleWithProviders {
    
    inline def apply(mwpCall: CallExpression, ngModule: Reference[ClassDeclaration[DeclarationNode]]): ResolvedModuleWithProviders = {
      val __obj = js.Dynamic.literal(mwpCall = mwpCall.asInstanceOf[js.Any], ngModule = ngModule.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedModuleWithProviders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedModuleWithProviders] (val x: Self) extends AnyVal {
      
      inline def setMwpCall(value: CallExpression): Self = StObject.set(x, "mwpCall", value.asInstanceOf[js.Any])
      
      inline def setNgModule(value: Reference[ClassDeclaration[DeclarationNode]]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
    }
  }
}
