package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPCEConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The DNS name that maps to the private IP address of the service you want to access.
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

object VPCEConfiguration {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    serviceDnsName: ServiceDnsName = null,
    vpceConfigurationDescription: VPCEConfigurationDescription = null,
    vpceConfigurationName: VPCEConfigurationName = null,
    vpceServiceName: VPCEServiceName = null
  ): VPCEConfiguration = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (serviceDnsName != null) __obj.updateDynamic("serviceDnsName")(serviceDnsName)
    if (vpceConfigurationDescription != null) __obj.updateDynamic("vpceConfigurationDescription")(vpceConfigurationDescription)
    if (vpceConfigurationName != null) __obj.updateDynamic("vpceConfigurationName")(vpceConfigurationName)
    if (vpceServiceName != null) __obj.updateDynamic("vpceServiceName")(vpceServiceName)
    __obj.asInstanceOf[VPCEConfiguration]
  }
}

