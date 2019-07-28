package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadEntityDefinitionsRequest extends js.Object {
  /**
    * A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new DefinitionDocument. If set to true, the upload will create a new namespace version.
    */
  var deprecateExistingEntities: js.UndefOr[DeprecateExistingEntities] = js.undefined
  /**
    * The DefinitionDocument that defines the updated entities.
    */
  var document: js.UndefOr[DefinitionDocument] = js.undefined
  /**
    * A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to true, the upload will create a new namespace version.
    */
  var syncWithPublicNamespace: js.UndefOr[SyncWithPublicNamespace] = js.undefined
}

object UploadEntityDefinitionsRequest {
  @scala.inline
  def apply(
    deprecateExistingEntities: js.UndefOr[DeprecateExistingEntities] = js.undefined,
    document: DefinitionDocument = null,
    syncWithPublicNamespace: js.UndefOr[SyncWithPublicNamespace] = js.undefined
  ): UploadEntityDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deprecateExistingEntities)) __obj.updateDynamic("deprecateExistingEntities")(deprecateExistingEntities)
    if (document != null) __obj.updateDynamic("document")(document)
    if (!js.isUndefined(syncWithPublicNamespace)) __obj.updateDynamic("syncWithPublicNamespace")(syncWithPublicNamespace)
    __obj.asInstanceOf[UploadEntityDefinitionsRequest]
  }
}

