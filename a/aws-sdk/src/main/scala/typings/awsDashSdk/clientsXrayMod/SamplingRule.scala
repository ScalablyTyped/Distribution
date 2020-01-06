package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRule extends js.Object {
  /**
    * Matches attributes derived from the request.
    */
  var Attributes: js.UndefOr[AttributeMap] = js.native
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: typings.awsDashSdk.clientsXrayMod.FixedRate = js.native
  /**
    * Matches the HTTP method of a request.
    */
  var HTTPMethod: typings.awsDashSdk.clientsXrayMod.HTTPMethod = js.native
  /**
    * Matches the hostname from a request URL.
    */
  var Host: typings.awsDashSdk.clientsXrayMod.Host = js.native
  /**
    * The priority of the sampling rule.
    */
  var Priority: typings.awsDashSdk.clientsXrayMod.Priority = js.native
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  var ReservoirSize: typings.awsDashSdk.clientsXrayMod.ReservoirSize = js.native
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  var ResourceARN: typings.awsDashSdk.clientsXrayMod.ResourceARN = js.native
  /**
    * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleARN: js.UndefOr[String] = js.native
  /**
    * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
    */
  var RuleName: js.UndefOr[typings.awsDashSdk.clientsXrayMod.RuleName] = js.native
  /**
    * Matches the name that the service uses to identify itself in segments.
    */
  var ServiceName: typings.awsDashSdk.clientsXrayMod.ServiceName = js.native
  /**
    * Matches the origin that the service uses to identify its type in segments.
    */
  var ServiceType: typings.awsDashSdk.clientsXrayMod.ServiceType = js.native
  /**
    * Matches the path from a request URL.
    */
  var URLPath: typings.awsDashSdk.clientsXrayMod.URLPath = js.native
  /**
    * The version of the sampling rule format (1).
    */
  var Version: typings.awsDashSdk.clientsXrayMod.Version = js.native
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
    val __obj = js.Dynamic.literal(FixedRate = FixedRate.asInstanceOf[js.Any], HTTPMethod = HTTPMethod.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ReservoirSize = ReservoirSize.asInstanceOf[js.Any], ResourceARN = ResourceARN.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], URLPath = URLPath.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRule]
  }
}

