package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudRendererPointSizeAlgorithm extends Object {
  /**
    * Specifies the scale factor that is applied to the size estimated by the density. Applies to `splat` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    *
    * @default 1
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  /**
    * Point size in meters (`useRealWorldSymbolSizes = true`) or points. Applies to `fixed-size` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * `fixed-size` or `splat`. Choosing `fixed-size` implies setting `size` and `useRealWorldSymbolSizes`. If `splat` is chosen then `scaleFactor` should be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var `type`: String
  /**
    * Specifies whether `size` is in real world units or screen-space units. Applies to `fixed-size` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.undefined
}

object PointCloudRendererPointSizeAlgorithm {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String,
    scaleFactor: Int | Double = null,
    size: Int | Double = null,
    useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.undefined
  ): PointCloudRendererPointSizeAlgorithm = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(useRealWorldSymbolSizes)) __obj.updateDynamic("useRealWorldSymbolSizes")(useRealWorldSymbolSizes)
    __obj.asInstanceOf[PointCloudRendererPointSizeAlgorithm]
  }
}

