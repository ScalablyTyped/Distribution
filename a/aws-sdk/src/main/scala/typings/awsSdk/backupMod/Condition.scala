package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends StObject {
  
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
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionKey(value: ConditionKey): Self = StObject.set(x, "ConditionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionType(value: ConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionValue(value: ConditionValue): Self = StObject.set(x, "ConditionValue", value.asInstanceOf[js.Any])
  }
}
