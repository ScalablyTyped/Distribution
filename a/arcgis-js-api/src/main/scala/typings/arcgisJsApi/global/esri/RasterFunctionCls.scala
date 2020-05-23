package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RasterFunctionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.RasterFunction")
@js.native
/**
  * Raster functions specify processing to be done to the image service. They allow the mosaic image service to deliver a dynamically mosaicked image and they can be used to enhance the mosaicked image product by applying processing operations such as image enhancements, and image algebra. See [raster functions](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm) for a list of functions and their [arguments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionArguments). The following image shows a landcover ImageryLayer rendered with two chained client-side raster functions used to reclass pixel values (Remap) and assign each pixel a new color (Colormap).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html)
  */
class RasterFunctionCls ()
  extends typings.arcgisJsApi.esri.RasterFunction {
  def this(properties: RasterFunctionProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

