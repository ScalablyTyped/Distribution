package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFlowTemplateRequest extends js.Object {
  /**
    * The version of the user's namespace. If no value is specified, the latest version is used by default. Use the GetFlowTemplateRevisions if you want to find earlier revisions of the flow to update.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
  /**
    * The DefinitionDocument that contains the updated workflow definition.
    */
  var definition: DefinitionDocument
  /**
    * The ID of the workflow to be updated. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn
}

object UpdateFlowTemplateRequest {
  @scala.inline
  def apply(definition: DefinitionDocument, id: Urn, compatibleNamespaceVersion: Int | Double = null): UpdateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition, id = id)
    if (compatibleNamespaceVersion != null) __obj.updateDynamic("compatibleNamespaceVersion")(compatibleNamespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowTemplateRequest]
  }
}

