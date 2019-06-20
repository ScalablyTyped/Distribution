package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This enumeration specifies the vertical position of text inside a shape in relation to the shape.
  *
  * This counts for the complete text, not individual lines.
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait TextVerticalAdjust extends js.Object

object TextVerticalAdjust {
  /**
    * The text extends from the left to the right edge of the shape.
    *
    * The text extends from the top to the bottom edge of the shape.
    */
  @scala.inline
  def BLOCK: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * the connection line leaves the connected object from the bottom,
    *
    * The bottom edge of the text is adjusted to the bottom edge of the shape.
    *
    * The text is positioned below the main line.
    */
  @scala.inline
  def BOTTOM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** The text is centered inside the shape. */
  @scala.inline
  def CENTER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * the connection line leaves the connected object from the top,
    *
    * The top edge of the text is adjusted to the top edge of the shape.
    *
    * The text is positioned above the main line.
    */
  @scala.inline
  def TOP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

