package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAccountAliasRequest extends js.Object {
  /**
    * The name of the account alias to delete. This parameter allows (through its regex pattern) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.
    */
  var AccountAlias: accountAliasType
}

object DeleteAccountAliasRequest {
  @scala.inline
  def apply(AccountAlias: accountAliasType): DeleteAccountAliasRequest = {
    val __obj = js.Dynamic.literal(AccountAlias = AccountAlias)
  
    __obj.asInstanceOf[DeleteAccountAliasRequest]
  }
}

