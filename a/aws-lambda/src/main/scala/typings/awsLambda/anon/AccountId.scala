package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountId extends js.Object {
  var accountId: String
  var data: ActionConfiguration
  var id: String
}

object AccountId {
  @scala.inline
  def apply(accountId: String, data: ActionConfiguration, id: String): AccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountId]
  }
}

