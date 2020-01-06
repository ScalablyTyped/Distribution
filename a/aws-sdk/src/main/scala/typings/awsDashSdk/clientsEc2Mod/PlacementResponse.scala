package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementResponse extends js.Object {
  /**
    * The name of the placement group that the instance is in.
    */
  var GroupName: js.UndefOr[String] = js.native
}

object PlacementResponse {
  @scala.inline
  def apply(GroupName: String = null): PlacementResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementResponse]
  }
}

