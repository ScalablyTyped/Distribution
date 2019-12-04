package typings.atAngularCommon

import typings.atAngularCommon.testingTestingMod.MockPlatformLocationConfig
import typings.atAngularCore.atAngularCoreMod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class MockLocationStrategy ()
    extends typings.atAngularCommon.testingTestingMod.MockLocationStrategy
  
  @js.native
  class MockPlatformLocation ()
    extends typings.atAngularCommon.testingTestingMod.MockPlatformLocation {
    def this(config: MockPlatformLocationConfig) = this()
  }
  
  @js.native
  class SpyLocation ()
    extends typings.atAngularCommon.testingTestingMod.SpyLocation
  
  val MOCK_PLATFORM_LOCATION_CONFIG: InjectionToken[MockPlatformLocationConfig] = js.native
}

