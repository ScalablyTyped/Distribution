package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These enumeration values are used to specify the location of a graphic object within its surroundings. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11`
*/
trait GraphicLocation extends js.Object

object GraphicLocation {
  /** The graphic is scaled to fill the whole surrounding area. */
  @scala.inline
  def AREA: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10` = this.cast(10)
  /** The graphic is located in the bottom left corner. */
  @scala.inline
  def LEFT_BOTTOM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /** The graphic is located in the middle of the left edge. */
  @scala.inline
  def LEFT_MIDDLE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** The graphic is located in the top left corner. */
  @scala.inline
  def LEFT_TOP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** The graphic is located in the middle of the bottom edge. */
  @scala.inline
  def MIDDLE_BOTTOM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  /** The graphic is located at the center of the surrounding object. */
  @scala.inline
  def MIDDLE_MIDDLE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** The graphic is located in the middle of the top edge. */
  @scala.inline
  def MIDDLE_TOP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * No column or page break is applied.
    *
    * This value specifies that a location is not yet assigned.
    */
  @scala.inline
  def NONE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** The graphic is located in the bottom right corner. */
  @scala.inline
  def RIGHT_BOTTOM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9` = this.cast(9)
  /** The graphic is located in the middle of the right edge. */
  @scala.inline
  def RIGHT_MIDDLE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** The graphic is located in the top right corner. */
  @scala.inline
  def RIGHT_TOP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** The graphic is repeatedly spread over the surrounding object like tiles. */
  @scala.inline
  def TILED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11` = this.cast(11)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

