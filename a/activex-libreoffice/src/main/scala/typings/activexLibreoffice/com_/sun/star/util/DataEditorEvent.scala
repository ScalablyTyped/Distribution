package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an event broadcasted by an {@link XDataEditor} . */
trait DataEditorEvent
  extends StObject
     with EventObject {
  
  /** specifies the type of the event. */
  var Type: DataEditorEventType
}
object DataEditorEvent {
  
  inline def apply(Source: XInterface, Type: DataEditorEventType): DataEditorEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEditorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataEditorEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: DataEditorEventType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
