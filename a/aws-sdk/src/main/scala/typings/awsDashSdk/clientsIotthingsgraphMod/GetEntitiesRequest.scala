package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEntitiesRequest extends js.Object {
  /**
    * An array of entity IDs. The IDs should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME 
    */
  var ids: Urns
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
}

object GetEntitiesRequest {
  @scala.inline
  def apply(ids: Urns, namespaceVersion: js.UndefOr[Version] = js.undefined): GetEntitiesRequest = {
    val __obj = js.Dynamic.literal(ids = ids)
    if (!js.isUndefined(namespaceVersion)) __obj.updateDynamic("namespaceVersion")(namespaceVersion)
    __obj.asInstanceOf[GetEntitiesRequest]
  }
}

