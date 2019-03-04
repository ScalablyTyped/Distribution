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

object XTextFieldsSupplier {
  @scala.inline
  def apply(
    TextFieldMasters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    TextFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess,
    acquire: js.Function0[scala.Unit],
    getTextFieldMasters: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getTextFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextFieldsSupplier = {
    val __obj = js.Dynamic.literal(TextFieldMasters = TextFieldMasters, TextFields = TextFields, acquire = acquire, getTextFieldMasters = getTextFieldMasters, getTextFields = getTextFields, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTextFieldsSupplier]
  }
}

