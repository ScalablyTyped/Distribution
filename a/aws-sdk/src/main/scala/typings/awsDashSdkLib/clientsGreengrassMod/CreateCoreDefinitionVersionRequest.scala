package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCoreDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: __string
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[__listOfCore] = js.undefined
}

object CreateCoreDefinitionVersionRequest {
  @scala.inline
  def apply(CoreDefinitionId: __string, AmznClientToken: __string = null, Cores: __listOfCore = null): CreateCoreDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId)
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (Cores != null) __obj.updateDynamic("Cores")(Cores)
    __obj.asInstanceOf[CreateCoreDefinitionVersionRequest]
  }
}

