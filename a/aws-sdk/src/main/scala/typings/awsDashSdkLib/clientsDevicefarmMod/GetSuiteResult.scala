package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSuiteResult extends js.Object {
  /**
    * A collection of one or more tests.
    */
  var suite: js.UndefOr[Suite] = js.undefined
}

object GetSuiteResult {
  @scala.inline
  def apply(suite: Suite = null): GetSuiteResult = {
    val __obj = js.Dynamic.literal()
    if (suite != null) __obj.updateDynamic("suite")(suite)
    __obj.asInstanceOf[GetSuiteResult]
  }
}

