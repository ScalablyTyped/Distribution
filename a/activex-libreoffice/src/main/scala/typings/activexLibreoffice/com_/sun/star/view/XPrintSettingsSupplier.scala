package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers printing related settings, which affect document rendering, but are not related to the printer itself. */
trait XPrintSettingsSupplier extends XInterface {
  /**
    * @returns a set of properties which are related to printing.
    * @see PrintSettings
    */
  val PrintSettings: XPropertySet
  /**
    * @returns a set of properties which are related to printing.
    * @see PrintSettings
    */
  def getPrintSettings(): XPropertySet
}

object XPrintSettingsSupplier {
  @scala.inline
  def apply(
    PrintSettings: XPropertySet,
    acquire: () => Unit,
    getPrintSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrintSettingsSupplier = {
    val __obj = js.Dynamic.literal(PrintSettings = PrintSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPrintSettings = js.Any.fromFunction0(getPrintSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrintSettingsSupplier]
  }
}

