package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeValidDBInstanceModificationsMessage extends js.Object {
  /**
    * The customer identifier or the ARN of your DB instance.
    */
  var DBInstanceIdentifier: String
}

object DescribeValidDBInstanceModificationsMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): DescribeValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier)
  
    __obj.asInstanceOf[DescribeValidDBInstanceModificationsMessage]
  }
}

