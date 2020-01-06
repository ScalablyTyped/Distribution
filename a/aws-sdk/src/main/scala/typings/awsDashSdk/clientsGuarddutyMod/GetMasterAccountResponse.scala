package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMasterAccountResponse extends js.Object {
  /**
    * Master account details.
    */
  var Master: typings.awsDashSdk.clientsGuarddutyMod.Master = js.native
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(Master: Master): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal(Master = Master.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
}

