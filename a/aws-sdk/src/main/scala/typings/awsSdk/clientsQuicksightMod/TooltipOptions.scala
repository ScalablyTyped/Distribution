package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipOptions extends StObject {
  
  /**
    * The setup for the detailed tooltip. The tooltip setup is always saved. The display type is decided based on the tooltip type.
    */
  var FieldBasedTooltip: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FieldBasedTooltip] = js.undefined
  
  /**
    * The selected type for the tooltip. Choose one of the following options:    BASIC: A basic tooltip.    DETAILED: A detailed tooltip.  
    */
  var SelectedTooltipType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SelectedTooltipType] = js.undefined
  
  /**
    * Determines whether or not the tooltip is visible.
    */
  var TooltipVisibility: js.UndefOr[Visibility] = js.undefined
}
object TooltipOptions {
  
  inline def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
    inline def setFieldBasedTooltip(value: FieldBasedTooltip): Self = StObject.set(x, "FieldBasedTooltip", value.asInstanceOf[js.Any])
    
    inline def setFieldBasedTooltipUndefined: Self = StObject.set(x, "FieldBasedTooltip", js.undefined)
    
    inline def setSelectedTooltipType(value: SelectedTooltipType): Self = StObject.set(x, "SelectedTooltipType", value.asInstanceOf[js.Any])
    
    inline def setSelectedTooltipTypeUndefined: Self = StObject.set(x, "SelectedTooltipType", js.undefined)
    
    inline def setTooltipVisibility(value: Visibility): Self = StObject.set(x, "TooltipVisibility", value.asInstanceOf[js.Any])
    
    inline def setTooltipVisibilityUndefined: Self = StObject.set(x, "TooltipVisibility", js.undefined)
  }
}
