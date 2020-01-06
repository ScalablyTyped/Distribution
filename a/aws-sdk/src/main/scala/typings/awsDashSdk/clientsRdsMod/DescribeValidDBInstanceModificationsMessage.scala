package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeValidDBInstanceModificationsMessage extends js.Object {
  /**
    * The customer identifier or the ARN of your DB instance. 
    */
  var DBInstanceIdentifier: String = js.native
}

object DescribeValidDBInstanceModificationsMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): DescribeValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeValidDBInstanceModificationsMessage]
  }
}

