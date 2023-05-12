package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipTypeProperties
  extends StObject
     with GraphObjectTypeProperties {
  
  /**
    * Specifies valid origin and destination [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) pairs for this relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#endPoints)
    */
  var endPoints: js.UndefOr[js.Array[RelationshipTypeEndPoints]] = js.undefined
}
object RelationshipTypeProperties {
  
  inline def apply(): RelationshipTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipTypeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipTypeProperties] (val x: Self) extends AnyVal {
    
    inline def setEndPoints(value: js.Array[RelationshipTypeEndPoints]): Self = StObject.set(x, "endPoints", value.asInstanceOf[js.Any])
    
    inline def setEndPointsUndefined: Self = StObject.set(x, "endPoints", js.undefined)
    
    inline def setEndPointsVarargs(value: RelationshipTypeEndPoints*): Self = StObject.set(x, "endPoints", js.Array(value*))
  }
}
