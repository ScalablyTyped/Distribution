package typings.atAngularCommon.testingTestingMod

import typings.atAngularCommon.atAngularCommonMod.PlatformLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/testing/testing", "MockPlatformLocation")
@js.native
class MockPlatformLocation () extends PlatformLocation {
  def this(config: MockPlatformLocationConfig) = this()
  var baseHref: js.Any = js.native
  var hashUpdate: js.Any = js.native
  var parseChanges: js.Any = js.native
  val state: js.Any = js.native
  val url: String = js.native
  var urlChanges: js.Any = js.native
}

