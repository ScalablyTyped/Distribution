package typings.angularPlatformServer

import typings.angularCore.mod.ApplicationRef
import typings.angularCore.mod.EnvironmentProviders
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Provider
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.Type
import typings.angularCore.mod.Version
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularPlatformServer.anon.Document
import typings.angularPlatformServer.anon.ExtraProviders
import typings.angularPlatformServer.anon.TypeofBrowserModule
import typings.angularPlatformServer.anon.TypeofHttpClientModule
import typings.angularPlatformServer.anon.TypeofNoopAnimationsModul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/platform-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-server", "BEFORE_APP_SERIALIZED")
  @js.native
  val BEFORE_APP_SERIALIZED: InjectionToken[js.Array[js.Function0[Unit | js.Promise[Unit]]]] = js.native
  
  @JSImport("@angular/platform-server", "INITIAL_CONFIG")
  @js.native
  val INITIAL_CONFIG: InjectionToken[PlatformConfig] = js.native
  
  @JSImport("@angular/platform-server", "PlatformState")
  @js.native
  open class PlatformState protected () extends StObject {
    def this(_doc: Any) = this()
    
    /* private */ var _doc: Any = js.native
    
    /**
      * Returns the current DOM state.
      */
    def getDocument(): Any = js.native
    
    /**
      * Renders the current state of the platform to string.
      */
    def renderToString(): String = js.native
  }
  /* static members */
  object PlatformState {
    
    @JSImport("@angular/platform-server", "PlatformState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-server", "PlatformState.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[PlatformState, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[PlatformState, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-server", "PlatformState.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[PlatformState] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[PlatformState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/platform-server", "ServerModule")
  @js.native
  open class ServerModule () extends StObject
  /* static members */
  object ServerModule {
    
    @JSImport("@angular/platform-server", "ServerModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-server", "ServerModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ServerModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ServerModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-server", "ServerModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[ServerModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[ServerModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-server", "ServerModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[
        ServerModule, 
        scala.Nothing, 
        js.Tuple2[TypeofHttpClientModule, TypeofNoopAnimationsModul], 
        js.Array[TypeofBrowserModule]
      ] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[
          ServerModule, 
          scala.Nothing, 
          js.Tuple2[TypeofHttpClientModule, TypeofNoopAnimationsModul], 
          js.Array[TypeofBrowserModule]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/platform-server", "ServerTransferStateModule")
  @js.native
  open class ServerTransferStateModule () extends StObject
  /* static members */
  object ServerTransferStateModule {
    
    @JSImport("@angular/platform-server", "ServerTransferStateModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-server", "ServerTransferStateModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ServerTransferStateModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ServerTransferStateModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-server", "ServerTransferStateModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[ServerTransferStateModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[ServerTransferStateModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-server", "ServerTransferStateModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[ServerTransferStateModule, scala.Nothing, scala.Nothing, scala.Nothing] = js.native
    inline def ɵmod_=(x: ɵɵNgModuleDeclaration[ServerTransferStateModule, scala.Nothing, scala.Nothing, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/platform-server", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  inline def platformDynamicServer(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformDynamicServer")().asInstanceOf[PlatformRef]
  inline def platformDynamicServer(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformDynamicServer")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
  
  inline def platformServer(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformServer")().asInstanceOf[PlatformRef]
  inline def platformServer(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformServer")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
  
  inline def provideServerRendering(): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("provideServerRendering")().asInstanceOf[EnvironmentProviders]
  
  inline def renderApplication[T](bootstrap: js.Function0[js.Promise[ApplicationRef]], options: Document): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderApplication")(bootstrap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def renderModule[T](moduleType: Type[T], options: ExtraProviders): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderModule")(moduleType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("@angular/platform-server", "\u0275INTERNAL_SERVER_PLATFORM_PROVIDERS")
  @js.native
  val ɵINTERNALSERVERPLATFORMPROVIDERS: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-server", "\u0275SERVER_CONTEXT")
  @js.native
  val ɵSERVERCONTEXT: InjectionToken[String] = js.native
  
  @JSImport("@angular/platform-server", "\u0275SERVER_RENDER_PROVIDERS")
  @js.native
  val ɵSERVERRENDERPROVIDERS: js.Array[Provider] = js.native
  
  inline def ɵsetDomTypes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setDomTypes")().asInstanceOf[Unit]
  
  trait PlatformConfig extends StObject {
    
    /**
      * Note: this option has no effect and can be removed from the config.
      *
      * The base URL for resolving absolute URL for HTTP requests. It must be set
      * if `useAbsoluteUrl` is true, and must consist of protocol, hostname,
      * and optional port. This option has no effect if `useAbsoluteUrl` is not
      * enabled.
      *
      * @deprecated This option is a noop.
      */
    var baseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The initial DOM to use to bootstrap the server application.
      * @default create a new DOM using Domino
      */
    var document: js.UndefOr[String] = js.undefined
    
    /**
      * The URL for the current application state. This is used for initializing
      * the platform's location. `protocol`, `hostname`, and `port` will be
      * overridden if `baseUrl` is set.
      * @default none
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Note: this option has no effect and can be removed from the config.
      *
      * Whether to append the absolute URL to any relative HTTP requests. If set to
      * true, this logic executes prior to any HTTP interceptors that may run later
      * on in the request. `baseUrl` must be supplied if this flag is enabled.
      *
      * @deprecated This option is a noop.
      * @default false
      */
    var useAbsoluteUrl: js.UndefOr[Boolean] = js.undefined
  }
  object PlatformConfig {
    
    inline def apply(): PlatformConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlatformConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlatformConfig] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUseAbsoluteUrl(value: Boolean): Self = StObject.set(x, "useAbsoluteUrl", value.asInstanceOf[js.Any])
      
      inline def setUseAbsoluteUrlUndefined: Self = StObject.set(x, "useAbsoluteUrl", js.undefined)
    }
  }
}
