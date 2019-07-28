package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableVpcClassicLinkDnsSupportResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}

object DisableVpcClassicLinkDnsSupportResult {
  @scala.inline
  def apply(Return: js.UndefOr[Boolean] = js.undefined): DisableVpcClassicLinkDnsSupportResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return)
    __obj.asInstanceOf[DisableVpcClassicLinkDnsSupportResult]
  }
}

