package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsuccessfulItem extends js.Object {
  /**
    * Information about the error.
    */
  var Error: js.UndefOr[UnsuccessfulItemError] = js.undefined
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
}

object UnsuccessfulItem {
  @scala.inline
  def apply(Error: UnsuccessfulItemError = null, ResourceId: String = null): UnsuccessfulItem = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    __obj.asInstanceOf[UnsuccessfulItem]
  }
}

