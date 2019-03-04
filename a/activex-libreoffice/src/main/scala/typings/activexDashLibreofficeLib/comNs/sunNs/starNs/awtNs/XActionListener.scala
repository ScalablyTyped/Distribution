package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive action events. */
trait XActionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when an action is performed. */
  def actionPerformed(rEvent: ActionEvent): scala.Unit
}

object XActionListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    actionPerformed: js.Function1[ActionEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XActionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, actionPerformed = actionPerformed, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XActionListener]
  }
}

