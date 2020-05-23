package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to inform listeners about LinguServiceEvents.
  *
  * The function of this interface is used by the {@link com.sun.star.linguistic2.XLinguServiceEventBroadcaster} to inform its listeners about the
  * com::sun::star::linguistic2::LinguServiceEvents.
  * @see com.sun.star.linguistic2.XLinguServiceManager
  */
trait XLinguServiceEventListener extends XEventListener {
  /** @param aLngSvcEvent the event the listener will be informed about. */
  def processLinguServiceEvent(aLngSvcEvent: LinguServiceEvent): Unit
}

object XLinguServiceEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    processLinguServiceEvent: LinguServiceEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLinguServiceEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), processLinguServiceEvent = js.Any.fromFunction1(processLinguServiceEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLinguServiceEventListener]
  }
}

