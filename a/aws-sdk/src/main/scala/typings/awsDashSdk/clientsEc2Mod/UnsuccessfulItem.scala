package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsuccessfulItem extends js.Object {
  /**
    * Information about the error.
    */
  var Error: js.UndefOr[UnsuccessfulItemError] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
}

object UnsuccessfulItem {
  @scala.inline
  def apply(Error: UnsuccessfulItemError = null, ResourceId: String = null): UnsuccessfulItem = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsuccessfulItem]
  }
}

