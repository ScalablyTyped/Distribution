package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVPCEConfigurationRequest extends js.Object {
  /**
    * The DNS name of the service running in your VPC that you want Device Farm to test.
    */
  var serviceDnsName: ServiceDnsName
  /**
    * An optional description, providing more details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined
  /**
    * The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
    */
  var vpceConfigurationName: VPCEConfigurationName
  /**
    * The name of the VPC endpoint service running inside your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: VPCEServiceName
}

object CreateVPCEConfigurationRequest {
  @scala.inline
  def apply(
    serviceDnsName: ServiceDnsName,
    vpceConfigurationName: VPCEConfigurationName,
    vpceServiceName: VPCEServiceName,
    vpceConfigurationDescription: VPCEConfigurationDescription = null
  ): CreateVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(serviceDnsName = serviceDnsName, vpceConfigurationName = vpceConfigurationName, vpceServiceName = vpceServiceName)
    if (vpceConfigurationDescription != null) __obj.updateDynamic("vpceConfigurationDescription")(vpceConfigurationDescription)
    __obj.asInstanceOf[CreateVPCEConfigurationRequest]
  }
}

