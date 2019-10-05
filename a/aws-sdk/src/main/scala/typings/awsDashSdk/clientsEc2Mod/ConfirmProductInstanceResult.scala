package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmProductInstanceResult extends js.Object {
  /**
    * The AWS account ID of the instance owner. This is only present if the product code is attached to the instance.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The return value of the request. Returns true if the specified product code is owned by the requester and associated with the specified instance.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}

object ConfirmProductInstanceResult {
  @scala.inline
  def apply(OwnerId: String = null, Return: js.UndefOr[scala.Boolean] = js.undefined): ConfirmProductInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return)
    __obj.asInstanceOf[ConfirmProductInstanceResult]
  }
}

