package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify the slant of a font. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
*/
trait FontSlant extends js.Object

object FontSlant {
  /**
    * specifies a font with an unknown slant.
    *
    * specifies that the menu item type is unknown.
    */
  @scala.inline
  def DONTKNOW: `3` = this.cast(3)
  /** specifies an italic font (slant designed into the font). */
  @scala.inline
  def ITALIC: `2` = this.cast(2)
  /** specifies a font without slant. */
  @scala.inline
  def NONE: `0` = this.cast(0)
  /** specifies an oblique font (slant not designed into the font). */
  @scala.inline
  def OBLIQUE: `1` = this.cast(1)
  /** specifies a reverse italic font (slant designed into the font). */
  @scala.inline
  def REVERSE_ITALIC: `5` = this.cast(5)
  /** specifies a reverse oblique font (slant not designed into the font). */
  @scala.inline
  def REVERSE_OBLIQUE: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

