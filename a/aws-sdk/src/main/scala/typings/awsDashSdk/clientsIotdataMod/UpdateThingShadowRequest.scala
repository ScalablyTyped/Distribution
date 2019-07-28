package typings.awsDashSdk.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateThingShadowRequest extends js.Object {
  /**
    * The state information, in JSON format.
    */
  var payload: JsonDocument
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}

object UpdateThingShadowRequest {
  @scala.inline
  def apply(payload: JsonDocument, thingName: ThingName): UpdateThingShadowRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], thingName = thingName)
  
    __obj.asInstanceOf[UpdateThingShadowRequest]
  }
}

