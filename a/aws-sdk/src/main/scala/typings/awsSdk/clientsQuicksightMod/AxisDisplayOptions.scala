package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisDisplayOptions extends StObject {
  
  /**
    * Determines whether or not the axis line is visible.
    */
  var AxisLineVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The offset value that determines the starting placement of the axis within a visual's bounds.
    */
  var AxisOffset: js.UndefOr[PixelLength] = js.undefined
  
  /**
    * The data options for an axis.
    */
  var DataOptions: js.UndefOr[AxisDataOptions] = js.undefined
  
  /**
    * Determines whether or not the grid line is visible.
    */
  var GridLineVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The scroll bar options for an axis.
    */
  var ScrollbarOptions: js.UndefOr[ScrollBarOptions] = js.undefined
  
  /**
    * The tick label options of an axis.
    */
  var TickLabelOptions: js.UndefOr[AxisTickLabelOptions] = js.undefined
}
object AxisDisplayOptions {
  
  inline def apply(): AxisDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisDisplayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisDisplayOptions] (val x: Self) extends AnyVal {
    
    inline def setAxisLineVisibility(value: Visibility): Self = StObject.set(x, "AxisLineVisibility", value.asInstanceOf[js.Any])
    
    inline def setAxisLineVisibilityUndefined: Self = StObject.set(x, "AxisLineVisibility", js.undefined)
    
    inline def setAxisOffset(value: PixelLength): Self = StObject.set(x, "AxisOffset", value.asInstanceOf[js.Any])
    
    inline def setAxisOffsetUndefined: Self = StObject.set(x, "AxisOffset", js.undefined)
    
    inline def setDataOptions(value: AxisDataOptions): Self = StObject.set(x, "DataOptions", value.asInstanceOf[js.Any])
    
    inline def setDataOptionsUndefined: Self = StObject.set(x, "DataOptions", js.undefined)
    
    inline def setGridLineVisibility(value: Visibility): Self = StObject.set(x, "GridLineVisibility", value.asInstanceOf[js.Any])
    
    inline def setGridLineVisibilityUndefined: Self = StObject.set(x, "GridLineVisibility", js.undefined)
    
    inline def setScrollbarOptions(value: ScrollBarOptions): Self = StObject.set(x, "ScrollbarOptions", value.asInstanceOf[js.Any])
    
    inline def setScrollbarOptionsUndefined: Self = StObject.set(x, "ScrollbarOptions", js.undefined)
    
    inline def setTickLabelOptions(value: AxisTickLabelOptions): Self = StObject.set(x, "TickLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setTickLabelOptionsUndefined: Self = StObject.set(x, "TickLabelOptions", js.undefined)
  }
}
