package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploySystemInstanceRequest extends js.Object {
  /**
    * The ID of the system instance. This value is returned by the CreateSystemInstance action. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:deployment:DEPLOYMENTNAME 
    */
  var id: js.UndefOr[Urn] = js.undefined
}

object DeploySystemInstanceRequest {
  @scala.inline
  def apply(id: Urn = null): DeploySystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DeploySystemInstanceRequest]
  }
}

