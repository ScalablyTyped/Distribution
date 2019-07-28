package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CidrAuthorizationContext extends js.Object {
  /**
    * The plain-text authorization message for the prefix and account.
    */
  var Message: String
  /**
    * The signed authorization message for the prefix and account.
    */
  var Signature: String
}

object CidrAuthorizationContext {
  @scala.inline
  def apply(Message: String, Signature: String): CidrAuthorizationContext = {
    val __obj = js.Dynamic.literal(Message = Message, Signature = Signature)
  
    __obj.asInstanceOf[CidrAuthorizationContext]
  }
}

