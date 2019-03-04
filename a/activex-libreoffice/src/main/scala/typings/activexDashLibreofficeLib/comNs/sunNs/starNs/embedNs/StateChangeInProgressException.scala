package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception can be thrown in case the object does not allow to call requested functionality currently because the object is changing state. */
trait StateChangeInProgressException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /**
    * contains the target state the object tries to reach currently.
    *
    * Contains a value from {@link EmbedStates} constant set.
    */
  var TargetState: scala.Double
}

object StateChangeInProgressException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    TargetState: scala.Double
  ): StateChangeInProgressException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, TargetState = TargetState)
  
    __obj.asInstanceOf[StateChangeInProgressException]
  }
}

