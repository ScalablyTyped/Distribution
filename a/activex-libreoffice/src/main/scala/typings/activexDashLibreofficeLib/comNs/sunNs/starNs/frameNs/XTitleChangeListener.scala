package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to receive notifications when the frame title changes */
trait XTitleChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** The frame title has changed */
  def titleChanged(aEvent: TitleChangedEvent): scala.Unit
}

