package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
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
    *   * Only applicable to layers with `polygon` geometries.
    *   * This function is not intended for use in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-sizeRange.html#sizeRange)
    *
    * @param params See the table below for details about parameters that may be passed to this function.
    * @param params.layer The `polygon` layer for which to generate a suggested min/max size range based on scale for a size visual variable.
    * @param params.view The [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    *
    */
  def sizeRange(params: sizeRangeSizeRangeParams): IPromise[SizeRangeResult]
}

object sizeRange {
  @scala.inline
  def apply(sizeRange: sizeRangeSizeRangeParams => IPromise[SizeRangeResult]): sizeRange = {
    val __obj = js.Dynamic.literal(sizeRange = js.Any.fromFunction1(sizeRange))
  
    __obj.asInstanceOf[sizeRange]
  }
}

