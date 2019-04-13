package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCognitoEventsResponse extends js.Object {
  /**
    * The Cognito Events returned from the GetCognitoEvents request
    */
  var Events: js.UndefOr[Events] = js.undefined
}

object GetCognitoEventsResponse {
  @scala.inline
  def apply(Events: Events = null): GetCognitoEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    __obj.asInstanceOf[GetCognitoEventsResponse]
  }
}

