package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectRequest extends js.Object {
  /**
    * The name of the project to create.
    */
  var ProjectName: typings.awsDashSdk.clientsRekognitionMod.ProjectName = js.native
}

object CreateProjectRequest {
  @scala.inline
  def apply(ProjectName: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateProjectRequest]
  }
}

