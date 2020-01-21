package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSdkTypeRequest extends js.Object {
  /**
    * [Required] The identifier of the queried SdkType instance.
    */
  var id: String = js.native
}

object GetSdkTypeRequest {
  @scala.inline
  def apply(id: String): GetSdkTypeRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSdkTypeRequest]
  }
}

