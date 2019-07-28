package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to veto changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @since OOo 1.1.2
  */
trait XModeChangeApproveListener extends XEventListener {
  /**
    * indicates that the mode of the broadcasting component is about to change.
    *
    * The {@link ModeChangeEvent.NewMode} indicates the new mode which is to be set on the component
    * @throws VetoException when the mode change is vetoed
    */
  def approveModeChange(rSource: ModeChangeEvent): Unit
}

object XModeChangeApproveListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveModeChange: ModeChangeEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModeChangeApproveListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveModeChange = js.Any.fromFunction1(approveModeChange), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XModeChangeApproveListener]
  }
}

