package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCognitoEventsResponse extends js.Object {
  /**
    * The Cognito Events returned from the GetCognitoEvents request
    */
  var Events: js.UndefOr[typings.awsDashSdk.clientsCognitosyncMod.Events] = js.native
}

object GetCognitoEventsResponse {
  @scala.inline
  def apply(Events: Events = null): GetCognitoEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCognitoEventsResponse]
  }
}

