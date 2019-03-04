package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to veto changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @since OOo 1.1.2
  */
trait XModeChangeApproveListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * indicates that the mode of the broadcasting component is about to change.
    *
    * The {@link ModeChangeEvent.NewMode} indicates the new mode which is to be set on the component
    * @throws VetoException when the mode change is vetoed
    */
  def approveModeChange(rSource: ModeChangeEvent): scala.Unit
}

object XModeChangeApproveListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    approveModeChange: js.Function1[ModeChangeEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XModeChangeApproveListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, approveModeChange = approveModeChange, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XModeChangeApproveListener]
  }
}

