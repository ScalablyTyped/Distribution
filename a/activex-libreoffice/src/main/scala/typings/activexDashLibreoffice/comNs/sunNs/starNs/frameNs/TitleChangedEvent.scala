package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about a changed title. */
trait TitleChangedEvent extends EventObject {
  /** The new title */
  var Title: String
}

object TitleChangedEvent {
  @scala.inline
  def apply(Source: XInterface, Title: String): TitleChangedEvent = {
    val __obj = js.Dynamic.literal(Source = Source, Title = Title)
  
    __obj.asInstanceOf[TitleChangedEvent]
  }
}

