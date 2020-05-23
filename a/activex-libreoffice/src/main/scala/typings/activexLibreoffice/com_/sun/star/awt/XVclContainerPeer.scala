package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the VCL container window implementation.
  * @deprecated Deprecated
  */
trait XVclContainerPeer extends XInterface {
  /** enable as dialog control. */
  def enableDialogControl(bEnable: Boolean): Unit
  /** sets a group. */
  def setGroup(Windows: SeqEquiv[XWindow]): Unit
  /** sets the tab order. */
  def setTabOrder(WindowOrder: SeqEquiv[XWindow], Tabs: SeqEquiv[_], GroupControl: Boolean): Unit
}

object XVclContainerPeer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    enableDialogControl: Boolean => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setGroup: SeqEquiv[XWindow] => Unit,
    setTabOrder: (SeqEquiv[XWindow], SeqEquiv[_], Boolean) => Unit
  ): XVclContainerPeer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), enableDialogControl = js.Any.fromFunction1(enableDialogControl), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGroup = js.Any.fromFunction1(setGroup), setTabOrder = js.Any.fromFunction3(setTabOrder))
    __obj.asInstanceOf[XVclContainerPeer]
  }
}

