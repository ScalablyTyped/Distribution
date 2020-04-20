package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Function for determining the suggested `minSize` and `maxSize` of a [scale-dependent size visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-sizeRange.html)
  */
trait sizeRange extends js.Object {
  /**
    * Generates a suggested size range (i.e. the `minSize` and `maxSize`) of a [scale-dependent size visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons)).
    * > **Known Limitations**
    *   * This function is not intended for use in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-sizeRange.html#sizeRange)
    *
    * @param params See the table below for details about parameters that may be passed to this function.
    * @param params.layer The layer for which to generate a suggested min/max size range based on scale for a size visual variable.
    * @param params.view The [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def sizeRange(params: sizeRangeSizeRangeParams): js.Promise[SizeRangeResult]
}

@JSGlobal("__esri.sizeRange")
@js.native
object sizeRange extends TopLevel[sizeRange]

