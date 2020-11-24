package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`multi-directional`
import typings.arcgisJsApi.arcgisJsApiStrings.adjusted
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.traditional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterShadedReliefRendererProperties extends js.Object {
  
  /**
    * The sun's angle of elevation above the horizon, ranging from 0 to 90 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#altitude)
    */
  var altitude: js.UndefOr[Double] = js.native
  
  /**
    * The sun's relative position along the horizon, ranging from 0 to 360 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#azimuth)
    */
  var azimuth: js.UndefOr[Double] = js.native
  
  /**
    * The color ramp to display the shaded relief.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#colorRamp)
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.native
  
  /**
    * The type of hillshading being applied on the elevation surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#hillshadeType)
    */
  var hillshadeType: js.UndefOr[traditional | `multi-directional`] = js.native
  
  /**
    * Pixel size factor accounts for changes in scale as the viewer zooms in and out on the map display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizeFactor)
    */
  var pixelSizeFactor: js.UndefOr[Double] = js.native
  
  /**
    * Pixel Size Power accounts for the altitude changes (or scale) as the viewer zooms in and out on the map display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizePower)
    */
  var pixelSizePower: js.UndefOr[Double] = js.native
  
  /**
    * Applies a constant or adjusted z-factor based on resolution changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#scalingType)
    */
  var scalingType: js.UndefOr[none | adjusted] = js.native
  
  /**
    * A ratio of z unit / xy unit, with optional exaggeration factored in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#zFactor)
    */
  var zFactor: js.UndefOr[Double] = js.native
}
object RasterShadedReliefRendererProperties {
  
  @scala.inline
  def apply(): RasterShadedReliefRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterShadedReliefRendererProperties]
  }
  
  @scala.inline
  implicit class RasterShadedReliefRendererPropertiesOps[Self <: RasterShadedReliefRendererProperties] (val x: Self) extends AnyVal {
    
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
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setAzimuth(value: Double): Self = this.set("azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzimuth: Self = this.set("azimuth", js.undefined)
    
    @scala.inline
    def setColorRamp(value: ColorRampProperties): Self = this.set("colorRamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRamp: Self = this.set("colorRamp", js.undefined)
    
    @scala.inline
    def setHillshadeType(value: traditional | `multi-directional`): Self = this.set("hillshadeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHillshadeType: Self = this.set("hillshadeType", js.undefined)
    
    @scala.inline
    def setPixelSizeFactor(value: Double): Self = this.set("pixelSizeFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelSizeFactor: Self = this.set("pixelSizeFactor", js.undefined)
    
    @scala.inline
    def setPixelSizePower(value: Double): Self = this.set("pixelSizePower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelSizePower: Self = this.set("pixelSizePower", js.undefined)
    
    @scala.inline
    def setScalingType(value: none | adjusted): Self = this.set("scalingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingType: Self = this.set("scalingType", js.undefined)
    
    @scala.inline
    def setZFactor(value: Double): Self = this.set("zFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZFactor: Self = this.set("zFactor", js.undefined)
  }
}
