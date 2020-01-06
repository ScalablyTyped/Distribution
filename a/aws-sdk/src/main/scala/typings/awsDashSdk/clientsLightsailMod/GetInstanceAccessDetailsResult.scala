package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceAccessDetailsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about a get instance access request.
    */
  var accessDetails: js.UndefOr[InstanceAccessDetails] = js.native
}

object GetInstanceAccessDetailsResult {
  @scala.inline
  def apply(accessDetails: InstanceAccessDetails = null): GetInstanceAccessDetailsResult = {
    val __obj = js.Dynamic.literal()
    if (accessDetails != null) __obj.updateDynamic("accessDetails")(accessDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceAccessDetailsResult]
  }
}

