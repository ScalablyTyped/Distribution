package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVPCEConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to describe.
    */
  var arn: AmazonResourceName
}

object GetVPCEConfigurationRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
  
    __obj.asInstanceOf[GetVPCEConfigurationRequest]
  }
}

