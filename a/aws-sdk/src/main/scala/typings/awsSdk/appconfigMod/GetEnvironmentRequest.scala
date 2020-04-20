package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEnvironmentRequest extends js.Object {
  /**
    * The ID of the application that includes the environment you want to get.
    */
  var ApplicationId: Id = js.native
  /**
    * The ID of the environment you wnat to get.
    */
  var EnvironmentId: Id = js.native
}

object GetEnvironmentRequest {
  @scala.inline
  def apply(ApplicationId: Id, EnvironmentId: Id): GetEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentRequest]
  }
}

