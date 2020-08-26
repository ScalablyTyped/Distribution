package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functions to set and remove a merged menu bar for inplace editing.
  * @since OOo 2.0
  */
@js.native
trait XMenuBarMergingAcceptor extends XInterface {
  /** removes a previously set merged menu bar and sets a previously created menu bar back. */
  def removeMergedMenuBar(): Unit = js.native
  /**
    * allows to set a merged menu bar.
    * @param xMergedMenuBar specifies the merged menu bar.  This function is normally used to provide inplace editing where functions from two application par
    * @see com.sun.star.ui.UIElementSettings
    * @see com.sun.star.frame.XDispatchProvider
    * @see com.sun.star.frame.XLayoutManager
    */
  def setMergedMenuBar(xMergedMenuBar: XIndexAccess): Boolean = js.native
}

object XMenuBarMergingAcceptor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeMergedMenuBar: () => Unit,
    setMergedMenuBar: XIndexAccess => Boolean
  ): XMenuBarMergingAcceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMergedMenuBar = js.Any.fromFunction0(removeMergedMenuBar), setMergedMenuBar = js.Any.fromFunction1(setMergedMenuBar))
    __obj.asInstanceOf[XMenuBarMergingAcceptor]
  }
  @scala.inline
  implicit class XMenuBarMergingAcceptorOps[Self <: XMenuBarMergingAcceptor] (val x: Self) extends AnyVal {
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
    def setRemoveMergedMenuBar(value: () => Unit): Self = this.set("removeMergedMenuBar", js.Any.fromFunction0(value))
    @scala.inline
    def setSetMergedMenuBar(value: XIndexAccess => Boolean): Self = this.set("setMergedMenuBar", js.Any.fromFunction1(value))
  }
  
}

