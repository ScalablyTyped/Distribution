package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAxisLabelOptions extends StObject {
  
  /**
    * The label options for a chart axis.
    */
  var AxisLabelOptions: js.UndefOr[AxisLabelOptionsList] = js.undefined
  
  /**
    * The visibility configuration of the sort icon on a chart's axis label.
    */
  var SortIconVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The visibility of an axis label on a chart. Choose one of the following options:    VISIBLE: Shows the axis.    HIDDEN: Hides the axis.  
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object ChartAxisLabelOptions {
  
  inline def apply(): ChartAxisLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisLabelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartAxisLabelOptions] (val x: Self) extends AnyVal {
    
    inline def setAxisLabelOptions(value: AxisLabelOptionsList): Self = StObject.set(x, "AxisLabelOptions", value.asInstanceOf[js.Any])
    
    inline def setAxisLabelOptionsUndefined: Self = StObject.set(x, "AxisLabelOptions", js.undefined)
    
    inline def setAxisLabelOptionsVarargs(value: AxisLabelOptions*): Self = StObject.set(x, "AxisLabelOptions", js.Array(value*))
    
    inline def setSortIconVisibility(value: Visibility): Self = StObject.set(x, "SortIconVisibility", value.asInstanceOf[js.Any])
    
    inline def setSortIconVisibilityUndefined: Self = StObject.set(x, "SortIconVisibility", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
