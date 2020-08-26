package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the {@link FootnoteSettings} within the context (e.g. document). */
@js.native
trait XEndnotesSettingsSupplier extends XInterface {
  /** @returns {@link EndnoteSettings} of the object. */
  val EndnotesSettings: XPropertySet = js.native
  /** @returns {@link EndnoteSettings} of the object. */
  def getEndnotesSettings(): XPropertySet = js.native
}

object XEndnotesSettingsSupplier {
  @scala.inline
  def apply(
    EndnotesSettings: XPropertySet,
    acquire: () => Unit,
    getEndnotesSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEndnotesSettingsSupplier = {
    val __obj = js.Dynamic.literal(EndnotesSettings = EndnotesSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEndnotesSettings = js.Any.fromFunction0(getEndnotesSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEndnotesSettingsSupplier]
  }
  @scala.inline
  implicit class XEndnotesSettingsSupplierOps[Self <: XEndnotesSettingsSupplier] (val x: Self) extends AnyVal {
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
    def setEndnotesSettings(value: XPropertySet): Self = this.set("EndnotesSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetEndnotesSettings(value: () => XPropertySet): Self = this.set("getEndnotesSettings", js.Any.fromFunction0(value))
  }
  
}

