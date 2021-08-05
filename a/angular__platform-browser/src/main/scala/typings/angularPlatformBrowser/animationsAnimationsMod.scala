package typings.angularPlatformBrowser

import typings.angularAnimations.browserMod.AnimationDriver
import typings.angularAnimations.browserMod.ɵAnimationEngine
import typings.angularAnimations.browserMod.ɵAnimationStyleNormalizer
import typings.angularAnimations.browserMod.ɵCssKeyframesDriver
import typings.angularAnimations.browserMod.ɵWebAnimationsDriver
import typings.angularAnimations.browserMod.ɵWebAnimationsStyleNormalizer
import typings.angularAnimations.mod.AnimationBuilder
import typings.angularAnimations.mod.AnimationFactory
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.Provider
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.RendererFactory2
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.BrowserAnimations
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.NoopAnimations
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.body
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.document
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.window
import typings.angularPlatformBrowser.mod.ɵDomRendererFactory2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsAnimationsMod {
  
  @JSImport("@angular/platform-browser/animations/animations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser/animations/animations", "ANIMATION_MODULE_TYPE")
  @js.native
  val ANIMATION_MODULE_TYPE: InjectionToken[NoopAnimations | BrowserAnimations] = js.native
  
  @JSImport("@angular/platform-browser/animations/animations", "BrowserAnimationsModule")
  @js.native
  class BrowserAnimationsModule () extends StObject
  
  @JSImport("@angular/platform-browser/animations/animations", "NoopAnimationsModule")
  @js.native
  class NoopAnimationsModule () extends StObject
  
  @JSImport("@angular/platform-browser/animations/animations", "\u0275AnimationRenderer")
  @js.native
  class ɵAnimationRenderer protected () extends ɵangularPackagesPlatformBrowserAnimationsAnimationsF {
    def this(
      factory: ɵAnimationRendererFactory,
      namespaceId: String,
      delegate: Renderer2,
      engine: ɵAnimationEngine
    ) = this()
    
    var factory: ɵAnimationRendererFactory = js.native
    
    @JSName("listen")
    def listen_body(target: body, eventName: String, callback: js.Function1[/* event */ js.Any, js.Any]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_document(target: document, eventName: String, callback: js.Function1[/* event */ js.Any, js.Any]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_window(target: window, eventName: String, callback: js.Function1[/* event */ js.Any, js.Any]): js.Function0[Unit] = js.native
  }
  
  @JSImport("@angular/platform-browser/animations/animations", "\u0275AnimationRendererFactory")
  @js.native
  class ɵAnimationRendererFactory protected () extends RendererFactory2 {
    def this(delegate: RendererFactory2, engine: ɵAnimationEngine, _zone: NgZone) = this()
    
    /* private */ var _animationCallbacksBuffer: js.Any = js.native
    
    /* private */ var _cdRecurDepth: js.Any = js.native
    
    /* private */ var _currentId: js.Any = js.native
    
    /* private */ var _microtaskId: js.Any = js.native
    
    /* private */ var _rendererCache: js.Any = js.native
    
    /* private */ var _scheduleCountTask: js.Any = js.native
    
    /* private */ var _zone: js.Any = js.native
    
    @JSName("begin")
    def begin_MɵAnimationRendererFactory(): Unit = js.native
    
    /* private */ var delegate: js.Any = js.native
    
    @JSName("end")
    def end_MɵAnimationRendererFactory(): Unit = js.native
    
    /* private */ var engine: js.Any = js.native
    
    /* private */ var promise: js.Any = js.native
    
    @JSName("whenRenderingDone")
    def whenRenderingDone_MɵAnimationRendererFactory(): js.Promise[js.Any] = js.native
  }
  
  @JSImport("@angular/platform-browser/animations/animations", "\u0275BrowserAnimationBuilder")
  @js.native
  class ɵBrowserAnimationBuilder protected () extends AnimationBuilder {
    def this(rootRenderer: RendererFactory2, doc: js.Any) = this()
    
    /* private */ var _nextAnimationId: js.Any = js.native
    
    /* private */ var _renderer: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser/animations/animations", "\u0275BrowserAnimationFactory")
  @js.native
  class ɵBrowserAnimationFactory protected () extends AnimationFactory {
    def this(_id: String, _renderer: ɵAnimationRenderer) = this()
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _renderer: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser/animations/animations", "\u0275InjectableAnimationEngine")
  @js.native
  class ɵInjectableAnimationEngine protected () extends ɵAnimationEngine {
    def this(doc: js.Any, driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer) = this()
  }
  
  inline def ɵangularPackagesPlatformBrowserAnimationsAnimationsA(): ɵWebAnimationsDriver | ɵCssKeyframesDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_animations_animations_a")().asInstanceOf[ɵWebAnimationsDriver | ɵCssKeyframesDriver]
  
  inline def ɵangularPackagesPlatformBrowserAnimationsAnimationsB(): ɵWebAnimationsStyleNormalizer = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_animations_animations_b")().asInstanceOf[ɵWebAnimationsStyleNormalizer]
  
  inline def ɵangularPackagesPlatformBrowserAnimationsAnimationsC(renderer: ɵDomRendererFactory2, engine: ɵAnimationEngine, zone: NgZone): ɵAnimationRendererFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_animations_animations_c")(renderer.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ɵAnimationRendererFactory]
  
  @JSImport("@angular/platform-browser/animations/animations", "\u0275angular_packages_platform_browser_animations_animations_d")
  @js.native
  val ɵangularPackagesPlatformBrowserAnimationsAnimationsD: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser/animations/animations", "\u0275angular_packages_platform_browser_animations_animations_e")
  @js.native
  val ɵangularPackagesPlatformBrowserAnimationsAnimationsE: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser/animations/animations", "\u0275angular_packages_platform_browser_animations_animations_f")
  @js.native
  class ɵangularPackagesPlatformBrowserAnimationsAnimationsF protected () extends Renderer2 {
    def this(namespaceId: String, delegate: Renderer2, engine: ɵAnimationEngine) = this()
    
    var delegate: Renderer2 = js.native
    
    /* protected */ def disableAnimations(element: js.Any, value: Boolean): Unit = js.native
    
    var engine: ɵAnimationEngine = js.native
    
    /* protected */ var namespaceId: String = js.native
  }
}
