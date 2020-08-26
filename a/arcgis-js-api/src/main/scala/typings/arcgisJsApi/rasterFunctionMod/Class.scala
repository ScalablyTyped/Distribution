package typings.arcgisJsApi.rasterFunctionMod

import typings.arcgisJsApi.esri.RasterFunction
import typings.arcgisJsApi.esri.RasterFunctionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/RasterFunction", JSImport.Namespace)
@js.native
/**
  * Raster functions specify processing to be done to the image service. They allow the mosaic image service to deliver a dynamically mosaicked image and they can be used to enhance the mosaicked image product by applying processing operations such as image enhancements, and image algebra. See [raster functions](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm) for a list of functions and their [arguments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionArguments). The following image shows a landcover ImageryLayer rendered with two chained client-side raster functions used to reclass pixel values (Remap) and assign each pixel a new color (Colormap).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html)
  */
class Class () extends RasterFunction {
  def this(properties: RasterFunctionProperties) = this()
}

