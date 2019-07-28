package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an event broadcasted by an {@link XDataEditor} . */
trait DataEditorEvent extends EventObject {
  /** specifies the type of the event. */
  var Type: DataEditorEventType
}

object DataEditorEvent {
  @scala.inline
  def apply(Source: XInterface, Type: DataEditorEventType): DataEditorEvent = {
    val __obj = js.Dynamic.literal(Source = Source, Type = Type)
  
    __obj.asInstanceOf[DataEditorEvent]
  }
}

