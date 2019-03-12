package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the window peer of a GridControl and allows you to set and retrieve the model data.
  *
  * Usually, the columns used are the columns as supplied by the grid control model.
  *
  * You should use this interface only if you know exactly what you are doing. Tampering with the columns of a grid control which is part of a complex
  * form can really hurt ....
  * @deprecated Deprecated
  * @see com.sun.star.awt.XWindowPeer
  * @see com.sun.star.form.component.GridControl
  */
trait XGridPeer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieves the currently used column definitions of the peer. */
  var Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
  /** retrieves the currently used column definitions of the peer. */
  def getColumns(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
  /** sets the column definition for the peer. */
  def setColumns(aColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer): scala.Unit
}

object XGridPeer {
  @scala.inline
  def apply(
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    acquire: () => scala.Unit,
    getColumns: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer => scala.Unit
  ): XGridPeer = {
    val __obj = js.Dynamic.literal(Columns = Columns, acquire = js.Any.fromFunction0(acquire), getColumns = js.Any.fromFunction0(getColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setColumns = js.Any.fromFunction1(setColumns))
  
    __obj.asInstanceOf[XGridPeer]
  }
}

