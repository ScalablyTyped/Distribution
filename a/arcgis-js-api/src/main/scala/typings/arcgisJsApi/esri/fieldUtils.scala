package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fieldUtils extends js.Object {
  /**
    * Gets the appropriate display field name to label a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getDisplayFieldName)
    *
    * @param fields An array of fields to determine the display field from.
    *
    */
  def getDisplayFieldName(fields: js.Array[Field]): String = js.native
  /**
    * Returns an array of field names used in the Arcade expression for calculating the z-values of features in the given feature layer's [FeatureLayer.elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getElevationFields)
    *
    * @param layer The featureLayer to extract fields required for calculating feature z-values.
    *
    */
  def getElevationFields(layer: FeatureLayer): js.Promise[js.Array[String]] = js.native
  def getExpressionFields(layer: CSVLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  /**
    * Returns an array of field names referenced in one or more Arcade expressions to be set on the given layer in either the `renderer`, `labelingInfo`, or `popupTemplate`. This is useful for when you want to request the data for these fields prior to updating a renderer for fast visual updates or when you want to execute a client-side query on that data prior to setting the Arcade expressions on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getExpressionFields)
    *
    * @param layer The layer for which the Arcade `expressions` are authored. This layer must have a `fields` property.
    * @param expressions An array of [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions to be set on the given `layer`.
    *
    */
  def getExpressionFields(layer: FeatureLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def getExpressionFields(layer: GeoJSONLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def getExpressionFields(layer: SceneLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def getExpressionFields(layer: StreamLayer, expressions: js.Array[String]): js.Promise[js.Array[String]] = js.native
  /**
    * Returns an array of editor tracking field names for a given feature layer. It includes the fields from the [FeatureLayer.editFieldsInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#editFieldsInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getFeatureEditFields)
    *
    * @param layer The Feature Layer from which to extract editor tracking fields.
    *
    */
  def getFeatureEditFields(layer: FeatureLayer): js.Array[String] = js.native
  /**
    * Returns an array of field names used in the Arcade expression for labeling features in the given feature layer's [FeatureLayer.labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getLabelingFields)
    *
    * @param layer The Feature Layer from which to extract label fields.
    *
    */
  def getLabelingFields(layer: FeatureLayer): js.Promise[js.Array[String]] = js.native
  /**
    * Returns an array of field names related to time. It includes the fields from the [FeatureLayer.timeInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#timeInfo), and the `trackIdField`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getTimeFields)
    *
    * @param layer The Feature Layer from which to extract time fields.
    *
    */
  def getTimeFields(layer: FeatureLayer): js.Promise[js.Array[String]] = js.native
}

@JSGlobal("__esri.fieldUtils")
@js.native
object fieldUtils extends TopLevel[fieldUtils]

