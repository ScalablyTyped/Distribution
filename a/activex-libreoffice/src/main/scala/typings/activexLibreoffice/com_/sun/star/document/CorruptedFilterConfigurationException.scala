package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorruptedFilterConfigurationException]
  }
}

