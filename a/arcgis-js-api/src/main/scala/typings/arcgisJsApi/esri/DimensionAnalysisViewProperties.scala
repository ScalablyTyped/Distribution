package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionAnalysisViewProperties extends StObject {
  
  /**
    * Set to `true` to enable interactivity for the [analysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#analysis).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#interactive)
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The selected dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#selectedDimension)
    */
  var selectedDimension: js.UndefOr[LengthDimensionProperties] = js.undefined
  
  /**
    * When `true`, the [analysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#analysis) is visualized in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object DimensionAnalysisViewProperties {
  
  inline def apply(): DimensionAnalysisViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionAnalysisViewProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionAnalysisViewProperties] (val x: Self) extends AnyVal {
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setSelectedDimension(value: LengthDimensionProperties): Self = StObject.set(x, "selectedDimension", value.asInstanceOf[js.Any])
    
    inline def setSelectedDimensionUndefined: Self = StObject.set(x, "selectedDimension", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
