package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the settings of a cell shadow. */
trait ShadowFormat extends js.Object {
  /** contains the color value of the shadow. */
  var Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** is `TRUE` , if shadow is transparent. */
  var IsTransparent: scala.Boolean
  /** contains the location of the shadow. */
  var Location: ShadowLocation
  /** contains the size of the shadow. */
  var ShadowWidth: scala.Double
}

object ShadowFormat {
  @scala.inline
  def apply(
    Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    IsTransparent: scala.Boolean,
    Location: ShadowLocation,
    ShadowWidth: scala.Double
  ): ShadowFormat = {
    val __obj = js.Dynamic.literal(Color = Color, IsTransparent = IsTransparent, Location = Location, ShadowWidth = ShadowWidth)
  
    __obj.asInstanceOf[ShadowFormat]
  }
}

