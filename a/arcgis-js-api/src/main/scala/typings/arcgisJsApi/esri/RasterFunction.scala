package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.c128
import typings.arcgisJsApi.arcgisJsApiStrings.c64
import typings.arcgisJsApi.arcgisJsApiStrings.f32
import typings.arcgisJsApi.arcgisJsApiStrings.f64
import typings.arcgisJsApi.arcgisJsApiStrings.s16
import typings.arcgisJsApi.arcgisJsApiStrings.s32
import typings.arcgisJsApi.arcgisJsApiStrings.s8
import typings.arcgisJsApi.arcgisJsApiStrings.u1
import typings.arcgisJsApi.arcgisJsApiStrings.u16
import typings.arcgisJsApi.arcgisJsApiStrings.u2
import typings.arcgisJsApi.arcgisJsApiStrings.u32
import typings.arcgisJsApi.arcgisJsApiStrings.u4
import typings.arcgisJsApi.arcgisJsApiStrings.u8
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterFunction
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The arguments for the raster function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionArguments)
  		 */
  var functionArguments: Any = js.native
  
  /**
  		 * The raster function name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionName)
  		 */
  var functionName: String = js.native
  
  /**
  		 * Defines the pixel type of the output image.
  		 *
  		 * @default unknown
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#outputPixelType)
  		 */
  var outputPixelType: c128 | c64 | f32 | f64 | s16 | s32 | s8 | u1 | u16 | u2 | u32 | u4 | u8 | unknown = js.native
  
  /**
  		 * Property where Raster Function template is passed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#rasterFunctionDefinition)
  		 */
  var rasterFunctionDefinition: Any = js.native
  
  /**
  		 * The variable name for the raster function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#variableName)
  		 */
  var variableName: String = js.native
}
