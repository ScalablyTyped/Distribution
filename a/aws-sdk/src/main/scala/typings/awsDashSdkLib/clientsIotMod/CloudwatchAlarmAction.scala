package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudwatchAlarmAction extends js.Object {
  /**
    * The CloudWatch alarm name.
    */
  var alarmName: AlarmName
  /**
    * The IAM role that allows access to the CloudWatch alarm.
    */
  var roleArn: AwsArn
  /**
    * The reason for the alarm change.
    */
  var stateReason: StateReason
  /**
    * The value of the alarm state. Acceptable values are: OK, ALARM, INSUFFICIENT_DATA.
    */
  var stateValue: StateValue
}

object CloudwatchAlarmAction {
  @scala.inline
  def apply(alarmName: AlarmName, roleArn: AwsArn, stateReason: StateReason, stateValue: StateValue): CloudwatchAlarmAction = {
    val __obj = js.Dynamic.literal(alarmName = alarmName, roleArn = roleArn, stateReason = stateReason, stateValue = stateValue)
  
    __obj.asInstanceOf[CloudwatchAlarmAction]
  }
}

