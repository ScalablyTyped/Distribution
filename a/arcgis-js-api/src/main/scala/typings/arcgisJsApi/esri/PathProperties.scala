package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProperties extends StObject {
  
  /**
    * Array of [entities](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Entity.html) and [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) where the first element is the starting entity of the path, the final element is the ending entity of the path, and intermediary elements are entities and relationships connecting the two.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Path.html#path)
    */
  var path: js.UndefOr[js.Array[GraphObjectProperties]] = js.undefined
}
object PathProperties {
  
  inline def apply(): PathProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathProperties]
  }
  
  extension [Self <: PathProperties](x: Self) {
    
    inline def setPath(value: js.Array[GraphObjectProperties]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: GraphObjectProperties*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
