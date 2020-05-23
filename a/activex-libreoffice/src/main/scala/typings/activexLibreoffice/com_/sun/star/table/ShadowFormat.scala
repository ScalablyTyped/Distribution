package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the settings of a cell shadow. */
trait ShadowFormat extends js.Object {
  /** contains the color value of the shadow. */
  var Color: typings.activexLibreoffice.com_.sun.star.util.Color
  /** is `TRUE` , if shadow is transparent. */
  var IsTransparent: Boolean
  /** contains the location of the shadow. */
  var Location: ShadowLocation
  /** contains the size of the shadow. */
  var ShadowWidth: Double
}

object ShadowFormat {
  @scala.inline
  def apply(Color: Color, IsTransparent: Boolean, Location: ShadowLocation, ShadowWidth: Double): ShadowFormat = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], IsTransparent = IsTransparent.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], ShadowWidth = ShadowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
}

