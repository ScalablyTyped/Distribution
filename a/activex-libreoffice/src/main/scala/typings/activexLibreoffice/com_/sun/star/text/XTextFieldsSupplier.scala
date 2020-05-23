package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to access the text fields used in this context (e.g. this document).
  * @see com.sun.star.sheet.SpreadsheetDocument
  * @see TextDocument
  */
trait XTextFieldsSupplier extends XInterface {
  /** @returns the collection of {@link TextFieldMaster} instances which are defined in this context (i.e. this document). */
  val TextFieldMasters: XNameAccess
  /** @returns the collection of {@link TextField} instances in this context (i.e. this document). */
  val TextFields: XEnumerationAccess
  /** @returns the collection of {@link TextFieldMaster} instances which are defined in this context (i.e. this document). */
  def getTextFieldMasters(): XNameAccess
  /** @returns the collection of {@link TextField} instances in this context (i.e. this document). */
  def getTextFields(): XEnumerationAccess
}

object XTextFieldsSupplier {
  @scala.inline
  def apply(
    TextFieldMasters: XNameAccess,
    TextFields: XEnumerationAccess,
    acquire: () => Unit,
    getTextFieldMasters: () => XNameAccess,
    getTextFields: () => XEnumerationAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextFieldsSupplier = {
    val __obj = js.Dynamic.literal(TextFieldMasters = TextFieldMasters.asInstanceOf[js.Any], TextFields = TextFields.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTextFieldMasters = js.Any.fromFunction0(getTextFieldMasters), getTextFields = js.Any.fromFunction0(getTextFields), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextFieldsSupplier]
  }
}

