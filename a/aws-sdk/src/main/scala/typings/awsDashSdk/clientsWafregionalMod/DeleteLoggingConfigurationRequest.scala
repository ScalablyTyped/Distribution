package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLoggingConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the web ACL from which you want to delete the LoggingConfiguration.
    */
  var ResourceArn: typings.awsDashSdk.clientsWafregionalMod.ResourceArn
}

object DeleteLoggingConfigurationRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): DeleteLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
  
    __obj.asInstanceOf[DeleteLoggingConfigurationRequest]
  }
}

