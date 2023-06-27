package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipTypeEndPoints extends StObject {
  
  /**
  		 * The `name` of the destination [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#endPoints)
  		 */
  var destinationEntityType: String
  
  /**
  		 * The `name` of the origin [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#endPoints)
  		 */
  var originEntityType: String
}
object RelationshipTypeEndPoints {
  
  inline def apply(destinationEntityType: String, originEntityType: String): RelationshipTypeEndPoints = {
    val __obj = js.Dynamic.literal(destinationEntityType = destinationEntityType.asInstanceOf[js.Any], originEntityType = originEntityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipTypeEndPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipTypeEndPoints] (val x: Self) extends AnyVal {
    
    inline def setDestinationEntityType(value: String): Self = StObject.set(x, "destinationEntityType", value.asInstanceOf[js.Any])
    
    inline def setOriginEntityType(value: String): Self = StObject.set(x, "originEntityType", value.asInstanceOf[js.Any])
  }
}
