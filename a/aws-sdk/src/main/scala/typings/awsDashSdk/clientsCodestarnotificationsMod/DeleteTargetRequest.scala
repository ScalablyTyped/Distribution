package typings.awsDashSdk.clientsCodestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTargetRequest extends js.Object {
  /**
    * A Boolean value that can be used to delete all associations with this SNS topic. The default value is FALSE. If set to TRUE, all associations between that target and every notification rule in your AWS account are deleted.
    */
  var ForceUnsubscribeAll: js.UndefOr[typings.awsDashSdk.clientsCodestarnotificationsMod.ForceUnsubscribeAll] = js.native
  /**
    * The Amazon Resource Name (ARN) of the SNS topic to delete.
    */
  var TargetAddress: typings.awsDashSdk.clientsCodestarnotificationsMod.TargetAddress = js.native
}

object DeleteTargetRequest {
  @scala.inline
  def apply(TargetAddress: TargetAddress, ForceUnsubscribeAll: js.UndefOr[Boolean] = js.undefined): DeleteTargetRequest = {
    val __obj = js.Dynamic.literal(TargetAddress = TargetAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(ForceUnsubscribeAll)) __obj.updateDynamic("ForceUnsubscribeAll")(ForceUnsubscribeAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTargetRequest]
  }
}

