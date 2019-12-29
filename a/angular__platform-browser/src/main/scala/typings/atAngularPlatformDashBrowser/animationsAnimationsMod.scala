package typings.atAngularPlatformDashBrowser

import typings.atAngularAnimations.atAngularAnimationsMod.AnimationBuilder
import typings.atAngularAnimations.atAngularAnimationsMod.AnimationFactory
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
import typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserStrings.body
import typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserStrings.document
import typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/animations/animations", JSImport.Namespace)
@js.native
object animationsAnimationsMod extends js.Object {
  @js.native
  class BrowserAnimationsModule () extends js.Object
  
  @js.native
  class NoopAnimationsModule () extends js.Object
  
  @js.native
  class ɵAnimationRenderer protected () extends ɵangular_packages_platform_browser_animations_animations_f {
    def this(
      factory: ɵAnimationRendererFactory,
      namespaceId: String,
      delegate: Renderer2,
      engine: ɵAnimationEngine
    ) = this()
    var factory: ɵAnimationRendererFactory = js.native
    @JSName("listen")
    def listen_body(target: body, eventName: String, callback: js.Function1[/* event */ js.Any, _]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_document(target: document, eventName: String, callback: js.Function1[/* event */ js.Any, _]): js.Function0[Unit] = js.native
    @JSName("listen")
    def listen_window(target: window, eventName: String, callback: js.Function1[/* event */ js.Any, _]): js.Function0[Unit] = js.native
  }
  
  @js.native
  class ɵAnimationRendererFactory protected () extends RendererFactory2 {
    def this(delegate: RendererFactory2, engine: ɵAnimationEngine, _zone: NgZone) = this()
    var _animationCallbacksBuffer: js.Any = js.native
    var _cdRecurDepth: js.Any = js.native
    var _currentId: js.Any = js.native
    var _microtaskId: js.Any = js.native
    var _rendererCache: js.Any = js.native
    var _scheduleCountTask: js.Any = js.native
    var _zone: js.Any = js.native
    var delegate: js.Any = js.native
    var engine: js.Any = js.native
    var promise: js.Any = js.native
    @JSName("begin")
    def begin_MɵAnimationRendererFactory(): Unit = js.native
    @JSName("end")
    def end_MɵAnimationRendererFactory(): Unit = js.native
    @JSName("whenRenderingDone")
    def whenRenderingDone_MɵAnimationRendererFactory(): js.Promise[_] = js.native
  }
  
  @js.native
  class ɵBrowserAnimationBuilder protected () extends AnimationBuilder {
    def this(rootRenderer: RendererFactory2, doc: js.Any) = this()
    var _nextAnimationId: js.Any = js.native
    var _renderer: js.Any = js.native
  }
  
  @js.native
  class ɵBrowserAnimationFactory protected () extends AnimationFactory {
    def this(_id: String, _renderer: ɵAnimationRenderer) = this()
    var _id: js.Any = js.native
    var _renderer: js.Any = js.native
  }
  
  @js.native
  class ɵInjectableAnimationEngine protected () extends ɵAnimationEngine {
    def this(doc: js.Any, driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer) = this()
  }
  
  @js.native
  class ɵangular_packages_platform_browser_animations_animations_f protected () extends Renderer2 {
    def this(namespaceId: String, delegate: Renderer2, engine: ɵAnimationEngine) = this()
    var delegate: Renderer2 = js.native
    var engine: ɵAnimationEngine = js.native
    var namespaceId: String = js.native
    /* protected */ def disableAnimations(element: js.Any, value: Boolean): Unit = js.native
  }
  
  val ANIMATION_MODULE_TYPE: InjectionToken[NoopAnimations | BrowserAnimations] = js.native
  val ɵangular_packages_platform_browser_animations_animations_d: js.Array[Provider] = js.native
  val ɵangular_packages_platform_browser_animations_animations_e: js.Array[Provider] = js.native
  def ɵangular_packages_platform_browser_animations_animations_a(): ɵWebAnimationsDriver | ɵCssKeyframesDriver = js.native
  def ɵangular_packages_platform_browser_animations_animations_b(): ɵWebAnimationsStyleNormalizer = js.native
  def ɵangular_packages_platform_browser_animations_animations_c(renderer: ɵDomRendererFactory2, engine: ɵAnimationEngine, zone: NgZone): ɵAnimationRendererFactory = js.native
}

