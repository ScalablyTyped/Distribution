package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionParameter extends StObject {
  
  /**
    * The key in a key-value pair. For example, in the tag Department: Accounting, Department is the key.
    */
  var ConditionKey: js.UndefOr[typings.awsSdk.clientsBackupMod.ConditionKey] = js.undefined
  
  /**
    * The value in a key-value pair. For example, in the tag Department: Accounting, Accounting is the value.
    */
  var ConditionValue: js.UndefOr[typings.awsSdk.clientsBackupMod.ConditionValue] = js.undefined
}
object ConditionParameter {
  
  inline def apply(): ConditionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionParameter] (val x: Self) extends AnyVal {
    
    inline def setConditionKey(value: ConditionKey): Self = StObject.set(x, "ConditionKey", value.asInstanceOf[js.Any])
    
    inline def setConditionKeyUndefined: Self = StObject.set(x, "ConditionKey", js.undefined)
    
    inline def setConditionValue(value: ConditionValue): Self = StObject.set(x, "ConditionValue", value.asInstanceOf[js.Any])
    
    inline def setConditionValueUndefined: Self = StObject.set(x, "ConditionValue", js.undefined)
  }
}
