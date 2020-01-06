package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePlacementRequest extends js.Object {
  /**
    * The user-defined object of attributes used to update the placement. The maximum number of key/value pairs is 50.
    */
  var attributes: js.UndefOr[PlacementAttributeMap] = js.native
  /**
    * The name of the placement to update.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project containing the placement to be updated.
    */
  var projectName: ProjectName = js.native
}

object UpdatePlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName, attributes: PlacementAttributeMap = null): UpdatePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePlacementRequest]
  }
}

