package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetResourceConfigRequest extends js.Object {
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID.
    */
  var resourceKeys: ResourceKeys = js.native
}

object BatchGetResourceConfigRequest {
  @scala.inline
  def apply(resourceKeys: ResourceKeys): BatchGetResourceConfigRequest = {
    val __obj = js.Dynamic.literal(resourceKeys = resourceKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetResourceConfigRequest]
  }
}

