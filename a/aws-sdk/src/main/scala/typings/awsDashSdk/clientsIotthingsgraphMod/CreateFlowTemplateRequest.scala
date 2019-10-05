package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFlowTemplateRequest extends js.Object {
  /**
    * The namespace version in which the workflow is to be created. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
  /**
    * The workflow DefinitionDocument.
    */
  var definition: DefinitionDocument
}

object CreateFlowTemplateRequest {
  @scala.inline
  def apply(definition: DefinitionDocument, compatibleNamespaceVersion: Int | Double = null): CreateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition)
    if (compatibleNamespaceVersion != null) __obj.updateDynamic("compatibleNamespaceVersion")(compatibleNamespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowTemplateRequest]
  }
}

