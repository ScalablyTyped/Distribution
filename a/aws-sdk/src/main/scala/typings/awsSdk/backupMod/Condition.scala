package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * The key in a key-value pair. For example, in "ec2:ResourceTag/Department": "accounting", "ec2:ResourceTag/Department" is the key.
    */
  var ConditionKey: typings.awsSdk.backupMod.ConditionKey = js.native
  /**
    * An operation, such as STRINGEQUALS, that is applied to a key-value pair used to filter resources in a selection.
    */
  var ConditionType: typings.awsSdk.backupMod.ConditionType = js.native
  /**
    * The value in a key-value pair. For example, in "ec2:ResourceTag/Department": "accounting", "accounting" is the value.
    */
  var ConditionValue: typings.awsSdk.backupMod.ConditionValue = js.native
}

object Condition {
  @scala.inline
  def apply(ConditionKey: ConditionKey, ConditionType: ConditionType, ConditionValue: ConditionValue): Condition = {
    val __obj = js.Dynamic.literal(ConditionKey = ConditionKey.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], ConditionValue = ConditionValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Condition]
  }
}

