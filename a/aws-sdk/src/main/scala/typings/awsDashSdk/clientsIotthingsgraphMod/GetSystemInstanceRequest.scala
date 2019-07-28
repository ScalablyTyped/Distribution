package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInstanceRequest extends js.Object {
  /**
    * The ID of the system deployment instance. This value is returned by CreateSystemInstance. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:deployment:DEPLOYMENTNAME 
    */
  var id: Urn
}

object GetSystemInstanceRequest {
  @scala.inline
  def apply(id: Urn): GetSystemInstanceRequest = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[GetSystemInstanceRequest]
  }
}

