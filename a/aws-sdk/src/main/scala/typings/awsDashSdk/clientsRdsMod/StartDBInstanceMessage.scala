package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDBInstanceMessage extends js.Object {
  /**
    *  The user-supplied instance identifier. 
    */
  var DBInstanceIdentifier: String
}

object StartDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): StartDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier)
  
    __obj.asInstanceOf[StartDBInstanceMessage]
  }
}

