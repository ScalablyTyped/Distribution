package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The style used to draw the endpoint of a line. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * butt | ![sls-cap-butt](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-butt.png)
    * round | ![sls-cap-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-round.png)
    * square | ![sls-cap-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-square.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#cap)
    *
    * @default butt
    */
  var cap: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.butt | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.round | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.square
  ] = js.undefined
  /**
    * The style used to draw the intersection of two line segments within a line geometry. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * bevel | ![sls-join-bevel](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-bevel.png)
    * miter | ![sls-join-miter](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-miter.png)
    * round | ![sls-join-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-round.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#join)
    *
    * @default miter
    */
  var join: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.miter | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.round | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.bevel
  ] = js.undefined
  /**
    * The material used to shade the line. This property defines the line's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[LineSymbol3DLayerMaterialProperties] = js.undefined
  /**
    * The width of the line in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#size)
    *
    * @default "1px"
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object LineSymbol3DLayerProperties {
  @scala.inline
  def apply(
    cap: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.butt | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.round | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.square = null,
    join: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.miter | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.round | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.bevel = null,
    material: LineSymbol3DLayerMaterialProperties = null,
    size: scala.Double | java.lang.String = null
  ): LineSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (join != null) __obj.updateDynamic("join")(join.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSymbol3DLayerProperties]
  }
}

