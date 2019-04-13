package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAgentVersionsRequest extends js.Object {
  /**
    * The configuration manager.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object DescribeAgentVersionsRequest {
  @scala.inline
  def apply(ConfigurationManager: StackConfigurationManager = null, StackId: String = null): DescribeAgentVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationManager != null) __obj.updateDynamic("ConfigurationManager")(ConfigurationManager)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[DescribeAgentVersionsRequest]
  }
}

