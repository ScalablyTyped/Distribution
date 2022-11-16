package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ExtentPropertiestypeexten
import typings.arcgisJsApi.anon.PolygonPropertiestypepoly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultidimensionalSubsetProperties extends StObject {
  
  /**
    * The spatial area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#areaOfInterest)
    */
  var areaOfInterest: js.UndefOr[ExtentPropertiestypeexten | PolygonPropertiestypepoly] = js.undefined
  
  /**
    * The variable and dimension subset definitions to set the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#subsetDefinitions)
    */
  var subsetDefinitions: js.UndefOr[js.Array[DimensionalDefinitionProperties]] = js.undefined
}
object MultidimensionalSubsetProperties {
  
  inline def apply(): MultidimensionalSubsetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultidimensionalSubsetProperties]
  }
  
  extension [Self <: MultidimensionalSubsetProperties](x: Self) {
    
    inline def setAreaOfInterest(value: ExtentPropertiestypeexten | PolygonPropertiestypepoly): Self = StObject.set(x, "areaOfInterest", value.asInstanceOf[js.Any])
    
    inline def setAreaOfInterestUndefined: Self = StObject.set(x, "areaOfInterest", js.undefined)
    
    inline def setSubsetDefinitions(value: js.Array[DimensionalDefinitionProperties]): Self = StObject.set(x, "subsetDefinitions", value.asInstanceOf[js.Any])
    
    inline def setSubsetDefinitionsUndefined: Self = StObject.set(x, "subsetDefinitions", js.undefined)
    
    inline def setSubsetDefinitionsVarargs(value: DimensionalDefinitionProperties*): Self = StObject.set(x, "subsetDefinitions", js.Array(value*))
  }
}
