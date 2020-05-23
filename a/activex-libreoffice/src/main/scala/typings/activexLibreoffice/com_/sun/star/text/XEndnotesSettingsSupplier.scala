package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(EndnotesSettings = EndnotesSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEndnotesSettings = js.Any.fromFunction0(getEndnotesSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEndnotesSettingsSupplier]
  }
}

