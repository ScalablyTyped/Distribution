package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertTarget extends js.Object {
  /**
    * The ARN of the notification target to which alerts are sent.
    */
  var alertTargetArn: AlertTargetArn
  /**
    * The ARN of the role that grants permission to send alerts to the notification target.
    */
  var roleArn: RoleArn
}

object AlertTarget {
  @scala.inline
  def apply(alertTargetArn: AlertTargetArn, roleArn: RoleArn): AlertTarget = {
    val __obj = js.Dynamic.literal(alertTargetArn = alertTargetArn, roleArn = roleArn)
  
    __obj.asInstanceOf[AlertTarget]
  }
}

