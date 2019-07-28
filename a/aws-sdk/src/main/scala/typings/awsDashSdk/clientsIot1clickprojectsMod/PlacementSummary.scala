package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementSummary extends js.Object {
  /**
    * The date when the placement was originally created, in UNIX epoch time format.
    */
  var createdDate: Time
  /**
    * The name of the placement being summarized.
    */
  var placementName: PlacementName
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName
  /**
    * The date when the placement was last updated, in UNIX epoch time format. If the placement was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: Time
}

object PlacementSummary {
  @scala.inline
  def apply(createdDate: Time, placementName: PlacementName, projectName: ProjectName, updatedDate: Time): PlacementSummary = {
    val __obj = js.Dynamic.literal(createdDate = createdDate, placementName = placementName, projectName = projectName, updatedDate = updatedDate)
  
    __obj.asInstanceOf[PlacementSummary]
  }
}

