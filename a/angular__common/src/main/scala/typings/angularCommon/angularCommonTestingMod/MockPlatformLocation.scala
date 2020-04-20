package typings.angularCommon.angularCommonTestingMod

import typings.angularCommon.mod.PlatformLocation
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
  var urlChanges: js.Any = js.native
  def state: js.Any = js.native
  def url: String = js.native
}

