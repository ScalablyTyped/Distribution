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
    acquire: () => scala.Unit,
    actionPerformed: ActionEvent => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XActionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), actionPerformed = js.Any.fromFunction1(actionPerformed), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XActionListener]
  }
}

