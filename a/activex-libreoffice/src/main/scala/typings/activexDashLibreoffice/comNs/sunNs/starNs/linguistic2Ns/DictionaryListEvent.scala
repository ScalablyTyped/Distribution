package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait DictionaryListEvent extends EventObject {
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
  @scala.inline
  def apply(Source: XInterface, aDictionaryEvents: SafeArray[DictionaryEvent], nCondensedEvent: Double): DictionaryListEvent = {
    val __obj = js.Dynamic.literal(Source = Source, aDictionaryEvents = aDictionaryEvents, nCondensedEvent = nCondensedEvent)
  
    __obj.asInstanceOf[DictionaryListEvent]
  }
}

