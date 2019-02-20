package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interfaces allows the object to act according to dictionary events.
  *
  * The single method is used by a dictionary to notify its listeners about com::sun::star::linguistic2::DictionaryEvents.
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.lang.XEventListener
  */
trait XDictionaryEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is used to get notification of dictionary events.
    * @param aDicEvent the event to be notified of.
    * @see com.sun.star.lang.DictionaryEvent
    */
  def processDictionaryEvent(aDicEvent: DictionaryEvent): scala.Unit
}

