package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionLayerViewProperties
  extends StObject
     with LayerViewProperties {
  
  /**
    * Set to `true` to enable interactivity for the [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-DimensionLayerView.html#layer).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-DimensionLayerView.html#interactive)
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The selected dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-DimensionLayerView.html#selectedDimension)
    */
  var selectedDimension: js.UndefOr[LengthDimensionProperties] = js.undefined
}
object DimensionLayerViewProperties {
  
  inline def apply(): DimensionLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionLayerViewProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionLayerViewProperties] (val x: Self) extends AnyVal {
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setSelectedDimension(value: LengthDimensionProperties): Self = StObject.set(x, "selectedDimension", value.asInstanceOf[js.Any])
    
    inline def setSelectedDimensionUndefined: Self = StObject.set(x, "selectedDimension", js.undefined)
  }
}
