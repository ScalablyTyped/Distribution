package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Optional
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Obtains human readable strings from an {@link XInteractionRequest} . */
@js.native
trait XInteractionRequestStringResolver extends XInterface {
  /**
    * Obtains a string containing a human readable message from an informational interaction request.
    *
    * An informational interaction request contains not more than one interaction continuation (user has no choice; request is just informational). The
    * supplies continuation must either be a {@link XInteractionAbort} or {@link XInteractionApprove}
    * @param Request the interaction request for that the message shall be obtained.
    * @returns the message string or an empty com::sun::star::beans::Optional.
    */
  def getStringFromInformationalRequest(Request: XInteractionRequest): Optional[String] = js.native
}

object XInteractionRequestStringResolver {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getStringFromInformationalRequest: XInteractionRequest => Optional[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInteractionRequestStringResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getStringFromInformationalRequest = js.Any.fromFunction1(getStringFromInformationalRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInteractionRequestStringResolver]
  }
  @scala.inline
  implicit class XInteractionRequestStringResolverOps[Self <: XInteractionRequestStringResolver] (val x: Self) extends AnyVal {
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
    def setGetStringFromInformationalRequest(value: XInteractionRequest => Optional[String]): Self = this.set("getStringFromInformationalRequest", js.Any.fromFunction1(value))
  }
  
}

