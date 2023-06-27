package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Convenience methods for getting field names used for feature layer [labeling](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo), [elevation](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo), [editor tracking](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#editFieldsInfo) and time span.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html)
	 */
@js.native
trait fieldUtils extends StObject {
  
  def getDisplayFieldName(layer: CSVLayer): String = js.native
  /**
  		 * Gets the appropriate display field name to label a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getDisplayFieldName)
  		 */
  def getDisplayFieldName(layer: FeatureLayer): String = js.native
  def getDisplayFieldName(layer: GeoJSONLayer): String = js.native
  def getDisplayFieldName(layer: OGCFeatureLayer): String = js.native
  def getDisplayFieldName(layer: SceneLayer): String = js.native
  def getDisplayFieldName(layer: StreamLayer): String = js.native
  
  /**
  		 * Returns an array of field names used in the Arcade expression for calculating the z-values of features in the given feature layer's [FeatureLayer.elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getElevationFields)
  		 */
  def getElevationFields(layer: FeatureLayer): js.Promise[js.Array[String]] = js.native
  
  def getExpressionFields(layer: CSVLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  /**
  		 * Returns an array of field names referenced in one or more [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expressions to be set on the given layer in either the renderer, labels, or popup template.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getExpressionFields)
  		 */
  def getExpressionFields(layer: FeatureLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def getExpressionFields(layer: GeoJSONLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def getExpressionFields(layer: SceneLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def getExpressionFields(layer: StreamLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  
  /**
  		 * Returns an array of editor tracking field names for a given feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getFeatureEditFields)
  		 */
  def getFeatureEditFields(layer: FeatureLayer): js.Array[String] = js.native
  
  /**
  		 * Returns an array of geometry field names for a given feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getFeatureGeometryFields)
  		 */
  def getFeatureGeometryFields(layer: FeatureLayer): js.Array[String] = js.native
  
  /**
  		 * Returns an array of field names used in the Arcade expression for labeling features in the given feature layer's [FeatureLayer.labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getLabelingFields)
  		 */
  def getLabelingFields(layer: FeatureLayer): js.Promise[js.Array[String]] = js.native
  
  /**
  		 * Returns an array of field names related to time.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getTimeFields)
  		 */
  def getTimeFields(layer: FeatureLayer): js.Promise[js.Array[String]] = js.native
}
