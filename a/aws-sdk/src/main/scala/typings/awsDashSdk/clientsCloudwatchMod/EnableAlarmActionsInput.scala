package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableAlarmActionsInput extends js.Object {
  /**
    * The names of the alarms.
    */
  var AlarmNames: typings.awsDashSdk.clientsCloudwatchMod.AlarmNames
}

object EnableAlarmActionsInput {
  @scala.inline
  def apply(AlarmNames: AlarmNames): EnableAlarmActionsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames)
  
    __obj.asInstanceOf[EnableAlarmActionsInput]
  }
}

