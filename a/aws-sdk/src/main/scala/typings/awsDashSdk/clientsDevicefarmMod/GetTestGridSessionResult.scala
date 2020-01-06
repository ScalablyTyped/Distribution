package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestGridSessionResult extends js.Object {
  /**
    * The TestGridSession that was requested.
    */
  var testGridSession: js.UndefOr[TestGridSession] = js.native
}

object GetTestGridSessionResult {
  @scala.inline
  def apply(testGridSession: TestGridSession = null): GetTestGridSessionResult = {
    val __obj = js.Dynamic.literal()
    if (testGridSession != null) __obj.updateDynamic("testGridSession")(testGridSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTestGridSessionResult]
  }
}

