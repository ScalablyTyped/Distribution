package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePlacementRequest extends js.Object {
  /**
    * The name of the placement within a project.
    */
  var placementName: PlacementName
  /**
    * The project containing the placement to be described.
    */
  var projectName: ProjectName
}

object DescribePlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): DescribePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName, projectName = projectName)
  
    __obj.asInstanceOf[DescribePlacementRequest]
  }
}

