package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecateSystemTemplateRequest extends js.Object {
  /**
    * The ID of the system to delete. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn
}

object DeprecateSystemTemplateRequest {
  @scala.inline
  def apply(id: Urn): DeprecateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[DeprecateSystemTemplateRequest]
  }
}

