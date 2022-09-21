package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerFloorInfoProperties extends StObject {
  
  /**
    * The field name derived from a floor-aware layer and used to filter features by floor level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LayerFloorInfo.html#floorField)
    */
  var floorField: js.UndefOr[String] = js.undefined
}
object LayerFloorInfoProperties {
  
  inline def apply(): LayerFloorInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerFloorInfoProperties]
  }
  
  extension [Self <: LayerFloorInfoProperties](x: Self) {
    
    inline def setFloorField(value: String): Self = StObject.set(x, "floorField", value.asInstanceOf[js.Any])
    
    inline def setFloorFieldUndefined: Self = StObject.set(x, "floorField", js.undefined)
  }
}
