package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the {@link FootnoteSettings} with the context (e.g. document). */
trait XFootnotesSettingsSupplier extends XInterface {
  /** @returns {@link FootnoteSettings} of the object. */
  val FootnotesSettings: XPropertySet
  /** @returns {@link FootnoteSettings} of the object. */
  def getFootnotesSettings(): XPropertySet
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
    val __obj = js.Dynamic.literal(FootnotesSettings = FootnotesSettings, acquire = js.Any.fromFunction0(acquire), getFootnotesSettings = js.Any.fromFunction0(getFootnotesSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFootnotesSettingsSupplier]
  }
}

