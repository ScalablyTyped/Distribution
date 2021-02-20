package typings.angularCommon

import typings.angularCommon.mod.Location
import typings.angularCommon.mod.LocationStrategy
import typings.angularCommon.mod.PlatformLocation
import typings.angularCore.mod.InjectionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularCommonTestingMod {
  
  @JSImport("@angular/common/testing/testing", "MOCK_PLATFORM_LOCATION_CONFIG")
  @js.native
  val MOCK_PLATFORM_LOCATION_CONFIG: InjectionToken[MockPlatformLocationConfig] = js.native
  
  @JSImport("@angular/common/testing/testing", "MockLocationStrategy")
  @js.native
  class MockLocationStrategy () extends LocationStrategy {
    
    def getState(): js.Any = js.native
    
    var internalBaseHref: String = js.native
    
    var internalPath: String = js.native
    
    var internalTitle: String = js.native
    
    def simulatePopState(url: String): Unit = js.native
    
    var stateChanges: js.Any = js.native
    
    var urlChanges: js.Array[String] = js.native
  }
  
  @JSImport("@angular/common/testing/testing", "MockPlatformLocation")
  @js.native
  class MockPlatformLocation () extends PlatformLocation {
    def this(config: MockPlatformLocationConfig) = this()
    
    var baseHref: js.Any = js.native
    
    var hashUpdate: js.Any = js.native
    
    var parseChanges: js.Any = js.native
    
    def state: js.Any = js.native
    
    def url: String = js.native
    
    var urlChanges: js.Any = js.native
  }
  
  @JSImport("@angular/common/testing/testing", "SpyLocation")
  @js.native
  class SpyLocation protected () extends Location {
    def this(platformStrategy: LocationStrategy, platformLocation: PlatformLocation) = this()
    
    var _history: js.Any = js.native
    
    var _historyIndex: js.Any = js.native
    
    def setBaseHref(url: String): Unit = js.native
    
    def setInitialPath(url: String): Unit = js.native
    
    def simulateHashChange(pathname: String): Unit = js.native
    
    def simulateUrlPop(pathname: String): Unit = js.native
    
    var urlChanges: js.Array[String] = js.native
  }
  
  @js.native
  trait MockPlatformLocationConfig extends StObject {
    
    var appBaseHref: js.UndefOr[String] = js.native
    
    var startUrl: js.UndefOr[String] = js.native
  }
  object MockPlatformLocationConfig {
    
    @scala.inline
    def apply(): MockPlatformLocationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockPlatformLocationConfig]
    }
    
    @scala.inline
    implicit class MockPlatformLocationConfigMutableBuilder[Self <: MockPlatformLocationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppBaseHref(value: String): Self = StObject.set(x, "appBaseHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppBaseHrefUndefined: Self = StObject.set(x, "appBaseHref", js.undefined)
      
      @scala.inline
      def setStartUrl(value: String): Self = StObject.set(x, "startUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUrlUndefined: Self = StObject.set(x, "startUrl", js.undefined)
    }
  }
}
