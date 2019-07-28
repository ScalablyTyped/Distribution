package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSystemTemplateRequest extends js.Object {
  /**
    * The namespace version in which the system is to be created. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
  /**
    * The DefinitionDocument used to create the system.
    */
  var definition: DefinitionDocument
}

object CreateSystemTemplateRequest {
  @scala.inline
  def apply(definition: DefinitionDocument, compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined): CreateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition)
    if (!js.isUndefined(compatibleNamespaceVersion)) __obj.updateDynamic("compatibleNamespaceVersion")(compatibleNamespaceVersion)
    __obj.asInstanceOf[CreateSystemTemplateRequest]
  }
}

