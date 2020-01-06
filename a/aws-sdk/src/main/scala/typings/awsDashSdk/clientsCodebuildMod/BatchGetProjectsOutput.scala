package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetProjectsOutput extends js.Object {
  /**
    * Information about the requested build projects.
    */
  var projects: js.UndefOr[Projects] = js.native
  /**
    * The names of build projects for which information could not be found.
    */
  var projectsNotFound: js.UndefOr[ProjectNames] = js.native
}

object BatchGetProjectsOutput {
  @scala.inline
  def apply(projects: Projects = null, projectsNotFound: ProjectNames = null): BatchGetProjectsOutput = {
    val __obj = js.Dynamic.literal()
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    if (projectsNotFound != null) __obj.updateDynamic("projectsNotFound")(projectsNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetProjectsOutput]
  }
}

