package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterShadedReliefRendererConstructor
  extends /**
  * RasterShadedReliefRenderer produces a grayscale or colored 3D representation of the surface on an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), with the sun's relative position taken into account for shading the image. This renderer uses the [altitude](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#altitude) and [azimuth](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html#azimuth) properties to specify the sun's position. By default, a grayscale color ramp is used to display a hillshade elevation model.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html)
  */
Instantiable0[RasterShadedReliefRenderer]
     with Instantiable1[/* properties */ RasterShadedReliefRendererProperties, RasterShadedReliefRenderer] {
  def fromJSON(json: js.Any): RasterShadedReliefRenderer = js.native
}

