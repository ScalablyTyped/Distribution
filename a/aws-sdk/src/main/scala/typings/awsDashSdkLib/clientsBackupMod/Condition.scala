package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * The key in a key-value pair. For example, in "ec2:ResourceTag/Department": "accounting", "ec2:ResourceTag/Department" is the key.
    */
  var ConditionKey: awsDashSdkLib.clientsBackupMod.ConditionKey
  /**
    * An operation, such as StringEquals, that is applied to a key-value pair used to filter resources in a selection.
    */
  var ConditionType: awsDashSdkLib.clientsBackupMod.ConditionType
  /**
    * The value in a key-value pair. For example, in "ec2:ResourceTag/Department": "accounting", "accounting" is the value.
    */
  var ConditionValue: awsDashSdkLib.clientsBackupMod.ConditionValue
}

object Condition {
  @scala.inline
  def apply(ConditionKey: ConditionKey, ConditionType: ConditionType, ConditionValue: ConditionValue): Condition = {
    val __obj = js.Dynamic.literal(ConditionKey = ConditionKey, ConditionType = ConditionType.asInstanceOf[js.Any], ConditionValue = ConditionValue)
  
    __obj.asInstanceOf[Condition]
  }
}

