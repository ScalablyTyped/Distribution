package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnowledgeGraphLayerConstructor
  extends StObject
     with Instantiable0[KnowledgeGraphLayer]
     with Instantiable1[/* properties */ KnowledgeGraphLayerProperties, KnowledgeGraphLayer] {
  
  /**
  		 * Assumes that data for all of the members defined in the inclusionModeDefinition is already loaded into local storage.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#loadLayerAssumingLocalCache)
  		 */
  def loadLayerAssumingLocalCache(): scala.Unit = js.native
}
