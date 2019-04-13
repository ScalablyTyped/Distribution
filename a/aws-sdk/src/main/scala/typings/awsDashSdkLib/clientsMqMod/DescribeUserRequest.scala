package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: __string
  /**
    * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: __string
}

object DescribeUserRequest {
  @scala.inline
  def apply(BrokerId: __string, Username: __string): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId, Username = Username)
  
    __obj.asInstanceOf[DescribeUserRequest]
  }
}

