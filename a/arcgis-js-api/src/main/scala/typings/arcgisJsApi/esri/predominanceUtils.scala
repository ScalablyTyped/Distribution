package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Provides utility functions for generating [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) and SQL expressions intended for use in an [predominance renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html)
	 */
@js.native
trait predominanceUtils extends StObject {
  
  def getPredominanceExpressions(layer: CSVLayer, fieldNames: js.Array[String]): PredominantExpressions = js.native
  /**
  		 * Returns [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) and SQL expressions used for visualizing the predominant category (or field) among a set of competing fields.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#getPredominanceExpressions)
  		 */
  def getPredominanceExpressions(layer: FeatureLayer, fieldNames: js.Array[String]): PredominantExpressions = js.native
  def getPredominanceExpressions(layer: GeoJSONLayer, fieldNames: js.Array[String]): PredominantExpressions = js.native
  def getPredominanceExpressions(layer: OGCFeatureLayer, fieldNames: js.Array[String]): PredominantExpressions = js.native
  def getPredominanceExpressions(layer: SceneLayer, fieldNames: js.Array[String]): PredominantExpressions = js.native
  def getPredominanceExpressions(layer: StreamLayer, fieldNames: js.Array[String]): PredominantExpressions = js.native
  def getPredominanceExpressions(layer: WFSLayer, fieldNames: js.Array[String]): PredominantExpressions = js.native
}
