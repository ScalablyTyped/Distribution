package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SipAddress extends js.Object {
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
}

