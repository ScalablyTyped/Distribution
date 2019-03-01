package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerCapabilitiesData
  extends stdLib.Object {
  /**
    * Indicates if the attachment is enabled on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsAttachment: scala.Boolean
  /**
    * Indicates if the features in the layer support M values. Requires ArcGIS Server service 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsM: scala.Boolean
  /**
    * Indicates if the features in the layer support Z values. Requires ArcGIS Server service 10.1 or greater. See [elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo) for details regarding placement and rendering of features with z-values in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsZ: scala.Boolean
}

object FeatureLayerCapabilitiesData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    supportsAttachment: scala.Boolean,
    supportsM: scala.Boolean,
    supportsZ: scala.Boolean
  ): FeatureLayerCapabilitiesData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("supportsAttachment")(supportsAttachment)
    __obj.updateDynamic("supportsM")(supportsM)
    __obj.updateDynamic("supportsZ")(supportsZ)
    __obj.asInstanceOf[FeatureLayerCapabilitiesData]
  }
}

