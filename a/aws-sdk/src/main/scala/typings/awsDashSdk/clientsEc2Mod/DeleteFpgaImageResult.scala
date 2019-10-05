package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFpgaImageResult extends js.Object {
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}

object DeleteFpgaImageResult {
  @scala.inline
  def apply(Return: js.UndefOr[scala.Boolean] = js.undefined): DeleteFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return)
    __obj.asInstanceOf[DeleteFpgaImageResult]
  }
}

