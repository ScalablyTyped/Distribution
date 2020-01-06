package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDetails extends js.Object {
  /**
    *  Website URL for this project in the AWS Mobile Hub console. 
    */
  var consoleUrl: js.UndefOr[ConsoleUrl] = js.native
  /**
    *  Date the project was created. 
    */
  var createdDate: js.UndefOr[_Date] = js.native
  /**
    *  Date of the last modification of the project. 
    */
  var lastUpdatedDate: js.UndefOr[_Date] = js.native
  var name: js.UndefOr[ProjectName] = js.native
  var projectId: js.UndefOr[ProjectId] = js.native
  var region: js.UndefOr[ProjectRegion] = js.native
  var resources: js.UndefOr[Resources] = js.native
  var state: js.UndefOr[ProjectState] = js.native
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
    if (consoleUrl != null) __obj.updateDynamic("consoleUrl")(consoleUrl.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetails]
  }
}

