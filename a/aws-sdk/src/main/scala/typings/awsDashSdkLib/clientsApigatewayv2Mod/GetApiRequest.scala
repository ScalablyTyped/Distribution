package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
}

object GetApiRequest {
  @scala.inline
  def apply(ApiId: __string): GetApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId)
  
    __obj.asInstanceOf[GetApiRequest]
  }
}

