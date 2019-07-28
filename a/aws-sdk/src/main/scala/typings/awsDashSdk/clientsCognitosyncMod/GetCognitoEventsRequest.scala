package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCognitoEventsRequest extends js.Object {
  /**
    * The Cognito Identity Pool ID for the request
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitosyncMod.IdentityPoolId
}

object GetCognitoEventsRequest {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): GetCognitoEventsRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[GetCognitoEventsRequest]
  }
}

