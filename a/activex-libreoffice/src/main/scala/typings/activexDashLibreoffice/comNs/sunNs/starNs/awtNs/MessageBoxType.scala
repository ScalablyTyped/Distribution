package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the type of a {@link XMessageBox} .
  * @since LibreOffice 4.2
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait MessageBoxType extends js.Object

object MessageBoxType {
  /** A message box to provide an error message to the user. */
  @scala.inline
  def ERRORBOX: `3` = this.cast(3)
  /** A message box to inform the user about a certain event */
  @scala.inline
  def INFOBOX: `1` = this.cast(1)
  /** A normal message box. */
  @scala.inline
  def MESSAGEBOX: `0` = this.cast(0)
  /** A message box to query information from the user. */
  @scala.inline
  def QUERYBOX: `4` = this.cast(4)
  /** A message to warn the user about a certain problem. */
  @scala.inline
  def WARNINGBOX: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

