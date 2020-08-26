package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSchemaCreationStatusRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
}

object GetSchemaCreationStatusRequest {
  @scala.inline
  def apply(apiId: String): GetSchemaCreationStatusRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaCreationStatusRequest]
  }
  @scala.inline
  implicit class GetSchemaCreationStatusRequestOps[Self <: GetSchemaCreationStatusRequest] (val x: Self) extends AnyVal {
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
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
  }
  
}

