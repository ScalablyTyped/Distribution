package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterFunctionProperties extends js.Object {
  /**
    * The arguments for the raster function. The structure depends on the function specified. See [raster functions](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm) for a list of functions and their arguments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionArguments)
    */
  var functionArguments: js.UndefOr[js.Any] = js.undefined
  /**
    * The raster function name. See [raster functions](https://developers.arcgis.com/documentation/common-data-types/raster-function-objects.htm) for a list of functions and their arguments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#functionName)
    */
  var functionName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the pixel type of the output image.  **Possible Values:** c128 | c64 | f32 | f64 | s16 | s32 | s8 | u1 | u16 | u2 | u32 | u4 | u8 | unknown
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#outputPixelType)
    *
    * @default unknown
    */
  var outputPixelType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The variable name for the raster function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html#variableName)
    */
  var variableName: js.UndefOr[java.lang.String] = js.undefined
}

object RasterFunctionProperties {
  @scala.inline
  def apply(
    functionArguments: js.Any = null,
    functionName: java.lang.String = null,
    outputPixelType: java.lang.String = null,
    variableName: java.lang.String = null
  ): RasterFunctionProperties = {
    val __obj = js.Dynamic.literal()
    if (functionArguments != null) __obj.updateDynamic("functionArguments")(functionArguments)
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    if (outputPixelType != null) __obj.updateDynamic("outputPixelType")(outputPixelType)
    if (variableName != null) __obj.updateDynamic("variableName")(variableName)
    __obj.asInstanceOf[RasterFunctionProperties]
  }
}

