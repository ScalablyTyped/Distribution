package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait knowledgeGraphRelationship
  extends StObject
     with GraphNamedObject {
  
  /**
  		 * The ID of the destination entity of the relationship (i.e.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html#destinationId)
  		 */
  var destinationId: String = js.native
  
  /**
  		 * The ID of the origin entity of the relationship (i.e.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html#originId)
  		 */
  var originId: String = js.native
}
