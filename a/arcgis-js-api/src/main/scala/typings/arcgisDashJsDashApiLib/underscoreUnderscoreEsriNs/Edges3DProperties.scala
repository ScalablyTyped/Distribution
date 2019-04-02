package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edges3DProperties extends js.Object {
  /**
    * The color of the edges. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#color)
    *
    * @default black
    */
  var color: js.UndefOr[Color | js.Array[scala.Double] | java.lang.String] = js.undefined
  /**
    * A size in points by which to extend edges beyond their original end points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#extensionLength)
    *
    * @default "0"
    */
  var extensionLength: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The size of the edges in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html#size)
    *
    * @default 1px
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Edges3DProperties {
  @scala.inline
  def apply(
    color: Color | js.Array[scala.Double] | java.lang.String = null,
    extensionLength: scala.Double | java.lang.String = null,
    size: scala.Double | java.lang.String = null
  ): Edges3DProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extensionLength != null) __obj.updateDynamic("extensionLength")(extensionLength.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edges3DProperties]
  }
}

