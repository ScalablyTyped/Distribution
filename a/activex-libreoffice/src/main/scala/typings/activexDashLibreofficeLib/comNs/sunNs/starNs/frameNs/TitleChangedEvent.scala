package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about a changed title. */
trait TitleChangedEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** The new title */
  var Title: java.lang.String
}

object TitleChangedEvent {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, Title: java.lang.String): TitleChangedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[TitleChangedEvent]
  }
}

