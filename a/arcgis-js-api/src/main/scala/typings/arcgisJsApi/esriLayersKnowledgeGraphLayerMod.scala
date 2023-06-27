package typings.arcgisJsApi

import typings.arcgisJsApi.esri.KnowledgeGraphLayer
import typings.arcgisJsApi.esri.KnowledgeGraphLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersKnowledgeGraphLayerMod {
  
  @JSImport("esri/layers/KnowledgeGraphLayer", JSImport.Namespace)
  @js.native
  /**
  		 * A KnowledgeGraphLayer is a composite layer that can be created from a [knowledge graph service](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html)
  		 */
  open class ^ ()
    extends StObject
       with KnowledgeGraphLayer {
    def this(properties: KnowledgeGraphLayerProperties) = this()
  }
  @JSImport("esri/layers/KnowledgeGraphLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Assumes that data for all of the members defined in the inclusionModeDefinition is already loaded into local storage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#loadLayerAssumingLocalCache)
  		 */
  inline def loadLayerAssumingLocalCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayerAssumingLocalCache")().asInstanceOf[Unit]
}
