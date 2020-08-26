package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`multi-directional`
import typings.arcgisJsApi.arcgisJsApiStrings.`raster-shaded-relief`
import typings.arcgisJsApi.arcgisJsApiStrings.adjusted
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.traditional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterShadedReliefRenderer
  extends Accessor
     with JSONSupport {
  /**
    * The sun's angle of elevation above the horizon, ranging from 0 to 90 degrees. A value of 0 degrees indicates that the sun is on the horizon, that is, on the same horizontal plane as the frame of reference. A value of 90 degrees indicates that the sun is directly overhead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#altitude)
    *
    * @default 45
    */
  var altitude: Double = js.native
  /**
    * The sun's relative position along the horizon, ranging from 0 to 360 degrees. This position is indicated by the angle of the sun measured clockwise from due north. An azimuth of 0 degrees indicates north, east is 90 degrees, south is 180 degrees, and west is 270 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#azimuth)
    *
    * @default 315
    */
  var azimuth: Double = js.native
  /**
    * The color ramp to display the shaded relief. By default, the grayscale is applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#colorRamp)
    *
    * @default null
    */
  var colorRamp: ColorRamp = js.native
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
  var hillshadeType: traditional | `multi-directional` = js.native
  /**
    * Pixel size factor accounts for changes in scale as the viewer zooms in and out on the map display. It controls the rate at which the Z Factor changes. This parameter is only valid when the [scalingType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#scalingType) is `adjusted`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizeFactor)
    *
    * @default 0.024
    */
  var pixelSizeFactor: Double = js.native
  /**
    * Pixel Size Power accounts for the altitude changes (or scale) as the viewer zooms in and out on the map display. It is the exponent applied to the pixel size term in the equation that controls the rate at which the Z Factor changes to avoid significant loss of relief. This parameter is only valid when the [scalingType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#scalingType) is `adjusted`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizePower)
    *
    * @default 0.664
    */
  var pixelSizePower: Double = js.native
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
  var scalingType: none | adjusted = js.native
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#type)
    */
  val `type`: `raster-shaded-relief` = js.native
  /**
    * A ratio of z unit / xy unit, with optional exaggeration factored in. If the units for the z (elevation) units are the same as the x,y (linear) units, then the z conversion factor is 1. If your dataset is using a projected coordinate system and your elevation and linear units are different, then you will need to define a z conversion factor to account for the difference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#zFactor)
    *
    * @default 1
    */
  var zFactor: Double = js.native
}

