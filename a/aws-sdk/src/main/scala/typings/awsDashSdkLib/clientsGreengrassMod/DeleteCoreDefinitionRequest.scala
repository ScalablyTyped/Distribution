package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCoreDefinitionRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: __string
}

object DeleteCoreDefinitionRequest {
  @scala.inline
  def apply(CoreDefinitionId: __string): DeleteCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId)
  
    __obj.asInstanceOf[DeleteCoreDefinitionRequest]
  }
}

