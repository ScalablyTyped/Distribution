package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SipAddress extends js.Object {
  /**
    * The type of the SIP address.
    */
  var Type: SipType
  /**
    * The URI for the SIP address.
    */
  var Uri: SipUri
}

object SipAddress {
  @scala.inline
  def apply(Type: SipType, Uri: SipUri): SipAddress = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Uri = Uri)
  
    __obj.asInstanceOf[SipAddress]
  }
}

