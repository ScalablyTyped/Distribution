package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsOutput extends js.Object {
  /**
    * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a nextToken. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of build project names, with each build project name representing a single build project.
    */
  var projects: js.UndefOr[ProjectNames] = js.native
}

object ListProjectsOutput {
  @scala.inline
  def apply(nextToken: String = null, projects: ProjectNames = null): ListProjectsOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsOutput]
  }
}

