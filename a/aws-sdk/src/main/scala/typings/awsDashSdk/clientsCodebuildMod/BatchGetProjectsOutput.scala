package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetProjectsOutput extends js.Object {
  /**
    * Information about the requested build projects.
    */
  var projects: js.UndefOr[Projects] = js.undefined
  /**
    * The names of build projects for which information could not be found.
    */
  var projectsNotFound: js.UndefOr[ProjectNames] = js.undefined
}

object BatchGetProjectsOutput {
  @scala.inline
  def apply(projects: Projects = null, projectsNotFound: ProjectNames = null): BatchGetProjectsOutput = {
    val __obj = js.Dynamic.literal()
    if (projects != null) __obj.updateDynamic("projects")(projects)
    if (projectsNotFound != null) __obj.updateDynamic("projectsNotFound")(projectsNotFound)
    __obj.asInstanceOf[BatchGetProjectsOutput]
  }
}

