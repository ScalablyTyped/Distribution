package typings.angularCommon

import typings.angularCommon.anon.Optional
import typings.angularCommon.mod.Location
import typings.angularCommon.mod.LocationStrategy
import typings.angularCommon.mod.PlatformLocation
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/common/testing", "MOCK_PLATFORM_LOCATION_CONFIG")
  @js.native
  val MOCK_PLATFORM_LOCATION_CONFIG: InjectionToken[MockPlatformLocationConfig] = js.native
  
  @JSImport("@angular/common/testing", "MockLocationStrategy")
  @js.native
  open class MockLocationStrategy () extends LocationStrategy {
    
    var internalBaseHref: String = js.native
    
    var internalPath: String = js.native
    
    var internalTitle: String = js.native
    
    def simulatePopState(url: String): Unit = js.native
    
    /* private */ var stateChanges: Any = js.native
    
    var urlChanges: js.Array[String] = js.native
  }
  /* static members */
  object MockLocationStrategy {
    
    @JSImport("@angular/common/testing", "MockLocationStrategy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/common/testing", "MockLocationStrategy.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[MockLocationStrategy, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[MockLocationStrategy, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/common/testing", "MockLocationStrategy.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[MockLocationStrategy] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[MockLocationStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/common/testing", "MockPlatformLocation")
  @js.native
  open class MockPlatformLocation () extends PlatformLocation {
    def this(config: MockPlatformLocationConfig) = this()
    
    /* private */ var baseHref: Any = js.native
    
    /* private */ var hashUpdate: Any = js.native
    
    @JSName("historyGo")
    def historyGo_MMockPlatformLocation(): Unit = js.native
    @JSName("historyGo")
    def historyGo_MMockPlatformLocation(relativePosition: Double): Unit = js.native
    
    /* private */ var parseChanges: Any = js.native
    
    /* private */ var scheduleHashUpdate: Any = js.native
    
    def state: Any = js.native
    
    def url: String = js.native
    
    /* private */ var urlChangeIndex: Any = js.native
    
    /* private */ var urlChanges: Any = js.native
  }
  /* static members */
  object MockPlatformLocation {
    
    @JSImport("@angular/common/testing", "MockPlatformLocation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/common/testing", "MockPlatformLocation.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[MockPlatformLocation, js.Array[Optional]] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[MockPlatformLocation, js.Array[Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/common/testing", "MockPlatformLocation.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[MockPlatformLocation] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[MockPlatformLocation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/common/testing", "SpyLocation")
  @js.native
  open class SpyLocation protected () extends Location {
    def this(locationStrategy: LocationStrategy) = this()
    
    /* private */ var _history: Any = js.native
    
    /* private */ var _historyIndex: Any = js.native
    
    /* private */ var pushHistory: Any = js.native
    
    def setBaseHref(url: String): Unit = js.native
    
    def setInitialPath(url: String): Unit = js.native
    
    def simulateHashChange(pathname: String): Unit = js.native
    
    def simulateUrlPop(pathname: String): Unit = js.native
    
    var urlChanges: js.Array[String] = js.native
  }
  /* static members */
  object SpyLocation {
    
    @JSImport("@angular/common/testing", "SpyLocation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/common/testing", "SpyLocation.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[SpyLocation, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[SpyLocation, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/common/testing", "SpyLocation.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[SpyLocation] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[SpyLocation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  trait MockPlatformLocationConfig extends StObject {
    
    var appBaseHref: js.UndefOr[String] = js.undefined
    
    var startUrl: js.UndefOr[String] = js.undefined
  }
  object MockPlatformLocationConfig {
    
    inline def apply(): MockPlatformLocationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockPlatformLocationConfig]
    }
    
    extension [Self <: MockPlatformLocationConfig](x: Self) {
      
      inline def setAppBaseHref(value: String): Self = StObject.set(x, "appBaseHref", value.asInstanceOf[js.Any])
      
      inline def setAppBaseHrefUndefined: Self = StObject.set(x, "appBaseHref", js.undefined)
      
      inline def setStartUrl(value: String): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
      
      inline def setStartUrlUndefined: Self = StObject.set(x, "startUrl", js.undefined)
    }
  }
}
