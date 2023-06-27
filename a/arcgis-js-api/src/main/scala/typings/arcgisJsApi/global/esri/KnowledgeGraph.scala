package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.KnowledgeGraphProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.KnowledgeGraph")
@js.native
/**
		 * The knowledge graph associated with the [knowledgeGraphService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-KnowledgeGraph.html)
		 */
open class KnowledgeGraph ()
  extends StObject
     with typings.arcgisJsApi.esri.KnowledgeGraph {
  def this(properties: KnowledgeGraphProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object KnowledgeGraph {
  
  @JSGlobal("__esri.KnowledgeGraph")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.KnowledgeGraph = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.KnowledgeGraph]
}
