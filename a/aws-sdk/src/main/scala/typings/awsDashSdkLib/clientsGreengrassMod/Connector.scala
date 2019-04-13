package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connector extends js.Object {
  /**
    * The ARN of the connector.
    */
  var ConnectorArn: js.UndefOr[__string] = js.undefined
  /**
    * A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The parameters or configuration that the connector uses.
    */
  var Parameters: js.UndefOr[__mapOf__string] = js.undefined
}

object Connector {
  @scala.inline
  def apply(ConnectorArn: __string = null, Id: __string = null, Parameters: __mapOf__string = null): Connector = {
    val __obj = js.Dynamic.literal()
    if (ConnectorArn != null) __obj.updateDynamic("ConnectorArn")(ConnectorArn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[Connector]
  }
}

