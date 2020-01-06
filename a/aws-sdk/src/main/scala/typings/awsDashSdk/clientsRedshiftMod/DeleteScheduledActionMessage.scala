package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteScheduledActionMessage extends js.Object {
  /**
    * The name of the scheduled action to delete. 
    */
  var ScheduledActionName: String = js.native
}

object DeleteScheduledActionMessage {
  @scala.inline
  def apply(ScheduledActionName: String): DeleteScheduledActionMessage = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteScheduledActionMessage]
  }
}

