package typings.angularPlatformBrowser.mod

import typings.angularCommon.mod.ɵDomAdapter
import typings.angularCore.mod.ApplicationRef
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Provider
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.Type
import typings.angularCore.mod.Version
import typings.angularPlatformBrowser.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def EVENT_MANAGER_PLUGINS: InjectionToken[js.Array[EventManagerPlugin]] = ^.asInstanceOf[js.Dynamic].selectDynamic("EVENT_MANAGER_PLUGINS").asInstanceOf[InjectionToken[js.Array[EventManagerPlugin]]]

inline def HAMMER_GESTURE_CONFIG: InjectionToken[HammerGestureConfig] = ^.asInstanceOf[js.Dynamic].selectDynamic("HAMMER_GESTURE_CONFIG").asInstanceOf[InjectionToken[HammerGestureConfig]]

inline def HAMMER_LOADER: InjectionToken[HammerLoader] = ^.asInstanceOf[js.Dynamic].selectDynamic("HAMMER_LOADER").asInstanceOf[InjectionToken[HammerLoader]]

inline def VERSION: Version = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[Version]

inline def bootstrapApplication(rootComponent: Type[Any]): js.Promise[ApplicationRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrapApplication")(rootComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationRef]]
inline def bootstrapApplication(rootComponent: Type[Any], options: ApplicationConfig): js.Promise[ApplicationRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("bootstrapApplication")(rootComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApplicationRef]]

inline def createApplication(): js.Promise[ApplicationRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("createApplication")().asInstanceOf[js.Promise[ApplicationRef]]
inline def createApplication(options: ApplicationConfig): js.Promise[ApplicationRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("createApplication")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApplicationRef]]

inline def disableDebugTools(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableDebugTools")().asInstanceOf[Unit]

inline def enableDebugTools[T](ref: ComponentRef[T]): ComponentRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDebugTools")(ref.asInstanceOf[js.Any]).asInstanceOf[ComponentRef[T]]

inline def makeStateKey[T](key: String): StateKey[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStateKey")(key.asInstanceOf[js.Any]).asInstanceOf[StateKey[T]]

inline def platformBrowser(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowser")().asInstanceOf[PlatformRef]
inline def platformBrowser(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowser")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]

inline def provideProtractorTestingSupport(): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("provideProtractorTestingSupport")().asInstanceOf[js.Array[Provider]]

inline def ɵINTERNALBROWSERPLATFORMPROVIDERS: js.Array[StaticProvider] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275INTERNAL_BROWSER_PLATFORM_PROVIDERS").asInstanceOf[js.Array[StaticProvider]]

inline def ɵTRANSITIONID: InjectionToken[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275TRANSITION_ID").asInstanceOf[InjectionToken[Any]]

inline def ɵescapeHtml(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275escapeHtml")(text.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ɵflattenStyles(compId: String, styles: js.Array[Any | js.Array[Any]], target: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275flattenStyles")(compId.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def ɵgetDOM(): ɵDomAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDOM")().asInstanceOf[ɵDomAdapter]

inline def ɵinitDomAdapter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275initDomAdapter")().asInstanceOf[Unit]

inline def ɵshimContentAttribute(componentShortId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275shimContentAttribute")(componentShortId.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ɵshimHostAttribute(componentShortId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275shimHostAttribute")(componentShortId.asInstanceOf[js.Any]).asInstanceOf[String]

type HammerLoader = js.Function0[js.Promise[Unit]]

type SafeHtml = SafeValue

type SafeResourceUrl = SafeValue

type SafeScript = SafeValue

type SafeStyle = SafeValue

type SafeUrl = SafeValue
