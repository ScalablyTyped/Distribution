package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemTemplateRequest extends js.Object {
  /**
    * The ID of the system to get. This ID must be in the user's namespace. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn
  /**
    * The number that specifies the revision of the system to get.
    */
  var revisionNumber: js.UndefOr[Version] = js.undefined
}

object GetSystemTemplateRequest {
  @scala.inline
  def apply(id: Urn, revisionNumber: js.UndefOr[Version] = js.undefined): GetSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(revisionNumber)) __obj.updateDynamic("revisionNumber")(revisionNumber)
    __obj.asInstanceOf[GetSystemTemplateRequest]
  }
}

