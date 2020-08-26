package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the endnotes within the context (e.g. document). */
@js.native
trait XEndnotesSupplier extends XInterface {
  /** @returns the endnote settings of the document. */
  val EndnoteSettings: XPropertySet = js.native
  /** @returns a collection of endnotes. */
  val Endnotes: XIndexAccess = js.native
  /** @returns the endnote settings of the document. */
  def getEndnoteSettings(): XPropertySet = js.native
  /** @returns a collection of endnotes. */
  def getEndnotes(): XIndexAccess = js.native
}

object XEndnotesSupplier {
  @scala.inline
  def apply(
    EndnoteSettings: XPropertySet,
    Endnotes: XIndexAccess,
    acquire: () => Unit,
    getEndnoteSettings: () => XPropertySet,
    getEndnotes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEndnotesSupplier = {
    val __obj = js.Dynamic.literal(EndnoteSettings = EndnoteSettings.asInstanceOf[js.Any], Endnotes = Endnotes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEndnoteSettings = js.Any.fromFunction0(getEndnoteSettings), getEndnotes = js.Any.fromFunction0(getEndnotes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEndnotesSupplier]
  }
  @scala.inline
  implicit class XEndnotesSupplierOps[Self <: XEndnotesSupplier] (val x: Self) extends AnyVal {
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
    def setEndnoteSettings(value: XPropertySet): Self = this.set("EndnoteSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndnotes(value: XIndexAccess): Self = this.set("Endnotes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetEndnoteSettings(value: () => XPropertySet): Self = this.set("getEndnoteSettings", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEndnotes(value: () => XIndexAccess): Self = this.set("getEndnotes", js.Any.fromFunction0(value))
  }
  
}

