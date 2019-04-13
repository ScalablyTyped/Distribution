package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCognitoEventsRequest extends js.Object {
  /**
    * The events to configure
    */
  var Events: awsDashSdkLib.clientsCognitosyncMod.Events
  /**
    * The Cognito Identity Pool to use when configuring Cognito Events
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitosyncMod.IdentityPoolId
}

object SetCognitoEventsRequest {
  @scala.inline
  def apply(Events: Events, IdentityPoolId: IdentityPoolId): SetCognitoEventsRequest = {
    val __obj = js.Dynamic.literal(Events = Events, IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[SetCognitoEventsRequest]
  }
}

