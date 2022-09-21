package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityVariableProperties
  extends StObject
     with VisualVariableProperties {
  
  /**
    * Name of the numeric attribute field by which to normalize the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#normalizationField)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that defines the opacity to apply to features in a layer in a sequence of stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops)
    */
  var stops: js.UndefOr[js.Array[OpacityStopProperties]] = js.undefined
}
object OpacityVariableProperties {
  
  inline def apply(): OpacityVariableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityVariableProperties]
  }
  
  extension [Self <: OpacityVariableProperties](x: Self) {
    
    inline def setNormalizationField(value: String): Self = StObject.set(x, "normalizationField", value.asInstanceOf[js.Any])
    
    inline def setNormalizationFieldUndefined: Self = StObject.set(x, "normalizationField", js.undefined)
    
    inline def setStops(value: js.Array[OpacityStopProperties]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: OpacityStopProperties*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
