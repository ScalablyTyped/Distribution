package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetProjectsInput extends js.Object {
  /**
    * The names or ARNs of the build projects. To get information about a project shared with your AWS account, its ARN must be specified. You cannot specify a shared project using its name.
    */
  var names: ProjectNames = js.native
}

object BatchGetProjectsInput {
  @scala.inline
  def apply(names: ProjectNames): BatchGetProjectsInput = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetProjectsInput]
  }
}

