package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.statusNs

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
  var Diff: Double
  /** specifies the current height of the font. */
  var Height: Double
  /** specifies the height of the font in the measure of the destination. */
  var Prop: Double
}

object FontHeight {
  @scala.inline
  def apply(Diff: Double, Height: Double, Prop: Double): FontHeight = {
    val __obj = js.Dynamic.literal(Diff = Diff, Height = Height, Prop = Prop)
  
    __obj.asInstanceOf[FontHeight]
  }
}

