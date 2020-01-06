package typings.awsDashSdk.clientsWafv2Mod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WAFV2 extends Service {
  @JSName("config")
  var config_WAFV2: ConfigBase with ClientConfiguration = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Associates a Web ACL with a regional application resource, to protect the resource. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  For AWS CloudFront, you can associate the Web ACL by providing the Id of the WebACL to the CloudFront API call UpdateDistribution. For information, see UpdateDistribution.
    */
  def associateWebACL(): Request[AssociateWebACLResponse, AWSError] = js.native
  def associateWebACL(callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebACLResponse, Unit]): Request[AssociateWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Associates a Web ACL with a regional application resource, to protect the resource. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  For AWS CloudFront, you can associate the Web ACL by providing the Id of the WebACL to the CloudFront API call UpdateDistribution. For information, see UpdateDistribution.
    */
  def associateWebACL(params: AssociateWebACLRequest): Request[AssociateWebACLResponse, AWSError] = js.native
  def associateWebACL(
    params: AssociateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateWebACLResponse, Unit]
  ): Request[AssociateWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Returns the web ACL capacity unit (WCU) requirements for a specified scope and set of rules. You can use this to check the capacity requirements for the rules you want to use in a RuleGroup or WebACL.  AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  def checkCapacity(): Request[CheckCapacityResponse, AWSError] = js.native
  def checkCapacity(callback: js.Function2[/* err */ AWSError, /* data */ CheckCapacityResponse, Unit]): Request[CheckCapacityResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Returns the web ACL capacity unit (WCU) requirements for a specified scope and set of rules. You can use this to check the capacity requirements for the rules you want to use in a RuleGroup or WebACL.  AWS WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  def checkCapacity(params: CheckCapacityRequest): Request[CheckCapacityResponse, AWSError] = js.native
  def checkCapacity(
    params: CheckCapacityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CheckCapacityResponse, Unit]
  ): Request[CheckCapacityResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Creates an IPSet, which you use to identify web requests that originate from specific IP addresses or ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can configure AWS WAF to block them using an IPSet that lists those IP addresses. 
    */
  def createIPSet(): Request[CreateIPSetResponse, AWSError] = js.native
  def createIPSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateIPSetResponse, Unit]): Request[CreateIPSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Creates an IPSet, which you use to identify web requests that originate from specific IP addresses or ranges of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP addresses, you can configure AWS WAF to block them using an IPSet that lists those IP addresses. 
    */
  def createIPSet(params: CreateIPSetRequest): Request[CreateIPSetResponse, AWSError] = js.native
  def createIPSet(
    params: CreateIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIPSetResponse, Unit]
  ): Request[CreateIPSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Creates a RegexPatternSet per the specifications provided.
    */
  def createRegexPatternSet(): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  def createRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateRegexPatternSetResponse, Unit]): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Creates a RegexPatternSet per the specifications provided.
    */
  def createRegexPatternSet(params: CreateRegexPatternSetRequest): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  def createRegexPatternSet(
    params: CreateRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRegexPatternSetResponse, Unit]
  ): Request[CreateRegexPatternSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Creates a RuleGroup per the specifications provided.   A rule group defines a collection of rules to inspect and control web requests that you can use in a WebACL. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements. 
    */
  def createRuleGroup(): Request[CreateRuleGroupResponse, AWSError] = js.native
  def createRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupResponse, Unit]): Request[CreateRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Creates a RuleGroup per the specifications provided.   A rule group defines a collection of rules to inspect and control web requests that you can use in a WebACL. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements. 
    */
  def createRuleGroup(params: CreateRuleGroupRequest): Request[CreateRuleGroupResponse, AWSError] = js.native
  def createRuleGroup(
    params: CreateRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleGroupResponse, Unit]
  ): Request[CreateRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Creates a WebACL per the specifications provided.  A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web ACL can be a combination of the types Rule, RuleGroup, and managed rule group. You can associate a Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway API, or an Application Load Balancer. 
    */
  def createWebACL(): Request[CreateWebACLResponse, AWSError] = js.native
  def createWebACL(callback: js.Function2[/* err */ AWSError, /* data */ CreateWebACLResponse, Unit]): Request[CreateWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Creates a WebACL per the specifications provided.  A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web ACL can be a combination of the types Rule, RuleGroup, and managed rule group. You can associate a Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway API, or an Application Load Balancer. 
    */
  def createWebACL(params: CreateWebACLRequest): Request[CreateWebACLResponse, AWSError] = js.native
  def createWebACL(
    params: CreateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWebACLResponse, Unit]
  ): Request[CreateWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the specified IPSet. 
    */
  def deleteIPSet(): Request[DeleteIPSetResponse, AWSError] = js.native
  def deleteIPSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIPSetResponse, Unit]): Request[DeleteIPSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the specified IPSet. 
    */
  def deleteIPSet(params: DeleteIPSetRequest): Request[DeleteIPSetResponse, AWSError] = js.native
  def deleteIPSet(
    params: DeleteIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIPSetResponse, Unit]
  ): Request[DeleteIPSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the LoggingConfiguration from the specified web ACL.
    */
  def deleteLoggingConfiguration(): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  def deleteLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoggingConfigurationResponse, Unit]): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the LoggingConfiguration from the specified web ACL.
    */
  def deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  def deleteLoggingConfiguration(
    params: DeleteLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLoggingConfigurationResponse, Unit]
  ): Request[DeleteLoggingConfigurationResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the specified RegexPatternSet.
    */
  def deleteRegexPatternSet(): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  def deleteRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegexPatternSetResponse, Unit]): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the specified RegexPatternSet.
    */
  def deleteRegexPatternSet(params: DeleteRegexPatternSetRequest): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  def deleteRegexPatternSet(
    params: DeleteRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRegexPatternSetResponse, Unit]
  ): Request[DeleteRegexPatternSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the specified RuleGroup.
    */
  def deleteRuleGroup(): Request[DeleteRuleGroupResponse, AWSError] = js.native
  def deleteRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleGroupResponse, Unit]): Request[DeleteRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the specified RuleGroup.
    */
  def deleteRuleGroup(params: DeleteRuleGroupRequest): Request[DeleteRuleGroupResponse, AWSError] = js.native
  def deleteRuleGroup(
    params: DeleteRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleGroupResponse, Unit]
  ): Request[DeleteRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the specified WebACL.
    */
  def deleteWebACL(): Request[DeleteWebACLResponse, AWSError] = js.native
  def deleteWebACL(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebACLResponse, Unit]): Request[DeleteWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Deletes the specified WebACL.
    */
  def deleteWebACL(params: DeleteWebACLRequest): Request[DeleteWebACLResponse, AWSError] = js.native
  def deleteWebACL(
    params: DeleteWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWebACLResponse, Unit]
  ): Request[DeleteWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Provides high-level information for a managed rule group, including descriptions of the rules. 
    */
  def describeManagedRuleGroup(): Request[DescribeManagedRuleGroupResponse, AWSError] = js.native
  def describeManagedRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeManagedRuleGroupResponse, Unit]): Request[DescribeManagedRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Provides high-level information for a managed rule group, including descriptions of the rules. 
    */
  def describeManagedRuleGroup(params: DescribeManagedRuleGroupRequest): Request[DescribeManagedRuleGroupResponse, AWSError] = js.native
  def describeManagedRuleGroup(
    params: DescribeManagedRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeManagedRuleGroupResponse, Unit]
  ): Request[DescribeManagedRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Disassociates a Web ACL from a regional application resource. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  For AWS CloudFront, you can disassociate the Web ACL by providing an empty WebACLId in the CloudFront API call UpdateDistribution. For information, see UpdateDistribution.
    */
  def disassociateWebACL(): Request[DisassociateWebACLResponse, AWSError] = js.native
  def disassociateWebACL(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWebACLResponse, Unit]): Request[DisassociateWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Disassociates a Web ACL from a regional application resource. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  For AWS CloudFront, you can disassociate the Web ACL by providing an empty WebACLId in the CloudFront API call UpdateDistribution. For information, see UpdateDistribution.
    */
  def disassociateWebACL(params: DisassociateWebACLRequest): Request[DisassociateWebACLResponse, AWSError] = js.native
  def disassociateWebACL(
    params: DisassociateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateWebACLResponse, Unit]
  ): Request[DisassociateWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the specified IPSet.
    */
  def getIPSet(): Request[GetIPSetResponse, AWSError] = js.native
  def getIPSet(callback: js.Function2[/* err */ AWSError, /* data */ GetIPSetResponse, Unit]): Request[GetIPSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the specified IPSet.
    */
  def getIPSet(params: GetIPSetRequest): Request[GetIPSetResponse, AWSError] = js.native
  def getIPSet(
    params: GetIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIPSetResponse, Unit]
  ): Request[GetIPSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Returns the LoggingConfiguration for the specified web ACL.
    */
  def getLoggingConfiguration(): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  def getLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingConfigurationResponse, Unit]): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Returns the LoggingConfiguration for the specified web ACL.
    */
  def getLoggingConfiguration(params: GetLoggingConfigurationRequest): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  def getLoggingConfiguration(
    params: GetLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLoggingConfigurationResponse, Unit]
  ): Request[GetLoggingConfigurationResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the keys that are currently blocked by a rate-based rule. The maximum number of managed keys that can be blocked for a single rate-based rule is 10,000. If more than 10,000 addresses exceed the rate limit, those with the highest rates are blocked.
    */
  def getRateBasedStatementManagedKeys(): Request[GetRateBasedStatementManagedKeysResponse, AWSError] = js.native
  def getRateBasedStatementManagedKeys(
    callback: js.Function2[/* err */ AWSError, /* data */ GetRateBasedStatementManagedKeysResponse, Unit]
  ): Request[GetRateBasedStatementManagedKeysResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the keys that are currently blocked by a rate-based rule. The maximum number of managed keys that can be blocked for a single rate-based rule is 10,000. If more than 10,000 addresses exceed the rate limit, those with the highest rates are blocked.
    */
  def getRateBasedStatementManagedKeys(params: GetRateBasedStatementManagedKeysRequest): Request[GetRateBasedStatementManagedKeysResponse, AWSError] = js.native
  def getRateBasedStatementManagedKeys(
    params: GetRateBasedStatementManagedKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRateBasedStatementManagedKeysResponse, Unit]
  ): Request[GetRateBasedStatementManagedKeysResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the specified RegexPatternSet.
    */
  def getRegexPatternSet(): Request[GetRegexPatternSetResponse, AWSError] = js.native
  def getRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ GetRegexPatternSetResponse, Unit]): Request[GetRegexPatternSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the specified RegexPatternSet.
    */
  def getRegexPatternSet(params: GetRegexPatternSetRequest): Request[GetRegexPatternSetResponse, AWSError] = js.native
  def getRegexPatternSet(
    params: GetRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRegexPatternSetResponse, Unit]
  ): Request[GetRegexPatternSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the specified RuleGroup.
    */
  def getRuleGroup(): Request[GetRuleGroupResponse, AWSError] = js.native
  def getRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetRuleGroupResponse, Unit]): Request[GetRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the specified RuleGroup.
    */
  def getRuleGroup(params: GetRuleGroupRequest): Request[GetRuleGroupResponse, AWSError] = js.native
  def getRuleGroup(
    params: GetRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRuleGroupResponse, Unit]
  ): Request[GetRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which AWS WAF selected the requests in the sample.
    */
  def getSampledRequests(): Request[GetSampledRequestsResponse, AWSError] = js.native
  def getSampledRequests(callback: js.Function2[/* err */ AWSError, /* data */ GetSampledRequestsResponse, Unit]): Request[GetSampledRequestsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which AWS WAF selected the requests in the sample.
    */
  def getSampledRequests(params: GetSampledRequestsRequest): Request[GetSampledRequestsResponse, AWSError] = js.native
  def getSampledRequests(
    params: GetSampledRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSampledRequestsResponse, Unit]
  ): Request[GetSampledRequestsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the specified WebACL.
    */
  def getWebACL(): Request[GetWebACLResponse, AWSError] = js.native
  def getWebACL(callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLResponse, Unit]): Request[GetWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the specified WebACL.
    */
  def getWebACL(params: GetWebACLRequest): Request[GetWebACLResponse, AWSError] = js.native
  def getWebACL(
    params: GetWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLResponse, Unit]
  ): Request[GetWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the WebACL for the specified resource. 
    */
  def getWebACLForResource(): Request[GetWebACLForResourceResponse, AWSError] = js.native
  def getWebACLForResource(callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLForResourceResponse, Unit]): Request[GetWebACLForResourceResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the WebACL for the specified resource. 
    */
  def getWebACLForResource(params: GetWebACLForResourceRequest): Request[GetWebACLForResourceResponse, AWSError] = js.native
  def getWebACLForResource(
    params: GetWebACLForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetWebACLForResourceResponse, Unit]
  ): Request[GetWebACLForResourceResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of managed rule groups that are available for you to use. This list includes all AWS managed rule groups and the AWS Marketplace managed rule groups that you're subscribed to.
    */
  def listAvailableManagedRuleGroups(): Request[ListAvailableManagedRuleGroupsResponse, AWSError] = js.native
  def listAvailableManagedRuleGroups(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagedRuleGroupsResponse, Unit]
  ): Request[ListAvailableManagedRuleGroupsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of managed rule groups that are available for you to use. This list includes all AWS managed rule groups and the AWS Marketplace managed rule groups that you're subscribed to.
    */
  def listAvailableManagedRuleGroups(params: ListAvailableManagedRuleGroupsRequest): Request[ListAvailableManagedRuleGroupsResponse, AWSError] = js.native
  def listAvailableManagedRuleGroups(
    params: ListAvailableManagedRuleGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagedRuleGroupsResponse, Unit]
  ): Request[ListAvailableManagedRuleGroupsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of IPSetSummary objects for the IP sets that you manage.
    */
  def listIPSets(): Request[ListIPSetsResponse, AWSError] = js.native
  def listIPSets(callback: js.Function2[/* err */ AWSError, /* data */ ListIPSetsResponse, Unit]): Request[ListIPSetsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of IPSetSummary objects for the IP sets that you manage.
    */
  def listIPSets(params: ListIPSetsRequest): Request[ListIPSetsResponse, AWSError] = js.native
  def listIPSets(
    params: ListIPSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIPSetsResponse, Unit]
  ): Request[ListIPSetsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of your LoggingConfiguration objects.
    */
  def listLoggingConfigurations(): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  def listLoggingConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListLoggingConfigurationsResponse, Unit]): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of your LoggingConfiguration objects.
    */
  def listLoggingConfigurations(params: ListLoggingConfigurationsRequest): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  def listLoggingConfigurations(
    params: ListLoggingConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLoggingConfigurationsResponse, Unit]
  ): Request[ListLoggingConfigurationsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of RegexPatternSetSummary objects for the regex pattern sets that you manage.
    */
  def listRegexPatternSets(): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  def listRegexPatternSets(callback: js.Function2[/* err */ AWSError, /* data */ ListRegexPatternSetsResponse, Unit]): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of RegexPatternSetSummary objects for the regex pattern sets that you manage.
    */
  def listRegexPatternSets(params: ListRegexPatternSetsRequest): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  def listRegexPatternSets(
    params: ListRegexPatternSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRegexPatternSetsResponse, Unit]
  ): Request[ListRegexPatternSetsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the specified web ACL. If you want the list of AWS CloudFront resources, use the AWS CloudFront call ListDistributionsByWebACLId. 
    */
  def listResourcesForWebACL(): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  def listResourcesForWebACL(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesForWebACLResponse, Unit]): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of the Amazon Resource Names (ARNs) for the regional resources that are associated with the specified web ACL. If you want the list of AWS CloudFront resources, use the AWS CloudFront call ListDistributionsByWebACLId. 
    */
  def listResourcesForWebACL(params: ListResourcesForWebACLRequest): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  def listResourcesForWebACL(
    params: ListResourcesForWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesForWebACLResponse, Unit]
  ): Request[ListResourcesForWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of RuleGroupSummary objects for the rule groups that you manage. 
    */
  def listRuleGroups(): Request[ListRuleGroupsResponse, AWSError] = js.native
  def listRuleGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsResponse, Unit]): Request[ListRuleGroupsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of RuleGroupSummary objects for the rule groups that you manage. 
    */
  def listRuleGroups(params: ListRuleGroupsRequest): Request[ListRuleGroupsResponse, AWSError] = js.native
  def listRuleGroups(
    params: ListRuleGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRuleGroupsResponse, Unit]
  ): Request[ListRuleGroupsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the TagInfoForResource for the specified resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves the TagInfoForResource for the specified resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of WebACLSummary objects for the web ACLs that you manage.
    */
  def listWebACLs(): Request[ListWebACLsResponse, AWSError] = js.native
  def listWebACLs(callback: js.Function2[/* err */ AWSError, /* data */ ListWebACLsResponse, Unit]): Request[ListWebACLsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Retrieves an array of WebACLSummary objects for the web ACLs that you manage.
    */
  def listWebACLs(params: ListWebACLsRequest): Request[ListWebACLsResponse, AWSError] = js.native
  def listWebACLs(
    params: ListWebACLsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWebACLsResponse, Unit]
  ): Request[ListWebACLsResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Enables the specified LoggingConfiguration, to start logging from a web ACL, according to the configuration provided. You can access information about all traffic that AWS WAF inspects using the following steps:   Create an Amazon Kinesis Data Firehose.  Create the data firehose with a PUT source and in the region that you are operating. If you are capturing logs for Amazon CloudFront, always create the firehose in US East (N. Virginia).   Do not create the data firehose using a Kinesis stream as your source.    Associate that firehose to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, AWS WAF will create a service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more information, see Logging Web ACL Traffic Information in the AWS WAF Developer Guide.
    */
  def putLoggingConfiguration(): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  def putLoggingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingConfigurationResponse, Unit]): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Enables the specified LoggingConfiguration, to start logging from a web ACL, according to the configuration provided. You can access information about all traffic that AWS WAF inspects using the following steps:   Create an Amazon Kinesis Data Firehose.  Create the data firehose with a PUT source and in the region that you are operating. If you are capturing logs for Amazon CloudFront, always create the firehose in US East (N. Virginia).   Do not create the data firehose using a Kinesis stream as your source.    Associate that firehose to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, AWS WAF will create a service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more information, see Logging Web ACL Traffic Information in the AWS WAF Developer Guide.
    */
  def putLoggingConfiguration(params: PutLoggingConfigurationRequest): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  def putLoggingConfiguration(
    params: PutLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLoggingConfigurationResponse, Unit]
  ): Request[PutLoggingConfigurationResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Associates tags with the specified AWS resource. Tags are key:value pairs that you can associate with AWS resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each AWS resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Associates tags with the specified AWS resource. Tags are key:value pairs that you can associate with AWS resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each AWS resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Disassociates tags from an AWS resource. Tags are key:value pairs that you can associate with AWS resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each AWS resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Disassociates tags from an AWS resource. Tags are key:value pairs that you can associate with AWS resources. For example, the tag key might be "customer" and the tag value might be "companyA." You can specify one or more tags to add to each container. You can add up to 50 tags to each AWS resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Updates the specified IPSet.
    */
  def updateIPSet(): Request[UpdateIPSetResponse, AWSError] = js.native
  def updateIPSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIPSetResponse, Unit]): Request[UpdateIPSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Updates the specified IPSet.
    */
  def updateIPSet(params: UpdateIPSetRequest): Request[UpdateIPSetResponse, AWSError] = js.native
  def updateIPSet(
    params: UpdateIPSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIPSetResponse, Unit]
  ): Request[UpdateIPSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Updates the specified RegexPatternSet.
    */
  def updateRegexPatternSet(): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  def updateRegexPatternSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegexPatternSetResponse, Unit]): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Updates the specified RegexPatternSet.
    */
  def updateRegexPatternSet(params: UpdateRegexPatternSetRequest): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  def updateRegexPatternSet(
    params: UpdateRegexPatternSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegexPatternSetResponse, Unit]
  ): Request[UpdateRegexPatternSetResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Updates the specified RuleGroup.  A rule group defines a collection of rules to inspect and control web requests that you can use in a WebACL. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements. 
    */
  def updateRuleGroup(): Request[UpdateRuleGroupResponse, AWSError] = js.native
  def updateRuleGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleGroupResponse, Unit]): Request[UpdateRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Updates the specified RuleGroup.  A rule group defines a collection of rules to inspect and control web requests that you can use in a WebACL. When you create a rule group, you define an immutable capacity limit. If you update a rule group, you must stay within the capacity. This allows others to reuse the rule group with confidence in its capacity requirements. 
    */
  def updateRuleGroup(params: UpdateRuleGroupRequest): Request[UpdateRuleGroupResponse, AWSError] = js.native
  def updateRuleGroup(
    params: UpdateRuleGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleGroupResponse, Unit]
  ): Request[UpdateRuleGroupResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Updates the specified WebACL.  A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web ACL can be a combination of the types Rule, RuleGroup, and managed rule group. You can associate a Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway API, or an Application Load Balancer. 
    */
  def updateWebACL(): Request[UpdateWebACLResponse, AWSError] = js.native
  def updateWebACL(callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebACLResponse, Unit]): Request[UpdateWebACLResponse, AWSError] = js.native
  /**
    *  This is the latest version of AWS WAF, named AWS WAFV2, released in November, 2019. For information, including how to migrate your AWS WAF resources from the prior release, see the AWS WAF Developer Guide.   Updates the specified WebACL.  A Web ACL defines a collection of rules to use to inspect and control web requests. Each rule has an action defined (allow, block, or count) for requests that match the statement of the rule. In the Web ACL, you assign a default action to take (allow, block) for any request that does not match any of the rules. The rules in a Web ACL can be a combination of the types Rule, RuleGroup, and managed rule group. You can associate a Web ACL with one or more AWS resources to protect. The resources can be Amazon CloudFront, an Amazon API Gateway API, or an Application Load Balancer. 
    */
  def updateWebACL(params: UpdateWebACLRequest): Request[UpdateWebACLResponse, AWSError] = js.native
  def updateWebACL(
    params: UpdateWebACLRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateWebACLResponse, Unit]
  ): Request[UpdateWebACLResponse, AWSError] = js.native
}

