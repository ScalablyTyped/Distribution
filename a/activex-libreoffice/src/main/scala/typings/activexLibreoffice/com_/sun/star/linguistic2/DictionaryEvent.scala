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
@js.native
trait DictionaryEvent extends EventObject {
  /**
    * is the type of event.
    *
    * This must be the value of a single flag. No combinations are allowed.
    * @see com.sun.star.linguistic2.DictionaryEventFlags
    */
  var nEvent: Double = js.native
  /**
    * is the affected dictionary entry (if any).
    *
    * It must be set if an entry was added or deleted, otherwise it should be empty.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    */
  var xDictionaryEntry: XDictionaryEntry = js.native
}

object DictionaryEvent {
  @scala.inline
  def apply(Source: XInterface, nEvent: Double, xDictionaryEntry: XDictionaryEntry): DictionaryEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], nEvent = nEvent.asInstanceOf[js.Any], xDictionaryEntry = xDictionaryEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryEvent]
  }
  @scala.inline
  implicit class DictionaryEventOps[Self <: DictionaryEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNEvent(value: Double): Self = this.set("nEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setXDictionaryEntry(value: XDictionaryEntry): Self = this.set("xDictionaryEntry", value.asInstanceOf[js.Any])
  }
  
}

