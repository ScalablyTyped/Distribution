package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These enumeration values are used to specify the location of a graphic object within its surroundings. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`10`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`9`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`11`
*/
trait GraphicLocation extends js.Object

object GraphicLocation {
  /** The graphic is scaled to fill the whole surrounding area. */
  @scala.inline
  def AREA: `10` = this.cast(10)
  /** The graphic is located in the bottom left corner. */
  @scala.inline
  def LEFT_BOTTOM: `7` = this.cast(7)
  /** The graphic is located in the middle of the left edge. */
  @scala.inline
  def LEFT_MIDDLE: `4` = this.cast(4)
  /** The graphic is located in the top left corner. */
  @scala.inline
  def LEFT_TOP: `1` = this.cast(1)
  /** The graphic is located in the middle of the bottom edge. */
  @scala.inline
  def MIDDLE_BOTTOM: `8` = this.cast(8)
  /** The graphic is located at the center of the surrounding object. */
  @scala.inline
  def MIDDLE_MIDDLE: `5` = this.cast(5)
  /** The graphic is located in the middle of the top edge. */
  @scala.inline
  def MIDDLE_TOP: `2` = this.cast(2)
  /**
    * No column or page break is applied.
    *
    * This value specifies that a location is not yet assigned.
    */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /** The graphic is located in the bottom right corner. */
  @scala.inline
  def RIGHT_BOTTOM: `9` = this.cast(9)
  /** The graphic is located in the middle of the right edge. */
  @scala.inline
  def RIGHT_MIDDLE: `6` = this.cast(6)
  /** The graphic is located in the top right corner. */
  @scala.inline
  def RIGHT_TOP: `3` = this.cast(3)
  /** The graphic is repeatedly spread over the surrounding object like tiles. */
  @scala.inline
  def TILED: `11` = this.cast(11)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

