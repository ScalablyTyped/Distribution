package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorBackground extends JSONSupport {
  /**
    * The color of the background. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-background-ColorBackground.html#color)
    *
    * @default black
    */
  var color: Color_
}

object ColorBackground {
  @scala.inline
  def apply(color: Color_, toJSON: () => js.Any): ColorBackground = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ColorBackground]
  }
}

