package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudRendererPointSizeAlgorithm
  extends stdLib.Object {
  /**
    * Specifies the scale factor that is applied to the size estimated by the density. Applies to `splat` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    *
    * @default 1
    */
  var scaleFactor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Point size in meters (`useRealWorldSymbolSizes = true`) or points. Applies to `fixed-size` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * `fixed-size` or `splat`. Choosing `fixed-size` implies setting `size` and `useRealWorldSymbolSizes`. If `splat` is chosen then `scaleFactor` should be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var `type`: java.lang.String
  /**
    * Specifies whether `size` is in real world units or screen-space units. Applies to `fixed-size` only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var useRealWorldSymbolSizes: js.UndefOr[scala.Boolean] = js.undefined
}

object PointCloudRendererPointSizeAlgorithm {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String,
    scaleFactor: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    useRealWorldSymbolSizes: js.UndefOr[scala.Boolean] = js.undefined
  ): PointCloudRendererPointSizeAlgorithm = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (scaleFactor != null) __obj.updateDynamic("scaleFactor")(scaleFactor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(useRealWorldSymbolSizes)) __obj.updateDynamic("useRealWorldSymbolSizes")(useRealWorldSymbolSizes)
    __obj.asInstanceOf[PointCloudRendererPointSizeAlgorithm]
  }
}

