package typings.awsDashSdk.clientsCodestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SNS topic.
    */
  var TargetAddress: js.UndefOr[typings.awsDashSdk.clientsCodestarnotificationsMod.TargetAddress] = js.native
  /**
    * The target type. Can be an Amazon SNS topic.
    */
  var TargetType: js.UndefOr[typings.awsDashSdk.clientsCodestarnotificationsMod.TargetType] = js.native
}

object Target {
  @scala.inline
  def apply(TargetAddress: TargetAddress = null, TargetType: TargetType = null): Target = {
    val __obj = js.Dynamic.literal()
    if (TargetAddress != null) __obj.updateDynamic("TargetAddress")(TargetAddress.asInstanceOf[js.Any])
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

