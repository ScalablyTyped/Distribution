package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryFilter extends StObject {
  
  /**
    * The geometry used to filter out the table's data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#GeometryFilter)
    */
  var geometry: Geometry_
  
  /**
    * The type of the filter used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#GeometryFilter)
    */
  var `type`: String
}
object GeometryFilter {
  
  inline def apply(geometry: Geometry_, `type`: String): GeometryFilter = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryFilter]
  }
  
  extension [Self <: GeometryFilter](x: Self) {
    
    inline def setGeometry(value: Geometry_): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
