package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** supplies the collection of {@link NumberFormats} (for example, in a document) and the settings belonging to these formats. */
@js.native
trait XNumberFormatsSupplier extends XInterface {
  /** @returns the {@link NumberFormatSettings} of this object. */
  val NumberFormatSettings: XPropertySet = js.native
  /** @returns the collection of number formats belonging to this object (e.g., to this document). */
  val NumberFormats: XNumberFormats = js.native
  /** @returns the {@link NumberFormatSettings} of this object. */
  def getNumberFormatSettings(): XPropertySet = js.native
  /** @returns the collection of number formats belonging to this object (e.g., to this document). */
  def getNumberFormats(): XNumberFormats = js.native
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
  @scala.inline
  implicit class XNumberFormatsSupplierOps[Self <: XNumberFormatsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNumberFormatSettings(value: XPropertySet): Self = this.set("NumberFormatSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberFormats(value: XNumberFormats): Self = this.set("NumberFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetNumberFormatSettings(value: () => XPropertySet): Self = this.set("getNumberFormatSettings", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumberFormats(value: () => XNumberFormats): Self = this.set("getNumberFormats", js.Any.fromFunction0(value))
  }
  
}

