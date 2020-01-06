package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSystemTemplateRequest extends js.Object {
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The DefinitionDocument that contains the updated system definition.
    */
  var definition: DefinitionDocument = js.native
  /**
    * The ID of the system to be updated. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn = js.native
}

object UpdateSystemTemplateRequest {
  @scala.inline
  def apply(definition: DefinitionDocument, id: Urn, compatibleNamespaceVersion: Int | Double = null): UpdateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (compatibleNamespaceVersion != null) __obj.updateDynamic("compatibleNamespaceVersion")(compatibleNamespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSystemTemplateRequest]
  }
}

