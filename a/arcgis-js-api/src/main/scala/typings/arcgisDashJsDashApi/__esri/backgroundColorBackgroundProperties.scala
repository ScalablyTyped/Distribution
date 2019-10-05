package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait backgroundColorBackgroundProperties extends BackgroundProperties {
  /**
    * The color of the background. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html#color)
    *
    * @default black
    */
  var color: js.UndefOr[Color | js.Array[Double] | String] = js.undefined
}

object backgroundColorBackgroundProperties {
  @scala.inline
  def apply(color: Color | js.Array[Double] | String = null): backgroundColorBackgroundProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[backgroundColorBackgroundProperties]
  }
}

