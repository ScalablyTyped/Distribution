package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interfaces allows the object to act according to dictionary-list events.
  *
  * This interface is the base class for all dictionary-list event listeners. Its single function will be called by the broadcasting dictionary-list in
  * order to notify its registered listeners.
  * @see com.sun.star.linguistic2.DictionaryListEvent
  * @see com.sun.star.linguistic2.XDictionaryList
  */
@js.native
trait XDictionaryListEventListener extends XEventListener {
  /**
    * is used to notify the object about dictionary-list events.
    * @param aDicListEvent the event to be notified of.
    * @see com.sun.star.linguistic2.DictionaryListEvent
    */
  def processDictionaryListEvent(aDicListEvent: DictionaryListEvent): Unit = js.native
}

object XDictionaryListEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    processDictionaryListEvent: DictionaryListEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDictionaryListEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), processDictionaryListEvent = js.Any.fromFunction1(processDictionaryListEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDictionaryListEventListener]
  }
  @scala.inline
  implicit class XDictionaryListEventListenerOps[Self <: XDictionaryListEventListener] (val x: Self) extends AnyVal {
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
    def setProcessDictionaryListEvent(value: DictionaryListEvent => Unit): Self = this.set("processDictionaryListEvent", js.Any.fromFunction1(value))
  }
  
}

