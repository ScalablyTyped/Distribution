package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the characteristics of a font.
  *
  * For example, this can be used to select a font.
  * @since OOo 2.0
  */
trait FontHeight extends js.Object {
  /** specifies the width of the font in the measure of the destination. */
  var Diff: scala.Double
  /** specifies the current height of the font. */
  var Height: scala.Double
  /** specifies the height of the font in the measure of the destination. */
  var Prop: scala.Double
}

object FontHeight {
  @scala.inline
  def apply(Diff: scala.Double, Height: scala.Double, Prop: scala.Double): FontHeight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Diff")(Diff)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("Prop")(Prop)
    __obj.asInstanceOf[FontHeight]
  }
}

