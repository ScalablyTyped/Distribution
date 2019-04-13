package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMasterAccountResponse extends js.Object {
  var Master: js.UndefOr[Master] = js.undefined
}

object GetMasterAccountResponse {
  @scala.inline
  def apply(Master: Master = null): GetMasterAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Master != null) __obj.updateDynamic("Master")(Master)
    __obj.asInstanceOf[GetMasterAccountResponse]
  }
}

