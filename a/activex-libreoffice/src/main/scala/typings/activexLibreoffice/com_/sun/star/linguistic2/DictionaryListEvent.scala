package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * structure representing a dictionary-list event.
  *
  * This structure is used by the dictionary-list to inform its listeners about certain events. Since the dictionary-list is able to collect several
  * single events before broadcasting them to its listeners the integer argument may be a combination (logical or) of several event types. If more
  * specific information about the events is requested by a listener, a sequence of all dictionary-list events since the last broadcasting will be
  * supplied. Otherwise, that list will be empty.
  * @see com.sun.star.linguistic2.DictionaryList
  * @see com.sun.star.linguistic2.XDictionaryListEventListener
  * @see com.sun.star.lang.EventObject
  */
trait DictionaryListEvent
  extends StObject
     with EventObject {
  
  /**
    * list of accumulated dictionary events.
    *
    * It will be empty if all {@link com.sun.star.linguistic2.XDictionaryListEventListener} are satisfied with the condensed representation of the {@link
    * com.sun.star.linguistic2.DictionaryListEvent.nCondensedEvent()} .
    * @see com.sun.star.linguistic2.DictionaryEvent
    */
  var aDictionaryEvents: SafeArray[DictionaryEvent]
  
  /**
    * the combined type of the accumulated events.
    *
    * The value can be the combination of multiple {@link com.sun.star.linguistic2.DictionaryListEventFlags} by applying the logical OR to them.
    * @see com.sun.star.linguistic2.DictionaryListEventFlags
    */
  var nCondensedEvent: Double
}
object DictionaryListEvent {
  
  inline def apply(Source: XInterface, aDictionaryEvents: SafeArray[DictionaryEvent], nCondensedEvent: Double): DictionaryListEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], aDictionaryEvents = aDictionaryEvents.asInstanceOf[js.Any], nCondensedEvent = nCondensedEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryListEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictionaryListEvent] (val x: Self) extends AnyVal {
    
    inline def setADictionaryEvents(value: SafeArray[DictionaryEvent]): Self = StObject.set(x, "aDictionaryEvents", value.asInstanceOf[js.Any])
    
    inline def setNCondensedEvent(value: Double): Self = StObject.set(x, "nCondensedEvent", value.asInstanceOf[js.Any])
  }
}
