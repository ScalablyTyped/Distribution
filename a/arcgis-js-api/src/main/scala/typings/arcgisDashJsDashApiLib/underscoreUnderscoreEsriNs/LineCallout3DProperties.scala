package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineCallout3DProperties extends Callout3DProperties {
  /**
    * The border settings of the callout line. The border of the callout line can be used to improve the contrast of the callout line color against various background colors. If the border is `null`, then no border will be visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    */
  var border: js.UndefOr[LineCallout3DBorderProperties] = js.undefined
  /**
    * The color of the callout line. This can be autocast with a named string, hex string, array of rgb or rgba values, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#color)
    *
    * @default black
    */
  var color: js.UndefOr[Color | js.Array[scala.Double] | java.lang.String] = js.undefined
  /**
    * The width of the callout line in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#size)
    *
    * @default 1px
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * For LineCallout3D the type is always `line`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#type)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LineCallout3DProperties {
  @scala.inline
  def apply(
    border: LineCallout3DBorderProperties = null,
    color: Color | js.Array[scala.Double] | java.lang.String = null,
    size: scala.Double | java.lang.String = null,
    `type`: java.lang.String = null
  ): LineCallout3DProperties = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LineCallout3DProperties]
  }
}

