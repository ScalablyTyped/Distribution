package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointSymbol3DProperties extends Symbol3DProperties {
  /**
    * Settings for adding a callout visualization to the symbol. Callouts are drawn from the point feature location that is being symbolized, to the vertical offset of the symbol. This property has no effect if [verticalOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset) is not set. At the moment only callouts of type line are supported. See [LineCallout3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#callout)
    */
  var callout: js.UndefOr[LineCallout3DProperties] = js.undefined
  /**
    * Shifts the symbol along the vertical world axis by a given height. The height is set in screen space units like points or pixels. For points displayed with a [callout](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#callout) `verticalOffset` should be set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var verticalOffset: js.UndefOr[PointSymbol3DVerticalOffsetProperties] = js.undefined
}

object PointSymbol3DProperties {
  @scala.inline
  def apply(
    callout: LineCallout3DProperties = null,
    color: Color | js.Array[Double] | String = null,
    styleOrigin: Symbol3DStyleOrigin = null,
    symbolLayers: CollectionProperties[Symbol3DLayerProperties] = null,
    verticalOffset: PointSymbol3DVerticalOffsetProperties = null
  ): PointSymbol3DProperties = {
    val __obj = js.Dynamic.literal()
    if (callout != null) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (styleOrigin != null) __obj.updateDynamic("styleOrigin")(styleOrigin.asInstanceOf[js.Any])
    if (symbolLayers != null) __obj.updateDynamic("symbolLayers")(symbolLayers.asInstanceOf[js.Any])
    if (verticalOffset != null) __obj.updateDynamic("verticalOffset")(verticalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointSymbol3DProperties]
  }
}

