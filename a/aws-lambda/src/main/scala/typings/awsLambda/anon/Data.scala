package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var accountId: String
  var data: ActionConfiguration
  var id: String
}

object Data {
  @scala.inline
  def apply(accountId: String, data: ActionConfiguration, id: String): Data = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

