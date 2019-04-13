package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprocessedAccount extends js.Object {
  /**
    * AWS Account ID.
    */
  var AccountId: __string
  /**
    * A reason why the account hasn't been processed.
    */
  var Result: __string
}

object UnprocessedAccount {
  @scala.inline
  def apply(AccountId: __string, Result: __string): UnprocessedAccount = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, Result = Result)
  
    __obj.asInstanceOf[UnprocessedAccount]
  }
}

