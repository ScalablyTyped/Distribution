package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access the {@link FootnoteSettings} within the context (e.g. document). */
trait XEndnotesSettingsSupplier extends XInterface {
  /** @returns {@link EndnoteSettings} of the object. */
  val EndnotesSettings: XPropertySet
  /** @returns {@link EndnoteSettings} of the object. */
  def getEndnotesSettings(): XPropertySet
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
    val __obj = js.Dynamic.literal(EndnotesSettings = EndnotesSettings, acquire = js.Any.fromFunction0(acquire), getEndnotesSettings = js.Any.fromFunction0(getEndnotesSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEndnotesSettingsSupplier]
  }
}

