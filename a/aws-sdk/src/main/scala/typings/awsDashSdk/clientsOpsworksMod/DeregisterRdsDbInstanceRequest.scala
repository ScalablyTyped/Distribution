package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterRdsDbInstanceRequest extends js.Object {
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String
}

object DeregisterRdsDbInstanceRequest {
  @scala.inline
  def apply(RdsDbInstanceArn: String): DeregisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn)
  
    __obj.asInstanceOf[DeregisterRdsDbInstanceRequest]
  }
}

