package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMinuteUsageRequest extends js.Object {
  /**
    * The month being requested, with a value of 1-12.
    */
  var month: Integer
  /**
    * The year being requested, in the format of YYYY.
    */
  var year: Integer
}

object GetMinuteUsageRequest {
  @scala.inline
  def apply(month: Integer, year: Integer): GetMinuteUsageRequest = {
    val __obj = js.Dynamic.literal(month = month, year = year)
  
    __obj.asInstanceOf[GetMinuteUsageRequest]
  }
}

