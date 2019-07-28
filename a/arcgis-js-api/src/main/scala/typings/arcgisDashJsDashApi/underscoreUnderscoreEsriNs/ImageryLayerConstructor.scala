package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageryLayerConstructor
  extends /**
  * Represents an image service resource as a layer. An ImageryLayer retrieves and displays data from image services. ImageryLayer allows you to and apply client side [pixel filtering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#pixelFilter), server defined or client-defined [rendering rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#renderingRule) (e.g. remap, colormap), and [mosaic rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#mosaicRule). This layer is particularly useful when you need to interactively change pixel manipulation criteria and get an immediate response on the client.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html)
  */
Instantiable0[ImageryLayer]
     with Instantiable1[/* properties */ ImageryLayerProperties, ImageryLayer] {
  def fromJSON(json: js.Any): ImageryLayer = js.native
}

