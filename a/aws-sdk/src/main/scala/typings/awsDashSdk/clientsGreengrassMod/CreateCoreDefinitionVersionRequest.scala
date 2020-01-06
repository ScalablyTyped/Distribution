package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCoreDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.native
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: __string = js.native
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[__listOfCore] = js.native
}

object CreateCoreDefinitionVersionRequest {
  @scala.inline
  def apply(CoreDefinitionId: __string, AmznClientToken: __string = null, Cores: __listOfCore = null): CreateCoreDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (Cores != null) __obj.updateDynamic("Cores")(Cores.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCoreDefinitionVersionRequest]
  }
}

