package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ArcGISMapServiceCapabilitiesExportMapMutableBuilder[Self <: ArcGISMapServiceCapabilitiesExportMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupportsDynamicLayers(value: Boolean): Self = StObject.set(x, "supportsDynamicLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsModification(value: Boolean): Self = StObject.set(x, "supportsModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsSublayerDefinitionExpression(value: Boolean): Self = StObject.set(x, "supportsSublayerDefinitionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsSublayerVisibility(value: Boolean): Self = StObject.set(x, "supportsSublayerVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsSublayersChanges(value: Boolean): Self = StObject.set(x, "supportsSublayersChanges", value.asInstanceOf[js.Any])
  }
}
