package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains convenience methods for getting Arcade expressions defined on a layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html)
  */
@js.native
trait arcadeUtils extends StObject {
  
  /**
    * Returns all Arcade expressions defined on a given layer and provides metadata describing the context for which each expression was authored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html#getExpressionsFromLayer)
    */
  def getExpressionsFromLayer(layer: CSVLayer): js.Array[arcadeUtilsExpressionInfo] = js.native
  def getExpressionsFromLayer(layer: FeatureLayer): js.Array[arcadeUtilsExpressionInfo] = js.native
  def getExpressionsFromLayer(layer: GeoJSONLayer): js.Array[arcadeUtilsExpressionInfo] = js.native
  def getExpressionsFromLayer(layer: OGCFeatureLayer): js.Array[arcadeUtilsExpressionInfo] = js.native
  def getExpressionsFromLayer(layer: SceneLayer): js.Array[arcadeUtilsExpressionInfo] = js.native
  def getExpressionsFromLayer(layer: Sublayer): js.Array[arcadeUtilsExpressionInfo] = js.native
  def getExpressionsFromLayer(layer: WFSLayer): js.Array[arcadeUtilsExpressionInfo] = js.native
}
