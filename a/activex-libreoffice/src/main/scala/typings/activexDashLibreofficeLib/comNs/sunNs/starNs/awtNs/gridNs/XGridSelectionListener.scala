package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An instance of this interface is used by the {@link XGridRowSelection} to get notifications about selection changes. */
trait XGridSelectionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** Invoked after a selection was changed. */
  def selectionChanged(gridSelectionEvent: GridSelectionEvent): scala.Unit
}

object XGridSelectionListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    selectionChanged: js.Function1[GridSelectionEvent, scala.Unit]
  ): XGridSelectionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, selectionChanged = selectionChanged)
  
    __obj.asInstanceOf[XGridSelectionListener]
  }
}

