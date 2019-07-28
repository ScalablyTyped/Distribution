package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCognitoEventsRequest extends js.Object {
  /**
    * The events to configure
    */
  var Events: typings.awsDashSdk.clientsCognitosyncMod.Events
  /**
    * The Cognito Identity Pool to use when configuring Cognito Events
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitosyncMod.IdentityPoolId
}

object SetCognitoEventsRequest {
  @scala.inline
  def apply(Events: Events, IdentityPoolId: IdentityPoolId): SetCognitoEventsRequest = {
    val __obj = js.Dynamic.literal(Events = Events, IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[SetCognitoEventsRequest]
  }
}

