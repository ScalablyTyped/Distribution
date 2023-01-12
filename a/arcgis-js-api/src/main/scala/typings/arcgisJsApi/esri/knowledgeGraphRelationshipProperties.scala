package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait knowledgeGraphRelationshipProperties
  extends StObject
     with GraphNamedObjectProperties {
  
  /**
    * The ID of the destination entity of the relationship (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html#destinationId)
    */
  var destinationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the origin entity of the relationship (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html#originId)
    */
  var originId: js.UndefOr[String] = js.undefined
}
object knowledgeGraphRelationshipProperties {
  
  inline def apply(): knowledgeGraphRelationshipProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[knowledgeGraphRelationshipProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: knowledgeGraphRelationshipProperties] (val x: Self) extends AnyVal {
    
    inline def setDestinationId(value: String): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
    
    inline def setDestinationIdUndefined: Self = StObject.set(x, "destinationId", js.undefined)
    
    inline def setOriginId(value: String): Self = StObject.set(x, "originId", value.asInstanceOf[js.Any])
    
    inline def setOriginIdUndefined: Self = StObject.set(x, "originId", js.undefined)
  }
}
