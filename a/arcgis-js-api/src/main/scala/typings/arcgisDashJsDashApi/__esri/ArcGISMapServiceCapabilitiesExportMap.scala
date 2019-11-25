package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISMapServiceCapabilitiesExportMap extends Object {
  /**
    * Indicates if sublayers rendering can be modified or added using dynamic layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsDynamicLayers: Boolean
  /**
    * Indicates if sublayers [definition expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression) can be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayerDefinitionExpression: Boolean
  /**
    * Indicates if sublayers [visibility](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#visible) can be changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayerVisibility: Boolean
  /**
    * Indicates if sublayers can be added, removed, or reordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayersChanges: Boolean
}

object ArcGISMapServiceCapabilitiesExportMap {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsDynamicLayers: Boolean,
    supportsSublayerDefinitionExpression: Boolean,
    supportsSublayerVisibility: Boolean,
    supportsSublayersChanges: Boolean
  ): ArcGISMapServiceCapabilitiesExportMap = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsDynamicLayers = supportsDynamicLayers.asInstanceOf[js.Any], supportsSublayerDefinitionExpression = supportsSublayerDefinitionExpression.asInstanceOf[js.Any], supportsSublayerVisibility = supportsSublayerVisibility.asInstanceOf[js.Any], supportsSublayersChanges = supportsSublayersChanges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesExportMap]
  }
}

