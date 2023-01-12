package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionAnalysisProperties extends StObject {
  
  /**
    * A list of dimensions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionAnalysis.html#dimensions)
    */
  var dimensions: js.UndefOr[CollectionProperties[LengthDimensionProperties]] = js.undefined
  
  /**
    * The style defines how the dimension objects of this analysis are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-DimensionAnalysis.html#style)
    */
  var style: js.UndefOr[DimensionSimpleStyleProperties] = js.undefined
}
object DimensionAnalysisProperties {
  
  inline def apply(): DimensionAnalysisProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionAnalysisProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionAnalysisProperties] (val x: Self) extends AnyVal {
    
    inline def setDimensions(value: CollectionProperties[LengthDimensionProperties]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: LengthDimensionProperties*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setStyle(value: DimensionSimpleStyleProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
