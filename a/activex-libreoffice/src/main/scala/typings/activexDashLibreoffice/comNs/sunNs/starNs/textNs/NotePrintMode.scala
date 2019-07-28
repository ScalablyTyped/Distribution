package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enumeration values are used to define the printing of notes in a document. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
*/
trait NotePrintMode extends js.Object

object NotePrintMode {
  /** Notes are collected at the end of the document. */
  @scala.inline
  def DOC_END: `2` = this.cast(2)
  /** Notes are not printed. */
  @scala.inline
  def NOT: `0` = this.cast(0)
  /** Only notes are printed. */
  @scala.inline
  def ONLY: `1` = this.cast(1)
  /** Notes are collected at the end of a page and printed on an inserted page. */
  @scala.inline
  def PAGE_END: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

