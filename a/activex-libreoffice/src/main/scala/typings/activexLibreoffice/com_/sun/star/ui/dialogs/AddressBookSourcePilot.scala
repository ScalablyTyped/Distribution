package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait AddressBookSourcePilot extends XExecutableDialog {
  def createWithParent(ParentWindow: XWindow): Unit
}

object AddressBookSourcePilot {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithParent: XWindow => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): AddressBookSourcePilot = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithParent = js.Any.fromFunction1(createWithParent), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[AddressBookSourcePilot]
  }
}

