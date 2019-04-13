package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVPCEConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to update.
    */
  var arn: AmazonResourceName
  /**
    * The DNS (domain) name used to connect to your private service in your Amazon VPC. The DNS name must not already be in use on the Internet.
    */
  var serviceDnsName: js.UndefOr[ServiceDnsName] = js.undefined
  /**
    * An optional description, providing more details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined
  /**
    * The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
    */
  var vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.undefined
  /**
    * The name of the VPC endpoint service running inside your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: js.UndefOr[VPCEServiceName] = js.undefined
}

object UpdateVPCEConfigurationRequest {
  @scala.inline
  def apply(
    arn: AmazonResourceName,
    serviceDnsName: ServiceDnsName = null,
    vpceConfigurationDescription: VPCEConfigurationDescription = null,
    vpceConfigurationName: VPCEConfigurationName = null,
    vpceServiceName: VPCEServiceName = null
  ): UpdateVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (serviceDnsName != null) __obj.updateDynamic("serviceDnsName")(serviceDnsName)
    if (vpceConfigurationDescription != null) __obj.updateDynamic("vpceConfigurationDescription")(vpceConfigurationDescription)
    if (vpceConfigurationName != null) __obj.updateDynamic("vpceConfigurationName")(vpceConfigurationName)
    if (vpceServiceName != null) __obj.updateDynamic("vpceServiceName")(vpceServiceName)
    __obj.asInstanceOf[UpdateVPCEConfigurationRequest]
  }
}

