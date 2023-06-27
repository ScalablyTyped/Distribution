package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GraphProperty
import typings.arcgisJsApi.esri.GraphPropertyProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestKnowledgeGraphGraphPropertyMod {
  
  @JSImport("esri/rest/knowledgeGraph/GraphProperty", JSImport.Namespace)
  @js.native
  /**
  		 * Specifies the properties of for [entity types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-EntityType.html) and [relationship types](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-RelationshipType.html) defined in the graph schema by the [data model](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-DataModel.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphProperty.html)
  		 */
  open class ^ ()
    extends StObject
       with GraphProperty {
    def this(properties: GraphPropertyProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/knowledgeGraph/GraphProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): GraphProperty = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[GraphProperty]
}
