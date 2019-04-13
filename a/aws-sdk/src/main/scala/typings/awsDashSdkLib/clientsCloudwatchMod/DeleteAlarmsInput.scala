package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAlarmsInput extends js.Object {
  /**
    * The alarms to be deleted.
    */
  var AlarmNames: awsDashSdkLib.clientsCloudwatchMod.AlarmNames
}

object DeleteAlarmsInput {
  @scala.inline
  def apply(AlarmNames: AlarmNames): DeleteAlarmsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames)
  
    __obj.asInstanceOf[DeleteAlarmsInput]
  }
}

