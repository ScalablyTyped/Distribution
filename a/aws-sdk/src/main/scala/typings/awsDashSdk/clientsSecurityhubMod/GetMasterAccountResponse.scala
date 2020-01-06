package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMasterAccountResponse extends js.Object {
  /**
    * A list of details about the Security Hub master account for the current member account. 
    */
  var Master: js.UndefOr[Invitation] = js.native
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(Master: Invitation = null): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Master != null) __obj.updateDynamic("Master")(Master.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
}

