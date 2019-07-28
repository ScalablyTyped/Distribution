package typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod

import typings.atAngularCore.atAngularCoreMod.ComponentRef
import typings.atAngularCore.atAngularCoreMod.ErrorHandler
import typings.atAngularCore.atAngularCoreMod.InjectionToken
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.NgProbeToken
import typings.atAngularCore.atAngularCoreMod.PlatformRef
import typings.atAngularCore.atAngularCoreMod.Provider
import typings.atAngularCore.atAngularCoreMod.StaticProvider
import typings.atAngularCore.atAngularCoreMod.Version
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EVENT_MANAGER_PLUGINS: InjectionToken[js.Array[ɵangular_packages_platform_browser_platform_browser_g]] = js.native
  val HAMMER_GESTURE_CONFIG: InjectionToken[HammerGestureConfig] = js.native
  val HAMMER_LOADER: InjectionToken[HammerLoader] = js.native
  val VERSION: Version = js.native
  val ɵBROWSER_SANITIZATION_PROVIDERS: js.Array[StaticProvider] = js.native
  val ɵELEMENT_PROBE_PROVIDERS: js.Array[Provider] = js.native
  val ɵELEMENT_PROBE_PROVIDERS__POST_R3__ : js.Array[scala.Nothing] = js.native
  val ɵINTERNAL_BROWSER_PLATFORM_PROVIDERS: js.Array[StaticProvider] = js.native
  val ɵTRANSITION_ID: InjectionToken[js.Object] = js.native
  val ɵangular_packages_platform_browser_platform_browser_c: js.Array[StaticProvider] = js.native
  val ɵangular_packages_platform_browser_platform_browser_i: js.Array[StaticProvider] = js.native
  val ɵangular_packages_platform_browser_platform_browser_k: js.Array[Provider] = js.native
  def disableDebugTools(): Unit = js.native
  def enableDebugTools[T](ref: ComponentRef[T]): ComponentRef[T] = js.native
  def makeStateKey[T](key: String): StateKey[T] = js.native
  def platformBrowser(): PlatformRef = js.native
  def platformBrowser(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def ɵangular_packages_platform_browser_platform_browser_a(): ErrorHandler = js.native
  def ɵangular_packages_platform_browser_platform_browser_b(): js.Any = js.native
  def ɵangular_packages_platform_browser_platform_browser_d(): Meta = js.native
  def ɵangular_packages_platform_browser_platform_browser_e(): Title = js.native
  def ɵangular_packages_platform_browser_platform_browser_f(doc: Document, appId: String): TransferState = js.native
  def ɵangular_packages_platform_browser_platform_browser_h(transitionId: String, document: js.Any, injector: Injector): js.Function0[Unit] = js.native
  def ɵangular_packages_platform_browser_platform_browser_j(coreTokens: js.Array[NgProbeToken]): js.Any = js.native
  def ɵescapeHtml(text: String): String = js.native
  def ɵflattenStyles(compId: String, styles: js.Array[_ | js.Array[_]], target: js.Array[String]): js.Array[String] = js.native
  def ɵgetDOM(): ɵDomAdapter = js.native
  def ɵinitDomAdapter(): Unit = js.native
  def ɵsetRootDomAdapter(adapter: ɵDomAdapter): Unit = js.native
  def ɵshimContentAttribute(componentShortId: String): String = js.native
  def ɵshimHostAttribute(componentShortId: String): String = js.native
}

