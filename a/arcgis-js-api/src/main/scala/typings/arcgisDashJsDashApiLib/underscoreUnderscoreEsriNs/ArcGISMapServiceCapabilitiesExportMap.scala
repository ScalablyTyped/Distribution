package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISMapServiceCapabilitiesExportMap
  extends stdLib.Object {
  /**
    * Indicates if sublayers rendering can be modified or added using dynamic layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsDynamicLayers: scala.Boolean
  /**
    * Indicates if sublayers [definition expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression) can be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayerDefinitionExpression: scala.Boolean
  /**
    * Indicates if sublayers [visibility](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#visible) can be changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayerVisibility: scala.Boolean
  /**
    * Indicates if sublayers can be added, removed, or reordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayersChanges: scala.Boolean
}

object ArcGISMapServiceCapabilitiesExportMap {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    supportsDynamicLayers: scala.Boolean,
    supportsSublayerDefinitionExpression: scala.Boolean,
    supportsSublayerVisibility: scala.Boolean,
    supportsSublayersChanges: scala.Boolean
  ): ArcGISMapServiceCapabilitiesExportMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("supportsDynamicLayers")(supportsDynamicLayers)
    __obj.updateDynamic("supportsSublayerDefinitionExpression")(supportsSublayerDefinitionExpression)
    __obj.updateDynamic("supportsSublayerVisibility")(supportsSublayerVisibility)
    __obj.updateDynamic("supportsSublayersChanges")(supportsSublayersChanges)
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesExportMap]
  }
}

