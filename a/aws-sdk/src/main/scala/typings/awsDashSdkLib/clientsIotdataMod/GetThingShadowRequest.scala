package typings
package awsDashSdkLib.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetThingShadowRequest extends js.Object {
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}

object GetThingShadowRequest {
  @scala.inline
  def apply(thingName: ThingName): GetThingShadowRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
  
    __obj.asInstanceOf[GetThingShadowRequest]
  }
}

