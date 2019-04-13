package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementResponse extends js.Object {
  /**
    * The name of the placement group the instance is in.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}

object PlacementResponse {
  @scala.inline
  def apply(GroupName: String = null): PlacementResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[PlacementResponse]
  }
}

