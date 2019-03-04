package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is passed to an {@link InteractionHandler} when creating a stratum backend fails.
  * @since OOo 2.0
  */
trait StratumCreationException extends BackendSetupException {
  /** Initialization data passed to the stratum instance. */
  var StratumData: java.lang.String
  /** Identifier of the stratum service that could not be created. */
  var StratumService: java.lang.String
}

object StratumCreationException {
  @scala.inline
  def apply(
    BackendException: js.Any,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    StratumData: java.lang.String,
    StratumService: java.lang.String
  ): StratumCreationException = {
    val __obj = js.Dynamic.literal(BackendException = BackendException, Context = Context, Message = Message, StratumData = StratumData, StratumService = StratumService)
  
    __obj.asInstanceOf[StratumCreationException]
  }
}

