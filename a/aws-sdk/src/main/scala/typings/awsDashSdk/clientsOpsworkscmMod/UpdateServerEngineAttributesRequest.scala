package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServerEngineAttributesRequest extends js.Object {
  /**
    * The name of the engine attribute to update. 
    */
  var AttributeName: typings.awsDashSdk.clientsOpsworkscmMod.AttributeName
  /**
    * The value to set for the attribute. 
    */
  var AttributeValue: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.AttributeValue] = js.undefined
  /**
    * The name of the server to update. 
    */
  var ServerName: typings.awsDashSdk.clientsOpsworkscmMod.ServerName
}

object UpdateServerEngineAttributesRequest {
  @scala.inline
  def apply(AttributeName: AttributeName, ServerName: ServerName, AttributeValue: AttributeValue = null): UpdateServerEngineAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName, ServerName = ServerName)
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue)
    __obj.asInstanceOf[UpdateServerEngineAttributesRequest]
  }
}

