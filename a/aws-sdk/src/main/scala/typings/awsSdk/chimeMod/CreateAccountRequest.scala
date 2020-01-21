package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountRequest extends js.Object {
  /**
    * The name of the Amazon Chime account.
    */
  var Name: AccountName = js.native
}

object CreateAccountRequest {
  @scala.inline
  def apply(Name: AccountName): CreateAccountRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAccountRequest]
  }
}

