package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to access the text fields used in this context (e.g. this document).
  * @see com.sun.star.sheet.SpreadsheetDocument
  * @see TextDocument
  */
trait XTextFieldsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of {@link TextFieldMaster} instances which are defined in this context (i.e. this document). */
  val TextFieldMasters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the collection of {@link TextField} instances in this context (i.e. this document). */
  val TextFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
  /** @returns the collection of {@link TextFieldMaster} instances which are defined in this context (i.e. this document). */
  def getTextFieldMasters(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** @returns the collection of {@link TextField} instances in this context (i.e. this document). */
  def getTextFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
}

