package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipAddress extends StObject {
  
  /**
    * The type of the SIP address.
    */
  var Type: SipType = js.native
  
  /**
    * The URI for the SIP address.
    */
  var Uri: SipUri = js.native
}
object SipAddress {
  
  @scala.inline
  def apply(Type: SipType, Uri: SipUri): SipAddress = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SipAddress]
  }
  
  @scala.inline
  implicit class SipAddressMutableBuilder[Self <: SipAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: SipUri): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
