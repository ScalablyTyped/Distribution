package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLocationNfsRequest extends js.Object {
  /**
    * The Amazon resource Name (ARN) of the NFS location to describe.
    */
  var LocationArn: typings.awsDashSdk.clientsDatasyncMod.LocationArn
}

object DescribeLocationNfsRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationNfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn)
  
    __obj.asInstanceOf[DescribeLocationNfsRequest]
  }
}

