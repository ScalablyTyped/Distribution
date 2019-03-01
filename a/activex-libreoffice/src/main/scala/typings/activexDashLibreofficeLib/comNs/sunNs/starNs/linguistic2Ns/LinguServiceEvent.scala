package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a linguistic service event.
  *
  * This type of event may be broadcast by a spell checker or hyphenator service implementation to inform its listeners (clients) that the results of
  * previous function calls may be different now. It is possible to suggest that hyphenation should be done again and/or the spelling of previously
  * incorrect or correct words should be checked again.
  * @see com.sun.star.linguistic2.XLinguServiceEventBroadcaster
  * @see com.sun.star.linguistic2.XLinguServiceEventListener
  * @see com.sun.star.linguistic2.SpellChecker
  * @see com.sun.star.linguistic2.Hyphenator
  * @see com.sun.star.lang.EventObject
  */
trait LinguServiceEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * The type of event.
    *
    * The value may be combined via logical OR from those values defined in {@link com.sun.star.linguistic2.LinguServiceEventFlags}
    */
  var nEvent: scala.Double
}

object LinguServiceEvent {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, nEvent: scala.Double): LinguServiceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("nEvent")(nEvent)
    __obj.asInstanceOf[LinguServiceEvent]
  }
}

