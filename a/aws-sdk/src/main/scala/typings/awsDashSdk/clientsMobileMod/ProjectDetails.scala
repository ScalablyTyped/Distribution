package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetails extends js.Object {
  /**
    *  Website URL for this project in the AWS Mobile Hub console. 
    */
  var consoleUrl: js.UndefOr[ConsoleUrl] = js.undefined
  /**
    *  Date the project was created. 
    */
  var createdDate: js.UndefOr[_Date] = js.undefined
  /**
    *  Date of the last modification of the project. 
    */
  var lastUpdatedDate: js.UndefOr[_Date] = js.undefined
  var name: js.UndefOr[ProjectName] = js.undefined
  var projectId: js.UndefOr[ProjectId] = js.undefined
  var region: js.UndefOr[ProjectRegion] = js.undefined
  var resources: js.UndefOr[Resources] = js.undefined
  var state: js.UndefOr[ProjectState] = js.undefined
}

object ProjectDetails {
  @scala.inline
  def apply(
    consoleUrl: ConsoleUrl = null,
    createdDate: _Date = null,
    lastUpdatedDate: _Date = null,
    name: ProjectName = null,
    projectId: ProjectId = null,
    region: ProjectRegion = null,
    resources: Resources = null,
    state: ProjectState = null
  ): ProjectDetails = {
    val __obj = js.Dynamic.literal()
    if (consoleUrl != null) __obj.updateDynamic("consoleUrl")(consoleUrl)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (region != null) __obj.updateDynamic("region")(region)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetails]
  }
}

