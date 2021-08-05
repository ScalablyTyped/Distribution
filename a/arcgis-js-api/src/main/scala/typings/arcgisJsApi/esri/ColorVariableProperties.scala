package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorVariableProperties
  extends StObject
     with VisualVariableProperties {
  
  /**
    * Name of the numeric attribute field by which to normalize the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#normalizationField)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
    * An array of sequential objects, or stops, that defines a continuous color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops)
    */
  var stops: js.UndefOr[js.Array[ColorStopProperties]] = js.undefined
}
object ColorVariableProperties {
  
  inline def apply(): ColorVariableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorVariableProperties]
  }
  
  extension [Self <: ColorVariableProperties](x: Self) {
    
    inline def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    inline def setStops(value: js.Array[ColorStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: ColorStopProperties*): Self = StObject.set(x, "stops", js.Array(value :_*))
  }
}
