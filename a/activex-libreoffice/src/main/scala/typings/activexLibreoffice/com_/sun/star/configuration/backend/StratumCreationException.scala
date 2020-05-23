package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is passed to an {@link InteractionHandler} when creating a stratum backend fails.
  * @since OOo 2.0
  */
trait StratumCreationException extends BackendSetupException {
  /** Initialization data passed to the stratum instance. */
  var StratumData: String
  /** Identifier of the stratum service that could not be created. */
  var StratumService: String
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
}

