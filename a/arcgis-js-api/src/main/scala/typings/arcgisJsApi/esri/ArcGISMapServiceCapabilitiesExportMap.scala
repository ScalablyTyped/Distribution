package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcGISMapServiceCapabilitiesExportMap extends Object {
  /**
    * Indicates if sublayers rendering can be modified or added using dynamic layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsDynamicLayers: Boolean = js.native
  /**
    * Indicates if a sublayer supports modifying its renderer and/or data source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsModification: Boolean = js.native
  /**
    * Indicates if sublayers [definition expression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression) can be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayerDefinitionExpression: Boolean = js.native
  /**
    * Indicates if sublayers [visibility](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#visible) can be changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayerVisibility: Boolean = js.native
  /**
    * Indicates if sublayers can be added, removed, or reordered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayersChanges: Boolean = js.native
}

object ArcGISMapServiceCapabilitiesExportMap {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsDynamicLayers: Boolean,
    supportsModification: Boolean,
    supportsSublayerDefinitionExpression: Boolean,
    supportsSublayerVisibility: Boolean,
    supportsSublayersChanges: Boolean
  ): ArcGISMapServiceCapabilitiesExportMap = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsDynamicLayers = supportsDynamicLayers.asInstanceOf[js.Any], supportsModification = supportsModification.asInstanceOf[js.Any], supportsSublayerDefinitionExpression = supportsSublayerDefinitionExpression.asInstanceOf[js.Any], supportsSublayerVisibility = supportsSublayerVisibility.asInstanceOf[js.Any], supportsSublayersChanges = supportsSublayersChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesExportMap]
  }
  @scala.inline
  implicit class ArcGISMapServiceCapabilitiesExportMapOps[Self <: ArcGISMapServiceCapabilitiesExportMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSupportsDynamicLayers(value: Boolean): Self = this.set("supportsDynamicLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsModification(value: Boolean): Self = this.set("supportsModification", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsSublayerDefinitionExpression(value: Boolean): Self = this.set("supportsSublayerDefinitionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsSublayerVisibility(value: Boolean): Self = this.set("supportsSublayerVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsSublayersChanges(value: Boolean): Self = this.set("supportsSublayersChanges", value.asInstanceOf[js.Any])
  }
  
}

