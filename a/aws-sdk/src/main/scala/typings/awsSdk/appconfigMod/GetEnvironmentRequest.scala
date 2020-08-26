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
  @scala.inline
  implicit class GetEnvironmentRequestOps[Self <: GetEnvironmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationId(value: Id): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentId(value: Id): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
  }
  
}

