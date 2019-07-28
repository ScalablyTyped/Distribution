package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
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
trait XDictionaryListEventListener extends XEventListener {
  /**
    * is used to notify the object about dictionary-list events.
    * @param aDicListEvent the event to be notified of.
    * @see com.sun.star.linguistic2.DictionaryListEvent
    */
  def processDictionaryListEvent(aDicListEvent: DictionaryListEvent): Unit
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
}

