package typings.angularPlatformBrowser

import typings.angularAnimations.browserMod.AnimationDriver
import typings.angularAnimations.browserMod.ɵAnimationEngine
import typings.angularAnimations.browserMod.ɵAnimationStyleNormalizer
import typings.angularAnimations.browserMod.ɵCssKeyframesDriver
import typings.angularAnimations.browserMod.ɵWebAnimationsDriver
import typings.angularAnimations.browserMod.ɵWebAnimationsStyleNormalizer
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.NgZone
import typings.angularCore.mod.Provider
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.RendererFactory2
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.BrowserAnimations
import typings.angularPlatformBrowser.angularPlatformBrowserStrings.NoopAnimations
import typings.angularPlatformBrowser.mod.ɵDomRendererFactory2
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
  class BrowserAnimationsModule ()
    extends typings.angularPlatformBrowser.animationsAnimationsMod.BrowserAnimationsModule
  
  @JSImport("@angular/platform-browser/animations", "NoopAnimationsModule")
  @js.native
  class NoopAnimationsModule ()
    extends typings.angularPlatformBrowser.animationsAnimationsMod.NoopAnimationsModule
  
  @JSImport("@angular/platform-browser/animations", "\u0275AnimationRenderer")
  @js.native
  class ɵAnimationRenderer protected ()
    extends typings.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRenderer {
    def this(
      factory: typings.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRendererFactory,
      namespaceId: String,
      delegate: Renderer2,
      engine: ɵAnimationEngine
    ) = this()
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275AnimationRendererFactory")
  @js.native
  class ɵAnimationRendererFactory protected ()
    extends typings.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRendererFactory {
    def this(delegate: RendererFactory2, engine: ɵAnimationEngine, _zone: NgZone) = this()
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275BrowserAnimationBuilder")
  @js.native
  class ɵBrowserAnimationBuilder protected ()
    extends typings.angularPlatformBrowser.animationsAnimationsMod.ɵBrowserAnimationBuilder {
    def this(rootRenderer: RendererFactory2, doc: js.Any) = this()
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275BrowserAnimationFactory")
  @js.native
  class ɵBrowserAnimationFactory protected ()
    extends typings.angularPlatformBrowser.animationsAnimationsMod.ɵBrowserAnimationFactory {
    def this(_id: String, _renderer: typings.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRenderer) = this()
  }
  
  @JSImport("@angular/platform-browser/animations", "\u0275InjectableAnimationEngine")
  @js.native
  class ɵInjectableAnimationEngine protected ()
    extends typings.angularPlatformBrowser.animationsAnimationsMod.ɵInjectableAnimationEngine {
    def this(doc: js.Any, driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer) = this()
  }
  
  @scala.inline
  def ɵangularPackagesPlatformBrowserAnimationsAnimationsA(): ɵWebAnimationsDriver | ɵCssKeyframesDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_animations_animations_a")().asInstanceOf[ɵWebAnimationsDriver | ɵCssKeyframesDriver]
  
  @scala.inline
  def ɵangularPackagesPlatformBrowserAnimationsAnimationsB(): ɵWebAnimationsStyleNormalizer = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_animations_animations_b")().asInstanceOf[ɵWebAnimationsStyleNormalizer]
  
  @scala.inline
  def ɵangularPackagesPlatformBrowserAnimationsAnimationsC(renderer: ɵDomRendererFactory2, engine: ɵAnimationEngine, zone: NgZone): typings.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRendererFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_platform_browser_animations_animations_c")(renderer.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.angularPlatformBrowser.animationsAnimationsMod.ɵAnimationRendererFactory]
  
  @JSImport("@angular/platform-browser/animations", "\u0275angular_packages_platform_browser_animations_animations_d")
  @js.native
  val ɵangularPackagesPlatformBrowserAnimationsAnimationsD: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser/animations", "\u0275angular_packages_platform_browser_animations_animations_e")
  @js.native
  val ɵangularPackagesPlatformBrowserAnimationsAnimationsE: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser/animations", "\u0275angular_packages_platform_browser_animations_animations_f")
  @js.native
  class ɵangularPackagesPlatformBrowserAnimationsAnimationsF protected ()
    extends typings.angularPlatformBrowser.animationsAnimationsMod.ɵangularPackagesPlatformBrowserAnimationsAnimationsF {
    def this(namespaceId: String, delegate: Renderer2, engine: ɵAnimationEngine) = this()
  }
}
