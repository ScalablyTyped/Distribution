package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a list of Internet media types (like "text/plain" and "text/html"), that are related to a send protocol. */
@js.native
trait SendMediaTypes extends StObject {
  
  /** the protocol to which the information is related (i.e. "NNTP", "SMTP", "VIM"). */
  var ProtocolType: String = js.native
  
  /** a list of Internet media types */
  var Value: SafeArray[String] = js.native
}
object SendMediaTypes {
  
  @scala.inline
  def apply(ProtocolType: String, Value: SafeArray[String]): SendMediaTypes = {
    val __obj = js.Dynamic.literal(ProtocolType = ProtocolType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMediaTypes]
  }
  
  @scala.inline
  implicit class SendMediaTypesMutableBuilder[Self <: SendMediaTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtocolType(value: String): Self = StObject.set(x, "ProtocolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: SafeArray[String]): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
