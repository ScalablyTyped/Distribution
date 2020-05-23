package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a dictionary event.
  *
  * This type of event is used by a dictionary to inform its listeners about changes in its properties or its entry list. It consists of an event type and
  * may supply an affected dictionary entry.
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.linguistic2.XDictionaryEventListener
  * @see com.sun.star.lang.EventObject
  */
trait DictionaryEvent extends EventObject {
  /**
    * is the type of event.
    *
    * This must be the value of a single flag. No combinations are allowed.
    * @see com.sun.star.linguistic2.DictionaryEventFlags
    */
  var nEvent: Double
  /**
    * is the affected dictionary entry (if any).
    *
    * It must be set if an entry was added or deleted, otherwise it should be empty.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    */
  var xDictionaryEntry: XDictionaryEntry
}

object DictionaryEvent {
  @scala.inline
  def apply(Source: XInterface, nEvent: Double, xDictionaryEntry: XDictionaryEntry): DictionaryEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], nEvent = nEvent.asInstanceOf[js.Any], xDictionaryEntry = xDictionaryEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryEvent]
  }
}

