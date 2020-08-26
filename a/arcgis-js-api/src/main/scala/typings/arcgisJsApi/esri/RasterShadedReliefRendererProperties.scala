package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`multi-directional`
import typings.arcgisJsApi.arcgisJsApiStrings.adjusted
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.traditional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterShadedReliefRendererProperties extends js.Object {
  /**
    * The sun's angle of elevation above the horizon, ranging from 0 to 90 degrees. A value of 0 degrees indicates that the sun is on the horizon, that is, on the same horizontal plane as the frame of reference. A value of 90 degrees indicates that the sun is directly overhead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#altitude)
    *
    * @default 45
    */
  var altitude: js.UndefOr[Double] = js.native
  /**
    * The sun's relative position along the horizon, ranging from 0 to 360 degrees. This position is indicated by the angle of the sun measured clockwise from due north. An azimuth of 0 degrees indicates north, east is 90 degrees, south is 180 degrees, and west is 270 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#azimuth)
    *
    * @default 315
    */
  var azimuth: js.UndefOr[Double] = js.native
  /**
    * The color ramp to display the shaded relief. By default, the grayscale is applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#colorRamp)
    *
    * @default null
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.native
  /**
    * The type of hillshading being applied on the elevation surface.
    *
    * Value | Description |
    * ----- | ----------- |
    * traditional | Calculates the hillshade using an illumination source from one direction using the altitude and azimuth properties to specify the sun's position.
    * multi-directional | Combines light from multiple sources to represent the hillshaded terrain. The advantage of the multidirectional hillshade method is that more detail is displayed in areas typically affected by over saturation and deep shadows than when using the traditional hillshade method.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#hillshadeType)
    *
    * @default "multi-directional"
    */
  var hillshadeType: js.UndefOr[traditional | `multi-directional`] = js.native
  /**
    * Pixel size factor accounts for changes in scale as the viewer zooms in and out on the map display. It controls the rate at which the Z Factor changes. This parameter is only valid when the [scalingType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#scalingType) is `adjusted`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizeFactor)
    *
    * @default 0.024
    */
  var pixelSizeFactor: js.UndefOr[Double] = js.native
  /**
    * Pixel Size Power accounts for the altitude changes (or scale) as the viewer zooms in and out on the map display. It is the exponent applied to the pixel size term in the equation that controls the rate at which the Z Factor changes to avoid significant loss of relief. This parameter is only valid when the [scalingType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#scalingType) is `adjusted`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizePower)
    *
    * @default 0.664
    */
  var pixelSizePower: js.UndefOr[Double] = js.native
  /**
    * Applies a constant or adjusted z-factor based on resolution changes. The shaded result is scaled dynamically by adjusting the z-factor using one of two options.  **Possible Values**
    *
    * Value | Description |
    * ----- | ----------- |
    * none | No scaling is applied. This is ideal for a single raster dataset covering a local area. This is not recommended for worldwide datasets with large variations in elevation or multi scale maps, as it will produce terrain relief with little variation at small scales.
    * adjusted | A nonlinear adjustment is applied using the [pixelSizePower](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizePower) and [pixelSizeFactor](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizeFactor) values, which accommodate a wide variety of altitude changes (scale) as the viewer zooms in and out. The Adjusted option is recommended when using a worldwide dataset.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#scalingType)
    *
    * @default none
    */
  var scalingType: js.UndefOr[none | adjusted] = js.native
  /**
    * A ratio of z unit / xy unit, with optional exaggeration factored in. If the units for the z (elevation) units are the same as the x,y (linear) units, then the z conversion factor is 1. If your dataset is using a projected coordinate system and your elevation and linear units are different, then you will need to define a z conversion factor to account for the difference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#zFactor)
    *
    * @default 1
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

