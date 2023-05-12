package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableFieldOption extends StObject {
  
  /**
    * The custom label of the pivot table field.
    */
  var CustomLabel: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CustomLabel] = js.undefined
  
  /**
    * The field ID of the pivot table field.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The visibility of the pivot table field.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object PivotTableFieldOption {
  
  inline def apply(FieldId: FieldId): PivotTableFieldOption = {
    val __obj = js.Dynamic.literal(FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTableFieldOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableFieldOption] (val x: Self) extends AnyVal {
    
    inline def setCustomLabel(value: CustomLabel): Self = StObject.set(x, "CustomLabel", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelUndefined: Self = StObject.set(x, "CustomLabel", js.undefined)
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
