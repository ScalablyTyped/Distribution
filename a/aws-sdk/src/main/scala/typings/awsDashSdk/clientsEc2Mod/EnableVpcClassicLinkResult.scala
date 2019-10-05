package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableVpcClassicLinkResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}

object EnableVpcClassicLinkResult {
  @scala.inline
  def apply(Return: js.UndefOr[scala.Boolean] = js.undefined): EnableVpcClassicLinkResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return)
    __obj.asInstanceOf[EnableVpcClassicLinkResult]
  }
}

