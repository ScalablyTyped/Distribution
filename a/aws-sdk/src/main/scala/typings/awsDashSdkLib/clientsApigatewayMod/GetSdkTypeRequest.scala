package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSdkTypeRequest extends js.Object {
  /**
    * [Required] The identifier of the queried SdkType instance.
    */
  var id: String
}

object GetSdkTypeRequest {
  @scala.inline
  def apply(id: String): GetSdkTypeRequest = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[GetSdkTypeRequest]
  }
}

