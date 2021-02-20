package typings.angularCommon

import typings.angularCommon.angularCommonTestingMod.MockPlatformLocationConfig
import typings.angularCommon.mod.LocationStrategy
import typings.angularCommon.mod.PlatformLocation
import typings.angularCore.mod.InjectionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularCommonMod {
  
  @JSImport("@angular/common/testing", "MOCK_PLATFORM_LOCATION_CONFIG")
  @js.native
  val MOCK_PLATFORM_LOCATION_CONFIG: InjectionToken[MockPlatformLocationConfig] = js.native
  
  @JSImport("@angular/common/testing", "MockLocationStrategy")
  @js.native
  class MockLocationStrategy ()
    extends typings.angularCommon.angularCommonTestingMod.MockLocationStrategy
  
  @JSImport("@angular/common/testing", "MockPlatformLocation")
  @js.native
  class MockPlatformLocation ()
    extends typings.angularCommon.angularCommonTestingMod.MockPlatformLocation {
    def this(config: MockPlatformLocationConfig) = this()
  }
  
  @JSImport("@angular/common/testing", "SpyLocation")
  @js.native
  class SpyLocation protected ()
    extends typings.angularCommon.angularCommonTestingMod.SpyLocation {
    def this(platformStrategy: LocationStrategy, platformLocation: PlatformLocation) = this()
  }
}
