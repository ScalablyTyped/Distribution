package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction request handler.
  *
  * This interface extends the interface {@link XInteractionHandler} the way that a caller can determine whether an interaction request was actually
  * handled by the interaction handler.
  * @since OOo 3.2
  */
@js.native
trait XInteractionHandler2 extends XInteractionHandler {
  /**
    * Handle an interaction request.
    * @param Request the inteaction request to handle.
    * @returns `TRUE` , if the handler handled the request, `FALSE` otherwise.
    */
  def handleInteractionRequest(Request: XInteractionRequest): Boolean = js.native
}

object XInteractionHandler2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    handle: XInteractionRequest => Unit,
    handleInteractionRequest: XInteractionRequest => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionHandler2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handle = js.Any.fromFunction1(handle), handleInteractionRequest = js.Any.fromFunction1(handleInteractionRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionHandler2]
  }
  @scala.inline
  implicit class XInteractionHandler2Ops[Self <: XInteractionHandler2] (val x: Self) extends AnyVal {
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
    def setHandleInteractionRequest(value: XInteractionRequest => Boolean): Self = this.set("handleInteractionRequest", js.Any.fromFunction1(value))
  }
  
}

