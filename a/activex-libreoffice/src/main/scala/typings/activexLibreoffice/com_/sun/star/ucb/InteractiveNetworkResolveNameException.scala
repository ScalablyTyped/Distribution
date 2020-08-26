package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A network error specifying a name resolution failure. */
@js.native
trait InteractiveNetworkResolveNameException extends ClassifiedInteractionRequest {
  /** The server name for which resolution failed. */
  var Server: String = js.native
}

object InteractiveNetworkResolveNameException {
  @scala.inline
  def apply(Classification: InteractionClassification, Context: XInterface, Message: String, Server: String): InteractiveNetworkResolveNameException = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveNetworkResolveNameException]
  }
  @scala.inline
  implicit class InteractiveNetworkResolveNameExceptionOps[Self <: InteractiveNetworkResolveNameException] (val x: Self) extends AnyVal {
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
    def setServer(value: String): Self = this.set("Server", value.asInstanceOf[js.Any])
  }
  
}

