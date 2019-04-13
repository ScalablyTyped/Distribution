package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBackupRequest extends js.Object {
  /**
    *  A user-defined description of the backup. 
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The name of the server that you want to back up. 
    */
  var ServerName: awsDashSdkLib.clientsOpsworkscmMod.ServerName
}

object CreateBackupRequest {
  @scala.inline
  def apply(ServerName: ServerName, Description: String = null): CreateBackupRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateBackupRequest]
  }
}

