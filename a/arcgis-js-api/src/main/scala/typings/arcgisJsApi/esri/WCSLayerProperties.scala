package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WCSLayerProperties
  extends LayerProperties
     with ImageryTileMixinProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  
  /**
    * The coverage identifier for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#coverageId)
    */
  var coverageId: js.UndefOr[String] = js.native
  
  /**
    * Use this property to append custom parameters to all WCS requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.native
  
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#interpolation)
    */
  var interpolation: js.UndefOr[nearest | bilinear | cubic | majority] = js.native
  
  /**
    * Use this property to define a data slice to by choosing a variable with a given value for each of its dimensions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#multidimensionalDefinition)
    */
  var multidimensionalDefinition: js.UndefOr[js.Array[DimensionalDefinitionProperties]] = js.native
  
  /**
    * The renderer assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#renderer)
    */
  @JSName("renderer")
  var renderer_WCSLayerProperties: js.UndefOr[ClassBreaksRendererProperties | RasterStretchRendererProperties] = js.native
  
  /**
    * The version of Web Coverage Service currently being used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WCSLayer.html#version)
    */
  var version: js.UndefOr[String] = js.native
}
object WCSLayerProperties {
  
  @scala.inline
  def apply(): WCSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WCSLayerProperties]
  }
  
  @scala.inline
  implicit class WCSLayerPropertiesOps[Self <: WCSLayerProperties] (val x: Self) extends AnyVal {
    
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
    def setCoverageId(value: String): Self = this.set("coverageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverageId: Self = this.set("coverageId", js.undefined)
    
    @scala.inline
    def setCustomParameters(value: js.Any): Self = this.set("customParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomParameters: Self = this.set("customParameters", js.undefined)
    
    @scala.inline
    def setInterpolation(value: nearest | bilinear | cubic | majority): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    
    @scala.inline
    def setMultidimensionalDefinitionVarargs(value: DimensionalDefinitionProperties*): Self = this.set("multidimensionalDefinition", js.Array(value :_*))
    
    @scala.inline
    def setMultidimensionalDefinition(value: js.Array[DimensionalDefinitionProperties]): Self = this.set("multidimensionalDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultidimensionalDefinition: Self = this.set("multidimensionalDefinition", js.undefined)
    
    @scala.inline
    def setRenderer(value: ClassBreaksRendererProperties | RasterStretchRendererProperties): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
