package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
}

object DeleteApiRequest {
  @scala.inline
  def apply(ApiId: __string): DeleteApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId)
  
    __obj.asInstanceOf[DeleteApiRequest]
  }
}

