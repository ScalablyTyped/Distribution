package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestGridProjectRequest extends js.Object {
  /**
    * The ARN of the Selenium testing project, from either CreateTestGridProject or ListTestGridProjects.
    */
  var projectArn: DeviceFarmArn = js.native
}

object GetTestGridProjectRequest {
  @scala.inline
  def apply(projectArn: DeviceFarmArn): GetTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTestGridProjectRequest]
  }
}

