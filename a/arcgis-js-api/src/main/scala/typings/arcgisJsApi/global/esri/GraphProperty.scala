package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GraphPropertyProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GraphProperty")
@js.native
/**
		 * Specifies the properties of for [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) and [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) defined in the graph schema by the [data model](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html)
		 */
open class GraphProperty ()
  extends StObject
     with typings.arcgisJsApi.esri.GraphProperty {
  def this(properties: GraphPropertyProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object GraphProperty {
  
  @JSGlobal("__esri.GraphProperty")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.GraphProperty = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.GraphProperty]
}
