package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationshipType
  extends StObject
     with GraphObjectType {
  
  /**
  		 * Specifies valid origin and destination [entity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) pairs for this relationship.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html#endPoints)
  		 */
  var endPoints: js.Array[RelationshipTypeEndPoints] = js.native
}
