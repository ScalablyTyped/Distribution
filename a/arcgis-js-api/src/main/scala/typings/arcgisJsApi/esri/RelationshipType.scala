package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipType
  extends StObject
     with GraphObjectType {
  
  /**
    * Specifies the [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) can be the destination of this relationship type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#destinationEntityTypes)
    */
  var destinationEntityTypes: js.Array[String] = js.native
  
  /**
    * Specifies the [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) that can be the origin of this relationship type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#originEntityTypes)
    */
  var originEntityTypes: js.Array[String] = js.native
  
  /**
    * Indicates whether the destination [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) for the relationship can be changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#strictDestination)
    */
  var strictDestination: Boolean = js.native
  
  /**
    * Indicates whether the origin [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) for the relationship can be changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#strictOrigin)
    */
  var strictOrigin: Boolean = js.native
}
