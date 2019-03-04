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

object XTitleChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    titleChanged: js.Function1[TitleChangedEvent, scala.Unit]
  ): XTitleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, titleChanged = titleChanged)
  
    __obj.asInstanceOf[XTitleChangeListener]
  }
}

