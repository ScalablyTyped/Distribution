package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleMarkerSymbolProperties extends MarkerSymbolProperties {
  /**
    * The outline of the marker symbol. The `color` property of this object directly modifies the overall color of marker symbols defined with the `cross` or `x` [style](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#style).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  /**
    * The SVG path of the icon.
    * > **Known Limitations**  This property is not supported in IE11.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#path)
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The size of the marker in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#size)
    *
    * @default 12
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The marker style. Possible values are in the table below.
    *
    * Value | Description
    * ------|------------
    * circle | ![sms_circle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-circle.png)
    * cross | ![sms_cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-cross.png)
    * diamond | ![sms_diamond](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-diamond.png)
    * square | ![sms_square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-square.png)
    * triangle | ![sms_triangle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-triangle.png)
    * x | ![sms_x](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-x.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#style)
    *
    * @default circle
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
}

object SimpleMarkerSymbolProperties {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    color: Color | js.Array[scala.Double] | java.lang.String = null,
    outline: SimpleLineSymbolProperties = null,
    path: java.lang.String = null,
    size: scala.Double | java.lang.String = null,
    style: java.lang.String = null,
    xoffset: scala.Double | java.lang.String = null,
    yoffset: scala.Double | java.lang.String = null
  ): SimpleMarkerSymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (path != null) __obj.updateDynamic("path")(path)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMarkerSymbolProperties]
  }
}

