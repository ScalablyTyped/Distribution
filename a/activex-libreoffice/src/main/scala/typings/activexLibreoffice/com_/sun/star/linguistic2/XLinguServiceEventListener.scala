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
@js.native
trait XLinguServiceEventListener extends XEventListener {
  /** @param aLngSvcEvent the event the listener will be informed about. */
  def processLinguServiceEvent(aLngSvcEvent: LinguServiceEvent): Unit = js.native
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
  @scala.inline
  implicit class XLinguServiceEventListenerOps[Self <: XLinguServiceEventListener] (val x: Self) extends AnyVal {
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
    def setProcessLinguServiceEvent(value: LinguServiceEvent => Unit): Self = this.set("processLinguServiceEvent", js.Any.fromFunction1(value))
  }
  
}

