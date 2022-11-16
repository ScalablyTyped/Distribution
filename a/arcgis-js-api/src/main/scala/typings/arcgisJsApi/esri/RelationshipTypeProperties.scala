package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipTypeProperties
  extends StObject
     with GraphObjectTypeProperties {
  
  /**
    * Specifies the [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) can be the destination of this relationship type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#destinationEntityTypes)
    */
  var destinationEntityTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies the [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) that can be the origin of this relationship type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#originEntityTypes)
    */
  var originEntityTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether the destination [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) for the relationship can be changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#strictDestination)
    */
  var strictDestination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the origin [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) for the relationship can be changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#strictOrigin)
    */
  var strictOrigin: js.UndefOr[Boolean] = js.undefined
}
object RelationshipTypeProperties {
  
  inline def apply(): RelationshipTypeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipTypeProperties]
  }
  
  extension [Self <: RelationshipTypeProperties](x: Self) {
    
    inline def setDestinationEntityTypes(value: js.Array[String]): Self = StObject.set(x, "destinationEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setDestinationEntityTypesUndefined: Self = StObject.set(x, "destinationEntityTypes", js.undefined)
    
    inline def setDestinationEntityTypesVarargs(value: String*): Self = StObject.set(x, "destinationEntityTypes", js.Array(value*))
    
    inline def setOriginEntityTypes(value: js.Array[String]): Self = StObject.set(x, "originEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setOriginEntityTypesUndefined: Self = StObject.set(x, "originEntityTypes", js.undefined)
    
    inline def setOriginEntityTypesVarargs(value: String*): Self = StObject.set(x, "originEntityTypes", js.Array(value*))
    
    inline def setStrictDestination(value: Boolean): Self = StObject.set(x, "strictDestination", value.asInstanceOf[js.Any])
    
    inline def setStrictDestinationUndefined: Self = StObject.set(x, "strictDestination", js.undefined)
    
    inline def setStrictOrigin(value: Boolean): Self = StObject.set(x, "strictOrigin", value.asInstanceOf[js.Any])
    
    inline def setStrictOriginUndefined: Self = StObject.set(x, "strictOrigin", js.undefined)
  }
}
