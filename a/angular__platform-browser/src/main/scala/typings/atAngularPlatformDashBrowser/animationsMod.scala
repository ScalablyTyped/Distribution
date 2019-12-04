package typings.atAngularPlatformDashBrowser

import typings.atAngularAnimations.browserMod.AnimationDriver
import typings.atAngularAnimations.browserMod.ɵAnimationEngine
import typings.atAngularAnimations.browserMod.ɵAnimationStyleNormalizer
import typings.atAngularAnimations.browserMod.ɵCssKeyframesDriver
import typings.atAngularAnimations.browserMod.ɵWebAnimationsDriver
import typings.atAngularAnimations.browserMod.ɵWebAnimationsStyleNormalizer
import typings.atAngularCore.atAngularCoreMod.InjectionToken
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.atAngularCore.atAngularCoreMod.Provider
import typings.atAngularCore.atAngularCoreMod.Renderer2
import typings.atAngularCore.atAngularCoreMod.RendererFactory2
import typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod.ɵDomRendererFactory2
import typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserStrings.BrowserAnimations
import typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserStrings.NoopAnimations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/animations", JSImport.Namespace)
@js.native
object animationsMod extends js.Object {
  @js.native
  class BrowserAnimationsModule ()
    extends typings.atAngularPlatformDashBrowser.animationsAnimationsMod.BrowserAnimationsModule
  
  @js.native
  class NoopAnimationsModule ()
    extends typings.atAngularPlatformDashBrowser.animationsAnimationsMod.NoopAnimationsModule
  
  @js.native
  class ɵAnimationRenderer protected ()
    extends typings.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRenderer {
    def this(
      factory: typings.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRendererFactory,
      namespaceId: String,
      delegate: Renderer2,
      engine: ɵAnimationEngine
    ) = this()
  }
  
  @js.native
  class ɵAnimationRendererFactory protected ()
    extends typings.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRendererFactory {
    def this(delegate: RendererFactory2, engine: ɵAnimationEngine, _zone: NgZone) = this()
  }
  
  @js.native
  class ɵBrowserAnimationBuilder protected ()
    extends typings.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵBrowserAnimationBuilder {
    def this(rootRenderer: RendererFactory2, doc: js.Any) = this()
  }
  
  @js.native
  class ɵBrowserAnimationFactory protected ()
    extends typings.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵBrowserAnimationFactory {
    def this(
      _id: String,
      _renderer: typings.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRenderer
    ) = this()
  }
  
  @js.native
  class ɵInjectableAnimationEngine protected ()
    extends typings.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵInjectableAnimationEngine {
    def this(doc: js.Any, driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer) = this()
  }
  
  @js.native
  class ɵangular_packages_platform_browser_animations_animations_f protected ()
    extends typings.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵangular_packages_platform_browser_animations_animations_f {
    def this(namespaceId: String, delegate: Renderer2, engine: ɵAnimationEngine) = this()
  }
  
  val ANIMATION_MODULE_TYPE: InjectionToken[NoopAnimations | BrowserAnimations] = js.native
  val ɵangular_packages_platform_browser_animations_animations_d: js.Array[Provider] = js.native
  val ɵangular_packages_platform_browser_animations_animations_e: js.Array[Provider] = js.native
  def ɵangular_packages_platform_browser_animations_animations_a(): ɵWebAnimationsDriver | ɵCssKeyframesDriver = js.native
  def ɵangular_packages_platform_browser_animations_animations_b(): ɵWebAnimationsStyleNormalizer = js.native
  def ɵangular_packages_platform_browser_animations_animations_c(renderer: ɵDomRendererFactory2, engine: ɵAnimationEngine, zone: NgZone): typings.atAngularPlatformDashBrowser.animationsAnimationsMod.ɵAnimationRendererFactory = js.native
}

