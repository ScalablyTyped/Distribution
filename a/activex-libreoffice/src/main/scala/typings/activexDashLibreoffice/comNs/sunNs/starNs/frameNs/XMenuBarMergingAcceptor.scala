package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functions to set and remove a merged menu bar for inplace editing.
  * @since OOo 2.0
  */
trait XMenuBarMergingAcceptor extends XInterface {
  /** removes a previously set merged menu bar and sets a previously created menu bar back. */
  def removeMergedMenuBar(): Unit
  /**
    * allows to set a merged menu bar.
    * @param xMergedMenuBar specifies the merged menu bar.  This function is normally used to provide inplace editing where functions from two application par
    * @see com.sun.star.ui.UIElementSettings
    * @see com.sun.star.frame.XDispatchProvider
    * @see com.sun.star.frame.XLayoutManager
    */
  def setMergedMenuBar(xMergedMenuBar: XIndexAccess): Boolean
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
}

