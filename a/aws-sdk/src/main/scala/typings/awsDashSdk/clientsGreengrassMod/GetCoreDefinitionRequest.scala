package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCoreDefinitionRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: __string = js.native
}

object GetCoreDefinitionRequest {
  @scala.inline
  def apply(CoreDefinitionId: __string): GetCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCoreDefinitionRequest]
  }
}

