package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WCSLayerProperties
  extends StObject
     with LayerProperties
     with ImageryTileMixinProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  
  /**
    * The coverage identifier for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#coverageId)
    */
  var coverageId: js.UndefOr[String] = js.undefined
  
  /**
    * Use this property to append custom parameters to all WCS requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#interpolation)
    */
  var interpolation: js.UndefOr[nearest | bilinear | cubic | majority] = js.undefined
  
  /**
    * Use this property to define a data slice to by choosing a variable with a given value for each of its dimensions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.UndefOr[js.Array[DimensionalDefinitionProperties]] = js.undefined
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#renderer)
    */
  @JSName("renderer")
  var renderer_WCSLayerProperties: js.UndefOr[ClassBreaksRendererProperties | RasterStretchRendererProperties] = js.undefined
  
  /**
    * The version of Web Coverage Service currently being used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#version)
    */
  var version: js.UndefOr[String] = js.undefined
}
object WCSLayerProperties {
  
  @scala.inline
  def apply(): WCSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WCSLayerProperties]
  }
  
  @scala.inline
  implicit class WCSLayerPropertiesMutableBuilder[Self <: WCSLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverageId(value: String): Self = StObject.set(x, "coverageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageIdUndefined: Self = StObject.set(x, "coverageId", js.undefined)
    
    @scala.inline
    def setCustomParameters(value: js.Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    @scala.inline
    def setInterpolation(value: nearest | bilinear | cubic | majority): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setMultidimensionalDefinition(value: js.Array[DimensionalDefinitionProperties]): Self = StObject.set(x, "multidimensionalDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultidimensionalDefinitionUndefined: Self = StObject.set(x, "multidimensionalDefinition", js.undefined)
    
    @scala.inline
    def setMultidimensionalDefinitionVarargs(value: DimensionalDefinitionProperties*): Self = StObject.set(x, "multidimensionalDefinition", js.Array(value :_*))
    
    @scala.inline
    def setRenderer(value: ClassBreaksRendererProperties | RasterStretchRendererProperties): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
