package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * A description of the application.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsAppconfigMod.Description] = js.native
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsAppconfigMod.Name] = js.native
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(ApplicationId: Id, Description: Description = null, Name: Name = null): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
}

