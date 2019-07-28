package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLocationEfsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the EFS location to describe.
    */
  var LocationArn: typings.awsDashSdk.clientsDatasyncMod.LocationArn
}

object DescribeLocationEfsRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationEfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn)
  
    __obj.asInstanceOf[DescribeLocationEfsRequest]
  }
}

