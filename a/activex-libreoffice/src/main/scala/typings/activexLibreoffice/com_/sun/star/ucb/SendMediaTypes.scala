package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a list of Internet media types (like "text/plain" and "text/html"), that are related to a send protocol. */
@js.native
trait SendMediaTypes extends js.Object {
  
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
  implicit class SendMediaTypesOps[Self <: SendMediaTypes] (val x: Self) extends AnyVal {
    
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
    def setProtocolType(value: String): Self = this.set("ProtocolType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: SafeArray[String]): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
