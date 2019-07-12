package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEventBusRequest extends js.Object {
  /**
    * The name of the event bus to delete.
    */
  var Name: EventBusName
}

object DeleteEventBusRequest {
  @scala.inline
  def apply(Name: EventBusName): DeleteEventBusRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteEventBusRequest]
  }
}

