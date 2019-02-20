package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to listen for changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @since OOo 1.1.2
  */
trait XModeChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** indicates that the mode of the broadcasting component has changed. */
  def modeChanged(rSource: ModeChangeEvent): scala.Unit
}

