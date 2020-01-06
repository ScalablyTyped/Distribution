package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemTemplateDescription extends js.Object {
  /**
    * The definition document of a system.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.native
  /**
    * An object that contains summary information about a system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.native
  /**
    * The namespace version against which the system was validated. Use this value in your system instance.
    */
  var validatedNamespaceVersion: js.UndefOr[Version] = js.native
}

object SystemTemplateDescription {
  @scala.inline
  def apply(
    definition: DefinitionDocument = null,
    summary: SystemTemplateSummary = null,
    validatedNamespaceVersion: Int | Double = null
  ): SystemTemplateDescription = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (validatedNamespaceVersion != null) __obj.updateDynamic("validatedNamespaceVersion")(validatedNamespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTemplateDescription]
  }
}

