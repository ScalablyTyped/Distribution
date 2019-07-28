package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStageRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The stage name.
    */
  var StageName: __string
}

object DeleteStageRequest {
  @scala.inline
  def apply(ApiId: __string, StageName: __string): DeleteStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, StageName = StageName)
  
    __obj.asInstanceOf[DeleteStageRequest]
  }
}

