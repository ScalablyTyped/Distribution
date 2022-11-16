package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISMapServiceCapabilitiesExportMap extends StObject {
  
  /**
    * Indicates if sublayers support Arcade expressions for labeling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsArcadeExpressionForLabeling: Boolean
  
  /**
    * _Since 4.23_ Indicates if [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) can be used in a sublayer's [renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#renderer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsCIMSymbols: Boolean
  
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
    * Indicates if sublayers can be added, or removed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var supportsSublayersChanges: Boolean
}
object ArcGISMapServiceCapabilitiesExportMap {
  
  inline def apply(
    supportsArcadeExpressionForLabeling: Boolean,
    supportsCIMSymbols: Boolean,
    supportsDynamicLayers: Boolean,
    supportsSublayerDefinitionExpression: Boolean,
    supportsSublayerVisibility: Boolean,
    supportsSublayersChanges: Boolean
  ): ArcGISMapServiceCapabilitiesExportMap = {
    val __obj = js.Dynamic.literal(supportsArcadeExpressionForLabeling = supportsArcadeExpressionForLabeling.asInstanceOf[js.Any], supportsCIMSymbols = supportsCIMSymbols.asInstanceOf[js.Any], supportsDynamicLayers = supportsDynamicLayers.asInstanceOf[js.Any], supportsSublayerDefinitionExpression = supportsSublayerDefinitionExpression.asInstanceOf[js.Any], supportsSublayerVisibility = supportsSublayerVisibility.asInstanceOf[js.Any], supportsSublayersChanges = supportsSublayersChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesExportMap]
  }
  
  extension [Self <: ArcGISMapServiceCapabilitiesExportMap](x: Self) {
    
    inline def setSupportsArcadeExpressionForLabeling(value: Boolean): Self = StObject.set(x, "supportsArcadeExpressionForLabeling", value.asInstanceOf[js.Any])
    
    inline def setSupportsCIMSymbols(value: Boolean): Self = StObject.set(x, "supportsCIMSymbols", value.asInstanceOf[js.Any])
    
    inline def setSupportsDynamicLayers(value: Boolean): Self = StObject.set(x, "supportsDynamicLayers", value.asInstanceOf[js.Any])
    
    inline def setSupportsSublayerDefinitionExpression(value: Boolean): Self = StObject.set(x, "supportsSublayerDefinitionExpression", value.asInstanceOf[js.Any])
    
    inline def setSupportsSublayerVisibility(value: Boolean): Self = StObject.set(x, "supportsSublayerVisibility", value.asInstanceOf[js.Any])
    
    inline def setSupportsSublayersChanges(value: Boolean): Self = StObject.set(x, "supportsSublayersChanges", value.asInstanceOf[js.Any])
  }
}
