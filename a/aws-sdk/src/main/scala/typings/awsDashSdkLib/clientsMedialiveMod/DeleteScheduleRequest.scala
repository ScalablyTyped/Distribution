package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteScheduleRequest extends js.Object {
  /**
    * Id of the channel whose schedule is being deleted.
    */
  var ChannelId: __string
}

object DeleteScheduleRequest {
  @scala.inline
  def apply(ChannelId: __string): DeleteScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId)
  
    __obj.asInstanceOf[DeleteScheduleRequest]
  }
}

