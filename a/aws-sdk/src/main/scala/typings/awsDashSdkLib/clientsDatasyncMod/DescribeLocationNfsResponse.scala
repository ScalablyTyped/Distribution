package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLocationNfsResponse extends js.Object {
  /**
    * The time that the NFS location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  /**
    * The Amazon resource Name (ARN) of the NFS location that was described.
    */
  var LocationArn: js.UndefOr[LocationArn] = js.undefined
  /**
    * The URL of the source NFS location that was described.
    */
  var LocationUri: js.UndefOr[LocationUri] = js.undefined
  var OnPremConfig: js.UndefOr[OnPremConfig] = js.undefined
}

object DescribeLocationNfsResponse {
  @scala.inline
  def apply(
    CreationTime: Time = null,
    LocationArn: LocationArn = null,
    LocationUri: LocationUri = null,
    OnPremConfig: OnPremConfig = null
  ): DescribeLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri)
    if (OnPremConfig != null) __obj.updateDynamic("OnPremConfig")(OnPremConfig)
    __obj.asInstanceOf[DescribeLocationNfsResponse]
  }
}

