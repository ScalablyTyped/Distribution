package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldBasedTooltip extends StObject {
  
  /**
    * The visibility of Show aggregations.
    */
  var AggregationVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The fields configuration in the tooltip.
    */
  var TooltipFields: js.UndefOr[TooltipItemList] = js.undefined
  
  /**
    * The type for the &gt;tooltip title. Choose one of the following options:    NONE: Doesn't use the primary value as the title.    PRIMARY_VALUE: Uses primary value as the title.  
    */
  var TooltipTitleType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TooltipTitleType] = js.undefined
}
object FieldBasedTooltip {
  
  inline def apply(): FieldBasedTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldBasedTooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldBasedTooltip] (val x: Self) extends AnyVal {
    
    inline def setAggregationVisibility(value: Visibility): Self = StObject.set(x, "AggregationVisibility", value.asInstanceOf[js.Any])
    
    inline def setAggregationVisibilityUndefined: Self = StObject.set(x, "AggregationVisibility", js.undefined)
    
    inline def setTooltipFields(value: TooltipItemList): Self = StObject.set(x, "TooltipFields", value.asInstanceOf[js.Any])
    
    inline def setTooltipFieldsUndefined: Self = StObject.set(x, "TooltipFields", js.undefined)
    
    inline def setTooltipFieldsVarargs(value: TooltipItem*): Self = StObject.set(x, "TooltipFields", js.Array(value*))
    
    inline def setTooltipTitleType(value: TooltipTitleType): Self = StObject.set(x, "TooltipTitleType", value.asInstanceOf[js.Any])
    
    inline def setTooltipTitleTypeUndefined: Self = StObject.set(x, "TooltipTitleType", js.undefined)
  }
}
