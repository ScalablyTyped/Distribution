package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

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
trait XDictionaryListEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is used to notify the object about dictionary-list events.
    * @param aDicListEvent the event to be notified of.
    * @see com.sun.star.linguistic2.DictionaryListEvent
    */
  def processDictionaryListEvent(aDicListEvent: DictionaryListEvent): scala.Unit
}

