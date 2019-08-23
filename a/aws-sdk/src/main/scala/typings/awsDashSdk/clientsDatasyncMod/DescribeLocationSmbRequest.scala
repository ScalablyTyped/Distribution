package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLocationSmbRequest extends js.Object {
  /**
    * The Amazon resource Name (ARN) of the SMB location to describe.
    */
  var LocationArn: typings.awsDashSdk.clientsDatasyncMod.LocationArn
}

object DescribeLocationSmbRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationSmbRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn)
  
    __obj.asInstanceOf[DescribeLocationSmbRequest]
  }
}

