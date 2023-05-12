package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingHistoryUpdate extends StObject {
  
  /**
    *  The value of the ASFF field after the finding change event. To preserve storage and readability, Security Hub omits this value if  FindingHistoryRecord  exceeds database limits. 
    */
  var NewValue: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The value of the ASFF field before the finding change event. 
    */
  var OldValue: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The ASFF field that changed during the finding change event. 
    */
  var UpdatedField: js.UndefOr[NonEmptyString] = js.undefined
}
object FindingHistoryUpdate {
  
  inline def apply(): FindingHistoryUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingHistoryUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingHistoryUpdate] (val x: Self) extends AnyVal {
    
    inline def setNewValue(value: NonEmptyString): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "NewValue", js.undefined)
    
    inline def setOldValue(value: NonEmptyString): Self = StObject.set(x, "OldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "OldValue", js.undefined)
    
    inline def setUpdatedField(value: NonEmptyString): Self = StObject.set(x, "UpdatedField", value.asInstanceOf[js.Any])
    
    inline def setUpdatedFieldUndefined: Self = StObject.set(x, "UpdatedField", js.undefined)
  }
}
