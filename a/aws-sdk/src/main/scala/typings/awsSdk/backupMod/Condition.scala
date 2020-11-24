package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends js.Object {
  
  /**
    * The key in a key-value pair. For example, in "ec2:ResourceTag/Department": "accounting", "ec2:ResourceTag/Department" is the key.
    */
  var ConditionKey: typings.awsSdk.backupMod.ConditionKey = js.native
  
  /**
    * An operation, such as StringEquals, that is applied to a key-value pair used to filter resources in a selection.
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
  
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConditionKey(value: ConditionKey): Self = this.set("ConditionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionType(value: ConditionType): Self = this.set("ConditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionValue(value: ConditionValue): Self = this.set("ConditionValue", value.asInstanceOf[js.Any])
  }
}
