package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountAliasRequest extends js.Object {
  /**
    * The account alias to create. This parameter allows (through its regex pattern) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.
    */
  var AccountAlias: accountAliasType
}

object CreateAccountAliasRequest {
  @scala.inline
  def apply(AccountAlias: accountAliasType): CreateAccountAliasRequest = {
    val __obj = js.Dynamic.literal(AccountAlias = AccountAlias)
  
    __obj.asInstanceOf[CreateAccountAliasRequest]
  }
}

