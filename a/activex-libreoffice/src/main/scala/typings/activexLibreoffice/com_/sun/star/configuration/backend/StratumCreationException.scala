package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is passed to an {@link InteractionHandler} when creating a stratum backend fails.
  * @since OOo 2.0
  */
@js.native
trait StratumCreationException extends BackendSetupException {
  /** Initialization data passed to the stratum instance. */
  var StratumData: String = js.native
  /** Identifier of the stratum service that could not be created. */
  var StratumService: String = js.native
}

object StratumCreationException {
  @scala.inline
  def apply(
    BackendException: js.Any,
    Context: XInterface,
    Message: String,
    StratumData: String,
    StratumService: String
  ): StratumCreationException = {
    val __obj = js.Dynamic.literal(BackendException = BackendException.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], StratumData = StratumData.asInstanceOf[js.Any], StratumService = StratumService.asInstanceOf[js.Any])
    __obj.asInstanceOf[StratumCreationException]
  }
  @scala.inline
  implicit class StratumCreationExceptionOps[Self <: StratumCreationException] (val x: Self) extends AnyVal {
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
    def setStratumData(value: String): Self = this.set("StratumData", value.asInstanceOf[js.Any])
    @scala.inline
    def setStratumService(value: String): Self = this.set("StratumService", value.asInstanceOf[js.Any])
  }
  
}

