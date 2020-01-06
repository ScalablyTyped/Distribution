package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTestGridProjectRequest extends js.Object {
  /**
    * The ARN of the project to delete, from CreateTestGridProject or ListTestGridProjects.
    */
  var projectArn: DeviceFarmArn = js.native
}

object DeleteTestGridProjectRequest {
  @scala.inline
  def apply(projectArn: DeviceFarmArn): DeleteTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTestGridProjectRequest]
  }
}

