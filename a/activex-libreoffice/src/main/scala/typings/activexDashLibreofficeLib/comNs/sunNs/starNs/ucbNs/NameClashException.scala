package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An exception used to notify a name clash. */
trait NameClashException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** contains the clashing name. */
  var Name: java.lang.String
}

object NameClashException {
  @scala.inline
  def apply(
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    Name: java.lang.String
  ): NameClashException = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, Name = Name)
  
    __obj.asInstanceOf[NameClashException]
  }
}

