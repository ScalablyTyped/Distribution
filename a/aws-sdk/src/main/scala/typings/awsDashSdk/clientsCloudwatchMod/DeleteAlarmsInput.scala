package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAlarmsInput extends js.Object {
  /**
    * The alarms to be deleted.
    */
  var AlarmNames: typings.awsDashSdk.clientsCloudwatchMod.AlarmNames = js.native
}

object DeleteAlarmsInput {
  @scala.inline
  def apply(AlarmNames: AlarmNames): DeleteAlarmsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAlarmsInput]
  }
}

