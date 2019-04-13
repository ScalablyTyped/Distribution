package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingRule extends js.Object {
  /**
    * Matches attributes derived from the request.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.undefined
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: awsDashSdkLib.clientsXrayMod.FixedRate
  /**
    * Matches the HTTP method of a request.
    */
  var HTTPMethod: awsDashSdkLib.clientsXrayMod.HTTPMethod
  /**
    * Matches the hostname from a request URL.
    */
  var Host: awsDashSdkLib.clientsXrayMod.Host
  /**
    * The priority of the sampling rule.
    */
  var Priority: awsDashSdkLib.clientsXrayMod.Priority
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  var ReservoirSize: awsDashSdkLib.clientsXrayMod.ReservoirSize
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  var ResourceARN: awsDashSdkLib.clientsXrayMod.ResourceARN
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.undefined
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[RuleName] = js.undefined
  /**
    * Matches the name that the service uses to identify itself in segments.
    */
  var ServiceName: awsDashSdkLib.clientsXrayMod.ServiceName
  /**
    * Matches the origin that the service uses to identify its type in segments.
    */
  var ServiceType: awsDashSdkLib.clientsXrayMod.ServiceType
  /**
    * Matches the path from a request URL.
    */
  var URLPath: awsDashSdkLib.clientsXrayMod.URLPath
  /**
    * The version of the sampling rule format (1).
    */
  var Version: awsDashSdkLib.clientsXrayMod.Version
}

object SamplingRule {
  @scala.inline
  def apply(
    FixedRate: FixedRate,
    HTTPMethod: HTTPMethod,
    Host: Host,
    Priority: Priority,
    ReservoirSize: ReservoirSize,
    ResourceARN: ResourceARN,
    ServiceName: ServiceName,
    ServiceType: ServiceType,
    URLPath: URLPath,
    Version: Version,
    Attributes: AttributeMap = null,
    RuleARN: String = null,
    RuleName: RuleName = null
  ): SamplingRule = {
    val __obj = js.Dynamic.literal(FixedRate = FixedRate, HTTPMethod = HTTPMethod, Host = Host, Priority = Priority, ReservoirSize = ReservoirSize, ResourceARN = ResourceARN, ServiceName = ServiceName, ServiceType = ServiceType, URLPath = URLPath, Version = Version)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN)
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    __obj.asInstanceOf[SamplingRule]
  }
}

