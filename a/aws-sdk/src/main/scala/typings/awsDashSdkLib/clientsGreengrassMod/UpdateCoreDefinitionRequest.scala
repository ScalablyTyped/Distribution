package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCoreDefinitionRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: __string
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
}

object UpdateCoreDefinitionRequest {
  @scala.inline
  def apply(CoreDefinitionId: __string, Name: __string = null): UpdateCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateCoreDefinitionRequest]
  }
}

