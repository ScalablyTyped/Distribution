package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * The key in a key-value pair. For example, in the tag Department: Accounting, Department is the key.
    */
  var ConditionKey: typings.awsSdk.clientsBackupMod.ConditionKey
  
  /**
    * An operation applied to a key-value pair used to assign resources to your backup plan. Condition only supports StringEquals. For more flexible assignment options, including StringLike and the ability to exclude resources from your backup plan, use Conditions (with an "s" on the end) for your  BackupSelection .
    */
  var ConditionType: typings.awsSdk.clientsBackupMod.ConditionType
  
  /**
    * The value in a key-value pair. For example, in the tag Department: Accounting, Accounting is the value.
    */
  var ConditionValue: typings.awsSdk.clientsBackupMod.ConditionValue
}
object Condition {
  
  inline def apply(ConditionKey: ConditionKey, ConditionType: ConditionType, ConditionValue: ConditionValue): Condition = {
    val __obj = js.Dynamic.literal(ConditionKey = ConditionKey.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], ConditionValue = ConditionValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    inline def setConditionKey(value: ConditionKey): Self = StObject.set(x, "ConditionKey", value.asInstanceOf[js.Any])
    
    inline def setConditionType(value: ConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    inline def setConditionValue(value: ConditionValue): Self = StObject.set(x, "ConditionValue", value.asInstanceOf[js.Any])
  }
}
