package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoggingConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the web ACL for which you want to get the LoggingConfiguration.
    */
  var ResourceArn: typings.awsDashSdk.clientsWafMod.ResourceArn
}

object GetLoggingConfigurationRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): GetLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[GetLoggingConfigurationRequest]
  }
}

