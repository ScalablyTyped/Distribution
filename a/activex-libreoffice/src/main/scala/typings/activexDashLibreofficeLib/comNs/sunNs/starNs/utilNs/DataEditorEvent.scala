package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an event broadcasted by an {@link XDataEditor} . */
trait DataEditorEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** specifies the type of the event. */
  var Type: DataEditorEventType
}

object DataEditorEvent {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, Type: DataEditorEventType): DataEditorEvent = {
    val __obj = js.Dynamic.literal(Source = Source, Type = Type)
  
    __obj.asInstanceOf[DataEditorEvent]
  }
}

