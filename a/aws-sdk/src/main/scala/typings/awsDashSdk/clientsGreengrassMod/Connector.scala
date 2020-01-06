package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connector extends js.Object {
  /**
    * The ARN of the connector.
    */
  var ConnectorArn: __string = js.native
  /**
    * A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
    */
  var Id: __string = js.native
  /**
    * The parameters or configuration that the connector uses.
    */
  var Parameters: js.UndefOr[__mapOf__string] = js.native
}

object Connector {
  @scala.inline
  def apply(ConnectorArn: __string, Id: __string, Parameters: __mapOf__string = null): Connector = {
    val __obj = js.Dynamic.literal(ConnectorArn = ConnectorArn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
}

