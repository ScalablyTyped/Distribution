package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemTemplateDescription extends js.Object {
  /**
    * The definition document of a system.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.undefined
  /**
    * An object that contains summary information about a system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.undefined
  /**
    * The namespace version against which the system was validated. Use this value in your system instance.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
}

object SystemTemplateDescription {
  @scala.inline
  def apply(
    definition: DefinitionDocument = null,
    summary: SystemTemplateSummary = null,
    validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
  ): SystemTemplateDescription = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (!js.isUndefined(validatedNamespaceVersion)) __obj.updateDynamic("validatedNamespaceVersion")(validatedNamespaceVersion)
    __obj.asInstanceOf[SystemTemplateDescription]
  }
}

