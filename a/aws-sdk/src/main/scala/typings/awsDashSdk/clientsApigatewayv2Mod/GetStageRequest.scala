package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStageRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: __string = js.native
}

object GetStageRequest {
  @scala.inline
  def apply(ApiId: __string, StageName: __string): GetStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetStageRequest]
  }
}

