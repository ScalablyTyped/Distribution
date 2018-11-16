package typings
package atAngularPlatformDashBrowserLib.platformDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", JSImport.Namespace)
@js.native
object platformDashBrowserModMembers extends js.Object {
  val DOCUMENT: atAngularCoreLib.coreMod.InjectionToken[stdLib.Document] = js.native
  val EVENT_MANAGER_PLUGINS: atAngularCoreLib.coreMod.InjectionToken[
    js.Array[
      atAngularPlatformDashBrowserLib.srcDomEventsEventUnderscoreManagerMod.EventManagerPlugin
    ]
  ] = js.native
  val HAMMER_GESTURE_CONFIG: atAngularCoreLib.coreMod.InjectionToken[
    atAngularPlatformDashBrowserLib.srcDomEventsHammerUnderscoreGesturesMod.HammerGestureConfig
  ] = js.native
  val HAMMER_LOADER: atAngularCoreLib.coreMod.InjectionToken[
    atAngularPlatformDashBrowserLib.srcDomEventsHammerUnderscoreGesturesMod.HammerLoader
  ] = js.native
  val VERSION: atAngularCoreLib.coreMod.Version = js.native
  val platformBrowser: js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]], 
    atAngularCoreLib.coreMod.PlatformRef
  ] = js.native
  val ɵBROWSER_SANITIZATION_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider] = js.native
  val ɵELEMENT_PROBE_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.Provider] = js.native
  val ɵINTERNAL_BROWSER_PLATFORM_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider] = js.native
  val ɵTRANSITION_ID: atAngularCoreLib.coreMod.InjectionToken[js.Object] = js.native
  val ɵangular_packages_platform_browser_platform_browser_c: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider] = js.native
  val ɵangular_packages_platform_browser_platform_browser_i: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider] = js.native
  def disableDebugTools(): scala.Unit = js.native
  def enableDebugTools[T](ref: atAngularCoreLib.coreMod.ComponentRef[T]): atAngularCoreLib.coreMod.ComponentRef[T] = js.native
  def makeStateKey[T](key: java.lang.String): atAngularPlatformDashBrowserLib.srcBrowserTransferUnderscoreStateMod.StateKey[T] = js.native
  def ɵangular_packages_platform_browser_platform_browser_a(): atAngularCoreLib.coreMod.ErrorHandler = js.native
  def ɵangular_packages_platform_browser_platform_browser_b(): js.Any = js.native
  def ɵangular_packages_platform_browser_platform_browser_d(): atAngularPlatformDashBrowserLib.srcBrowserMetaMod.Meta = js.native
  def ɵangular_packages_platform_browser_platform_browser_e(): atAngularPlatformDashBrowserLib.srcBrowserTitleMod.Title = js.native
  def ɵangular_packages_platform_browser_platform_browser_f(doc: stdLib.Document, appId: java.lang.String): atAngularPlatformDashBrowserLib.srcBrowserTransferUnderscoreStateMod.TransferState = js.native
  def ɵangular_packages_platform_browser_platform_browser_h(transitionId: java.lang.String, document: js.Any, injector: atAngularCoreLib.coreMod.Injector): js.Function0[scala.Unit] = js.native
  def ɵangular_packages_platform_browser_platform_browser_j(coreTokens: js.Array[atAngularCoreLib.coreMod.NgProbeToken]): js.Any = js.native
  def ɵescapeHtml(text: java.lang.String): java.lang.String = js.native
  def ɵflattenStyles(compId: java.lang.String, styles: js.Array[_ | js.Array[_]], target: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def ɵgetDOM(): atAngularPlatformDashBrowserLib.srcDomDomUnderscoreAdapterMod.DomAdapter = js.native
  def ɵinitDomAdapter(): scala.Unit = js.native
  def ɵsetRootDomAdapter(adapter: atAngularPlatformDashBrowserLib.srcDomDomUnderscoreAdapterMod.DomAdapter): scala.Unit = js.native
  def ɵshimContentAttribute(componentShortId: java.lang.String): java.lang.String = js.native
  def ɵshimHostAttribute(componentShortId: java.lang.String): java.lang.String = js.native
}

