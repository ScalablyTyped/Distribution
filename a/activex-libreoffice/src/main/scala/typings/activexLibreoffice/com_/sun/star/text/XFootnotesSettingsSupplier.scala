package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the {@link FootnoteSettings} with the context (e.g. document). */
@js.native
trait XFootnotesSettingsSupplier extends XInterface {
  /** @returns {@link FootnoteSettings} of the object. */
  val FootnotesSettings: XPropertySet = js.native
  /** @returns {@link FootnoteSettings} of the object. */
  def getFootnotesSettings(): XPropertySet = js.native
}

object XFootnotesSettingsSupplier {
  @scala.inline
  def apply(
    FootnotesSettings: XPropertySet,
    acquire: () => Unit,
    getFootnotesSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFootnotesSettingsSupplier = {
    val __obj = js.Dynamic.literal(FootnotesSettings = FootnotesSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFootnotesSettings = js.Any.fromFunction0(getFootnotesSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFootnotesSettingsSupplier]
  }
  @scala.inline
  implicit class XFootnotesSettingsSupplierOps[Self <: XFootnotesSettingsSupplier] (val x: Self) extends AnyVal {
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
    def setFootnotesSettings(value: XPropertySet): Self = this.set("FootnotesSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFootnotesSettings(value: () => XPropertySet): Self = this.set("getFootnotesSettings", js.Any.fromFunction0(value))
  }
  
}

