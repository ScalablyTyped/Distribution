package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These enumeration values are used to specify the alignment of the text range delimited by a tabulator. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait TabAlign extends js.Object

object TabAlign {
  /**
    * set the horizontal alignment to the center between the margins from the container object
    *
    * adjusted to the center
    *
    * The text range is centered between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @scala.inline
  def CENTER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** The decimal point of the text range to the left of this tabulator is aligned to the position of this tabulator. */
  @scala.inline
  def DECIMAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** The default alignment for tabulators is applied. */
  @scala.inline
  def DEFAULT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /**
    * set the horizontal alignment to the left margin from the container object
    *
    * The page style is only used for left pages.
    *
    * adjusted to the left border
    *
    * The text range is left-aligned between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @scala.inline
  def LEFT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * set the horizontal alignment to the right margin from the container object
    *
    * The page style is only used for right pages.
    *
    * adjusted to the right border
    *
    * The text range is right-aligned between the previous tabulator (or the left border, if none) and this tabulator.
    */
  @scala.inline
  def RIGHT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

