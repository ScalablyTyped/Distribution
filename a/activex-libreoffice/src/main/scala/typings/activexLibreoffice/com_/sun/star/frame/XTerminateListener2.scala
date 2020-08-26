package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extend interface {@link XTerminateListener} so a listener will be informed in case termination process was canceled by other reasons. */
@js.native
trait XTerminateListener2 extends XTerminateListener {
  /**
    * is called when the master environment (e.g., desktop) was canceled in it's terminate request.
    *
    * Termination can be intercepted by throwing {@link TerminationVetoException} . But if a listener was queried for termination .. doesn't throw a veto
    * exception ... it doesn't know if termination will be real next time. Because any other listener can throw those exception too ... and so it can happen
    * that after {@link queryTermination()} no {@link notifyTermination()} will occur. But these listener don't know if its allowed to start new processes
    * then. Using this optional(!) interface will make it possible to be informed about canceled termination requests also.
    * @param Event describe the source of the event (e.g., the desktop)
    */
  def cancelTermination(Event: EventObject): Unit = js.native
}

object XTerminateListener2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancelTermination: EventObject => Unit,
    disposing: EventObject => Unit,
    notifyTermination: EventObject => Unit,
    queryInterface: `type` => js.Any,
    queryTermination: EventObject => Unit,
    release: () => Unit
  ): XTerminateListener2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelTermination = js.Any.fromFunction1(cancelTermination), disposing = js.Any.fromFunction1(disposing), notifyTermination = js.Any.fromFunction1(notifyTermination), queryInterface = js.Any.fromFunction1(queryInterface), queryTermination = js.Any.fromFunction1(queryTermination), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTerminateListener2]
  }
  @scala.inline
  implicit class XTerminateListener2Ops[Self <: XTerminateListener2] (val x: Self) extends AnyVal {
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
    def setCancelTermination(value: EventObject => Unit): Self = this.set("cancelTermination", js.Any.fromFunction1(value))
  }
  
}

