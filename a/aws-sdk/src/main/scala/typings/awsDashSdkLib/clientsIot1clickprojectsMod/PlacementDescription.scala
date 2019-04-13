package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementDescription extends js.Object {
  /**
    * The user-defined attributes associated with the placement.
    */
  var attributes: PlacementAttributeMap
  /**
    * The date when the placement was initially created, in UNIX epoch time format.
    */
  var createdDate: Time
  /**
    * The name of the placement.
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

object PlacementDescription {
  @scala.inline
  def apply(
    attributes: PlacementAttributeMap,
    createdDate: Time,
    placementName: PlacementName,
    projectName: ProjectName,
    updatedDate: Time
  ): PlacementDescription = {
    val __obj = js.Dynamic.literal(attributes = attributes, createdDate = createdDate, placementName = placementName, projectName = projectName, updatedDate = updatedDate)
  
    __obj.asInstanceOf[PlacementDescription]
  }
}

