package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEditorEvent]
  }
}

