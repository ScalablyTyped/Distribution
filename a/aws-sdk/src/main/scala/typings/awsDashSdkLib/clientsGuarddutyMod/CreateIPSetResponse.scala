package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIPSetResponse extends js.Object {
  var IpSetId: js.UndefOr[IpSetId] = js.undefined
}

object CreateIPSetResponse {
  @scala.inline
  def apply(IpSetId: IpSetId = null): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal()
    if (IpSetId != null) __obj.updateDynamic("IpSetId")(IpSetId)
    __obj.asInstanceOf[CreateIPSetResponse]
  }
}

