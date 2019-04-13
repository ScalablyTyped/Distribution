package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancer extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A string to string map of the configuration options for your load balancer. Valid values are listed below.
    */
  var configurationOptions: js.UndefOr[LoadBalancerConfigurationOptions] = js.undefined
  /**
    * The date when your load balancer was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The DNS name of your Lightsail load balancer.
    */
  var dnsName: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The path you specified to perform your health checks. If no path is specified, the load balancer tries to make a request to the default (root) page.
    */
  var healthCheckPath: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * An array of InstanceHealthSummary objects describing the health of the load balancer.
    */
  var instanceHealthSummary: js.UndefOr[InstanceHealthSummaryList] = js.undefined
  /**
    * The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's port 80. For HTTPS traffic, it's port 443.
    */
  var instancePort: js.UndefOr[integer] = js.undefined
  /**
    * The AWS Region where your load balancer was created (e.g., us-east-2a). Lightsail automatically creates your load balancer across Availability Zones.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The name of the load balancer (e.g., my-load-balancer).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The protocol you have enabled for your load balancer. Valid values are below. You can't just have HTTP_HTTPS, but you can have just HTTP.
    */
  var protocol: js.UndefOr[LoadBalancerProtocol] = js.undefined
  /**
    * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
    */
  var publicPorts: js.UndefOr[PortList] = js.undefined
  /**
    * The resource type (e.g., LoadBalancer.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The status of your load balancer. Valid values are below.
    */
  var state: js.UndefOr[LoadBalancerState] = js.undefined
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail load balancer. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS certificates. For example, if true, the certificate is attached to the load balancer.
    */
  var tlsCertificateSummaries: js.UndefOr[LoadBalancerTlsCertificateSummaryList] = js.undefined
}

object LoadBalancer {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    configurationOptions: LoadBalancerConfigurationOptions = null,
    createdAt: IsoDate = null,
    dnsName: NonEmptyString = null,
    healthCheckPath: NonEmptyString = null,
    instanceHealthSummary: InstanceHealthSummaryList = null,
    instancePort: js.UndefOr[integer] = js.undefined,
    location: ResourceLocation = null,
    name: ResourceName = null,
    protocol: LoadBalancerProtocol = null,
    publicPorts: PortList = null,
    resourceType: ResourceType = null,
    state: LoadBalancerState = null,
    supportCode: java.lang.String = null,
    tags: TagList = null,
    tlsCertificateSummaries: LoadBalancerTlsCertificateSummaryList = null
  ): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (configurationOptions != null) __obj.updateDynamic("configurationOptions")(configurationOptions)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (dnsName != null) __obj.updateDynamic("dnsName")(dnsName)
    if (healthCheckPath != null) __obj.updateDynamic("healthCheckPath")(healthCheckPath)
    if (instanceHealthSummary != null) __obj.updateDynamic("instanceHealthSummary")(instanceHealthSummary)
    if (!js.isUndefined(instancePort)) __obj.updateDynamic("instancePort")(instancePort)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (publicPorts != null) __obj.updateDynamic("publicPorts")(publicPorts)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (tlsCertificateSummaries != null) __obj.updateDynamic("tlsCertificateSummaries")(tlsCertificateSummaries)
    __obj.asInstanceOf[LoadBalancer]
  }
}

