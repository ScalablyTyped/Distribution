package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectorDefinitionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.native
  /**
    * Information about the initial version of the connector definition.
    */
  var InitialVersion: js.UndefOr[ConnectorDefinitionVersion] = js.native
  /**
    * The name of the connector definition.
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * Tag(s) to add to the new resource.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateConnectorDefinitionRequest {
  @scala.inline
  def apply(
    AmznClientToken: __string = null,
    InitialVersion: ConnectorDefinitionVersion = null,
    Name: __string = null,
    tags: Tags = null
  ): CreateConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (InitialVersion != null) __obj.updateDynamic("InitialVersion")(InitialVersion.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectorDefinitionRequest]
  }
}

