package typings.angularPlatformBrowser

import typings.angularAnimations.browserMod.AnimationDriver
import typings.angularAnimations.browserMod.ɵAnimationEngine
import typings.angularAnimations.browserMod.ɵAnimationStyleNormalizer
import typings.angularAnimations.mod.AnimationBuilder
import typings.angularAnimations.mod.AnimationFactory
import typings.angularCore.mod.ApplicationRef
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.Provider
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.RendererFactory2
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.BrowserAnimations
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.NoopAnimations
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.body
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.document
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.window
import typings.angularPlatformBrowser.anon.TypeofBrowserModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsMod {
  
  @JSImport("@angular/platform-browser/animations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser/animations", "ANIMATION_MODULE_TYPE")
  @js.native
  val ANIMATION_MODULE_TYPE: InjectionToken[NoopAnimations | BrowserAnimations] = js.native
  
  @JSImport("@angular/platform-browser/animations", "BrowserAnimationsModule")
  @js.native
  open class BrowserAnimationsModule () extends StObject
  /* static members */
  object BrowserAnimationsModule {
    
    @JSImport("@angular/platform-browser/animations", "BrowserAnimationsModule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Configures the module based on the specified object.
      *
      * @param config Object used to configure the behavior of the `BrowserAnimationsModule`.
      * @see `BrowserAnimationsModuleConfig`
      *
      * @usageNotes
      * When registering the `BrowserAnimationsModule`, you can use the `withConfig`
      * function as follows:
      * ```
      * @NgModule({
      *   imports: [BrowserAnimationsModule.withConfig(config)]
      * })
      * class MyNgModule {}
      * ```
      */
    inline def withConfig(config: BrowserAnimationsModuleConfig): ModuleWithProviders[BrowserAnimationsModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfig")(config.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[BrowserAnimationsModule]]
    
    @JSImport("@angular/platform-browser/animations", "BrowserAnimationsModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[BrowserAnimationsModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[BrowserAnimationsModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser/animations", "BrowserAnimationsModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[BrowserAnimationsModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[BrowserAnimationsModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser/animations", "BrowserAnimationsModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[BrowserAnimationsModule, scala.Nothing, scala.Nothing, js.Array[TypeofBrowserModule]] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[BrowserAnimationsModule, scala.Nothing, scala.Nothing, js.Array[TypeofBrowserModule]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/platform-browser/animations", "NoopAnimationsModule")
  @js.native
  open class NoopAnimationsModule () extends StObject
  /* static members */
  object NoopAnimationsModule {
    
    @JSImport("@angular/platform-browser/animations", "NoopAnimationsModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-browser/animations", "NoopAnimationsModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[NoopAnimationsModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[NoopAnimationsModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser/animations", "NoopAnimationsModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[NoopAnimationsModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[NoopAnimationsModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser/animations", "NoopAnimationsModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[NoopAnimationsModule, scala.Nothing, scala.Nothing, js.Array[TypeofBrowserModule]] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[NoopAnimationsModule, scala.Nothing, scala.Nothing, js.Array[TypeofBrowserModule]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  inline def provideAnimations(): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideAnimations")().asInstanceOf[js.Array[Provider]]
  
  inline def provideNoopAnimations(): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideNoopAnimations")().asInstanceOf[js.Array[Provider]]
  
  @JSImport("@angular/platform-browser/animations", "\u0275AnimationRenderer")
  @js.native
  open class ɵAnimationRenderer protected () extends BaseAnimationRenderer {
    def this(
      factory: ɵAnimationRendererFactory,
      namespaceId: String,
      delegate: Renderer2,
      engine: ɵAnimationEngine
    ) = this()
    def this(
      factory: ɵAnimationRendererFactory,
      namespaceId: String,
      delegate: Renderer2,
      engine: ɵAnimationEngine,
      onDestroy: js.Function0[Unit]
    ) = this()
    
    var factory: ɵAnimationRendererFactory = js.native
    
    def listen(target: window | document | body, eventName: String, callback: js.Function1[/* event */ Any, Any]): js.Function0[Unit] = js.native
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275AnimationRendererFactory")
  @js.native
  open class ɵAnimationRendererFactory protected () extends RendererFactory2 {
    def this(delegate: RendererFactory2, engine: ɵAnimationEngine, _zone: NgZone) = this()
    
    /* private */ var _animationCallbacksBuffer: Any = js.native
    
    /* private */ var _cdRecurDepth: Any = js.native
    
    /* private */ var _currentId: Any = js.native
    
    /* private */ var _microtaskId: Any = js.native
    
    /* private */ var _rendererCache: Any = js.native
    
    /* private */ var _scheduleCountTask: Any = js.native
    
    /* private */ var _zone: Any = js.native
    
    @JSName("begin")
    def begin_MɵAnimationRendererFactory(): Unit = js.native
    
    /* private */ var delegate: Any = js.native
    
    @JSName("end")
    def end_MɵAnimationRendererFactory(): Unit = js.native
    
    /* private */ var engine: Any = js.native
    
    /* private */ var promise: Any = js.native
    
    @JSName("whenRenderingDone")
    def whenRenderingDone_MɵAnimationRendererFactory(): js.Promise[Any] = js.native
  }
  /* static members */
  object ɵAnimationRendererFactory {
    
    @JSImport("@angular/platform-browser/animations", "\u0275AnimationRendererFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-browser/animations", "\u0275AnimationRendererFactory.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ɵAnimationRendererFactory, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵAnimationRendererFactory, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser/animations", "\u0275AnimationRendererFactory.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[ɵAnimationRendererFactory] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵAnimationRendererFactory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275BrowserAnimationBuilder")
  @js.native
  open class ɵBrowserAnimationBuilder protected () extends AnimationBuilder {
    def this(rootRenderer: RendererFactory2, doc: Any) = this()
    
    /* private */ var _nextAnimationId: Any = js.native
    
    /* private */ var _renderer: Any = js.native
  }
  /* static members */
  object ɵBrowserAnimationBuilder {
    
    @JSImport("@angular/platform-browser/animations", "\u0275BrowserAnimationBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-browser/animations", "\u0275BrowserAnimationBuilder.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ɵBrowserAnimationBuilder, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵBrowserAnimationBuilder, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser/animations", "\u0275BrowserAnimationBuilder.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[ɵBrowserAnimationBuilder] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵBrowserAnimationBuilder]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275BrowserAnimationFactory")
  @js.native
  open class ɵBrowserAnimationFactory protected () extends AnimationFactory {
    def this(_id: String, _renderer: ɵAnimationRenderer) = this()
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _renderer: Any = js.native
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275InjectableAnimationEngine")
  @js.native
  open class ɵInjectableAnimationEngine protected ()
    extends ɵAnimationEngine
       with OnDestroy {
    def this(doc: Any, driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer, appRef: ApplicationRef) = this()
    
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
  }
  /* static members */
  object ɵInjectableAnimationEngine {
    
    @JSImport("@angular/platform-browser/animations", "\u0275InjectableAnimationEngine")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-browser/animations", "\u0275InjectableAnimationEngine.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ɵInjectableAnimationEngine, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵInjectableAnimationEngine, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser/animations", "\u0275InjectableAnimationEngine.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[ɵInjectableAnimationEngine] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵInjectableAnimationEngine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BaseAnimationRenderer extends Renderer2 {
    
    /* private */ var _onDestroy: Any = js.native
    
    var delegate: Renderer2 = js.native
    
    /* protected */ def disableAnimations(element: Any, value: Boolean): Unit = js.native
    
    var engine: ɵAnimationEngine = js.native
    
    /* protected */ var namespaceId: String = js.native
  }
  
  trait BrowserAnimationsModuleConfig extends StObject {
    
    /**
      *  Whether animations should be disabled. Passing this is identical to providing the
      * `NoopAnimationsModule`, but it can be controlled based on a runtime value.
      */
    var disableAnimations: js.UndefOr[Boolean] = js.undefined
  }
  object BrowserAnimationsModuleConfig {
    
    inline def apply(): BrowserAnimationsModuleConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserAnimationsModuleConfig]
    }
    
    extension [Self <: BrowserAnimationsModuleConfig](x: Self) {
      
      inline def setDisableAnimations(value: Boolean): Self = StObject.set(x, "disableAnimations", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimationsUndefined: Self = StObject.set(x, "disableAnimations", js.undefined)
    }
  }
}
