package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetFpgaImageAttributeResult extends js.Object {
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}

object ResetFpgaImageAttributeResult {
  @scala.inline
  def apply(Return: js.UndefOr[Boolean] = js.undefined): ResetFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return)
    __obj.asInstanceOf[ResetFpgaImageAttributeResult]
  }
}

