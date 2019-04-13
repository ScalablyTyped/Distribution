package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCoreDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: __string
  /**
    * The ID of the core definition version.
    */
  var CoreDefinitionVersionId: __string
}

object GetCoreDefinitionVersionRequest {
  @scala.inline
  def apply(CoreDefinitionId: __string, CoreDefinitionVersionId: __string): GetCoreDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId, CoreDefinitionVersionId = CoreDefinitionVersionId)
  
    __obj.asInstanceOf[GetCoreDefinitionVersionRequest]
  }
}

