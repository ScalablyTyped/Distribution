package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTestResult extends js.Object {
  /**
    * A test condition that is evaluated.
    */
  var test: js.UndefOr[Test] = js.undefined
}

object GetTestResult {
  @scala.inline
  def apply(test: Test = null): GetTestResult = {
    val __obj = js.Dynamic.literal()
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[GetTestResult]
  }
}

