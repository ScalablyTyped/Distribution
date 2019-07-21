package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IotEventsAction extends js.Object {
  /**
    * The name of the AWS IoT Events input where the data is sent.
    */
  var inputName: InputName
}

object IotEventsAction {
  @scala.inline
  def apply(inputName: InputName): IotEventsAction = {
    val __obj = js.Dynamic.literal(inputName = inputName)
  
    __obj.asInstanceOf[IotEventsAction]
  }
}

