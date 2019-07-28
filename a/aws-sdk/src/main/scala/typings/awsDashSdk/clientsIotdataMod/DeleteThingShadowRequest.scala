package typings.awsDashSdk.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteThingShadowRequest extends js.Object {
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}

object DeleteThingShadowRequest {
  @scala.inline
  def apply(thingName: ThingName): DeleteThingShadowRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
  
    __obj.asInstanceOf[DeleteThingShadowRequest]
  }
}

