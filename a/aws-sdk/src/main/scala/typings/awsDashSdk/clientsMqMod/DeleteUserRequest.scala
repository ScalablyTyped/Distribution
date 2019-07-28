package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: __string
  /**
    * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: __string
}

object DeleteUserRequest {
  @scala.inline
  def apply(BrokerId: __string, Username: __string): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId, Username = Username)
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

