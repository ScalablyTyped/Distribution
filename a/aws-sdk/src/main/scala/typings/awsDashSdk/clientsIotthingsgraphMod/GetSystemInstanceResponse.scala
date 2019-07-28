package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInstanceResponse extends js.Object {
  /**
    * An object that describes the system instance.
    */
  var description: js.UndefOr[SystemInstanceDescription] = js.undefined
}

object GetSystemInstanceResponse {
  @scala.inline
  def apply(description: SystemInstanceDescription = null): GetSystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[GetSystemInstanceResponse]
  }
}

