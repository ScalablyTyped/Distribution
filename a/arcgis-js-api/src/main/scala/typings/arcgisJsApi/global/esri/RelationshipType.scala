package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RelationshipTypeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RelationshipType")
@js.native
/**
		 * A relationship type defines a homogenous collection of [relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-Relationship.html) that can exist between two [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html), with a common set of properties.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html)
		 */
open class RelationshipType ()
  extends StObject
     with typings.arcgisJsApi.esri.RelationshipType {
  def this(properties: RelationshipTypeProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RelationshipType {
  
  @JSGlobal("__esri.RelationshipType")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RelationshipType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RelationshipType]
}
