package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipItem extends StObject {
  
  /**
    * The tooltip item for the columns that are not part of a field well.
    */
  var ColumnTooltipItem: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ColumnTooltipItem] = js.undefined
  
  /**
    * The tooltip item for the fields.
    */
  var FieldTooltipItem: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FieldTooltipItem] = js.undefined
}
object TooltipItem {
  
  inline def apply(): TooltipItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipItem] (val x: Self) extends AnyVal {
    
    inline def setColumnTooltipItem(value: ColumnTooltipItem): Self = StObject.set(x, "ColumnTooltipItem", value.asInstanceOf[js.Any])
    
    inline def setColumnTooltipItemUndefined: Self = StObject.set(x, "ColumnTooltipItem", js.undefined)
    
    inline def setFieldTooltipItem(value: FieldTooltipItem): Self = StObject.set(x, "FieldTooltipItem", value.asInstanceOf[js.Any])
    
    inline def setFieldTooltipItemUndefined: Self = StObject.set(x, "FieldTooltipItem", js.undefined)
  }
}
