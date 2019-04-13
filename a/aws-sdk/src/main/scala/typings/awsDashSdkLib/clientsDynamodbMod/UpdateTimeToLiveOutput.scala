package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTimeToLiveOutput extends js.Object {
  /**
    * Represents the output of an UpdateTimeToLive operation.
    */
  var TimeToLiveSpecification: js.UndefOr[TimeToLiveSpecification] = js.undefined
}

object UpdateTimeToLiveOutput {
  @scala.inline
  def apply(TimeToLiveSpecification: TimeToLiveSpecification = null): UpdateTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    if (TimeToLiveSpecification != null) __obj.updateDynamic("TimeToLiveSpecification")(TimeToLiveSpecification)
    __obj.asInstanceOf[UpdateTimeToLiveOutput]
  }
}

