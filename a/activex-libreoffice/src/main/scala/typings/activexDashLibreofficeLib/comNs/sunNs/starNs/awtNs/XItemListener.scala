package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events from a component when the state of an item changes. */
trait XItemListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when an item changes its state. */
  def itemStateChanged(rEvent: ItemEvent): scala.Unit
}

object XItemListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    itemStateChanged: js.Function1[ItemEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XItemListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, itemStateChanged = itemStateChanged, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XItemListener]
  }
}

