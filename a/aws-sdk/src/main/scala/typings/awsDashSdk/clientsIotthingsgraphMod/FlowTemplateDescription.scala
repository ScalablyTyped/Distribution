package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowTemplateDescription extends js.Object {
  /**
    * A workflow's definition document.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.undefined
  /**
    * An object that contains summary information about a workflow.
    */
  var summary: js.UndefOr[FlowTemplateSummary] = js.undefined
  /**
    * The version of the user's namespace against which the workflow was validated. Use this value in your system instance.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
}

object FlowTemplateDescription {
  @scala.inline
  def apply(
    definition: DefinitionDocument = null,
    summary: FlowTemplateSummary = null,
    validatedNamespaceVersion: Int | Double = null
  ): FlowTemplateDescription = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (validatedNamespaceVersion != null) __obj.updateDynamic("validatedNamespaceVersion")(validatedNamespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowTemplateDescription]
  }
}

