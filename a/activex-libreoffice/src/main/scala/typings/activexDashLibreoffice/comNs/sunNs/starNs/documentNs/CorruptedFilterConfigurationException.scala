package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown in case the global filter configuration does not exists or contains corrupted data.
  * @since OOo 2.0
  */
trait CorruptedFilterConfigurationException extends Exception {
  /** Instead of the message part of an exception, this value describe the type of corruption more in detail. */
  var Details: String
}

object CorruptedFilterConfigurationException {
  @scala.inline
  def apply(Context: XInterface, Details: String, Message: String): CorruptedFilterConfigurationException = {
    val __obj = js.Dynamic.literal(Context = Context, Details = Details, Message = Message)
  
    __obj.asInstanceOf[CorruptedFilterConfigurationException]
  }
}

