package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** supplies the collection of {@link NumberFormats} (for example, in a document) and the settings belonging to these formats. */
trait XNumberFormatsSupplier extends XInterface {
  /** @returns the {@link NumberFormatSettings} of this object. */
  val NumberFormatSettings: XPropertySet
  /** @returns the collection of number formats belonging to this object (e.g., to this document). */
  val NumberFormats: XNumberFormats
  /** @returns the {@link NumberFormatSettings} of this object. */
  def getNumberFormatSettings(): XPropertySet
  /** @returns the collection of number formats belonging to this object (e.g., to this document). */
  def getNumberFormats(): XNumberFormats
}

object XNumberFormatsSupplier {
  @scala.inline
  def apply(
    NumberFormatSettings: XPropertySet,
    NumberFormats: XNumberFormats,
    acquire: () => Unit,
    getNumberFormatSettings: () => XPropertySet,
    getNumberFormats: () => XNumberFormats,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberFormatsSupplier = {
    val __obj = js.Dynamic.literal(NumberFormatSettings = NumberFormatSettings.asInstanceOf[js.Any], NumberFormats = NumberFormats.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getNumberFormatSettings = js.Any.fromFunction0(getNumberFormatSettings), getNumberFormats = js.Any.fromFunction0(getNumberFormats), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberFormatsSupplier]
  }
}

