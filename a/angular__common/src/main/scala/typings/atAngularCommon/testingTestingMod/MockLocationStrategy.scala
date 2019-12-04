package typings.atAngularCommon.testingTestingMod

import typings.atAngularCommon.atAngularCommonMod.LocationStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/testing/testing", "MockLocationStrategy")
@js.native
class MockLocationStrategy () extends LocationStrategy {
  var internalBaseHref: String = js.native
  var internalPath: String = js.native
  var internalTitle: String = js.native
  var stateChanges: js.Any = js.native
  var urlChanges: js.Array[String] = js.native
  def getState(): js.Any = js.native
  def simulatePopState(url: String): Unit = js.native
}

