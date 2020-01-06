package typings.awsDashSdk.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteThingShadowRequest extends js.Object {
  /**
    * The name of the thing.
    */
  var thingName: ThingName = js.native
}

object DeleteThingShadowRequest {
  @scala.inline
  def apply(thingName: ThingName): DeleteThingShadowRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteThingShadowRequest]
  }
}

