package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functions to set and remove a merged menu bar for inplace editing.
  * @since OOo 2.0
  */
trait XMenuBarMergingAcceptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** removes a previously set merged menu bar and sets a previously created menu bar back. */
  def removeMergedMenuBar(): scala.Unit
  /**
    * allows to set a merged menu bar.
    * @param xMergedMenuBar specifies the merged menu bar.  This function is normally used to provide inplace editing where functions from two application par
    * @see com.sun.star.ui.UIElementSettings
    * @see com.sun.star.frame.XDispatchProvider
    * @see com.sun.star.frame.XLayoutManager
    */
  def setMergedMenuBar(xMergedMenuBar: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess): scala.Boolean
}

object XMenuBarMergingAcceptor {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeMergedMenuBar: () => scala.Unit,
    setMergedMenuBar: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess => scala.Boolean
  ): XMenuBarMergingAcceptor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMergedMenuBar = js.Any.fromFunction0(removeMergedMenuBar), setMergedMenuBar = js.Any.fromFunction1(setMergedMenuBar))
  
    __obj.asInstanceOf[XMenuBarMergingAcceptor]
  }
}

