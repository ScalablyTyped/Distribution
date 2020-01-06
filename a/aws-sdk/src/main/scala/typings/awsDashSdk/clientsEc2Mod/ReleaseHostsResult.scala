package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseHostsResult extends js.Object {
  /**
    * The IDs of the Dedicated Hosts that were successfully released.
    */
  var Successful: js.UndefOr[ResponseHostIdList] = js.native
  /**
    * The IDs of the Dedicated Hosts that could not be released, including an error message.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.native
}

object ReleaseHostsResult {
  @scala.inline
  def apply(Successful: ResponseHostIdList = null, Unsuccessful: UnsuccessfulItemList = null): ReleaseHostsResult = {
    val __obj = js.Dynamic.literal()
    if (Successful != null) __obj.updateDynamic("Successful")(Successful.asInstanceOf[js.Any])
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseHostsResult]
  }
}

