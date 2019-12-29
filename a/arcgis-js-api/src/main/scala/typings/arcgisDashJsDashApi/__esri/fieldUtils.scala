package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fieldUtils extends js.Object {
  /**
    * Returns an array of field names used in the Arcade expression for calculating the Z values of features in the given feature layer's [FeatureLayer.elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getElevationFields)
    *
    * @param layer The featureLayer to extract fields required for calculating feature Z values.
    *
    */
  def getElevationFields(layer: FeatureLayer): js.Promise[js.Array[String]]
  /**
    * Returns an array of editor tracking field names for a given feature layer. It includes the fields from the [FeatureLayer.editFieldsInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#editFieldsInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getFeatureEditFields)
    *
    * @param layer The Feature Layer from which to extract editor tracking fields.
    *
    */
  def getFeatureEditFields(layer: FeatureLayer): js.Array[String]
  /**
    * Returns an array of field names used in the Arcade expression for labeling features in the given feature layer's [FeatureLayer.labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getLabelingFields)
    *
    * @param layer The Feature Layer from which to extract label fields.
    *
    */
  def getLabelingFields(layer: FeatureLayer): js.Promise[js.Array[String]]
  /**
    * Returns an array of field names related to time. It includes the fields from the [FeatureLayer.timeInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#timeInfo), and the `trackIdField`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-fieldUtils.html#getTimeFields)
    *
    * @param layer The Feature Layer from which to extract time fields.
    *
    */
  def getTimeFields(layer: FeatureLayer): js.Promise[js.Array[String]]
}

@JSGlobal("__esri.fieldUtils")
@js.native
object fieldUtils extends TopLevel[fieldUtils]

