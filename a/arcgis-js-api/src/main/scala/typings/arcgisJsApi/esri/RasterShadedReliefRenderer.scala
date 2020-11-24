package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`multi-directional`
import typings.arcgisJsApi.arcgisJsApiStrings.`raster-shaded-relief`
import typings.arcgisJsApi.arcgisJsApiStrings.adjusted
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.traditional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterShadedReliefRenderer
  extends Accessor
     with JSONSupport {
  
  /**
    * The sun's angle of elevation above the horizon, ranging from 0 to 90 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#altitude)
    */
  var altitude: Double = js.native
  
  /**
    * The sun's relative position along the horizon, ranging from 0 to 360 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#azimuth)
    */
  var azimuth: Double = js.native
  
  /**
    * The color ramp to display the shaded relief.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#colorRamp)
    */
  var colorRamp: ColorRamp = js.native
  
  /**
    * The type of hillshading being applied on the elevation surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#hillshadeType)
    */
  var hillshadeType: traditional | `multi-directional` = js.native
  
  /**
    * Pixel size factor accounts for changes in scale as the viewer zooms in and out on the map display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizeFactor)
    */
  var pixelSizeFactor: Double = js.native
  
  /**
    * Pixel Size Power accounts for the altitude changes (or scale) as the viewer zooms in and out on the map display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#pixelSizePower)
    */
  var pixelSizePower: Double = js.native
  
  /**
    * Applies a constant or adjusted z-factor based on resolution changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#scalingType)
    */
  var scalingType: none | adjusted = js.native
  
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#type)
    */
  val `type`: `raster-shaded-relief` = js.native
  
  /**
    * A ratio of z unit / xy unit, with optional exaggeration factored in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#zFactor)
    */
  var zFactor: Double = js.native
}
