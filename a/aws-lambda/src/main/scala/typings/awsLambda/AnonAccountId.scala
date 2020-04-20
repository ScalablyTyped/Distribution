package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccountId extends js.Object {
  var accountId: String
  var data: AnonActionConfiguration
  var id: String
}

object AnonAccountId {
  @scala.inline
  def apply(accountId: String, data: AnonActionConfiguration, id: String): AnonAccountId = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountId]
  }
}

