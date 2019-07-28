package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableAlarmActionsInput extends js.Object {
  /**
    * The names of the alarms.
    */
  var AlarmNames: typings.awsDashSdk.clientsCloudwatchMod.AlarmNames
}

object DisableAlarmActionsInput {
  @scala.inline
  def apply(AlarmNames: AlarmNames): DisableAlarmActionsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames)
  
    __obj.asInstanceOf[DisableAlarmActionsInput]
  }
}

