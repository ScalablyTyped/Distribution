package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The BitmapMode selects an algorithm for filling an area with a bitmap. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait BitmapMode extends js.Object

object BitmapMode {
  /** the bitmap is painted in its original or selected size. */
  @scala.inline
  def NO_REPEAT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** the bitmap is repeated over the fill area. */
  @scala.inline
  def REPEAT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * the bitmap is stretched to fill the area.
    *
    * The text is stretched so that the longest line goes from the left to the right edge of the shape.
    */
  @scala.inline
  def STRETCH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

