package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionLayerProperties
  extends StObject
     with LayerProperties {
  
  /**
  		 * The analysis object that stores the dimension shapes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DimensionLayer.html#source)
  		 */
  var source: js.UndefOr[DimensionAnalysisProperties] = js.undefined
  
  /**
  		 * The style defines how the dimension objects of this layer are displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DimensionLayer.html#style)
  		 */
  var style: js.UndefOr[DimensionSimpleStyleProperties] = js.undefined
}
object DimensionLayerProperties {
  
  inline def apply(): DimensionLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setSource(value: DimensionAnalysisProperties): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStyle(value: DimensionSimpleStyleProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
