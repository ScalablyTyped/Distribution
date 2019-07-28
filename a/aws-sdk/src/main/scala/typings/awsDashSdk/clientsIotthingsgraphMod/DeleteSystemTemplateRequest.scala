package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSystemTemplateRequest extends js.Object {
  /**
    * The ID of the system to be deleted. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn
}

object DeleteSystemTemplateRequest {
  @scala.inline
  def apply(id: Urn): DeleteSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[DeleteSystemTemplateRequest]
  }
}

