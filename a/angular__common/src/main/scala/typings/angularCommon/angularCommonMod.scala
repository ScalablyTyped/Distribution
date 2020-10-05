package typings.angularCommon

import typings.angularCommon.angularCommonTestingMod.MockPlatformLocationConfig
import typings.angularCore.mod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/testing", JSImport.Namespace)
@js.native
object angularCommonMod extends js.Object {
  @js.native
  class MockLocationStrategy ()
    extends typings.angularCommon.angularCommonTestingMod.MockLocationStrategy
  
  @js.native
  class MockPlatformLocation ()
    extends typings.angularCommon.angularCommonTestingMod.MockPlatformLocation {
    def this(config: MockPlatformLocationConfig) = this()
  }
  
  @js.native
  class SpyLocation ()
    extends typings.angularCommon.angularCommonTestingMod.SpyLocation
  
  val MOCK_PLATFORM_LOCATION_CONFIG: InjectionToken[MockPlatformLocationConfig] = js.native
}

