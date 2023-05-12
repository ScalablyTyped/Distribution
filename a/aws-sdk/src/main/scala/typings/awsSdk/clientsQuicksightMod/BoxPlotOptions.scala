package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxPlotOptions extends StObject {
  
  /**
    * Determines the visibility of all data points of the box plot.
    */
  var AllDataPointsVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * Determines the visibility of the outlier in a box plot.
    */
  var OutlierVisibility: js.UndefOr[Visibility] = js.undefined
  
  /**
    * The style options of the box plot.
    */
  var StyleOptions: js.UndefOr[BoxPlotStyleOptions] = js.undefined
}
object BoxPlotOptions {
  
  inline def apply(): BoxPlotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxPlotOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoxPlotOptions] (val x: Self) extends AnyVal {
    
    inline def setAllDataPointsVisibility(value: Visibility): Self = StObject.set(x, "AllDataPointsVisibility", value.asInstanceOf[js.Any])
    
    inline def setAllDataPointsVisibilityUndefined: Self = StObject.set(x, "AllDataPointsVisibility", js.undefined)
    
    inline def setOutlierVisibility(value: Visibility): Self = StObject.set(x, "OutlierVisibility", value.asInstanceOf[js.Any])
    
    inline def setOutlierVisibilityUndefined: Self = StObject.set(x, "OutlierVisibility", js.undefined)
    
    inline def setStyleOptions(value: BoxPlotStyleOptions): Self = StObject.set(x, "StyleOptions", value.asInstanceOf[js.Any])
    
    inline def setStyleOptionsUndefined: Self = StObject.set(x, "StyleOptions", js.undefined)
  }
}
