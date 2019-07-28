package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMasterAccountResponse extends js.Object {
  /**
    * A list of details about the Security Hub master account for the current member account. 
    */
  var Master: js.UndefOr[Invitation] = js.undefined
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(Master: Invitation = null): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Master != null) __obj.updateDynamic("Master")(Master)
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
}

