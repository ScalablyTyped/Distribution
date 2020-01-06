package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVPCEConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to update.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The DNS (domain) name used to connect to your private service in your VPC. The DNS name must not already be in use on the internet.
    */
  var serviceDnsName: js.UndefOr[ServiceDnsName] = js.native
  /**
    * An optional description that provides details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.native
  /**
    * The friendly name you give to your VPC endpoint configuration to manage your configurations more easily.
    */
  var vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.native
  /**
    * The name of the VPC endpoint service running in your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: js.UndefOr[VPCEServiceName] = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (serviceDnsName != null) __obj.updateDynamic("serviceDnsName")(serviceDnsName.asInstanceOf[js.Any])
    if (vpceConfigurationDescription != null) __obj.updateDynamic("vpceConfigurationDescription")(vpceConfigurationDescription.asInstanceOf[js.Any])
    if (vpceConfigurationName != null) __obj.updateDynamic("vpceConfigurationName")(vpceConfigurationName.asInstanceOf[js.Any])
    if (vpceServiceName != null) __obj.updateDynamic("vpceServiceName")(vpceServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVPCEConfigurationRequest]
  }
}

