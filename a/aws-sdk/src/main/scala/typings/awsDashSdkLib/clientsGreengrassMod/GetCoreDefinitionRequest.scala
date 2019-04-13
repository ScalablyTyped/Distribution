package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCoreDefinitionRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: __string
}

object GetCoreDefinitionRequest {
  @scala.inline
  def apply(CoreDefinitionId: __string): GetCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId)
  
    __obj.asInstanceOf[GetCoreDefinitionRequest]
  }
}

