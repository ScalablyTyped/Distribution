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

