package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationRequest extends js.Object {
  /**
    * The ID of the application you want to get.
    */
  var ApplicationId: Id = js.native
}

object GetApplicationRequest {
  @scala.inline
  def apply(ApplicationId: Id): GetApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApplicationRequest]
  }
}

