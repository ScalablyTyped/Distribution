package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldTooltipItem extends StObject {
  
  /**
    * The unique ID of the field that is targeted by the tooltip.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The label of the tooltip item.
    */
  var Label: js.UndefOr[String] = js.undefined
  
  /**
    * The visibility of the tooltip item.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object FieldTooltipItem {
  
  inline def apply(FieldId: FieldId): FieldTooltipItem = {
    val __obj = js.Dynamic.literal(FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTooltipItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldTooltipItem] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
