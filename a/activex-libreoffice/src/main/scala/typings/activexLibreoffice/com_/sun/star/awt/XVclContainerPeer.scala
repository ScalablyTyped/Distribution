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
@js.native
trait XVclContainerPeer extends XInterface {
  /** enable as dialog control. */
  def enableDialogControl(bEnable: Boolean): Unit = js.native
  /** sets a group. */
  def setGroup(Windows: SeqEquiv[XWindow]): Unit = js.native
  /** sets the tab order. */
  def setTabOrder(WindowOrder: SeqEquiv[XWindow], Tabs: SeqEquiv[_], GroupControl: Boolean): Unit = js.native
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
  @scala.inline
  implicit class XVclContainerPeerOps[Self <: XVclContainerPeer] (val x: Self) extends AnyVal {
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
    def setEnableDialogControl(value: Boolean => Unit): Self = this.set("enableDialogControl", js.Any.fromFunction1(value))
    @scala.inline
    def setSetGroup(value: SeqEquiv[XWindow] => Unit): Self = this.set("setGroup", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTabOrder(value: (SeqEquiv[XWindow], SeqEquiv[_], Boolean) => Unit): Self = this.set("setTabOrder", js.Any.fromFunction3(value))
  }
  
}

