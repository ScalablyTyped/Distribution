package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link XGridColumnModel} to get notifications about column model changes.
  * @since OOo 3.3
  */
trait XGridColumnListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** Invoked after a column was modified. */
  def columnChanged(event: GridColumnEvent): scala.Unit
}

object XGridColumnListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    columnChanged: js.Function1[GridColumnEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XGridColumnListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, columnChanged = columnChanged, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XGridColumnListener]
  }
}

