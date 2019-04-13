package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountRequest extends js.Object {
  /**
    * The name of the Amazon Chime account.
    */
  var Name: AccountName
}

object CreateAccountRequest {
  @scala.inline
  def apply(Name: AccountName): CreateAccountRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[CreateAccountRequest]
  }
}

