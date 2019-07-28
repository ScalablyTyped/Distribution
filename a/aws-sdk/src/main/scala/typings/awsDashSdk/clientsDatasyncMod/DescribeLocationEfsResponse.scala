package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLocationEfsResponse extends js.Object {
  /**
    * The time that the EFS location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  var Ec2Config: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.Ec2Config] = js.undefined
  /**
    * The Amazon resource Name (ARN) of the EFS location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationArn] = js.undefined
  /**
    * The URL of the EFS location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationUri] = js.undefined
}

object DescribeLocationEfsResponse {
  @scala.inline
  def apply(
    CreationTime: Time = null,
    Ec2Config: Ec2Config = null,
    LocationArn: LocationArn = null,
    LocationUri: LocationUri = null
  ): DescribeLocationEfsResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Ec2Config != null) __obj.updateDynamic("Ec2Config")(Ec2Config)
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri)
    __obj.asInstanceOf[DescribeLocationEfsResponse]
  }
}

