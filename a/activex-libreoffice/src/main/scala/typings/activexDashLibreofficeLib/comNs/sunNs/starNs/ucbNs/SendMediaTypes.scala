package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a list of Internet media types (like "text/plain" and "text/html"), that are related to a send protocol. */
trait SendMediaTypes extends js.Object {
  /** the protocol to which the information is related (i.e. "NNTP", "SMTP", "VIM"). */
  var ProtocolType: java.lang.String
  /** a list of Internet media types */
  var Value: stdLib.SafeArray[java.lang.String]
}

object SendMediaTypes {
  @scala.inline
  def apply(ProtocolType: java.lang.String, Value: stdLib.SafeArray[java.lang.String]): SendMediaTypes = {
    val __obj = js.Dynamic.literal(ProtocolType = ProtocolType, Value = Value)
  
    __obj.asInstanceOf[SendMediaTypes]
  }
}

