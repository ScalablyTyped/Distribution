package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionFilter extends StObject {
  
  /**
    * An array of numbers indicating the row's ObjectId's.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#SelectionFilter)
    */
  var objectIds: js.Array[Double]
  
  /**
    * The type of the filter used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#SelectionFilter)
    */
  var `type`: String
}
object SelectionFilter {
  
  inline def apply(objectIds: js.Array[Double], `type`: String): SelectionFilter = {
    val __obj = js.Dynamic.literal(objectIds = objectIds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionFilter]
  }
  
  extension [Self <: SelectionFilter](x: Self) {
    
    inline def setObjectIds(value: js.Array[Double]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsVarargs(value: Double*): Self = StObject.set(x, "objectIds", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
