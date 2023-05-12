package typings.angularPlatformBrowser.mod

import typings.angularCommon.mod.ɵDomAdapter
import typings.angularCore.mod.ApplicationRef
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.EnvironmentProviders
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Provider
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.Type
import typings.angularCore.mod.Version
import typings.angularPlatformBrowser.angularPlatformBrowserInts.`0`
import typings.angularPlatformBrowser.angularPlatformBrowserInts.`1`
import typings.angularPlatformBrowser.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EVENT_MANAGER_PLUGINS: InjectionToken[js.Array[EventManagerPlugin]] = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_MANAGER_PLUGINS").asInstanceOf[InjectionToken[js.Array[EventManagerPlugin]]]

inline def HAMMER_GESTURE_CONFIG: InjectionToken[HammerGestureConfig] = ^.asInstanceOf[js.Dynamic].selectDynamic("HAMMER_GESTURE_CONFIG").asInstanceOf[InjectionToken[HammerGestureConfig]]

inline def HAMMER_LOADER: InjectionToken[HammerLoader] = ^.asInstanceOf[js.Dynamic].selectDynamic("HAMMER_LOADER").asInstanceOf[InjectionToken[HammerLoader]]

inline def REMOVE_STYLES_ON_COMPONENT_DESTROY: InjectionToken[Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("REMOVE_STYLES_ON_COMPONENT_DESTROY").asInstanceOf[InjectionToken[Boolean]]

inline def VERSION: Version = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[Version]

inline def bootstrapApplication(rootComponent: Type[Any]): js.Promise[ApplicationRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrapApplication")(rootComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationRef]]
inline def bootstrapApplication(rootComponent: Type[Any], options: ApplicationConfig): js.Promise[ApplicationRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("bootstrapApplication")(rootComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApplicationRef]]

inline def createApplication(): js.Promise[ApplicationRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("createApplication")().asInstanceOf[js.Promise[ApplicationRef]]
inline def createApplication(options: ApplicationConfig): js.Promise[ApplicationRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("createApplication")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationRef]]

inline def disableDebugTools(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableDebugTools")().asInstanceOf[Unit]

inline def enableDebugTools[T](ref: ComponentRef[T]): ComponentRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDebugTools")(ref.asInstanceOf[js.Any]).asInstanceOf[ComponentRef[T]]

inline def makeStateKey[T](key: String): typings.angularCore.mod.StateKey[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.angularCore.mod.StateKey[T]]

inline def platformBrowser(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowser")().asInstanceOf[PlatformRef]
inline def platformBrowser(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowser")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]

inline def provideClientHydration(features: HydrationFeature[HydrationFeatureKind]*): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("provideClientHydration")(features.asInstanceOf[Seq[js.Any]]*).asInstanceOf[EnvironmentProviders]

inline def provideProtractorTestingSupport(): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideProtractorTestingSupport")().asInstanceOf[js.Array[Provider]]

inline def withNoDomReuse(): HydrationFeature[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNoDomReuse")().asInstanceOf[HydrationFeature[`0`]]

inline def withNoHttpTransferCache(): HydrationFeature[`1`] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNoHttpTransferCache")().asInstanceOf[HydrationFeature[`1`]]

inline def ɵINTERNALBROWSERPLATFORMPROVIDERS: js.Array[StaticProvider] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275INTERNAL_BROWSER_PLATFORM_PROVIDERS").asInstanceOf[js.Array[StaticProvider]]

inline def ɵgetDOM(): ɵDomAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDOM")().asInstanceOf[ɵDomAdapter]

inline def ɵinitDomAdapter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275initDomAdapter")().asInstanceOf[Unit]

type ApplicationConfig = typings.angularCore.mod.ApplicationConfig

type HammerLoader = js.Function0[js.Promise[Unit]]

type SafeHtml = SafeValue

type SafeResourceUrl = SafeValue

type SafeScript = SafeValue

type SafeStyle = SafeValue

type SafeUrl = SafeValue

type StateKey[T] = typings.angularCore.mod.StateKey[T]

type TransferState = typings.angularCore.mod.TransferState
