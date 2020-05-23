package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Layer")
@js.native
/**
  * The layer is the most fundamental component of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). It is a collection of spatial data in the form of vector graphics or raster images that represent real-world phenomena. Layers may contain discrete features that store vector data or continuous cells/pixels that store raster data.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)
  */
class LayerCls ()
  extends typings.arcgisJsApi.esri.Layer {
  def this(properties: LayerProperties) = this()
}

