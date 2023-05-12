package typings.angularPlatformServer

import org.scalablytyped.runtime.Instantiable0
import typings.angularCommon.httpMod.HttpClientModule
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.Provider
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularPlatformBrowser.animationsMod.NoopAnimationsModule
import typings.angularPlatformBrowser.anon.AppId
import typings.angularPlatformBrowser.anon.Optional
import typings.angularPlatformBrowser.anon.TypeofApplicationModule
import typings.angularPlatformBrowser.anon.TypeofCommonModule
import typings.angularPlatformBrowser.mod.BrowserModule
import typings.angularPlatformBrowserDynamic.anon.TypeofBrowserTestingModul
import typings.angularPlatformBrowserDynamic.testingMod.BrowserDynamicTestingModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Document extends StObject {
    
    var document: js.UndefOr[String | typings.std.Document] = js.undefined
    
    var platformProviders: js.UndefOr[js.Array[Provider]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Document {
    
    inline def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      inline def setDocument(value: String | typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setPlatformProviders(value: js.Array[Provider]): Self = StObject.set(x, "platformProviders", value.asInstanceOf[js.Any])
      
      inline def setPlatformProvidersUndefined: Self = StObject.set(x, "platformProviders", js.undefined)
      
      inline def setPlatformProvidersVarargs(value: Provider*): Self = StObject.set(x, "platformProviders", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ExtraProviders extends StObject {
    
    var document: js.UndefOr[String | typings.std.Document] = js.undefined
    
    var extraProviders: js.UndefOr[js.Array[StaticProvider]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ExtraProviders {
    
    inline def apply(): ExtraProviders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraProviders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtraProviders] (val x: Self) extends AnyVal {
      
      inline def setDocument(value: String | typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setExtraProviders(value: js.Array[StaticProvider]): Self = StObject.set(x, "extraProviders", value.asInstanceOf[js.Any])
      
      inline def setExtraProvidersUndefined: Self = StObject.set(x, "extraProviders", js.undefined)
      
      inline def setExtraProvidersVarargs(value: StaticProvider*): Self = StObject.set(x, "extraProviders", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait TypeofBrowserDynamicTesti
    extends StObject
       with Instantiable0[BrowserDynamicTestingModule] {
    
    var ɵfac: ɵɵFactoryDeclaration[BrowserDynamicTestingModule, scala.Nothing] = js.native
    
    var ɵinj: ɵɵInjectorDeclaration[BrowserDynamicTestingModule] = js.native
    
    var ɵmod: ɵɵNgModuleDeclaration[
        BrowserDynamicTestingModule, 
        scala.Nothing, 
        scala.Nothing, 
        js.Array[TypeofBrowserTestingModul]
      ] = js.native
  }
  
  @js.native
  trait TypeofBrowserModule
    extends StObject
       with Instantiable0[BrowserModule] {
    
    /**
      * Configures a browser-based app to transition from a server-rendered app, if
      * one is present on the page.
      *
      * @param params An object containing an identifier for the app to transition.
      * The ID must match between the client and server versions of the app.
      * @returns The reconfigured `BrowserModule` to import into the app's root `AppModule`.
      *
      * @deprecated Use {@link APP_ID} instead to set the application ID.
      */
    def withServerTransition(params: AppId): ModuleWithProviders[BrowserModule] = js.native
    
    var ɵfac: ɵɵFactoryDeclaration[BrowserModule, js.Array[Optional]] = js.native
    
    var ɵinj: ɵɵInjectorDeclaration[BrowserModule] = js.native
    
    var ɵmod: ɵɵNgModuleDeclaration[
        BrowserModule, 
        scala.Nothing, 
        scala.Nothing, 
        js.Tuple2[TypeofCommonModule, TypeofApplicationModule]
      ] = js.native
  }
  
  @js.native
  trait TypeofHttpClientModule
    extends StObject
       with Instantiable0[HttpClientModule] {
    
    var ɵfac: ɵɵFactoryDeclaration[HttpClientModule, scala.Nothing] = js.native
    
    var ɵinj: ɵɵInjectorDeclaration[HttpClientModule] = js.native
    
    var ɵmod: ɵɵNgModuleDeclaration[HttpClientModule, scala.Nothing, scala.Nothing, scala.Nothing] = js.native
  }
  
  @js.native
  trait TypeofNoopAnimationsModul
    extends StObject
       with Instantiable0[NoopAnimationsModule] {
    
    var ɵfac: ɵɵFactoryDeclaration[NoopAnimationsModule, scala.Nothing] = js.native
    
    var ɵinj: ɵɵInjectorDeclaration[NoopAnimationsModule] = js.native
    
    var ɵmod: ɵɵNgModuleDeclaration[
        NoopAnimationsModule, 
        scala.Nothing, 
        scala.Nothing, 
        js.Array[typings.angularPlatformBrowser.anon.TypeofBrowserModule]
      ] = js.native
  }
}
