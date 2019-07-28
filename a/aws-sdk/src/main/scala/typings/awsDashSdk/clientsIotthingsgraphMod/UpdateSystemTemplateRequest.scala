package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSystemTemplateRequest extends js.Object {
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
  /**
    * The DefinitionDocument that contains the updated system definition.
    */
  var definition: DefinitionDocument
  /**
    * The ID of the system to be updated. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn
}

object UpdateSystemTemplateRequest {
  @scala.inline
  def apply(
    definition: DefinitionDocument,
    id: Urn,
    compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
  ): UpdateSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition, id = id)
    if (!js.isUndefined(compatibleNamespaceVersion)) __obj.updateDynamic("compatibleNamespaceVersion")(compatibleNamespaceVersion)
    __obj.asInstanceOf[UpdateSystemTemplateRequest]
  }
}

