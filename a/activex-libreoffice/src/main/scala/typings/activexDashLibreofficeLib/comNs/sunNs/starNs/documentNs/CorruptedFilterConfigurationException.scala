package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown in case the global filter configuration does not exists or contains corrupted data.
  * @since OOo 2.0
  */
trait CorruptedFilterConfigurationException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** Instead of the message part of an exception, this value describe the type of corruption more in detail. */
  var Details: java.lang.String
}

object CorruptedFilterConfigurationException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Details: java.lang.String,
    Message: java.lang.String
  ): CorruptedFilterConfigurationException = {
    val __obj = js.Dynamic.literal(Context = Context, Details = Details, Message = Message)
  
    __obj.asInstanceOf[CorruptedFilterConfigurationException]
  }
}

