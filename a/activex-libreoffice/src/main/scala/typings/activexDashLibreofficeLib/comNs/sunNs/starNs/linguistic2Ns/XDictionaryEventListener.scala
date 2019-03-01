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

object XDictionaryEventListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    processDictionaryEvent: js.Function1[DictionaryEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDictionaryEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("processDictionaryEvent")(processDictionaryEvent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDictionaryEventListener]
  }
}

