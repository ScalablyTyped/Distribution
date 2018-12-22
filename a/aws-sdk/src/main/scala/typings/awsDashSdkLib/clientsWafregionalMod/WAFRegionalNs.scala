package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/wafregional", "WAFRegional")
@js.native
object WAFRegionalNs extends js.Object {
  
  trait ActivatedRule extends js.Object {
    /**
         * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the Rule. Valid values for Action include the following:    ALLOW: CloudFront responds with the requested object.    BLOCK: CloudFront responds with an HTTP 403 (Forbidden) status code.    COUNT: AWS WAF increments a counter of requests that match the conditions in the rule and then continues to inspect the web request based on the remaining rules in the web ACL.     ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case, you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.
         */
    var Action: js.UndefOr[WafAction] = js.undefined
    /**
         * An array of rules to exclude from a rule group. This is applicable only when the ActivatedRule refers to a RuleGroup. Sometimes it is necessary to troubleshoot rule groups that are blocking traffic unexpectedly (false positives). One troubleshooting technique is to identify the specific rule within the rule group that is blocking the legitimate traffic and then disable (exclude) that particular rule. You can exclude rules from both your own rule groups and AWS Marketplace rule groups that have been associated with a web ACL. Specifying ExcludedRules does not remove those rules from the rule group. Rather, it changes the action for the rules to COUNT. Therefore, requests that match an ExcludedRule are counted but not blocked. The RuleGroup owner will receive COUNT metrics for each ExcludedRule. If you want to exclude rules from a rule group that is already associated with a web ACL, perform the following steps:   Use the AWS WAF logs to identify the IDs of the rules that you want to exclude. For more information about the logs, see Logging Web ACL Traffic Information.   Submit an UpdateWebACL request that has two actions:   The first action deletes the existing rule group from the web ACL. That is, in the UpdateWebACL request, the first Updates:Action should be DELETE and Updates:ActivatedRule:RuleId should be the rule group that contains the rules that you want to exclude.   The second action inserts the same rule group back in, but specifying the rules to exclude. That is, the second Updates:Action should be INSERT, Updates:ActivatedRule:RuleId should be the rule group that you just removed, and ExcludedRules should contain the rules that you want to exclude.    
         */
    var ExcludedRules: js.UndefOr[ExcludedRules] = js.undefined
    /**
         * Use the OverrideAction to test your RuleGroup. Any rule in a RuleGroup can potentially block a request. If you set the OverrideAction to None, the RuleGroup will block a request if any individual rule in the RuleGroup matches the request and is configured to block that request. However if you first want to test the RuleGroup, set the OverrideAction to Count. The RuleGroup will then override any block action specified by individual rules contained within the group. Instead of blocking matching requests, those requests will be counted. You can view a record of counted requests using GetSampledRequests.   ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.
         */
    var OverrideAction: js.UndefOr[WafOverrideAction] = js.undefined
    /**
         * Specifies the order in which the Rules in a WebACL are evaluated. Rules with a lower value for Priority are evaluated before Rules with a higher value. The value must be a unique integer. If you add multiple Rules to a WebACL, the values don't need to be consecutive.
         */
    var Priority: RulePriority
    /**
         * The RuleId for a Rule. You use RuleId to get more information about a Rule (see GetRule), update a Rule (see UpdateRule), insert a Rule into a WebACL or delete a one from a WebACL (see UpdateWebACL), or delete a Rule from AWS WAF (see DeleteRule).  RuleId is returned by CreateRule and by ListRules.
         */
    var RuleId: ResourceId
    /**
         * The rule type, either REGULAR, as defined by Rule, RATE_BASED, as defined by RateBasedRule, or GROUP, as defined by RuleGroup. The default is REGULAR. Although this field is optional, be aware that if you try to add a RATE_BASED rule to a web ACL without setting the type, the UpdateWebACL request will fail because the request tries to add a REGULAR rule with the specified ID, which does not exist. 
         */
    var Type: js.UndefOr[WafRuleType] = js.undefined
  }
  
  
  trait AssociateWebACLRequest extends js.Object {
    /**
         * The ARN (Amazon Resource Name) of the resource to be protected, either an application load balancer or Amazon API Gateway stage.  The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway stage: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name    
         */
    var ResourceArn: ResourceArn
    /**
         * A unique identifier (ID) for the web ACL. 
         */
    var WebACLId: ResourceId
  }
  
  
  trait AssociateWebACLResponse extends js.Object
  
  
  trait ByteMatchSet extends js.Object {
    /**
         * The ByteMatchSetId for a ByteMatchSet. You use ByteMatchSetId to get information about a ByteMatchSet (see GetByteMatchSet), update a ByteMatchSet (see UpdateByteMatchSet), insert a ByteMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a ByteMatchSet from AWS WAF (see DeleteByteMatchSet).  ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
         */
    var ByteMatchSetId: ResourceId
    /**
         * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
         */
    var ByteMatchTuples: ByteMatchTuples
    /**
         * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait ByteMatchSetSummary extends js.Object {
    /**
         * The ByteMatchSetId for a ByteMatchSet. You use ByteMatchSetId to get information about a ByteMatchSet, update a ByteMatchSet, remove a ByteMatchSet from a Rule, and delete a ByteMatchSet from AWS WAF.  ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
         */
    var ByteMatchSetId: ResourceId
    /**
         * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
         */
    var Name: ResourceName
  }
  
  
  trait ByteMatchSetUpdate extends js.Object {
    /**
         * Specifies whether to insert or delete a ByteMatchTuple.
         */
    var Action: ChangeAction
    /**
         * Information about the part of a web request that you want AWS WAF to inspect and the value that you want AWS WAF to search for. If you specify DELETE for the value of Action, the ByteMatchTuple values must exactly match the values in the ByteMatchTuple that you want to delete from the ByteMatchSet.
         */
    var ByteMatchTuple: ByteMatchTuple
  }
  
  
  trait ByteMatchTuple extends js.Object {
    /**
         * The part of a web request that you want AWS WAF to search, such as a specified header or a query string. For more information, see FieldToMatch.
         */
    var FieldToMatch: FieldToMatch
    /**
         * Within the portion of a web request that you want to search (for example, in the query string, if any), specify where you want AWS WAF to search. Valid values include the following:  CONTAINS  The specified part of the web request must include the value of TargetString, but the location doesn't matter.  CONTAINS_WORD  The specified part of the web request must include the value of TargetString, and TargetString must contain only alphanumeric characters or underscore (A-Z, a-z, 0-9, or _). In addition, TargetString must be a word, which means one of the following:    TargetString exactly matches the value of the specified part of the web request, such as the value of a header.    TargetString is at the beginning of the specified part of the web request and is followed by a character other than an alphanumeric character or underscore (_), for example, BadBot;.    TargetString is at the end of the specified part of the web request and is preceded by a character other than an alphanumeric character or underscore (_), for example, ;BadBot.    TargetString is in the middle of the specified part of the web request and is preceded and followed by characters other than alphanumeric characters or underscore (_), for example, -BadBot;.    EXACTLY  The value of the specified part of the web request must exactly match the value of TargetString.  STARTS_WITH  The value of TargetString must appear at the beginning of the specified part of the web request.  ENDS_WITH  The value of TargetString must appear at the end of the specified part of the web request.
         */
    var PositionalConstraint: PositionalConstraint
    /**
         * The value that you want AWS WAF to search for. AWS WAF searches for the specified string in the part of web requests that you specified in FieldToMatch. The maximum length of the value is 50 bytes. Valid values depend on the values that you specified for FieldToMatch:    HEADER: The value that you want AWS WAF to search for in the request header that you specified in FieldToMatch, for example, the value of the User-Agent or Referer header.    METHOD: The HTTP method, which indicates the type of operation specified in the request. CloudFront supports the following methods: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT.    QUERY_STRING: The value that you want AWS WAF to search for in the query string, which is the part of a URL that appears after a ? character.    URI: The value that you want AWS WAF to search for in the part of a URL that identifies a resource, for example, /images/daily-ad.jpg.    BODY: The part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form. The request body immediately follows the request headers. Note that only the first 8192 bytes of the request body are forwarded to AWS WAF for inspection. To allow or block requests based on the length of the body, you can create a size constraint set. For more information, see CreateSizeConstraintSet.     SINGLE_QUERY_ARG: The parameter in the query string that you will inspect, such as UserName or SalesRegion. The maximum length for SINGLE_QUERY_ARG is 30 characters.    ALL_QUERY_ARGS: Similar to SINGLE_QUERY_ARG, but instead of inspecting a single parameter, AWS WAF inspects all parameters within the query string for the value or regex pattern that you specify in TargetString.   If TargetString includes alphabetic characters A-Z and a-z, note that the value is case sensitive.  If you're using the AWS WAF API  Specify a base64-encoded version of the value. The maximum length of the value before you base64-encode it is 50 bytes. For example, suppose the value of Type is HEADER and the value of Data is User-Agent. If you want to search the User-Agent header for the value BadBot, you base64-encode BadBot using MIME base64-encoding and include the resulting value, QmFkQm90, in the value of TargetString.  If you're using the AWS CLI or one of the AWS SDKs  The value that you want AWS WAF to search for. The SDK automatically base64 encodes the value.
         */
    var TargetString: ByteMatchTargetString
    /**
         * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on TargetString before inspecting a request for a match. You can only specify a single type of TextTransformation.  CMD_LINE  When you're concerned that attackers are injecting an operating system command line command and using unusual formatting to disguise some or all of the command, use this option to perform the following transformations:   Delete the following characters: \ " ' ^   Delete spaces before the following characters: / (   Replace the following characters with a space: , ;   Replace multiple spaces with one space   Convert uppercase letters (A-Z) to lowercase (a-z)    COMPRESS_WHITE_SPACE  Use this option to replace the following characters with a space character (decimal 32):   \f, formfeed, decimal 12   \t, tab, decimal 9   \n, newline, decimal 10   \r, carriage return, decimal 13   \v, vertical tab, decimal 11   non-breaking space, decimal 160    COMPRESS_WHITE_SPACE also replaces multiple spaces with one space.  HTML_ENTITY_DECODE  Use this option to replace HTML-encoded characters with unencoded characters. HTML_ENTITY_DECODE performs the following operations:   Replaces (ampersand)quot; with "    Replaces (ampersand)nbsp; with a non-breaking space, decimal 160   Replaces (ampersand)lt; with a "less than" symbol   Replaces (ampersand)gt; with &gt;    Replaces characters that are represented in hexadecimal format, (ampersand)#xhhhh;, with the corresponding characters   Replaces characters that are represented in decimal format, (ampersand)#nnnn;, with the corresponding characters    LOWERCASE  Use this option to convert uppercase letters (A-Z) to lowercase (a-z).  URL_DECODE  Use this option to decode a URL-encoded value.  NONE  Specify NONE if you don't want to perform any text transformations.
         */
    var TextTransformation: TextTransformation
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateByteMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
         */
    var Name: ResourceName
  }
  
  
  trait CreateByteMatchSetResponse extends js.Object {
    /**
         * A ByteMatchSet that contains no ByteMatchTuple objects.
         */
    var ByteMatchSet: js.UndefOr[ByteMatchSet] = js.undefined
    /**
         * The ChangeToken that you used to submit the CreateByteMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait CreateGeoMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description of the GeoMatchSet. You can't change Name after you create the GeoMatchSet.
         */
    var Name: ResourceName
  }
  
  
  trait CreateGeoMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateGeoMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * The GeoMatchSet returned in the CreateGeoMatchSet response. The GeoMatchSet contains no GeoMatchConstraints.
         */
    var GeoMatchSet: js.UndefOr[GeoMatchSet] = js.undefined
  }
  
  
  trait CreateIPSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description of the IPSet. You can't change Name after you create the IPSet.
         */
    var Name: ResourceName
  }
  
  
  trait CreateIPSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateIPSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * The IPSet returned in the CreateIPSet response.
         */
    var IPSet: js.UndefOr[IPSet] = js.undefined
  }
  
  
  trait CreateRateBasedRuleRequest extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description for the metrics for this RateBasedRule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the metric after you create the RateBasedRule.
         */
    var MetricName: MetricName
    /**
         * A friendly name or description of the RateBasedRule. You can't change the name of a RateBasedRule after you create it.
         */
    var Name: ResourceName
    /**
         * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to rate monitoring. The only valid value for RateKey is IP. IP indicates that requests that arrive from the same IP address are subject to the RateLimit that is specified in the RateBasedRule.
         */
    var RateKey: RateKey
    /**
         * The maximum number of requests, which have an identical value in the field that is specified by RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
         */
    var RateLimit: RateLimit
  }
  
  
  trait CreateRateBasedRuleResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * The RateBasedRule that is returned in the CreateRateBasedRule response.
         */
    var Rule: js.UndefOr[RateBasedRule] = js.undefined
  }
  
  
  trait CreateRegexMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description of the RegexMatchSet. You can't change Name after you create a RegexMatchSet.
         */
    var Name: ResourceName
  }
  
  
  trait CreateRegexMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateRegexMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * A RegexMatchSet that contains no RegexMatchTuple objects.
         */
    var RegexMatchSet: js.UndefOr[RegexMatchSet] = js.undefined
  }
  
  
  trait CreateRegexPatternSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
         */
    var Name: ResourceName
  }
  
  
  trait CreateRegexPatternSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * A RegexPatternSet that contains no objects.
         */
    var RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined
  }
  
  
  trait CreateRuleGroupRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the metric after you create the RuleGroup.
         */
    var MetricName: MetricName
    /**
         * A friendly name or description of the RuleGroup. You can't change Name after you create a RuleGroup.
         */
    var Name: ResourceName
  }
  
  
  trait CreateRuleGroupResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * An empty RuleGroup.
         */
    var RuleGroup: js.UndefOr[RuleGroup] = js.undefined
  }
  
  
  trait CreateRuleRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description for the metrics for this Rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change the name of the metric after you create the Rule.
         */
    var MetricName: MetricName
    /**
         * A friendly name or description of the Rule. You can't change the name of a Rule after you create it.
         */
    var Name: ResourceName
  }
  
  
  trait CreateRuleResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * The Rule returned in the CreateRule response.
         */
    var Rule: js.UndefOr[Rule] = js.undefined
  }
  
  
  trait CreateSizeConstraintSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description of the SizeConstraintSet. You can't change Name after you create a SizeConstraintSet.
         */
    var Name: ResourceName
  }
  
  
  trait CreateSizeConstraintSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * A SizeConstraintSet that contains no SizeConstraint objects.
         */
    var SizeConstraintSet: js.UndefOr[SizeConstraintSet] = js.undefined
  }
  
  
  trait CreateSqlInjectionMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description for the SqlInjectionMatchSet that you're creating. You can't change Name after you create the SqlInjectionMatchSet.
         */
    var Name: ResourceName
  }
  
  
  trait CreateSqlInjectionMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * A SqlInjectionMatchSet.
         */
    var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet] = js.undefined
  }
  
  
  trait CreateWebACLRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of the Rule objects that are associated with the WebACL.
         */
    var DefaultAction: WafAction
    /**
         * A friendly name or description for the metrics for this WebACL. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain white space. You can't change MetricName after you create the WebACL.
         */
    var MetricName: MetricName
    /**
         * A friendly name or description of the WebACL. You can't change Name after you create the WebACL.
         */
    var Name: ResourceName
  }
  
  
  trait CreateWebACLResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateWebACL request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * The WebACL returned in the CreateWebACL response.
         */
    var WebACL: js.UndefOr[WebACL] = js.undefined
  }
  
  
  trait CreateXssMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A friendly name or description for the XssMatchSet that you're creating. You can't change Name after you create the XssMatchSet.
         */
    var Name: ResourceName
  }
  
  
  trait CreateXssMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the CreateXssMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
    /**
         * An XssMatchSet.
         */
    var XssMatchSet: js.UndefOr[XssMatchSet] = js.undefined
  }
  
  
  trait DeleteByteMatchSetRequest extends js.Object {
    /**
         * The ByteMatchSetId of the ByteMatchSet that you want to delete. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
         */
    var ByteMatchSetId: ResourceId
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
  }
  
  
  trait DeleteByteMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteByteMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteGeoMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The GeoMatchSetID of the GeoMatchSet that you want to delete. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
         */
    var GeoMatchSetId: ResourceId
  }
  
  
  trait DeleteGeoMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteGeoMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteIPSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The IPSetId of the IPSet that you want to delete. IPSetId is returned by CreateIPSet and by ListIPSets.
         */
    var IPSetId: ResourceId
  }
  
  
  trait DeleteIPSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteIPSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteLoggingConfigurationRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the web ACL from which you want to delete the LoggingConfiguration.
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait DeleteLoggingConfigurationResponse extends js.Object
  
  
  trait DeletePermissionPolicyRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the RuleGroup from which you want to delete the policy. The user making the request must be the owner of the RuleGroup.
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait DeletePermissionPolicyResponse extends js.Object
  
  
  trait DeleteRateBasedRuleRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The RuleId of the RateBasedRule that you want to delete. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
         */
    var RuleId: ResourceId
  }
  
  
  trait DeleteRateBasedRuleResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteRegexMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The RegexMatchSetId of the RegexMatchSet that you want to delete. RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
         */
    var RegexMatchSetId: ResourceId
  }
  
  
  trait DeleteRegexMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteRegexMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteRegexPatternSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The RegexPatternSetId of the RegexPatternSet that you want to delete. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
         */
    var RegexPatternSetId: ResourceId
  }
  
  
  trait DeleteRegexPatternSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteRuleGroupRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The RuleGroupId of the RuleGroup that you want to delete. RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
         */
    var RuleGroupId: ResourceId
  }
  
  
  trait DeleteRuleGroupResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteRuleRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The RuleId of the Rule that you want to delete. RuleId is returned by CreateRule and by ListRules.
         */
    var RuleId: ResourceId
  }
  
  
  trait DeleteRuleResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteSizeConstraintSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The SizeConstraintSetId of the SizeConstraintSet that you want to delete. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
         */
    var SizeConstraintSetId: ResourceId
  }
  
  
  trait DeleteSizeConstraintSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteSqlInjectionMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The SqlInjectionMatchSetId of the SqlInjectionMatchSet that you want to delete. SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
         */
    var SqlInjectionMatchSetId: ResourceId
  }
  
  
  trait DeleteSqlInjectionMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteWebACLRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The WebACLId of the WebACL that you want to delete. WebACLId is returned by CreateWebACL and by ListWebACLs.
         */
    var WebACLId: ResourceId
  }
  
  
  trait DeleteWebACLResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteWebACL request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DeleteXssMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The XssMatchSetId of the XssMatchSet that you want to delete. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
         */
    var XssMatchSetId: ResourceId
  }
  
  
  trait DeleteXssMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the DeleteXssMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait DisassociateWebACLRequest extends js.Object {
    /**
         * The ARN (Amazon Resource Name) of the resource from which the web ACL is being removed, either an application load balancer or Amazon API Gateway stage. The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway stage: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name    
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait DisassociateWebACLResponse extends js.Object
  
  
  trait ExcludedRule extends js.Object {
    /**
         * The unique identifier for the rule to exclude from the rule group.
         */
    var RuleId: ResourceId
  }
  
  
  trait FieldToMatch extends js.Object {
    /**
         * When the value of Type is HEADER, enter the name of the header that you want AWS WAF to search, for example, User-Agent or Referer. The name of the header is not case sensitive. When the value of Type is SINGLE_QUERY_ARG, enter the name of the parameter that you want AWS WAF to search, for example, UserName or SalesRegion. The parameter name is not case sensitive. If the value of Type is any other value, omit Data.
         */
    var Data: js.UndefOr[MatchFieldData] = js.undefined
    /**
         * The part of the web request that you want AWS WAF to search for a specified string. Parts of a request that you can search include the following:    HEADER: A specified request header, for example, the value of the User-Agent or Referer header. If you choose HEADER for the type, specify the name of the header in Data.    METHOD: The HTTP method, which indicated the type of operation that the request is asking the origin to perform. Amazon CloudFront supports the following methods: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT.    QUERY_STRING: A query string, which is the part of a URL that appears after a ? character, if any.    URI: The part of a web request that identifies a resource, for example, /images/daily-ad.jpg.    BODY: The part of a request that contains any additional data that you want to send to your web server as the HTTP request body, such as data from a form. The request body immediately follows the request headers. Note that only the first 8192 bytes of the request body are forwarded to AWS WAF for inspection. To allow or block requests based on the length of the body, you can create a size constraint set. For more information, see CreateSizeConstraintSet.     SINGLE_QUERY_ARG: The parameter in the query string that you will inspect, such as UserName or SalesRegion. The maximum length for SINGLE_QUERY_ARG is 30 characters.    ALL_QUERY_ARGS: Similar to SINGLE_QUERY_ARG, but rather than inspecting a single parameter, AWS WAF will inspect all parameters within the query for the value or regex pattern that you specify in TargetString.  
         */
    var Type: MatchFieldType
  }
  
  
  trait GeoMatchConstraint extends js.Object {
    /**
         * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
         */
    var Type: GeoMatchConstraintType
    /**
         * The country that you want AWS WAF to search for.
         */
    var Value: GeoMatchConstraintValue
  }
  
  
  trait GeoMatchSet extends js.Object {
    /**
         * An array of GeoMatchConstraint objects, which contain the country that you want AWS WAF to search for.
         */
    var GeoMatchConstraints: GeoMatchConstraints
    /**
         * The GeoMatchSetId for an GeoMatchSet. You use GeoMatchSetId to get information about a GeoMatchSet (see GeoMatchSet), update a GeoMatchSet (see UpdateGeoMatchSet), insert a GeoMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a GeoMatchSet from AWS WAF (see DeleteGeoMatchSet).  GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
         */
    var GeoMatchSetId: ResourceId
    /**
         * A friendly name or description of the GeoMatchSet. You can't change the name of an GeoMatchSet after you create it.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait GeoMatchSetSummary extends js.Object {
    /**
         * The GeoMatchSetId for an GeoMatchSet. You can use GeoMatchSetId in a GetGeoMatchSet request to get detailed information about an GeoMatchSet.
         */
    var GeoMatchSetId: ResourceId
    /**
         * A friendly name or description of the GeoMatchSet. You can't change the name of an GeoMatchSet after you create it.
         */
    var Name: ResourceName
  }
  
  
  trait GeoMatchSetUpdate extends js.Object {
    /**
         * Specifies whether to insert or delete a country with UpdateGeoMatchSet.
         */
    var Action: ChangeAction
    /**
         * The country from which web requests originate that you want AWS WAF to search for.
         */
    var GeoMatchConstraint: GeoMatchConstraint
  }
  
  
  trait GetByteMatchSetRequest extends js.Object {
    /**
         * The ByteMatchSetId of the ByteMatchSet that you want to get. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
         */
    var ByteMatchSetId: ResourceId
  }
  
  
  trait GetByteMatchSetResponse extends js.Object {
    /**
         * Information about the ByteMatchSet that you specified in the GetByteMatchSet request. For more information, see the following topics:    ByteMatchSet: Contains ByteMatchSetId, ByteMatchTuples, and Name     ByteMatchTuples: Contains an array of ByteMatchTuple objects. Each ByteMatchTuple object contains FieldToMatch, PositionalConstraint, TargetString, and TextTransformation     FieldToMatch: Contains Data and Type   
         */
    var ByteMatchSet: js.UndefOr[ByteMatchSet] = js.undefined
  }
  
  
  trait GetChangeTokenRequest extends js.Object
  
  
  trait GetChangeTokenResponse extends js.Object {
    /**
         * The ChangeToken that you used in the request. Use this value in a GetChangeTokenStatus request to get the current status of the request. 
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait GetChangeTokenStatusRequest extends js.Object {
    /**
         * The change token for which you want to get the status. This change token was previously returned in the GetChangeToken response.
         */
    var ChangeToken: ChangeToken
  }
  
  
  trait GetChangeTokenStatusResponse extends js.Object {
    /**
         * The status of the change token.
         */
    var ChangeTokenStatus: js.UndefOr[ChangeTokenStatus] = js.undefined
  }
  
  
  trait GetGeoMatchSetRequest extends js.Object {
    /**
         * The GeoMatchSetId of the GeoMatchSet that you want to get. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
         */
    var GeoMatchSetId: ResourceId
  }
  
  
  trait GetGeoMatchSetResponse extends js.Object {
    /**
         * Information about the GeoMatchSet that you specified in the GetGeoMatchSet request. This includes the Type, which for a GeoMatchContraint is always Country, as well as the Value, which is the identifier for a specific country.
         */
    var GeoMatchSet: js.UndefOr[GeoMatchSet] = js.undefined
  }
  
  
  trait GetIPSetRequest extends js.Object {
    /**
         * The IPSetId of the IPSet that you want to get. IPSetId is returned by CreateIPSet and by ListIPSets.
         */
    var IPSetId: ResourceId
  }
  
  
  trait GetIPSetResponse extends js.Object {
    /**
         * Information about the IPSet that you specified in the GetIPSet request. For more information, see the following topics:    IPSet: Contains IPSetDescriptors, IPSetId, and Name     IPSetDescriptors: Contains an array of IPSetDescriptor objects. Each IPSetDescriptor object contains Type and Value   
         */
    var IPSet: js.UndefOr[IPSet] = js.undefined
  }
  
  
  trait GetLoggingConfigurationRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the web ACL for which you want to get the LoggingConfiguration.
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait GetLoggingConfigurationResponse extends js.Object {
    /**
         * The LoggingConfiguration for the specified web ACL.
         */
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
  }
  
  
  trait GetPermissionPolicyRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the RuleGroup for which you want to get the policy.
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait GetPermissionPolicyResponse extends js.Object {
    /**
         * The IAM policy attached to the specified RuleGroup.
         */
    var Policy: js.UndefOr[PolicyString] = js.undefined
  }
  
  
  trait GetRateBasedRuleManagedKeysRequest extends js.Object {
    /**
         * A null value and not currently used. Do not include this in your request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * The RuleId of the RateBasedRule for which you want to get a list of ManagedKeys. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
         */
    var RuleId: ResourceId
  }
  
  
  trait GetRateBasedRuleManagedKeysResponse extends js.Object {
    /**
         * An array of IP addresses that currently are blocked by the specified RateBasedRule. 
         */
    var ManagedKeys: js.UndefOr[ManagedKeys] = js.undefined
    /**
         * A null value and not currently used.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait GetRateBasedRuleRequest extends js.Object {
    /**
         * The RuleId of the RateBasedRule that you want to get. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
         */
    var RuleId: ResourceId
  }
  
  
  trait GetRateBasedRuleResponse extends js.Object {
    /**
         * Information about the RateBasedRule that you specified in the GetRateBasedRule request.
         */
    var Rule: js.UndefOr[RateBasedRule] = js.undefined
  }
  
  
  trait GetRegexMatchSetRequest extends js.Object {
    /**
         * The RegexMatchSetId of the RegexMatchSet that you want to get. RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
         */
    var RegexMatchSetId: ResourceId
  }
  
  
  trait GetRegexMatchSetResponse extends js.Object {
    /**
         * Information about the RegexMatchSet that you specified in the GetRegexMatchSet request. For more information, see RegexMatchTuple.
         */
    var RegexMatchSet: js.UndefOr[RegexMatchSet] = js.undefined
  }
  
  
  trait GetRegexPatternSetRequest extends js.Object {
    /**
         * The RegexPatternSetId of the RegexPatternSet that you want to get. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
         */
    var RegexPatternSetId: ResourceId
  }
  
  
  trait GetRegexPatternSetResponse extends js.Object {
    /**
         * Information about the RegexPatternSet that you specified in the GetRegexPatternSet request, including the identifier of the pattern set and the regular expression patterns you want AWS WAF to search for. 
         */
    var RegexPatternSet: js.UndefOr[RegexPatternSet] = js.undefined
  }
  
  
  trait GetRuleGroupRequest extends js.Object {
    /**
         * The RuleGroupId of the RuleGroup that you want to get. RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
         */
    var RuleGroupId: ResourceId
  }
  
  
  trait GetRuleGroupResponse extends js.Object {
    /**
         * Information about the RuleGroup that you specified in the GetRuleGroup request. 
         */
    var RuleGroup: js.UndefOr[RuleGroup] = js.undefined
  }
  
  
  trait GetRuleRequest extends js.Object {
    /**
         * The RuleId of the Rule that you want to get. RuleId is returned by CreateRule and by ListRules.
         */
    var RuleId: ResourceId
  }
  
  
  trait GetRuleResponse extends js.Object {
    /**
         * Information about the Rule that you specified in the GetRule request. For more information, see the following topics:    Rule: Contains MetricName, Name, an array of Predicate objects, and RuleId     Predicate: Each Predicate object contains DataId, Negated, and Type   
         */
    var Rule: js.UndefOr[Rule] = js.undefined
  }
  
  
  trait GetSampledRequestsRequest extends js.Object {
    /**
         * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource received during the time range. If your resource received fewer requests than the value of MaxItems, GetSampledRequests returns information about all of them. 
         */
    var MaxItems: GetSampledRequestsMaxItems
    /**
         *  RuleId is one of three values:   The RuleId of the Rule or the RuleGroupId of the RuleGroup for which you want GetSampledRequests to return a sample of requests.    Default_Action, which causes GetSampledRequests to return a sample of the requests that didn't match any of the rules in the specified WebACL.  
         */
    var RuleId: ResourceId
    /**
         * The start date and time and the end date and time of the range for which you want GetSampledRequests to return a sample of requests. Specify the date and time in the following format: "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
         */
    var TimeWindow: TimeWindow
    /**
         * The WebACLId of the WebACL for which you want GetSampledRequests to return a sample of requests.
         */
    var WebAclId: ResourceId
  }
  
  
  trait GetSampledRequestsResponse extends js.Object {
    /**
         * The total number of requests from which GetSampledRequests got a sample of MaxItems requests. If PopulationSize is less than MaxItems, the sample includes every request that your AWS resource received during the specified time range.
         */
    var PopulationSize: js.UndefOr[PopulationSize] = js.undefined
    /**
         * A complex type that contains detailed information about each of the requests in the sample.
         */
    var SampledRequests: js.UndefOr[SampledHTTPRequests] = js.undefined
    /**
         * Usually, TimeWindow is the time range that you specified in the GetSampledRequests request. However, if your AWS resource received more than 5,000 requests during the time range that you specified in the request, GetSampledRequests returns the time range for the first 5,000 requests.
         */
    var TimeWindow: js.UndefOr[TimeWindow] = js.undefined
  }
  
  
  trait GetSizeConstraintSetRequest extends js.Object {
    /**
         * The SizeConstraintSetId of the SizeConstraintSet that you want to get. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
         */
    var SizeConstraintSetId: ResourceId
  }
  
  
  trait GetSizeConstraintSetResponse extends js.Object {
    /**
         * Information about the SizeConstraintSet that you specified in the GetSizeConstraintSet request. For more information, see the following topics:    SizeConstraintSet: Contains SizeConstraintSetId, SizeConstraints, and Name     SizeConstraints: Contains an array of SizeConstraint objects. Each SizeConstraint object contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
         */
    var SizeConstraintSet: js.UndefOr[SizeConstraintSet] = js.undefined
  }
  
  
  trait GetSqlInjectionMatchSetRequest extends js.Object {
    /**
         * The SqlInjectionMatchSetId of the SqlInjectionMatchSet that you want to get. SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
         */
    var SqlInjectionMatchSetId: ResourceId
  }
  
  
  trait GetSqlInjectionMatchSetResponse extends js.Object {
    /**
         * Information about the SqlInjectionMatchSet that you specified in the GetSqlInjectionMatchSet request. For more information, see the following topics:    SqlInjectionMatchSet: Contains Name, SqlInjectionMatchSetId, and an array of SqlInjectionMatchTuple objects    SqlInjectionMatchTuple: Each SqlInjectionMatchTuple object contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
         */
    var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet] = js.undefined
  }
  
  
  trait GetWebACLForResourceRequest extends js.Object {
    /**
         * The ARN (Amazon Resource Name) of the resource for which to get the web ACL, either an application load balancer or Amazon API Gateway stage. The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Amazon API Gateway stage: arn:aws:apigateway:region::/restapis/api-id/stages/stage-name    
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait GetWebACLForResourceResponse extends js.Object {
    /**
         * Information about the web ACL that you specified in the GetWebACLForResource request. If there is no associated resource, a null WebACLSummary is returned.
         */
    var WebACLSummary: js.UndefOr[WebACLSummary] = js.undefined
  }
  
  
  trait GetWebACLRequest extends js.Object {
    /**
         * The WebACLId of the WebACL that you want to get. WebACLId is returned by CreateWebACL and by ListWebACLs.
         */
    var WebACLId: ResourceId
  }
  
  
  trait GetWebACLResponse extends js.Object {
    /**
         * Information about the WebACL that you specified in the GetWebACL request. For more information, see the following topics:    WebACL: Contains DefaultAction, MetricName, Name, an array of Rule objects, and WebACLId     DefaultAction (Data type is WafAction): Contains Type     Rules: Contains an array of ActivatedRule objects, which contain Action, Priority, and RuleId     Action: Contains Type   
         */
    var WebACL: js.UndefOr[WebACL] = js.undefined
  }
  
  
  trait GetXssMatchSetRequest extends js.Object {
    /**
         * The XssMatchSetId of the XssMatchSet that you want to get. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
         */
    var XssMatchSetId: ResourceId
  }
  
  
  trait GetXssMatchSetResponse extends js.Object {
    /**
         * Information about the XssMatchSet that you specified in the GetXssMatchSet request. For more information, see the following topics:    XssMatchSet: Contains Name, XssMatchSetId, and an array of XssMatchTuple objects    XssMatchTuple: Each XssMatchTuple object contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
         */
    var XssMatchSet: js.UndefOr[XssMatchSet] = js.undefined
  }
  
  
  trait HTTPHeader extends js.Object {
    /**
         * The name of one of the headers in the sampled web request.
         */
    var Name: js.UndefOr[HeaderName] = js.undefined
    /**
         * The value of one of the headers in the sampled web request.
         */
    var Value: js.UndefOr[HeaderValue] = js.undefined
  }
  
  
  trait HTTPRequest extends js.Object {
    /**
         * The IP address that the request originated from. If the WebACL is associated with a CloudFront distribution, this is the value of one of the following fields in CloudFront access logs:    c-ip, if the viewer did not use an HTTP proxy or a load balancer to send the request    x-forwarded-for, if the viewer did use an HTTP proxy or a load balancer to send the request  
         */
    var ClientIP: js.UndefOr[IPString] = js.undefined
    /**
         * The two-letter country code for the country that the request originated from. For a current list of country codes, see the Wikipedia entry ISO 3166-1 alpha-2.
         */
    var Country: js.UndefOr[Country] = js.undefined
    /**
         * The HTTP version specified in the sampled web request, for example, HTTP/1.1.
         */
    var HTTPVersion: js.UndefOr[HTTPVersion] = js.undefined
    /**
         * A complex type that contains two values for each header in the sampled web request: the name of the header and the value of the header.
         */
    var Headers: js.UndefOr[HTTPHeaders] = js.undefined
    /**
         * The HTTP method specified in the sampled web request. CloudFront supports the following methods: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT. 
         */
    var Method: js.UndefOr[HTTPMethod] = js.undefined
    /**
         * The part of a web request that identifies the resource, for example, /images/daily-ad.jpg.
         */
    var URI: js.UndefOr[URIString] = js.undefined
  }
  
  
  trait IPSet extends js.Object {
    /**
         * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from. If the WebACL is associated with a CloudFront distribution and the viewer did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the CloudFront access logs.
         */
    var IPSetDescriptors: IPSetDescriptors
    /**
         * The IPSetId for an IPSet. You use IPSetId to get information about an IPSet (see GetIPSet), update an IPSet (see UpdateIPSet), insert an IPSet into a Rule or delete one from a Rule (see UpdateRule), and delete an IPSet from AWS WAF (see DeleteIPSet).  IPSetId is returned by CreateIPSet and by ListIPSets.
         */
    var IPSetId: ResourceId
    /**
         * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait IPSetDescriptor extends js.Object {
    /**
         * Specify IPV4 or IPV6.
         */
    var Type: IPSetDescriptorType
    /**
         * Specify an IPv4 address by using CIDR notation. For example:   To configure AWS WAF to allow, block, or count requests that originated from the IP address 192.0.2.44, specify 192.0.2.44/32.   To configure AWS WAF to allow, block, or count requests that originated from IP addresses from 192.0.2.0 to 192.0.2.255, specify 192.0.2.0/24.   For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing. Specify an IPv6 address by using CIDR notation. For example:   To configure AWS WAF to allow, block, or count requests that originated from the IP address 1111:0000:0000:0000:0000:0000:0000:0111, specify 1111:0000:0000:0000:0000:0000:0000:0111/128.   To configure AWS WAF to allow, block, or count requests that originated from IP addresses 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify 1111:0000:0000:0000:0000:0000:0000:0000/64.  
         */
    var Value: IPSetDescriptorValue
  }
  
  
  trait IPSetSummary extends js.Object {
    /**
         * The IPSetId for an IPSet. You can use IPSetId in a GetIPSet request to get detailed information about an IPSet.
         */
    var IPSetId: ResourceId
    /**
         * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
         */
    var Name: ResourceName
  }
  
  
  trait IPSetUpdate extends js.Object {
    /**
         * Specifies whether to insert or delete an IP address with UpdateIPSet.
         */
    var Action: ChangeAction
    /**
         * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from.
         */
    var IPSetDescriptor: IPSetDescriptor
  }
  
  
  trait ListActivatedRulesInRuleGroupRequest extends js.Object {
    /**
         * Specifies the number of ActivatedRules that you want AWS WAF to return for this request. If you have more ActivatedRules than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of ActivatedRules.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more ActivatedRules than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of ActivatedRules. For the second and subsequent ListActivatedRulesInRuleGroup requests, specify the value of NextMarker from the previous response to get information about another batch of ActivatedRules.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * The RuleGroupId of the RuleGroup for which you want to get a list of ActivatedRule objects.
         */
    var RuleGroupId: js.UndefOr[ResourceId] = js.undefined
  }
  
  
  trait ListActivatedRulesInRuleGroupResponse extends js.Object {
    /**
         * An array of ActivatedRules objects.
         */
    var ActivatedRules: js.UndefOr[ActivatedRules] = js.undefined
    /**
         * If you have more ActivatedRules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ActivatedRules, submit another ListActivatedRulesInRuleGroup request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListByteMatchSetsRequest extends js.Object {
    /**
         * Specifies the number of ByteMatchSet objects that you want AWS WAF to return for this request. If you have more ByteMatchSets objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of ByteMatchSet objects.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more ByteMatchSets than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of ByteMatchSets. For the second and subsequent ListByteMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of ByteMatchSets.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListByteMatchSetsResponse extends js.Object {
    /**
         * An array of ByteMatchSetSummary objects.
         */
    var ByteMatchSets: js.UndefOr[ByteMatchSetSummaries] = js.undefined
    /**
         * If you have more ByteMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ByteMatchSet objects, submit another ListByteMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListGeoMatchSetsRequest extends js.Object {
    /**
         * Specifies the number of GeoMatchSet objects that you want AWS WAF to return for this request. If you have more GeoMatchSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of GeoMatchSet objects.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more GeoMatchSets than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of GeoMatchSet objects. For the second and subsequent ListGeoMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of GeoMatchSet objects.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListGeoMatchSetsResponse extends js.Object {
    /**
         * An array of GeoMatchSetSummary objects.
         */
    var GeoMatchSets: js.UndefOr[GeoMatchSetSummaries] = js.undefined
    /**
         * If you have more GeoMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more GeoMatchSet objects, submit another ListGeoMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListIPSetsRequest extends js.Object {
    /**
         * Specifies the number of IPSet objects that you want AWS WAF to return for this request. If you have more IPSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of IPSet objects.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more IPSets than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of IPSets. For the second and subsequent ListIPSets requests, specify the value of NextMarker from the previous response to get information about another batch of IPSets.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListIPSetsResponse extends js.Object {
    /**
         * An array of IPSetSummary objects.
         */
    var IPSets: js.UndefOr[IPSetSummaries] = js.undefined
    /**
         * If you have more IPSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more IPSet objects, submit another ListIPSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListLoggingConfigurationsRequest extends js.Object {
    /**
         * Specifies the number of LoggingConfigurations that you want AWS WAF to return for this request. If you have more LoggingConfigurations than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of LoggingConfigurations.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more LoggingConfigurations than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of LoggingConfigurations. For the second and subsequent ListLoggingConfigurations requests, specify the value of NextMarker from the previous response to get information about another batch of ListLoggingConfigurations.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListLoggingConfigurationsResponse extends js.Object {
    /**
         * An array of LoggingConfiguration objects.
         */
    var LoggingConfigurations: js.UndefOr[LoggingConfigurations] = js.undefined
    /**
         * If you have more LoggingConfigurations than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more LoggingConfigurations, submit another ListLoggingConfigurations request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListRateBasedRulesRequest extends js.Object {
    /**
         * Specifies the number of Rules that you want AWS WAF to return for this request. If you have more Rules than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of Rules.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more Rules than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of Rules. For the second and subsequent ListRateBasedRules requests, specify the value of NextMarker from the previous response to get information about another batch of Rules.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListRateBasedRulesResponse extends js.Object {
    /**
         * If you have more Rules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more Rules, submit another ListRateBasedRules request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of RuleSummary objects.
         */
    var Rules: js.UndefOr[RuleSummaries] = js.undefined
  }
  
  
  trait ListRegexMatchSetsRequest extends js.Object {
    /**
         * Specifies the number of RegexMatchSet objects that you want AWS WAF to return for this request. If you have more RegexMatchSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of RegexMatchSet objects.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more RegexMatchSet objects than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of ByteMatchSets. For the second and subsequent ListRegexMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of RegexMatchSet objects.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListRegexMatchSetsResponse extends js.Object {
    /**
         * If you have more RegexMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexMatchSet objects, submit another ListRegexMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of RegexMatchSetSummary objects.
         */
    var RegexMatchSets: js.UndefOr[RegexMatchSetSummaries] = js.undefined
  }
  
  
  trait ListRegexPatternSetsRequest extends js.Object {
    /**
         * Specifies the number of RegexPatternSet objects that you want AWS WAF to return for this request. If you have more RegexPatternSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of RegexPatternSet objects.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more RegexPatternSet objects than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of RegexPatternSet objects. For the second and subsequent ListRegexPatternSets requests, specify the value of NextMarker from the previous response to get information about another batch of RegexPatternSet objects.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListRegexPatternSetsResponse extends js.Object {
    /**
         * If you have more RegexPatternSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexPatternSet objects, submit another ListRegexPatternSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of RegexPatternSetSummary objects.
         */
    var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.undefined
  }
  
  
  trait ListResourcesForWebACLRequest extends js.Object {
    /**
         * The type of resource to list, either an application load balancer or Amazon API Gateway.
         */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
         * The unique identifier (ID) of the web ACL for which to list the associated resources.
         */
    var WebACLId: ResourceId
  }
  
  
  trait ListResourcesForWebACLResponse extends js.Object {
    /**
         * An array of ARNs (Amazon Resource Names) of the resources associated with the specified web ACL. An array with zero elements is returned if there are no resources associated with the web ACL.
         */
    var ResourceArns: js.UndefOr[ResourceArns] = js.undefined
  }
  
  
  trait ListRuleGroupsRequest extends js.Object {
    /**
         * Specifies the number of RuleGroups that you want AWS WAF to return for this request. If you have more RuleGroups than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of RuleGroups.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more RuleGroups than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of RuleGroups. For the second and subsequent ListRuleGroups requests, specify the value of NextMarker from the previous response to get information about another batch of RuleGroups.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListRuleGroupsResponse extends js.Object {
    /**
         * If you have more RuleGroups than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RuleGroups, submit another ListRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of RuleGroup objects.
         */
    var RuleGroups: js.UndefOr[RuleGroupSummaries] = js.undefined
  }
  
  
  trait ListRulesRequest extends js.Object {
    /**
         * Specifies the number of Rules that you want AWS WAF to return for this request. If you have more Rules than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of Rules.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more Rules than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of Rules. For the second and subsequent ListRules requests, specify the value of NextMarker from the previous response to get information about another batch of Rules.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListRulesResponse extends js.Object {
    /**
         * If you have more Rules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more Rules, submit another ListRules request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of RuleSummary objects.
         */
    var Rules: js.UndefOr[RuleSummaries] = js.undefined
  }
  
  
  trait ListSizeConstraintSetsRequest extends js.Object {
    /**
         * Specifies the number of SizeConstraintSet objects that you want AWS WAF to return for this request. If you have more SizeConstraintSets objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of SizeConstraintSet objects.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more SizeConstraintSets than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of SizeConstraintSets. For the second and subsequent ListSizeConstraintSets requests, specify the value of NextMarker from the previous response to get information about another batch of SizeConstraintSets.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListSizeConstraintSetsResponse extends js.Object {
    /**
         * If you have more SizeConstraintSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SizeConstraintSet objects, submit another ListSizeConstraintSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of SizeConstraintSetSummary objects.
         */
    var SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries] = js.undefined
  }
  
  
  trait ListSqlInjectionMatchSetsRequest extends js.Object {
    /**
         * Specifies the number of SqlInjectionMatchSet objects that you want AWS WAF to return for this request. If you have more SqlInjectionMatchSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of Rules.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more SqlInjectionMatchSet objects than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of SqlInjectionMatchSets. For the second and subsequent ListSqlInjectionMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of SqlInjectionMatchSets.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListSqlInjectionMatchSetsResponse extends js.Object {
    /**
         * If you have more SqlInjectionMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SqlInjectionMatchSet objects, submit another ListSqlInjectionMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of SqlInjectionMatchSetSummary objects.
         */
    var SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries] = js.undefined
  }
  
  
  trait ListSubscribedRuleGroupsRequest extends js.Object {
    /**
         * Specifies the number of subscribed rule groups that you want AWS WAF to return for this request. If you have more objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of objects.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more ByteMatchSetssubscribed rule groups than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of subscribed rule groups. For the second and subsequent ListSubscribedRuleGroupsRequest requests, specify the value of NextMarker from the previous response to get information about another batch of subscribed rule groups.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListSubscribedRuleGroupsResponse extends js.Object {
    /**
         * If you have more objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more objects, submit another ListSubscribedRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of RuleGroup objects.
         */
    var RuleGroups: js.UndefOr[SubscribedRuleGroupSummaries] = js.undefined
  }
  
  
  trait ListWebACLsRequest extends js.Object {
    /**
         * Specifies the number of WebACL objects that you want AWS WAF to return for this request. If you have more WebACL objects than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of WebACL objects.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more WebACL objects than the number that you specify for Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of WebACL objects. For the second and subsequent ListWebACLs requests, specify the value of NextMarker from the previous response to get information about another batch of WebACL objects.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListWebACLsResponse extends js.Object {
    /**
         * If you have more WebACL objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more WebACL objects, submit another ListWebACLs request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of WebACLSummary objects.
         */
    var WebACLs: js.UndefOr[WebACLSummaries] = js.undefined
  }
  
  
  trait ListXssMatchSetsRequest extends js.Object {
    /**
         * Specifies the number of XssMatchSet objects that you want AWS WAF to return for this request. If you have more XssMatchSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of Rules.
         */
    var Limit: js.UndefOr[PaginationLimit] = js.undefined
    /**
         * If you specify a value for Limit and you have more XssMatchSet objects than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of XssMatchSets. For the second and subsequent ListXssMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of XssMatchSets.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
  }
  
  
  trait ListXssMatchSetsResponse extends js.Object {
    /**
         * If you have more XssMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more XssMatchSet objects, submit another ListXssMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
         */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    /**
         * An array of XssMatchSetSummary objects.
         */
    var XssMatchSets: js.UndefOr[XssMatchSetSummaries] = js.undefined
  }
  
  
  trait LoggingConfiguration extends js.Object {
    /**
         * An array of Amazon Kinesis Data Firehose ARNs.
         */
    var LogDestinationConfigs: LogDestinationConfigs
    /**
         * The parts of the request that you want redacted from the logs. For example, if you redact the cookie field, the cookie field in the firehose will be xxx. 
         */
    var RedactedFields: js.UndefOr[RedactedFields] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait Predicate extends js.Object {
    /**
         * A unique identifier for a predicate in a Rule, such as ByteMatchSetId or IPSetId. The ID is returned by the corresponding Create or List command.
         */
    var DataId: ResourceId
    /**
         * Set Negated to False if you want AWS WAF to allow, block, or count requests based on the settings in the specified ByteMatchSet, IPSet, SqlInjectionMatchSet, XssMatchSet, RegexMatchSet, GeoMatchSet, or SizeConstraintSet. For example, if an IPSet includes the IP address 192.0.2.44, AWS WAF will allow or block requests based on that IP address. Set Negated to True if you want AWS WAF to allow or block a request based on the negation of the settings in the ByteMatchSet, IPSet, SqlInjectionMatchSet, XssMatchSet, RegexMatchSet, GeoMatchSet, or SizeConstraintSet. For example, if an IPSet includes the IP address 192.0.2.44, AWS WAF will allow, block, or count requests based on all IP addresses except 192.0.2.44.
         */
    var Negated: Negated
    /**
         * The type of predicate in a Rule, such as ByteMatch or IPSet.
         */
    var Type: PredicateType
  }
  
  
  trait PutLoggingConfigurationRequest extends js.Object {
    /**
         * The Amazon Kinesis Data Firehose that contains the inspected traffic information, the redacted fields details, and the Amazon Resource Name (ARN) of the web ACL to monitor.
         */
    var LoggingConfiguration: LoggingConfiguration
  }
  
  
  trait PutLoggingConfigurationResponse extends js.Object {
    /**
         * The LoggingConfiguration that you submitted in the request.
         */
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
  }
  
  
  trait PutPermissionPolicyRequest extends js.Object {
    /**
         * The policy to attach to the specified RuleGroup.
         */
    var Policy: PolicyString
    /**
         * The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
         */
    var ResourceArn: ResourceArn
  }
  
  
  trait PutPermissionPolicyResponse extends js.Object
  
  
  trait RateBasedRule extends js.Object {
    /**
         * The Predicates object contains one Predicate element for each ByteMatchSet, IPSet, or SqlInjectionMatchSet object that you want to include in a RateBasedRule.
         */
    var MatchPredicates: Predicates
    /**
         * A friendly name or description for the metrics for a RateBasedRule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the metric after you create the RateBasedRule.
         */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
         * A friendly name or description for a RateBasedRule. You can't change the name of a RateBasedRule after you create it.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to rate monitoring. The only valid value for RateKey is IP. IP indicates that requests arriving from the same IP address are subject to the RateLimit that is specified in the RateBasedRule.
         */
    var RateKey: RateKey
    /**
         * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
         */
    var RateLimit: RateLimit
    /**
         * A unique identifier for a RateBasedRule. You use RuleId to get more information about a RateBasedRule (see GetRateBasedRule), update a RateBasedRule (see UpdateRateBasedRule), insert a RateBasedRule into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a RateBasedRule from AWS WAF (see DeleteRateBasedRule).
         */
    var RuleId: ResourceId
  }
  
  
  trait RegexMatchSet extends js.Object {
    /**
         * A friendly name or description of the RegexMatchSet. You can't change Name after you create a RegexMatchSet.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The RegexMatchSetId for a RegexMatchSet. You use RegexMatchSetId to get information about a RegexMatchSet (see GetRegexMatchSet), update a RegexMatchSet (see UpdateRegexMatchSet), insert a RegexMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a RegexMatchSet from AWS WAF (see DeleteRegexMatchSet).  RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
         */
    var RegexMatchSetId: js.UndefOr[ResourceId] = js.undefined
    /**
         * Contains an array of RegexMatchTuple objects. Each RegexMatchTuple object contains:    The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the User-Agent header.    The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see RegexPatternSet.   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.  
         */
    var RegexMatchTuples: js.UndefOr[RegexMatchTuples] = js.undefined
  }
  
  
  trait RegexMatchSetSummary extends js.Object {
    /**
         * A friendly name or description of the RegexMatchSet. You can't change Name after you create a RegexMatchSet.
         */
    var Name: ResourceName
    /**
         * The RegexMatchSetId for a RegexMatchSet. You use RegexMatchSetId to get information about a RegexMatchSet, update a RegexMatchSet, remove a RegexMatchSet from a Rule, and delete a RegexMatchSet from AWS WAF.  RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
         */
    var RegexMatchSetId: ResourceId
  }
  
  
  trait RegexMatchSetUpdate extends js.Object {
    /**
         * Specifies whether to insert or delete a RegexMatchTuple.
         */
    var Action: ChangeAction
    /**
         * Information about the part of a web request that you want AWS WAF to inspect and the identifier of the regular expression (regex) pattern that you want AWS WAF to search for. If you specify DELETE for the value of Action, the RegexMatchTuple values must exactly match the values in the RegexMatchTuple that you want to delete from the RegexMatchSet.
         */
    var RegexMatchTuple: RegexMatchTuple
  }
  
  
  trait RegexMatchTuple extends js.Object {
    /**
         * Specifies where in a web request to look for the RegexPatternSet.
         */
    var FieldToMatch: FieldToMatch
    /**
         * The RegexPatternSetId for a RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet (see GetRegexPatternSet), update a RegexPatternSet (see UpdateRegexPatternSet), insert a RegexPatternSet into a RegexMatchSet or delete one from a RegexMatchSet (see UpdateRegexMatchSet), and delete an RegexPatternSet from AWS WAF (see DeleteRegexPatternSet).  RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
         */
    var RegexPatternSetId: ResourceId
    /**
         * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on RegexPatternSet before inspecting a request for a match. You can only specify a single type of TextTransformation.  CMD_LINE  When you're concerned that attackers are injecting an operating system commandline command and using unusual formatting to disguise some or all of the command, use this option to perform the following transformations:   Delete the following characters: \ " ' ^   Delete spaces before the following characters: / (   Replace the following characters with a space: , ;   Replace multiple spaces with one space   Convert uppercase letters (A-Z) to lowercase (a-z)    COMPRESS_WHITE_SPACE  Use this option to replace the following characters with a space character (decimal 32):   \f, formfeed, decimal 12   \t, tab, decimal 9   \n, newline, decimal 10   \r, carriage return, decimal 13   \v, vertical tab, decimal 11   non-breaking space, decimal 160    COMPRESS_WHITE_SPACE also replaces multiple spaces with one space.  HTML_ENTITY_DECODE  Use this option to replace HTML-encoded characters with unencoded characters. HTML_ENTITY_DECODE performs the following operations:   Replaces (ampersand)quot; with "    Replaces (ampersand)nbsp; with a non-breaking space, decimal 160   Replaces (ampersand)lt; with a "less than" symbol   Replaces (ampersand)gt; with &gt;    Replaces characters that are represented in hexadecimal format, (ampersand)#xhhhh;, with the corresponding characters   Replaces characters that are represented in decimal format, (ampersand)#nnnn;, with the corresponding characters    LOWERCASE  Use this option to convert uppercase letters (A-Z) to lowercase (a-z).  URL_DECODE  Use this option to decode a URL-encoded value.  NONE  Specify NONE if you don't want to perform any text transformations.
         */
    var TextTransformation: TextTransformation
  }
  
  
  trait RegexPatternSet extends js.Object {
    /**
         * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The identifier for the RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet, update a RegexPatternSet, remove a RegexPatternSet from a RegexMatchSet, and delete a RegexPatternSet from AWS WAF.  RegexMatchSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
         */
    var RegexPatternSetId: ResourceId
    /**
         * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as B[a@]dB[o0]t.
         */
    var RegexPatternStrings: RegexPatternStrings
  }
  
  
  trait RegexPatternSetSummary extends js.Object {
    /**
         * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
         */
    var Name: ResourceName
    /**
         * The RegexPatternSetId for a RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet, update a RegexPatternSet, remove a RegexPatternSet from a RegexMatchSet, and delete a RegexPatternSet from AWS WAF.  RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
         */
    var RegexPatternSetId: ResourceId
  }
  
  
  trait RegexPatternSetUpdate extends js.Object {
    /**
         * Specifies whether to insert or delete a RegexPatternString.
         */
    var Action: ChangeAction
    /**
         * Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t.
         */
    var RegexPatternString: RegexPatternString
  }
  
  
  trait Rule extends js.Object {
    /**
         * A friendly name or description for the metrics for this Rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change MetricName after you create the Rule.
         */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
         * The friendly name or description for the Rule. You can't change the name of a Rule after you create it.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The Predicates object contains one Predicate element for each ByteMatchSet, IPSet, or SqlInjectionMatchSet object that you want to include in a Rule.
         */
    var Predicates: Predicates
    /**
         * A unique identifier for a Rule. You use RuleId to get more information about a Rule (see GetRule), update a Rule (see UpdateRule), insert a Rule into a WebACL or delete a one from a WebACL (see UpdateWebACL), or delete a Rule from AWS WAF (see DeleteRule).  RuleId is returned by CreateRule and by ListRules.
         */
    var RuleId: ResourceId
  }
  
  
  trait RuleGroup extends js.Object {
    /**
         * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the metric after you create the RuleGroup.
         */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
         * The friendly name or description for the RuleGroup. You can't change the name of a RuleGroup after you create it.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * A unique identifier for a RuleGroup. You use RuleGroupId to get more information about a RuleGroup (see GetRuleGroup), update a RuleGroup (see UpdateRuleGroup), insert a RuleGroup into a WebACL or delete a one from a WebACL (see UpdateWebACL), or delete a RuleGroup from AWS WAF (see DeleteRuleGroup).  RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
         */
    var RuleGroupId: ResourceId
  }
  
  
  trait RuleGroupSummary extends js.Object {
    /**
         * A friendly name or description of the RuleGroup. You can't change the name of a RuleGroup after you create it.
         */
    var Name: ResourceName
    /**
         * A unique identifier for a RuleGroup. You use RuleGroupId to get more information about a RuleGroup (see GetRuleGroup), update a RuleGroup (see UpdateRuleGroup), insert a RuleGroup into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a RuleGroup from AWS WAF (see DeleteRuleGroup).  RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
         */
    var RuleGroupId: ResourceId
  }
  
  
  trait RuleGroupUpdate extends js.Object {
    /**
         * Specify INSERT to add an ActivatedRule to a RuleGroup. Use DELETE to remove an ActivatedRule from a RuleGroup.
         */
    var Action: ChangeAction
    /**
         * The ActivatedRule object specifies a Rule that you want to insert or delete, the priority of the Rule in the WebACL, and the action that you want AWS WAF to take when a web request matches the Rule (ALLOW, BLOCK, or COUNT).
         */
    var ActivatedRule: ActivatedRule
  }
  
  
  trait RuleSummary extends js.Object {
    /**
         * A friendly name or description of the Rule. You can't change the name of a Rule after you create it.
         */
    var Name: ResourceName
    /**
         * A unique identifier for a Rule. You use RuleId to get more information about a Rule (see GetRule), update a Rule (see UpdateRule), insert a Rule into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a Rule from AWS WAF (see DeleteRule).  RuleId is returned by CreateRule and by ListRules.
         */
    var RuleId: ResourceId
  }
  
  
  trait RuleUpdate extends js.Object {
    /**
         * Specify INSERT to add a Predicate to a Rule. Use DELETE to remove a Predicate from a Rule.
         */
    var Action: ChangeAction
    /**
         * The ID of the Predicate (such as an IPSet) that you want to add to a Rule.
         */
    var Predicate: Predicate
  }
  
  
  trait SampledHTTPRequest extends js.Object {
    /**
         * The action for the Rule that the request matched: ALLOW, BLOCK, or COUNT.
         */
    var Action: js.UndefOr[Action] = js.undefined
    /**
         * A complex type that contains detailed information about the request.
         */
    var Request: HTTPRequest
    /**
         * This value is returned if the GetSampledRequests request specifies the ID of a RuleGroup rather than the ID of an individual rule. RuleWithinRuleGroup is the rule within the specified RuleGroup that matched the request listed in the response.
         */
    var RuleWithinRuleGroup: js.UndefOr[ResourceId] = js.undefined
    /**
         * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
         */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
    /**
         * A value that indicates how one result in the response relates proportionally to other results in the response. A result that has a weight of 2 represents roughly twice as many CloudFront web requests as a result that has a weight of 1.
         */
    var Weight: SampleWeight
  }
  
  
  trait SizeConstraint extends js.Object {
    /**
         * The type of comparison you want AWS WAF to perform. AWS WAF uses this in combination with the provided Size and FieldToMatch to build an expression in the form of "Size ComparisonOperator size in bytes of FieldToMatch". If that expression is true, the SizeConstraint is considered to match.  EQ: Used to test if the Size is equal to the size of the FieldToMatch   NE: Used to test if the Size is not equal to the size of the FieldToMatch   LE: Used to test if the Size is less than or equal to the size of the FieldToMatch   LT: Used to test if the Size is strictly less than the size of the FieldToMatch   GE: Used to test if the Size is greater than or equal to the size of the FieldToMatch   GT: Used to test if the Size is strictly greater than the size of the FieldToMatch 
         */
    var ComparisonOperator: ComparisonOperator
    /**
         * Specifies where in a web request to look for the size constraint.
         */
    var FieldToMatch: FieldToMatch
    /**
         * The size in bytes that you want AWS WAF to compare against the size of the specified FieldToMatch. AWS WAF uses this in combination with ComparisonOperator and FieldToMatch to build an expression in the form of "Size ComparisonOperator size in bytes of FieldToMatch". If that expression is true, the SizeConstraint is considered to match. Valid values for size are 0 - 21474836480 bytes (0 - 20 GB). If you specify URI for the value of Type, the / in the URI counts as one character. For example, the URI /logo.jpg is nine characters long.
         */
    var Size: Size
    /**
         * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on FieldToMatch before inspecting a request for a match. You can only specify a single type of TextTransformation. Note that if you choose BODY for the value of Type, you must choose NONE for TextTransformation because CloudFront forwards only the first 8192 bytes for inspection.   NONE  Specify NONE if you don't want to perform any text transformations.  CMD_LINE  When you're concerned that attackers are injecting an operating system command line command and using unusual formatting to disguise some or all of the command, use this option to perform the following transformations:   Delete the following characters: \ " ' ^   Delete spaces before the following characters: / (   Replace the following characters with a space: , ;   Replace multiple spaces with one space   Convert uppercase letters (A-Z) to lowercase (a-z)    COMPRESS_WHITE_SPACE  Use this option to replace the following characters with a space character (decimal 32):   \f, formfeed, decimal 12   \t, tab, decimal 9   \n, newline, decimal 10   \r, carriage return, decimal 13   \v, vertical tab, decimal 11   non-breaking space, decimal 160    COMPRESS_WHITE_SPACE also replaces multiple spaces with one space.  HTML_ENTITY_DECODE  Use this option to replace HTML-encoded characters with unencoded characters. HTML_ENTITY_DECODE performs the following operations:   Replaces (ampersand)quot; with "    Replaces (ampersand)nbsp; with a non-breaking space, decimal 160   Replaces (ampersand)lt; with a "less than" symbol   Replaces (ampersand)gt; with &gt;    Replaces characters that are represented in hexadecimal format, (ampersand)#xhhhh;, with the corresponding characters   Replaces characters that are represented in decimal format, (ampersand)#nnnn;, with the corresponding characters    LOWERCASE  Use this option to convert uppercase letters (A-Z) to lowercase (a-z).  URL_DECODE  Use this option to decode a URL-encoded value.
         */
    var TextTransformation: TextTransformation
  }
  
  
  trait SizeConstraintSet extends js.Object {
    /**
         * The name, if any, of the SizeConstraintSet.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * A unique identifier for a SizeConstraintSet. You use SizeConstraintSetId to get information about a SizeConstraintSet (see GetSizeConstraintSet), update a SizeConstraintSet (see UpdateSizeConstraintSet), insert a SizeConstraintSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SizeConstraintSet from AWS WAF (see DeleteSizeConstraintSet).  SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
         */
    var SizeConstraintSetId: ResourceId
    /**
         * Specifies the parts of web requests that you want to inspect the size of.
         */
    var SizeConstraints: SizeConstraints
  }
  
  
  trait SizeConstraintSetSummary extends js.Object {
    /**
         * The name of the SizeConstraintSet, if any.
         */
    var Name: ResourceName
    /**
         * A unique identifier for a SizeConstraintSet. You use SizeConstraintSetId to get information about a SizeConstraintSet (see GetSizeConstraintSet), update a SizeConstraintSet (see UpdateSizeConstraintSet), insert a SizeConstraintSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SizeConstraintSet from AWS WAF (see DeleteSizeConstraintSet).  SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
         */
    var SizeConstraintSetId: ResourceId
  }
  
  
  trait SizeConstraintSetUpdate extends js.Object {
    /**
         * Specify INSERT to add a SizeConstraintSetUpdate to a SizeConstraintSet. Use DELETE to remove a SizeConstraintSetUpdate from a SizeConstraintSet.
         */
    var Action: ChangeAction
    /**
         * Specifies a constraint on the size of a part of the web request. AWS WAF uses the Size, ComparisonOperator, and FieldToMatch to build an expression in the form of "Size ComparisonOperator size in bytes of FieldToMatch". If that expression is true, the SizeConstraint is considered to match.
         */
    var SizeConstraint: SizeConstraint
  }
  
  
  trait SqlInjectionMatchSet extends js.Object {
    /**
         * The name, if any, of the SqlInjectionMatchSet.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * A unique identifier for a SqlInjectionMatchSet. You use SqlInjectionMatchSetId to get information about a SqlInjectionMatchSet (see GetSqlInjectionMatchSet), update a SqlInjectionMatchSet (see UpdateSqlInjectionMatchSet), insert a SqlInjectionMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SqlInjectionMatchSet from AWS WAF (see DeleteSqlInjectionMatchSet).  SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
         */
    var SqlInjectionMatchSetId: ResourceId
    /**
         * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
         */
    var SqlInjectionMatchTuples: SqlInjectionMatchTuples
  }
  
  
  trait SqlInjectionMatchSetSummary extends js.Object {
    /**
         * The name of the SqlInjectionMatchSet, if any, specified by Id.
         */
    var Name: ResourceName
    /**
         * A unique identifier for a SqlInjectionMatchSet. You use SqlInjectionMatchSetId to get information about a SqlInjectionMatchSet (see GetSqlInjectionMatchSet), update a SqlInjectionMatchSet (see UpdateSqlInjectionMatchSet), insert a SqlInjectionMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SqlInjectionMatchSet from AWS WAF (see DeleteSqlInjectionMatchSet).  SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
         */
    var SqlInjectionMatchSetId: ResourceId
  }
  
  
  trait SqlInjectionMatchSetUpdate extends js.Object {
    /**
         * Specify INSERT to add a SqlInjectionMatchSetUpdate to a SqlInjectionMatchSet. Use DELETE to remove a SqlInjectionMatchSetUpdate from a SqlInjectionMatchSet.
         */
    var Action: ChangeAction
    /**
         * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
         */
    var SqlInjectionMatchTuple: SqlInjectionMatchTuple
  }
  
  
  trait SqlInjectionMatchTuple extends js.Object {
    /**
         * Specifies where in a web request to look for snippets of malicious SQL code.
         */
    var FieldToMatch: FieldToMatch
    /**
         * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on FieldToMatch before inspecting a request for a match. You can only specify a single type of TextTransformation.  CMD_LINE  When you're concerned that attackers are injecting an operating system command line command and using unusual formatting to disguise some or all of the command, use this option to perform the following transformations:   Delete the following characters: \ " ' ^   Delete spaces before the following characters: / (   Replace the following characters with a space: , ;   Replace multiple spaces with one space   Convert uppercase letters (A-Z) to lowercase (a-z)    COMPRESS_WHITE_SPACE  Use this option to replace the following characters with a space character (decimal 32):   \f, formfeed, decimal 12   \t, tab, decimal 9   \n, newline, decimal 10   \r, carriage return, decimal 13   \v, vertical tab, decimal 11   non-breaking space, decimal 160    COMPRESS_WHITE_SPACE also replaces multiple spaces with one space.  HTML_ENTITY_DECODE  Use this option to replace HTML-encoded characters with unencoded characters. HTML_ENTITY_DECODE performs the following operations:   Replaces (ampersand)quot; with "    Replaces (ampersand)nbsp; with a non-breaking space, decimal 160   Replaces (ampersand)lt; with a "less than" symbol   Replaces (ampersand)gt; with &gt;    Replaces characters that are represented in hexadecimal format, (ampersand)#xhhhh;, with the corresponding characters   Replaces characters that are represented in decimal format, (ampersand)#nnnn;, with the corresponding characters    LOWERCASE  Use this option to convert uppercase letters (A-Z) to lowercase (a-z).  URL_DECODE  Use this option to decode a URL-encoded value.  NONE  Specify NONE if you don't want to perform any text transformations.
         */
    var TextTransformation: TextTransformation
  }
  
  
  trait SubscribedRuleGroupSummary extends js.Object {
    /**
         * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the metric after you create the RuleGroup.
         */
    var MetricName: MetricName
    /**
         * A friendly name or description of the RuleGroup. You can't change the name of a RuleGroup after you create it.
         */
    var Name: ResourceName
    /**
         * A unique identifier for a RuleGroup.
         */
    var RuleGroupId: ResourceId
  }
  
  
  trait TimeWindow extends js.Object {
    /**
         * The end of the time range from which you want GetSampledRequests to return a sample of the requests that your AWS resource received. Specify the date and time in the following format: "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
         */
    var EndTime: Timestamp
    /**
         * The beginning of the time range from which you want GetSampledRequests to return a sample of the requests that your AWS resource received. Specify the date and time in the following format: "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
         */
    var StartTime: Timestamp
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.
       */
    def associateWebACL(): awsDashSdkLib.libRequestMod.Request[AssociateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.
       */
    def associateWebACL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.
       */
    def associateWebACL(params: AssociateWebACLRequest): awsDashSdkLib.libRequestMod.Request[AssociateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.
       */
    def associateWebACL(
      params: AssociateWebACLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a ByteMatchSet. You then use UpdateByteMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a ByteMatchSet that matches any requests with User-Agent headers that contain the string BadBot. You can then configure AWS WAF to reject those requests. To create and configure a ByteMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateByteMatchSet request.   Submit a CreateByteMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createByteMatchSet(): awsDashSdkLib.libRequestMod.Request[CreateByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a ByteMatchSet. You then use UpdateByteMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a ByteMatchSet that matches any requests with User-Agent headers that contain the string BadBot. You can then configure AWS WAF to reject those requests. To create and configure a ByteMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateByteMatchSet request.   Submit a CreateByteMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createByteMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateByteMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a ByteMatchSet. You then use UpdateByteMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a ByteMatchSet that matches any requests with User-Agent headers that contain the string BadBot. You can then configure AWS WAF to reject those requests. To create and configure a ByteMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateByteMatchSet request.   Submit a CreateByteMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createByteMatchSet(params: CreateByteMatchSetRequest): awsDashSdkLib.libRequestMod.Request[CreateByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a ByteMatchSet. You then use UpdateByteMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a ByteMatchSet that matches any requests with User-Agent headers that contain the string BadBot. You can then configure AWS WAF to reject those requests. To create and configure a ByteMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateByteMatchSet request.   Submit a CreateByteMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createByteMatchSet(
      params: CreateByteMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateByteMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an GeoMatchSet, which you use to specify which web requests you want to allow or block based on the country that the requests originate from. For example, if you're receiving a lot of requests from one or more countries and you want to block the requests, you can create an GeoMatchSet that contains those countries and then configure AWS WAF to block the requests.  To create and configure a GeoMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateGeoMatchSet request.   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSetSet request to specify the countries that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createGeoMatchSet(): awsDashSdkLib.libRequestMod.Request[CreateGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an GeoMatchSet, which you use to specify which web requests you want to allow or block based on the country that the requests originate from. For example, if you're receiving a lot of requests from one or more countries and you want to block the requests, you can create an GeoMatchSet that contains those countries and then configure AWS WAF to block the requests.  To create and configure a GeoMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateGeoMatchSet request.   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSetSet request to specify the countries that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createGeoMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGeoMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an GeoMatchSet, which you use to specify which web requests you want to allow or block based on the country that the requests originate from. For example, if you're receiving a lot of requests from one or more countries and you want to block the requests, you can create an GeoMatchSet that contains those countries and then configure AWS WAF to block the requests.  To create and configure a GeoMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateGeoMatchSet request.   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSetSet request to specify the countries that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createGeoMatchSet(params: CreateGeoMatchSetRequest): awsDashSdkLib.libRequestMod.Request[CreateGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an GeoMatchSet, which you use to specify which web requests you want to allow or block based on the country that the requests originate from. For example, if you're receiving a lot of requests from one or more countries and you want to block the requests, you can create an GeoMatchSet that contains those countries and then configure AWS WAF to block the requests.  To create and configure a GeoMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateGeoMatchSet request.   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSetSet request to specify the countries that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createGeoMatchSet(
      params: CreateGeoMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGeoMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an IPSet, which you use to specify which web requests that you want to allow or block based on the IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can create an IPSet that contains those IP addresses and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateIPSet request.   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createIPSet(): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an IPSet, which you use to specify which web requests that you want to allow or block based on the IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can create an IPSet that contains those IP addresses and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateIPSet request.   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createIPSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an IPSet, which you use to specify which web requests that you want to allow or block based on the IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can create an IPSet that contains those IP addresses and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateIPSet request.   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createIPSet(params: CreateIPSetRequest): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an IPSet, which you use to specify which web requests that you want to allow or block based on the IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can create an IPSet that contains those IP addresses and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateIPSet request.   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createIPSet(
      params: CreateIPSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RateBasedRule. The RateBasedRule contains a RateLimit, which specifies the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The RateBasedRule also contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to count or block if these requests exceed the RateLimit. If you add more than one predicate to a RateBasedRule, a request not only must exceed the RateLimit, but it also must match all the specifications to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions must be received at a rate of more than 15,000 requests every five minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops below 15,000 for a five-minute period, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site. To create and configure a RateBasedRule, perform the following steps:   Create and update the predicates that you want to include in the rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRateBasedRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRateBasedRule request to specify the predicates that you want to include in the rule.   Create and update a WebACL that contains the RateBasedRule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRateBasedRule(): awsDashSdkLib.libRequestMod.Request[CreateRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RateBasedRule. The RateBasedRule contains a RateLimit, which specifies the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The RateBasedRule also contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to count or block if these requests exceed the RateLimit. If you add more than one predicate to a RateBasedRule, a request not only must exceed the RateLimit, but it also must match all the specifications to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions must be received at a rate of more than 15,000 requests every five minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops below 15,000 for a five-minute period, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site. To create and configure a RateBasedRule, perform the following steps:   Create and update the predicates that you want to include in the rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRateBasedRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRateBasedRule request to specify the predicates that you want to include in the rule.   Create and update a WebACL that contains the RateBasedRule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRateBasedRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRateBasedRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RateBasedRule. The RateBasedRule contains a RateLimit, which specifies the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The RateBasedRule also contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to count or block if these requests exceed the RateLimit. If you add more than one predicate to a RateBasedRule, a request not only must exceed the RateLimit, but it also must match all the specifications to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions must be received at a rate of more than 15,000 requests every five minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops below 15,000 for a five-minute period, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site. To create and configure a RateBasedRule, perform the following steps:   Create and update the predicates that you want to include in the rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRateBasedRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRateBasedRule request to specify the predicates that you want to include in the rule.   Create and update a WebACL that contains the RateBasedRule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRateBasedRule(params: CreateRateBasedRuleRequest): awsDashSdkLib.libRequestMod.Request[CreateRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RateBasedRule. The RateBasedRule contains a RateLimit, which specifies the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The RateBasedRule also contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to count or block if these requests exceed the RateLimit. If you add more than one predicate to a RateBasedRule, a request not only must exceed the RateLimit, but it also must match all the specifications to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions must be received at a rate of more than 15,000 requests every five minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops below 15,000 for a five-minute period, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site. To create and configure a RateBasedRule, perform the following steps:   Create and update the predicates that you want to include in the rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRateBasedRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRateBasedRule request to specify the predicates that you want to include in the rule.   Create and update a WebACL that contains the RateBasedRule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRateBasedRule(
      params: CreateRateBasedRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRateBasedRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RegexMatchSet. You then use UpdateRegexMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a RegexMatchSet that contains a RegexMatchTuple that looks for any requests with User-Agent headers that match a RegexPatternSet with pattern B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexMatchSet request.   Submit a CreateRegexMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value, using a RegexPatternSet, that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRegexMatchSet(): awsDashSdkLib.libRequestMod.Request[CreateRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RegexMatchSet. You then use UpdateRegexMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a RegexMatchSet that contains a RegexMatchTuple that looks for any requests with User-Agent headers that match a RegexPatternSet with pattern B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexMatchSet request.   Submit a CreateRegexMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value, using a RegexPatternSet, that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRegexMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRegexMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RegexMatchSet. You then use UpdateRegexMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a RegexMatchSet that contains a RegexMatchTuple that looks for any requests with User-Agent headers that match a RegexPatternSet with pattern B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexMatchSet request.   Submit a CreateRegexMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value, using a RegexPatternSet, that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRegexMatchSet(params: CreateRegexMatchSetRequest): awsDashSdkLib.libRequestMod.Request[CreateRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RegexMatchSet. You then use UpdateRegexMatchSet to identify the part of a web request that you want AWS WAF to inspect, such as the values of the User-Agent header or the query string. For example, you can create a RegexMatchSet that contains a RegexMatchTuple that looks for any requests with User-Agent headers that match a RegexPatternSet with pattern B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexMatchSet request.   Submit a CreateRegexMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value, using a RegexPatternSet, that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRegexMatchSet(
      params: CreateRegexMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRegexMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RegexPatternSet. You then use UpdateRegexPatternSet to specify the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexPatternSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexPatternSet request.   Submit a CreateRegexPatternSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the string that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRegexPatternSet(): awsDashSdkLib.libRequestMod.Request[CreateRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RegexPatternSet. You then use UpdateRegexPatternSet to specify the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexPatternSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexPatternSet request.   Submit a CreateRegexPatternSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the string that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRegexPatternSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRegexPatternSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RegexPatternSet. You then use UpdateRegexPatternSet to specify the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexPatternSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexPatternSet request.   Submit a CreateRegexPatternSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the string that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRegexPatternSet(params: CreateRegexPatternSetRequest): awsDashSdkLib.libRequestMod.Request[CreateRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RegexPatternSet. You then use UpdateRegexPatternSet to specify the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexPatternSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRegexPatternSet request.   Submit a CreateRegexPatternSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the string that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRegexPatternSet(
      params: CreateRegexPatternSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRegexPatternSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Rule, which contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to block. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed or blocked. For example, suppose that you add the following to a Rule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   You then add the Rule to a WebACL and specify that you want to blocks requests that satisfy the Rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to specify the predicates that you want to include in the Rule.   Create and update a WebACL that contains the Rule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRule(): awsDashSdkLib.libRequestMod.Request[CreateRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Rule, which contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to block. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed or blocked. For example, suppose that you add the following to a Rule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   You then add the Rule to a WebACL and specify that you want to blocks requests that satisfy the Rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to specify the predicates that you want to include in the Rule.   Create and update a WebACL that contains the Rule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Rule, which contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to block. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed or blocked. For example, suppose that you add the following to a Rule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   You then add the Rule to a WebACL and specify that you want to blocks requests that satisfy the Rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to specify the predicates that you want to include in the Rule.   Create and update a WebACL that contains the Rule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRule(params: CreateRuleRequest): awsDashSdkLib.libRequestMod.Request[CreateRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Rule, which contains the IPSet objects, ByteMatchSet objects, and other predicates that identify the requests that you want to block. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed or blocked. For example, suppose that you add the following to a Rule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   You then add the Rule to a WebACL and specify that you want to blocks requests that satisfy the Rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule. For more information, see CreateByteMatchSet, CreateIPSet, and CreateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateRule request.   Submit a CreateRule request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to specify the predicates that you want to include in the Rule.   Create and update a WebACL that contains the Rule. For more information, see CreateWebACL.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRule(
      params: CreateRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RuleGroup. A rule group is a collection of predefined rules that you add to a web ACL. You use UpdateRuleGroup to add rules to the rule group. Rule groups are subject to the following limits:   Three rule groups per account. You can request an increase to this limit by contacting customer support.   One rule group per web ACL.   Ten rules per rule group.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRuleGroup(): awsDashSdkLib.libRequestMod.Request[CreateRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RuleGroup. A rule group is a collection of predefined rules that you add to a web ACL. You use UpdateRuleGroup to add rules to the rule group. Rule groups are subject to the following limits:   Three rule groups per account. You can request an increase to this limit by contacting customer support.   One rule group per web ACL.   Ten rules per rule group.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRuleGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RuleGroup. A rule group is a collection of predefined rules that you add to a web ACL. You use UpdateRuleGroup to add rules to the rule group. Rule groups are subject to the following limits:   Three rule groups per account. You can request an increase to this limit by contacting customer support.   One rule group per web ACL.   Ten rules per rule group.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRuleGroup(params: CreateRuleGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a RuleGroup. A rule group is a collection of predefined rules that you add to a web ACL. You use UpdateRuleGroup to add rules to the rule group. Rule groups are subject to the following limits:   Three rule groups per account. You can request an increase to this limit by contacting customer support.   One rule group per web ACL.   Ten rules per rule group.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createRuleGroup(
      params: CreateRuleGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a SizeConstraintSet. You then use UpdateSizeConstraintSet to identify the part of a web request that you want AWS WAF to check for length, such as the length of the User-Agent header or the length of the query string. For example, you can create a SizeConstraintSet that matches any requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those requests. To create and configure a SizeConstraintSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSizeConstraintSet request.   Submit a CreateSizeConstraintSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createSizeConstraintSet(): awsDashSdkLib.libRequestMod.Request[CreateSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a SizeConstraintSet. You then use UpdateSizeConstraintSet to identify the part of a web request that you want AWS WAF to check for length, such as the length of the User-Agent header or the length of the query string. For example, you can create a SizeConstraintSet that matches any requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those requests. To create and configure a SizeConstraintSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSizeConstraintSet request.   Submit a CreateSizeConstraintSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createSizeConstraintSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSizeConstraintSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a SizeConstraintSet. You then use UpdateSizeConstraintSet to identify the part of a web request that you want AWS WAF to check for length, such as the length of the User-Agent header or the length of the query string. For example, you can create a SizeConstraintSet that matches any requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those requests. To create and configure a SizeConstraintSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSizeConstraintSet request.   Submit a CreateSizeConstraintSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createSizeConstraintSet(params: CreateSizeConstraintSetRequest): awsDashSdkLib.libRequestMod.Request[CreateSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a SizeConstraintSet. You then use UpdateSizeConstraintSet to identify the part of a web request that you want AWS WAF to check for length, such as the length of the User-Agent header or the length of the query string. For example, you can create a SizeConstraintSet that matches any requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those requests. To create and configure a SizeConstraintSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSizeConstraintSet request.   Submit a CreateSizeConstraintSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createSizeConstraintSet(
      params: CreateSizeConstraintSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSizeConstraintSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests that contain snippets of SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure a SqlInjectionMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSqlInjectionMatchSet request.   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSqlInjectionMatchSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests in which you want to allow, block, or count malicious SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createSqlInjectionMatchSet(): awsDashSdkLib.libRequestMod.Request[CreateSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests that contain snippets of SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure a SqlInjectionMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSqlInjectionMatchSet request.   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSqlInjectionMatchSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests in which you want to allow, block, or count malicious SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createSqlInjectionMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSqlInjectionMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests that contain snippets of SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure a SqlInjectionMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSqlInjectionMatchSet request.   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSqlInjectionMatchSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests in which you want to allow, block, or count malicious SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createSqlInjectionMatchSet(params: CreateSqlInjectionMatchSetRequest): awsDashSdkLib.libRequestMod.Request[CreateSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a SqlInjectionMatchSet, which you use to allow, block, or count requests that contain snippets of SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure a SqlInjectionMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateSqlInjectionMatchSet request.   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSqlInjectionMatchSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests in which you want to allow, block, or count malicious SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createSqlInjectionMatchSet(
      params: CreateSqlInjectionMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSqlInjectionMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a WebACL, which contains the Rules that identify the CloudFront web requests that you want to allow, block, or count. AWS WAF evaluates Rules in order based on the value of Priority for each Rule. You also specify a default action, either ALLOW or BLOCK. If a web request doesn't match any of the Rules in a WebACL, AWS WAF responds to the request with the default action.  To create and configure a WebACL, perform the following steps:   Create and update the ByteMatchSet objects and other predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateWebACL request.   Submit a CreateWebACL request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.   For more information about how to use the AWS WAF API, see the AWS WAF Developer Guide.
       */
    def createWebACL(): awsDashSdkLib.libRequestMod.Request[CreateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a WebACL, which contains the Rules that identify the CloudFront web requests that you want to allow, block, or count. AWS WAF evaluates Rules in order based on the value of Priority for each Rule. You also specify a default action, either ALLOW or BLOCK. If a web request doesn't match any of the Rules in a WebACL, AWS WAF responds to the request with the default action.  To create and configure a WebACL, perform the following steps:   Create and update the ByteMatchSet objects and other predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateWebACL request.   Submit a CreateWebACL request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.   For more information about how to use the AWS WAF API, see the AWS WAF Developer Guide.
       */
    def createWebACL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a WebACL, which contains the Rules that identify the CloudFront web requests that you want to allow, block, or count. AWS WAF evaluates Rules in order based on the value of Priority for each Rule. You also specify a default action, either ALLOW or BLOCK. If a web request doesn't match any of the Rules in a WebACL, AWS WAF responds to the request with the default action.  To create and configure a WebACL, perform the following steps:   Create and update the ByteMatchSet objects and other predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateWebACL request.   Submit a CreateWebACL request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.   For more information about how to use the AWS WAF API, see the AWS WAF Developer Guide.
       */
    def createWebACL(params: CreateWebACLRequest): awsDashSdkLib.libRequestMod.Request[CreateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a WebACL, which contains the Rules that identify the CloudFront web requests that you want to allow, block, or count. AWS WAF evaluates Rules in order based on the value of Priority for each Rule. You also specify a default action, either ALLOW or BLOCK. If a web request doesn't match any of the Rules in a WebACL, AWS WAF responds to the request with the default action.  To create and configure a WebACL, perform the following steps:   Create and update the ByteMatchSet objects and other predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateWebACL request.   Submit a CreateWebACL request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.   For more information about how to use the AWS WAF API, see the AWS WAF Developer Guide.
       */
    def createWebACL(
      params: CreateWebACLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an XssMatchSet, which you use to allow, block, or count requests that contain cross-site scripting attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure an XssMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateXssMatchSet request.   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateXssMatchSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests in which you want to allow, block, or count cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createXssMatchSet(): awsDashSdkLib.libRequestMod.Request[CreateXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an XssMatchSet, which you use to allow, block, or count requests that contain cross-site scripting attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure an XssMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateXssMatchSet request.   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateXssMatchSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests in which you want to allow, block, or count cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createXssMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateXssMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an XssMatchSet, which you use to allow, block, or count requests that contain cross-site scripting attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure an XssMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateXssMatchSet request.   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateXssMatchSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests in which you want to allow, block, or count cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createXssMatchSet(params: CreateXssMatchSetRequest): awsDashSdkLib.libRequestMod.Request[CreateXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an XssMatchSet, which you use to allow, block, or count requests that contain cross-site scripting attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be malicious strings. To create and configure an XssMatchSet, perform the following steps:   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a CreateXssMatchSet request.   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateXssMatchSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests in which you want to allow, block, or count cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def createXssMatchSet(
      params: CreateXssMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateXssMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a ByteMatchSet. You can't delete a ByteMatchSet if it's still used in any Rules or if it still includes any ByteMatchTuple objects (any filters). If you just want to remove a ByteMatchSet from a Rule, use UpdateRule. To permanently delete a ByteMatchSet, perform the following steps:   Update the ByteMatchSet to remove filters, if any. For more information, see UpdateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteByteMatchSet request.   Submit a DeleteByteMatchSet request.  
       */
    def deleteByteMatchSet(): awsDashSdkLib.libRequestMod.Request[DeleteByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a ByteMatchSet. You can't delete a ByteMatchSet if it's still used in any Rules or if it still includes any ByteMatchTuple objects (any filters). If you just want to remove a ByteMatchSet from a Rule, use UpdateRule. To permanently delete a ByteMatchSet, perform the following steps:   Update the ByteMatchSet to remove filters, if any. For more information, see UpdateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteByteMatchSet request.   Submit a DeleteByteMatchSet request.  
       */
    def deleteByteMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteByteMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a ByteMatchSet. You can't delete a ByteMatchSet if it's still used in any Rules or if it still includes any ByteMatchTuple objects (any filters). If you just want to remove a ByteMatchSet from a Rule, use UpdateRule. To permanently delete a ByteMatchSet, perform the following steps:   Update the ByteMatchSet to remove filters, if any. For more information, see UpdateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteByteMatchSet request.   Submit a DeleteByteMatchSet request.  
       */
    def deleteByteMatchSet(params: DeleteByteMatchSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a ByteMatchSet. You can't delete a ByteMatchSet if it's still used in any Rules or if it still includes any ByteMatchTuple objects (any filters). If you just want to remove a ByteMatchSet from a Rule, use UpdateRule. To permanently delete a ByteMatchSet, perform the following steps:   Update the ByteMatchSet to remove filters, if any. For more information, see UpdateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteByteMatchSet request.   Submit a DeleteByteMatchSet request.  
       */
    def deleteByteMatchSet(
      params: DeleteByteMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteByteMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a GeoMatchSet. You can't delete a GeoMatchSet if it's still used in any Rules or if it still includes any countries. If you just want to remove a GeoMatchSet from a Rule, use UpdateRule. To permanently delete a GeoMatchSet from AWS WAF, perform the following steps:   Update the GeoMatchSet to remove any countries. For more information, see UpdateGeoMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteGeoMatchSet request.   Submit a DeleteGeoMatchSet request.  
       */
    def deleteGeoMatchSet(): awsDashSdkLib.libRequestMod.Request[DeleteGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a GeoMatchSet. You can't delete a GeoMatchSet if it's still used in any Rules or if it still includes any countries. If you just want to remove a GeoMatchSet from a Rule, use UpdateRule. To permanently delete a GeoMatchSet from AWS WAF, perform the following steps:   Update the GeoMatchSet to remove any countries. For more information, see UpdateGeoMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteGeoMatchSet request.   Submit a DeleteGeoMatchSet request.  
       */
    def deleteGeoMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGeoMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a GeoMatchSet. You can't delete a GeoMatchSet if it's still used in any Rules or if it still includes any countries. If you just want to remove a GeoMatchSet from a Rule, use UpdateRule. To permanently delete a GeoMatchSet from AWS WAF, perform the following steps:   Update the GeoMatchSet to remove any countries. For more information, see UpdateGeoMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteGeoMatchSet request.   Submit a DeleteGeoMatchSet request.  
       */
    def deleteGeoMatchSet(params: DeleteGeoMatchSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a GeoMatchSet. You can't delete a GeoMatchSet if it's still used in any Rules or if it still includes any countries. If you just want to remove a GeoMatchSet from a Rule, use UpdateRule. To permanently delete a GeoMatchSet from AWS WAF, perform the following steps:   Update the GeoMatchSet to remove any countries. For more information, see UpdateGeoMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteGeoMatchSet request.   Submit a DeleteGeoMatchSet request.  
       */
    def deleteGeoMatchSet(
      params: DeleteGeoMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGeoMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an IPSet. You can't delete an IPSet if it's still used in any Rules or if it still includes any IP addresses. If you just want to remove an IPSet from a Rule, use UpdateRule. To permanently delete an IPSet from AWS WAF, perform the following steps:   Update the IPSet to remove IP address ranges, if any. For more information, see UpdateIPSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteIPSet request.   Submit a DeleteIPSet request.  
       */
    def deleteIPSet(): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an IPSet. You can't delete an IPSet if it's still used in any Rules or if it still includes any IP addresses. If you just want to remove an IPSet from a Rule, use UpdateRule. To permanently delete an IPSet from AWS WAF, perform the following steps:   Update the IPSet to remove IP address ranges, if any. For more information, see UpdateIPSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteIPSet request.   Submit a DeleteIPSet request.  
       */
    def deleteIPSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an IPSet. You can't delete an IPSet if it's still used in any Rules or if it still includes any IP addresses. If you just want to remove an IPSet from a Rule, use UpdateRule. To permanently delete an IPSet from AWS WAF, perform the following steps:   Update the IPSet to remove IP address ranges, if any. For more information, see UpdateIPSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteIPSet request.   Submit a DeleteIPSet request.  
       */
    def deleteIPSet(params: DeleteIPSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an IPSet. You can't delete an IPSet if it's still used in any Rules or if it still includes any IP addresses. If you just want to remove an IPSet from a Rule, use UpdateRule. To permanently delete an IPSet from AWS WAF, perform the following steps:   Update the IPSet to remove IP address ranges, if any. For more information, see UpdateIPSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteIPSet request.   Submit a DeleteIPSet request.  
       */
    def deleteIPSet(
      params: DeleteIPSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes the LoggingConfiguration from the specified web ACL.
       */
    def deleteLoggingConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes the LoggingConfiguration from the specified web ACL.
       */
    def deleteLoggingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLoggingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes the LoggingConfiguration from the specified web ACL.
       */
    def deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeleteLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes the LoggingConfiguration from the specified web ACL.
       */
    def deleteLoggingConfiguration(
      params: DeleteLoggingConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteLoggingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an IAM policy from the specified RuleGroup. The user making the request must be the owner of the RuleGroup.
       */
    def deletePermissionPolicy(): awsDashSdkLib.libRequestMod.Request[DeletePermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an IAM policy from the specified RuleGroup. The user making the request must be the owner of the RuleGroup.
       */
    def deletePermissionPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePermissionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an IAM policy from the specified RuleGroup. The user making the request must be the owner of the RuleGroup.
       */
    def deletePermissionPolicy(params: DeletePermissionPolicyRequest): awsDashSdkLib.libRequestMod.Request[DeletePermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an IAM policy from the specified RuleGroup. The user making the request must be the owner of the RuleGroup.
       */
    def deletePermissionPolicy(
      params: DeletePermissionPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePermissionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RateBasedRule. You can't delete a rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a rule from a WebACL, use UpdateWebACL. To permanently delete a RateBasedRule from AWS WAF, perform the following steps:   Update the RateBasedRule to remove predicates, if any. For more information, see UpdateRateBasedRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRateBasedRule request.   Submit a DeleteRateBasedRule request.  
       */
    def deleteRateBasedRule(): awsDashSdkLib.libRequestMod.Request[DeleteRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RateBasedRule. You can't delete a rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a rule from a WebACL, use UpdateWebACL. To permanently delete a RateBasedRule from AWS WAF, perform the following steps:   Update the RateBasedRule to remove predicates, if any. For more information, see UpdateRateBasedRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRateBasedRule request.   Submit a DeleteRateBasedRule request.  
       */
    def deleteRateBasedRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRateBasedRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RateBasedRule. You can't delete a rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a rule from a WebACL, use UpdateWebACL. To permanently delete a RateBasedRule from AWS WAF, perform the following steps:   Update the RateBasedRule to remove predicates, if any. For more information, see UpdateRateBasedRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRateBasedRule request.   Submit a DeleteRateBasedRule request.  
       */
    def deleteRateBasedRule(params: DeleteRateBasedRuleRequest): awsDashSdkLib.libRequestMod.Request[DeleteRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RateBasedRule. You can't delete a rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a rule from a WebACL, use UpdateWebACL. To permanently delete a RateBasedRule from AWS WAF, perform the following steps:   Update the RateBasedRule to remove predicates, if any. For more information, see UpdateRateBasedRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRateBasedRule request.   Submit a DeleteRateBasedRule request.  
       */
    def deleteRateBasedRule(
      params: DeleteRateBasedRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRateBasedRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RegexMatchSet. You can't delete a RegexMatchSet if it's still used in any Rules or if it still includes any RegexMatchTuples objects (any filters). If you just want to remove a RegexMatchSet from a Rule, use UpdateRule. To permanently delete a RegexMatchSet, perform the following steps:   Update the RegexMatchSet to remove filters, if any. For more information, see UpdateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRegexMatchSet request.   Submit a DeleteRegexMatchSet request.  
       */
    def deleteRegexMatchSet(): awsDashSdkLib.libRequestMod.Request[DeleteRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RegexMatchSet. You can't delete a RegexMatchSet if it's still used in any Rules or if it still includes any RegexMatchTuples objects (any filters). If you just want to remove a RegexMatchSet from a Rule, use UpdateRule. To permanently delete a RegexMatchSet, perform the following steps:   Update the RegexMatchSet to remove filters, if any. For more information, see UpdateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRegexMatchSet request.   Submit a DeleteRegexMatchSet request.  
       */
    def deleteRegexMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRegexMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RegexMatchSet. You can't delete a RegexMatchSet if it's still used in any Rules or if it still includes any RegexMatchTuples objects (any filters). If you just want to remove a RegexMatchSet from a Rule, use UpdateRule. To permanently delete a RegexMatchSet, perform the following steps:   Update the RegexMatchSet to remove filters, if any. For more information, see UpdateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRegexMatchSet request.   Submit a DeleteRegexMatchSet request.  
       */
    def deleteRegexMatchSet(params: DeleteRegexMatchSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RegexMatchSet. You can't delete a RegexMatchSet if it's still used in any Rules or if it still includes any RegexMatchTuples objects (any filters). If you just want to remove a RegexMatchSet from a Rule, use UpdateRule. To permanently delete a RegexMatchSet, perform the following steps:   Update the RegexMatchSet to remove filters, if any. For more information, see UpdateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRegexMatchSet request.   Submit a DeleteRegexMatchSet request.  
       */
    def deleteRegexMatchSet(
      params: DeleteRegexMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRegexMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RegexPatternSet. You can't delete a RegexPatternSet if it's still used in any RegexMatchSet or if the RegexPatternSet is not empty. 
       */
    def deleteRegexPatternSet(): awsDashSdkLib.libRequestMod.Request[DeleteRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RegexPatternSet. You can't delete a RegexPatternSet if it's still used in any RegexMatchSet or if the RegexPatternSet is not empty. 
       */
    def deleteRegexPatternSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRegexPatternSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RegexPatternSet. You can't delete a RegexPatternSet if it's still used in any RegexMatchSet or if the RegexPatternSet is not empty. 
       */
    def deleteRegexPatternSet(params: DeleteRegexPatternSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RegexPatternSet. You can't delete a RegexPatternSet if it's still used in any RegexMatchSet or if the RegexPatternSet is not empty. 
       */
    def deleteRegexPatternSet(
      params: DeleteRegexPatternSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRegexPatternSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a Rule. You can't delete a Rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a Rule from a WebACL, use UpdateWebACL. To permanently delete a Rule from AWS WAF, perform the following steps:   Update the Rule to remove predicates, if any. For more information, see UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRule request.   Submit a DeleteRule request.  
       */
    def deleteRule(): awsDashSdkLib.libRequestMod.Request[DeleteRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a Rule. You can't delete a Rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a Rule from a WebACL, use UpdateWebACL. To permanently delete a Rule from AWS WAF, perform the following steps:   Update the Rule to remove predicates, if any. For more information, see UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRule request.   Submit a DeleteRule request.  
       */
    def deleteRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a Rule. You can't delete a Rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a Rule from a WebACL, use UpdateWebACL. To permanently delete a Rule from AWS WAF, perform the following steps:   Update the Rule to remove predicates, if any. For more information, see UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRule request.   Submit a DeleteRule request.  
       */
    def deleteRule(params: DeleteRuleRequest): awsDashSdkLib.libRequestMod.Request[DeleteRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a Rule. You can't delete a Rule if it's still used in any WebACL objects or if it still includes any predicates, such as ByteMatchSet objects. If you just want to remove a Rule from a WebACL, use UpdateWebACL. To permanently delete a Rule from AWS WAF, perform the following steps:   Update the Rule to remove predicates, if any. For more information, see UpdateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRule request.   Submit a DeleteRule request.  
       */
    def deleteRule(
      params: DeleteRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RuleGroup. You can't delete a RuleGroup if it's still used in any WebACL objects or if it still includes any rules. If you just want to remove a RuleGroup from a WebACL, use UpdateWebACL. To permanently delete a RuleGroup from AWS WAF, perform the following steps:   Update the RuleGroup to remove rules, if any. For more information, see UpdateRuleGroup.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRuleGroup request.   Submit a DeleteRuleGroup request.  
       */
    def deleteRuleGroup(): awsDashSdkLib.libRequestMod.Request[DeleteRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RuleGroup. You can't delete a RuleGroup if it's still used in any WebACL objects or if it still includes any rules. If you just want to remove a RuleGroup from a WebACL, use UpdateWebACL. To permanently delete a RuleGroup from AWS WAF, perform the following steps:   Update the RuleGroup to remove rules, if any. For more information, see UpdateRuleGroup.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRuleGroup request.   Submit a DeleteRuleGroup request.  
       */
    def deleteRuleGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RuleGroup. You can't delete a RuleGroup if it's still used in any WebACL objects or if it still includes any rules. If you just want to remove a RuleGroup from a WebACL, use UpdateWebACL. To permanently delete a RuleGroup from AWS WAF, perform the following steps:   Update the RuleGroup to remove rules, if any. For more information, see UpdateRuleGroup.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRuleGroup request.   Submit a DeleteRuleGroup request.  
       */
    def deleteRuleGroup(params: DeleteRuleGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a RuleGroup. You can't delete a RuleGroup if it's still used in any WebACL objects or if it still includes any rules. If you just want to remove a RuleGroup from a WebACL, use UpdateWebACL. To permanently delete a RuleGroup from AWS WAF, perform the following steps:   Update the RuleGroup to remove rules, if any. For more information, see UpdateRuleGroup.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteRuleGroup request.   Submit a DeleteRuleGroup request.  
       */
    def deleteRuleGroup(
      params: DeleteRuleGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a SizeConstraintSet. You can't delete a SizeConstraintSet if it's still used in any Rules or if it still includes any SizeConstraint objects (any filters). If you just want to remove a SizeConstraintSet from a Rule, use UpdateRule. To permanently delete a SizeConstraintSet, perform the following steps:   Update the SizeConstraintSet to remove filters, if any. For more information, see UpdateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSizeConstraintSet request.   Submit a DeleteSizeConstraintSet request.  
       */
    def deleteSizeConstraintSet(): awsDashSdkLib.libRequestMod.Request[DeleteSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a SizeConstraintSet. You can't delete a SizeConstraintSet if it's still used in any Rules or if it still includes any SizeConstraint objects (any filters). If you just want to remove a SizeConstraintSet from a Rule, use UpdateRule. To permanently delete a SizeConstraintSet, perform the following steps:   Update the SizeConstraintSet to remove filters, if any. For more information, see UpdateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSizeConstraintSet request.   Submit a DeleteSizeConstraintSet request.  
       */
    def deleteSizeConstraintSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSizeConstraintSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a SizeConstraintSet. You can't delete a SizeConstraintSet if it's still used in any Rules or if it still includes any SizeConstraint objects (any filters). If you just want to remove a SizeConstraintSet from a Rule, use UpdateRule. To permanently delete a SizeConstraintSet, perform the following steps:   Update the SizeConstraintSet to remove filters, if any. For more information, see UpdateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSizeConstraintSet request.   Submit a DeleteSizeConstraintSet request.  
       */
    def deleteSizeConstraintSet(params: DeleteSizeConstraintSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a SizeConstraintSet. You can't delete a SizeConstraintSet if it's still used in any Rules or if it still includes any SizeConstraint objects (any filters). If you just want to remove a SizeConstraintSet from a Rule, use UpdateRule. To permanently delete a SizeConstraintSet, perform the following steps:   Update the SizeConstraintSet to remove filters, if any. For more information, see UpdateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSizeConstraintSet request.   Submit a DeleteSizeConstraintSet request.  
       */
    def deleteSizeConstraintSet(
      params: DeleteSizeConstraintSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSizeConstraintSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a SqlInjectionMatchSet. You can't delete a SqlInjectionMatchSet if it's still used in any Rules or if it still contains any SqlInjectionMatchTuple objects. If you just want to remove a SqlInjectionMatchSet from a Rule, use UpdateRule. To permanently delete a SqlInjectionMatchSet from AWS WAF, perform the following steps:   Update the SqlInjectionMatchSet to remove filters, if any. For more information, see UpdateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSqlInjectionMatchSet request.   Submit a DeleteSqlInjectionMatchSet request.  
       */
    def deleteSqlInjectionMatchSet(): awsDashSdkLib.libRequestMod.Request[DeleteSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a SqlInjectionMatchSet. You can't delete a SqlInjectionMatchSet if it's still used in any Rules or if it still contains any SqlInjectionMatchTuple objects. If you just want to remove a SqlInjectionMatchSet from a Rule, use UpdateRule. To permanently delete a SqlInjectionMatchSet from AWS WAF, perform the following steps:   Update the SqlInjectionMatchSet to remove filters, if any. For more information, see UpdateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSqlInjectionMatchSet request.   Submit a DeleteSqlInjectionMatchSet request.  
       */
    def deleteSqlInjectionMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSqlInjectionMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a SqlInjectionMatchSet. You can't delete a SqlInjectionMatchSet if it's still used in any Rules or if it still contains any SqlInjectionMatchTuple objects. If you just want to remove a SqlInjectionMatchSet from a Rule, use UpdateRule. To permanently delete a SqlInjectionMatchSet from AWS WAF, perform the following steps:   Update the SqlInjectionMatchSet to remove filters, if any. For more information, see UpdateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSqlInjectionMatchSet request.   Submit a DeleteSqlInjectionMatchSet request.  
       */
    def deleteSqlInjectionMatchSet(params: DeleteSqlInjectionMatchSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a SqlInjectionMatchSet. You can't delete a SqlInjectionMatchSet if it's still used in any Rules or if it still contains any SqlInjectionMatchTuple objects. If you just want to remove a SqlInjectionMatchSet from a Rule, use UpdateRule. To permanently delete a SqlInjectionMatchSet from AWS WAF, perform the following steps:   Update the SqlInjectionMatchSet to remove filters, if any. For more information, see UpdateSqlInjectionMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteSqlInjectionMatchSet request.   Submit a DeleteSqlInjectionMatchSet request.  
       */
    def deleteSqlInjectionMatchSet(
      params: DeleteSqlInjectionMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSqlInjectionMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a WebACL. You can't delete a WebACL if it still contains any Rules. To delete a WebACL, perform the following steps:   Update the WebACL to remove Rules, if any. For more information, see UpdateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteWebACL request.   Submit a DeleteWebACL request.  
       */
    def deleteWebACL(): awsDashSdkLib.libRequestMod.Request[DeleteWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a WebACL. You can't delete a WebACL if it still contains any Rules. To delete a WebACL, perform the following steps:   Update the WebACL to remove Rules, if any. For more information, see UpdateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteWebACL request.   Submit a DeleteWebACL request.  
       */
    def deleteWebACL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a WebACL. You can't delete a WebACL if it still contains any Rules. To delete a WebACL, perform the following steps:   Update the WebACL to remove Rules, if any. For more information, see UpdateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteWebACL request.   Submit a DeleteWebACL request.  
       */
    def deleteWebACL(params: DeleteWebACLRequest): awsDashSdkLib.libRequestMod.Request[DeleteWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes a WebACL. You can't delete a WebACL if it still contains any Rules. To delete a WebACL, perform the following steps:   Update the WebACL to remove Rules, if any. For more information, see UpdateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteWebACL request.   Submit a DeleteWebACL request.  
       */
    def deleteWebACL(
      params: DeleteWebACLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an XssMatchSet. You can't delete an XssMatchSet if it's still used in any Rules or if it still contains any XssMatchTuple objects. If you just want to remove an XssMatchSet from a Rule, use UpdateRule. To permanently delete an XssMatchSet from AWS WAF, perform the following steps:   Update the XssMatchSet to remove filters, if any. For more information, see UpdateXssMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteXssMatchSet request.   Submit a DeleteXssMatchSet request.  
       */
    def deleteXssMatchSet(): awsDashSdkLib.libRequestMod.Request[DeleteXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an XssMatchSet. You can't delete an XssMatchSet if it's still used in any Rules or if it still contains any XssMatchTuple objects. If you just want to remove an XssMatchSet from a Rule, use UpdateRule. To permanently delete an XssMatchSet from AWS WAF, perform the following steps:   Update the XssMatchSet to remove filters, if any. For more information, see UpdateXssMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteXssMatchSet request.   Submit a DeleteXssMatchSet request.  
       */
    def deleteXssMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteXssMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an XssMatchSet. You can't delete an XssMatchSet if it's still used in any Rules or if it still contains any XssMatchTuple objects. If you just want to remove an XssMatchSet from a Rule, use UpdateRule. To permanently delete an XssMatchSet from AWS WAF, perform the following steps:   Update the XssMatchSet to remove filters, if any. For more information, see UpdateXssMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteXssMatchSet request.   Submit a DeleteXssMatchSet request.  
       */
    def deleteXssMatchSet(params: DeleteXssMatchSetRequest): awsDashSdkLib.libRequestMod.Request[DeleteXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently deletes an XssMatchSet. You can't delete an XssMatchSet if it's still used in any Rules or if it still contains any XssMatchTuple objects. If you just want to remove an XssMatchSet from a Rule, use UpdateRule. To permanently delete an XssMatchSet from AWS WAF, perform the following steps:   Update the XssMatchSet to remove filters, if any. For more information, see UpdateXssMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of a DeleteXssMatchSet request.   Submit a DeleteXssMatchSet request.  
       */
    def deleteXssMatchSet(
      params: DeleteXssMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteXssMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.
       */
    def disassociateWebACL(): awsDashSdkLib.libRequestMod.Request[DisassociateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.
       */
    def disassociateWebACL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.
       */
    def disassociateWebACL(params: DisassociateWebACLRequest): awsDashSdkLib.libRequestMod.Request[DisassociateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.
       */
    def disassociateWebACL(
      params: DisassociateWebACLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the ByteMatchSet specified by ByteMatchSetId.
       */
    def getByteMatchSet(): awsDashSdkLib.libRequestMod.Request[GetByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the ByteMatchSet specified by ByteMatchSetId.
       */
    def getByteMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetByteMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the ByteMatchSet specified by ByteMatchSetId.
       */
    def getByteMatchSet(params: GetByteMatchSetRequest): awsDashSdkLib.libRequestMod.Request[GetByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the ByteMatchSet specified by ByteMatchSetId.
       */
    def getByteMatchSet(
      params: GetByteMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetByteMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting requests to AWS WAF. Each create, update, or delete request must use a unique change token. If your application submits a GetChangeToken request and then submits a second GetChangeToken request before submitting a create, update, or delete request, the second GetChangeToken request returns the same value as the first GetChangeToken request. When you use a change token in a create, update, or delete request, the status of the change token changes to PENDING, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use GetChangeTokenStatus to determine the status of your change token.
       */
    def getChangeToken(): awsDashSdkLib.libRequestMod.Request[GetChangeTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting requests to AWS WAF. Each create, update, or delete request must use a unique change token. If your application submits a GetChangeToken request and then submits a second GetChangeToken request before submitting a create, update, or delete request, the second GetChangeToken request returns the same value as the first GetChangeToken request. When you use a change token in a create, update, or delete request, the status of the change token changes to PENDING, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use GetChangeTokenStatus to determine the status of your change token.
       */
    def getChangeToken(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChangeTokenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChangeTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting requests to AWS WAF. Each create, update, or delete request must use a unique change token. If your application submits a GetChangeToken request and then submits a second GetChangeToken request before submitting a create, update, or delete request, the second GetChangeToken request returns the same value as the first GetChangeToken request. When you use a change token in a create, update, or delete request, the status of the change token changes to PENDING, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use GetChangeTokenStatus to determine the status of your change token.
       */
    def getChangeToken(params: GetChangeTokenRequest): awsDashSdkLib.libRequestMod.Request[GetChangeTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting requests to AWS WAF. Each create, update, or delete request must use a unique change token. If your application submits a GetChangeToken request and then submits a second GetChangeToken request before submitting a create, update, or delete request, the second GetChangeToken request returns the same value as the first GetChangeToken request. When you use a change token in a create, update, or delete request, the status of the change token changes to PENDING, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use GetChangeTokenStatus to determine the status of your change token.
       */
    def getChangeToken(
      params: GetChangeTokenRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChangeTokenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChangeTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the status of a ChangeToken that you got by calling GetChangeToken. ChangeTokenStatus is one of the following values:    PROVISIONED: You requested the change token by calling GetChangeToken, but you haven't used it yet in a call to create, update, or delete an AWS WAF object.    PENDING: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.    IN_SYNC: Propagation is complete.  
       */
    def getChangeTokenStatus(): awsDashSdkLib.libRequestMod.Request[GetChangeTokenStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the status of a ChangeToken that you got by calling GetChangeToken. ChangeTokenStatus is one of the following values:    PROVISIONED: You requested the change token by calling GetChangeToken, but you haven't used it yet in a call to create, update, or delete an AWS WAF object.    PENDING: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.    IN_SYNC: Propagation is complete.  
       */
    def getChangeTokenStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChangeTokenStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChangeTokenStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the status of a ChangeToken that you got by calling GetChangeToken. ChangeTokenStatus is one of the following values:    PROVISIONED: You requested the change token by calling GetChangeToken, but you haven't used it yet in a call to create, update, or delete an AWS WAF object.    PENDING: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.    IN_SYNC: Propagation is complete.  
       */
    def getChangeTokenStatus(params: GetChangeTokenStatusRequest): awsDashSdkLib.libRequestMod.Request[GetChangeTokenStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the status of a ChangeToken that you got by calling GetChangeToken. ChangeTokenStatus is one of the following values:    PROVISIONED: You requested the change token by calling GetChangeToken, but you haven't used it yet in a call to create, update, or delete an AWS WAF object.    PENDING: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.    IN_SYNC: Propagation is complete.  
       */
    def getChangeTokenStatus(
      params: GetChangeTokenStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetChangeTokenStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetChangeTokenStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the GeoMatchSet that is specified by GeoMatchSetId.
       */
    def getGeoMatchSet(): awsDashSdkLib.libRequestMod.Request[GetGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the GeoMatchSet that is specified by GeoMatchSetId.
       */
    def getGeoMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGeoMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the GeoMatchSet that is specified by GeoMatchSetId.
       */
    def getGeoMatchSet(params: GetGeoMatchSetRequest): awsDashSdkLib.libRequestMod.Request[GetGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the GeoMatchSet that is specified by GeoMatchSetId.
       */
    def getGeoMatchSet(
      params: GetGeoMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGeoMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the IPSet that is specified by IPSetId.
       */
    def getIPSet(): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the IPSet that is specified by IPSetId.
       */
    def getIPSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the IPSet that is specified by IPSetId.
       */
    def getIPSet(params: GetIPSetRequest): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the IPSet that is specified by IPSetId.
       */
    def getIPSet(
      params: GetIPSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the LoggingConfiguration for the specified web ACL.
       */
    def getLoggingConfiguration(): awsDashSdkLib.libRequestMod.Request[GetLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the LoggingConfiguration for the specified web ACL.
       */
    def getLoggingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLoggingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the LoggingConfiguration for the specified web ACL.
       */
    def getLoggingConfiguration(params: GetLoggingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the LoggingConfiguration for the specified web ACL.
       */
    def getLoggingConfiguration(
      params: GetLoggingConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLoggingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the IAM policy attached to the RuleGroup.
       */
    def getPermissionPolicy(): awsDashSdkLib.libRequestMod.Request[GetPermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the IAM policy attached to the RuleGroup.
       */
    def getPermissionPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPermissionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the IAM policy attached to the RuleGroup.
       */
    def getPermissionPolicy(params: GetPermissionPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetPermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the IAM policy attached to the RuleGroup.
       */
    def getPermissionPolicy(
      params: GetPermissionPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPermissionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RateBasedRule that is specified by the RuleId that you included in the GetRateBasedRule request.
       */
    def getRateBasedRule(): awsDashSdkLib.libRequestMod.Request[GetRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RateBasedRule that is specified by the RuleId that you included in the GetRateBasedRule request.
       */
    def getRateBasedRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRateBasedRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RateBasedRule that is specified by the RuleId that you included in the GetRateBasedRule request.
       */
    def getRateBasedRule(params: GetRateBasedRuleRequest): awsDashSdkLib.libRequestMod.Request[GetRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RateBasedRule that is specified by the RuleId that you included in the GetRateBasedRule request.
       */
    def getRateBasedRule(
      params: GetRateBasedRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRateBasedRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of IP addresses currently being blocked by the RateBasedRule that is specified by the RuleId. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000 addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
       */
    def getRateBasedRuleManagedKeys(): awsDashSdkLib.libRequestMod.Request[GetRateBasedRuleManagedKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of IP addresses currently being blocked by the RateBasedRule that is specified by the RuleId. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000 addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
       */
    def getRateBasedRuleManagedKeys(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRateBasedRuleManagedKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRateBasedRuleManagedKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of IP addresses currently being blocked by the RateBasedRule that is specified by the RuleId. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000 addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
       */
    def getRateBasedRuleManagedKeys(params: GetRateBasedRuleManagedKeysRequest): awsDashSdkLib.libRequestMod.Request[GetRateBasedRuleManagedKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of IP addresses currently being blocked by the RateBasedRule that is specified by the RuleId. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000 addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
       */
    def getRateBasedRuleManagedKeys(
      params: GetRateBasedRuleManagedKeysRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRateBasedRuleManagedKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRateBasedRuleManagedKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RegexMatchSet specified by RegexMatchSetId.
       */
    def getRegexMatchSet(): awsDashSdkLib.libRequestMod.Request[GetRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RegexMatchSet specified by RegexMatchSetId.
       */
    def getRegexMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRegexMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RegexMatchSet specified by RegexMatchSetId.
       */
    def getRegexMatchSet(params: GetRegexMatchSetRequest): awsDashSdkLib.libRequestMod.Request[GetRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RegexMatchSet specified by RegexMatchSetId.
       */
    def getRegexMatchSet(
      params: GetRegexMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRegexMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RegexPatternSet specified by RegexPatternSetId.
       */
    def getRegexPatternSet(): awsDashSdkLib.libRequestMod.Request[GetRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RegexPatternSet specified by RegexPatternSetId.
       */
    def getRegexPatternSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRegexPatternSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RegexPatternSet specified by RegexPatternSetId.
       */
    def getRegexPatternSet(params: GetRegexPatternSetRequest): awsDashSdkLib.libRequestMod.Request[GetRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RegexPatternSet specified by RegexPatternSetId.
       */
    def getRegexPatternSet(
      params: GetRegexPatternSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRegexPatternSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the Rule that is specified by the RuleId that you included in the GetRule request.
       */
    def getRule(): awsDashSdkLib.libRequestMod.Request[GetRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the Rule that is specified by the RuleId that you included in the GetRule request.
       */
    def getRule(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRuleResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the Rule that is specified by the RuleId that you included in the GetRule request.
       */
    def getRule(params: GetRuleRequest): awsDashSdkLib.libRequestMod.Request[GetRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the Rule that is specified by the RuleId that you included in the GetRule request.
       */
    def getRule(
      params: GetRuleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRuleResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RuleGroup that is specified by the RuleGroupId that you included in the GetRuleGroup request. To view the rules in a rule group, use ListActivatedRulesInRuleGroup.
       */
    def getRuleGroup(): awsDashSdkLib.libRequestMod.Request[GetRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RuleGroup that is specified by the RuleGroupId that you included in the GetRuleGroup request. To view the rules in a rule group, use ListActivatedRulesInRuleGroup.
       */
    def getRuleGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RuleGroup that is specified by the RuleGroupId that you included in the GetRuleGroup request. To view the rules in a rule group, use ListActivatedRulesInRuleGroup.
       */
    def getRuleGroup(params: GetRuleGroupRequest): awsDashSdkLib.libRequestMod.Request[GetRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the RuleGroup that is specified by the RuleGroupId that you included in the GetRuleGroup request. To view the rules in a rule group, use ListActivatedRulesInRuleGroup.
       */
    def getRuleGroup(
      params: GetRuleGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which AWS WAF selected the requests in the sample.
       */
    def getSampledRequests(): awsDashSdkLib.libRequestMod.Request[GetSampledRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which AWS WAF selected the requests in the sample.
       */
    def getSampledRequests(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSampledRequestsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSampledRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which AWS WAF selected the requests in the sample.
       */
    def getSampledRequests(params: GetSampledRequestsRequest): awsDashSdkLib.libRequestMod.Request[GetSampledRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from among the first 5,000 requests that your AWS resource received during a time range that you choose. You can specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.  GetSampledRequests returns a time range, which is usually the time range that you specified. However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time range elapsed, GetSampledRequests returns an updated time range. This new time range indicates the actual period during which AWS WAF selected the requests in the sample.
       */
    def getSampledRequests(
      params: GetSampledRequestsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSampledRequestsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSampledRequestsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SizeConstraintSet specified by SizeConstraintSetId.
       */
    def getSizeConstraintSet(): awsDashSdkLib.libRequestMod.Request[GetSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SizeConstraintSet specified by SizeConstraintSetId.
       */
    def getSizeConstraintSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSizeConstraintSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SizeConstraintSet specified by SizeConstraintSetId.
       */
    def getSizeConstraintSet(params: GetSizeConstraintSetRequest): awsDashSdkLib.libRequestMod.Request[GetSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SizeConstraintSet specified by SizeConstraintSetId.
       */
    def getSizeConstraintSet(
      params: GetSizeConstraintSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSizeConstraintSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId.
       */
    def getSqlInjectionMatchSet(): awsDashSdkLib.libRequestMod.Request[GetSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId.
       */
    def getSqlInjectionMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSqlInjectionMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId.
       */
    def getSqlInjectionMatchSet(params: GetSqlInjectionMatchSetRequest): awsDashSdkLib.libRequestMod.Request[GetSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the SqlInjectionMatchSet that is specified by SqlInjectionMatchSetId.
       */
    def getSqlInjectionMatchSet(
      params: GetSqlInjectionMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSqlInjectionMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the WebACL that is specified by WebACLId.
       */
    def getWebACL(): awsDashSdkLib.libRequestMod.Request[GetWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the WebACL that is specified by WebACLId.
       */
    def getWebACL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the WebACL that is specified by WebACLId.
       */
    def getWebACL(params: GetWebACLRequest): awsDashSdkLib.libRequestMod.Request[GetWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the WebACL that is specified by WebACLId.
       */
    def getWebACL(
      params: GetWebACLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.
       */
    def getWebACLForResource(): awsDashSdkLib.libRequestMod.Request[GetWebACLForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.
       */
    def getWebACLForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetWebACLForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetWebACLForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.
       */
    def getWebACLForResource(params: GetWebACLForResourceRequest): awsDashSdkLib.libRequestMod.Request[GetWebACLForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.
       */
    def getWebACLForResource(
      params: GetWebACLForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetWebACLForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetWebACLForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the XssMatchSet that is specified by XssMatchSetId.
       */
    def getXssMatchSet(): awsDashSdkLib.libRequestMod.Request[GetXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the XssMatchSet that is specified by XssMatchSetId.
       */
    def getXssMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetXssMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the XssMatchSet that is specified by XssMatchSetId.
       */
    def getXssMatchSet(params: GetXssMatchSetRequest): awsDashSdkLib.libRequestMod.Request[GetXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the XssMatchSet that is specified by XssMatchSetId.
       */
    def getXssMatchSet(
      params: GetXssMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetXssMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ActivatedRule objects.
       */
    def listActivatedRulesInRuleGroup(): awsDashSdkLib.libRequestMod.Request[ListActivatedRulesInRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ActivatedRule objects.
       */
    def listActivatedRulesInRuleGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActivatedRulesInRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActivatedRulesInRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ActivatedRule objects.
       */
    def listActivatedRulesInRuleGroup(params: ListActivatedRulesInRuleGroupRequest): awsDashSdkLib.libRequestMod.Request[ListActivatedRulesInRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ActivatedRule objects.
       */
    def listActivatedRulesInRuleGroup(
      params: ListActivatedRulesInRuleGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListActivatedRulesInRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListActivatedRulesInRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ByteMatchSetSummary objects.
       */
    def listByteMatchSets(): awsDashSdkLib.libRequestMod.Request[ListByteMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ByteMatchSetSummary objects.
       */
    def listByteMatchSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListByteMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListByteMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ByteMatchSetSummary objects.
       */
    def listByteMatchSets(params: ListByteMatchSetsRequest): awsDashSdkLib.libRequestMod.Request[ListByteMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of ByteMatchSetSummary objects.
       */
    def listByteMatchSets(
      params: ListByteMatchSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListByteMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListByteMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of GeoMatchSetSummary objects in the response.
       */
    def listGeoMatchSets(): awsDashSdkLib.libRequestMod.Request[ListGeoMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of GeoMatchSetSummary objects in the response.
       */
    def listGeoMatchSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGeoMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGeoMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of GeoMatchSetSummary objects in the response.
       */
    def listGeoMatchSets(params: ListGeoMatchSetsRequest): awsDashSdkLib.libRequestMod.Request[ListGeoMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of GeoMatchSetSummary objects in the response.
       */
    def listGeoMatchSets(
      params: ListGeoMatchSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGeoMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGeoMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of IPSetSummary objects in the response.
       */
    def listIPSets(): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of IPSetSummary objects in the response.
       */
    def listIPSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIPSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of IPSetSummary objects in the response.
       */
    def listIPSets(params: ListIPSetsRequest): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of IPSetSummary objects in the response.
       */
    def listIPSets(
      params: ListIPSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIPSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIPSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of LoggingConfiguration objects.
       */
    def listLoggingConfigurations(): awsDashSdkLib.libRequestMod.Request[ListLoggingConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of LoggingConfiguration objects.
       */
    def listLoggingConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLoggingConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLoggingConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of LoggingConfiguration objects.
       */
    def listLoggingConfigurations(params: ListLoggingConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListLoggingConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of LoggingConfiguration objects.
       */
    def listLoggingConfigurations(
      params: ListLoggingConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListLoggingConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListLoggingConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleSummary objects.
       */
    def listRateBasedRules(): awsDashSdkLib.libRequestMod.Request[ListRateBasedRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleSummary objects.
       */
    def listRateBasedRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRateBasedRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRateBasedRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleSummary objects.
       */
    def listRateBasedRules(params: ListRateBasedRulesRequest): awsDashSdkLib.libRequestMod.Request[ListRateBasedRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleSummary objects.
       */
    def listRateBasedRules(
      params: ListRateBasedRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRateBasedRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRateBasedRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RegexMatchSetSummary objects.
       */
    def listRegexMatchSets(): awsDashSdkLib.libRequestMod.Request[ListRegexMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RegexMatchSetSummary objects.
       */
    def listRegexMatchSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRegexMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRegexMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RegexMatchSetSummary objects.
       */
    def listRegexMatchSets(params: ListRegexMatchSetsRequest): awsDashSdkLib.libRequestMod.Request[ListRegexMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RegexMatchSetSummary objects.
       */
    def listRegexMatchSets(
      params: ListRegexMatchSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRegexMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRegexMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RegexPatternSetSummary objects.
       */
    def listRegexPatternSets(): awsDashSdkLib.libRequestMod.Request[ListRegexPatternSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RegexPatternSetSummary objects.
       */
    def listRegexPatternSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRegexPatternSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRegexPatternSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RegexPatternSetSummary objects.
       */
    def listRegexPatternSets(params: ListRegexPatternSetsRequest): awsDashSdkLib.libRequestMod.Request[ListRegexPatternSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RegexPatternSetSummary objects.
       */
    def listRegexPatternSets(
      params: ListRegexPatternSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRegexPatternSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRegexPatternSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of resources associated with the specified web ACL.
       */
    def listResourcesForWebACL(): awsDashSdkLib.libRequestMod.Request[ListResourcesForWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of resources associated with the specified web ACL.
       */
    def listResourcesForWebACL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourcesForWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourcesForWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of resources associated with the specified web ACL.
       */
    def listResourcesForWebACL(params: ListResourcesForWebACLRequest): awsDashSdkLib.libRequestMod.Request[ListResourcesForWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of resources associated with the specified web ACL.
       */
    def listResourcesForWebACL(
      params: ListResourcesForWebACLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourcesForWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourcesForWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleGroup objects.
       */
    def listRuleGroups(): awsDashSdkLib.libRequestMod.Request[ListRuleGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleGroup objects.
       */
    def listRuleGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRuleGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRuleGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleGroup objects.
       */
    def listRuleGroups(params: ListRuleGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListRuleGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleGroup objects.
       */
    def listRuleGroups(
      params: ListRuleGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRuleGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRuleGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleSummary objects.
       */
    def listRules(): awsDashSdkLib.libRequestMod.Request[ListRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleSummary objects.
       */
    def listRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleSummary objects.
       */
    def listRules(params: ListRulesRequest): awsDashSdkLib.libRequestMod.Request[ListRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleSummary objects.
       */
    def listRules(
      params: ListRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of SizeConstraintSetSummary objects.
       */
    def listSizeConstraintSets(): awsDashSdkLib.libRequestMod.Request[ListSizeConstraintSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of SizeConstraintSetSummary objects.
       */
    def listSizeConstraintSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSizeConstraintSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSizeConstraintSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of SizeConstraintSetSummary objects.
       */
    def listSizeConstraintSets(params: ListSizeConstraintSetsRequest): awsDashSdkLib.libRequestMod.Request[ListSizeConstraintSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of SizeConstraintSetSummary objects.
       */
    def listSizeConstraintSets(
      params: ListSizeConstraintSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSizeConstraintSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSizeConstraintSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of SqlInjectionMatchSet objects.
       */
    def listSqlInjectionMatchSets(): awsDashSdkLib.libRequestMod.Request[ListSqlInjectionMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of SqlInjectionMatchSet objects.
       */
    def listSqlInjectionMatchSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSqlInjectionMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSqlInjectionMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of SqlInjectionMatchSet objects.
       */
    def listSqlInjectionMatchSets(params: ListSqlInjectionMatchSetsRequest): awsDashSdkLib.libRequestMod.Request[ListSqlInjectionMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of SqlInjectionMatchSet objects.
       */
    def listSqlInjectionMatchSets(
      params: ListSqlInjectionMatchSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSqlInjectionMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSqlInjectionMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleGroup objects that you are subscribed to.
       */
    def listSubscribedRuleGroups(): awsDashSdkLib.libRequestMod.Request[ListSubscribedRuleGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleGroup objects that you are subscribed to.
       */
    def listSubscribedRuleGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSubscribedRuleGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSubscribedRuleGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleGroup objects that you are subscribed to.
       */
    def listSubscribedRuleGroups(params: ListSubscribedRuleGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListSubscribedRuleGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of RuleGroup objects that you are subscribed to.
       */
    def listSubscribedRuleGroups(
      params: ListSubscribedRuleGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSubscribedRuleGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSubscribedRuleGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of WebACLSummary objects in the response.
       */
    def listWebACLs(): awsDashSdkLib.libRequestMod.Request[ListWebACLsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of WebACLSummary objects in the response.
       */
    def listWebACLs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWebACLsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWebACLsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of WebACLSummary objects in the response.
       */
    def listWebACLs(params: ListWebACLsRequest): awsDashSdkLib.libRequestMod.Request[ListWebACLsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of WebACLSummary objects in the response.
       */
    def listWebACLs(
      params: ListWebACLsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListWebACLsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListWebACLsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of XssMatchSet objects.
       */
    def listXssMatchSets(): awsDashSdkLib.libRequestMod.Request[ListXssMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of XssMatchSet objects.
       */
    def listXssMatchSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListXssMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListXssMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of XssMatchSet objects.
       */
    def listXssMatchSets(params: ListXssMatchSetsRequest): awsDashSdkLib.libRequestMod.Request[ListXssMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns an array of XssMatchSet objects.
       */
    def listXssMatchSets(
      params: ListXssMatchSetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListXssMatchSetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListXssMatchSetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a LoggingConfiguration with a specified web ACL. You can access information about all traffic that AWS WAF inspects using the following steps:   Create an Amazon Kinesis Data Firehose .    Associate that firehose to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, AWS WAF will create a service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more information, see Logging Web ACL Traffic Information in the AWS WAF Developer Guide.
       */
    def putLoggingConfiguration(): awsDashSdkLib.libRequestMod.Request[PutLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a LoggingConfiguration with a specified web ACL. You can access information about all traffic that AWS WAF inspects using the following steps:   Create an Amazon Kinesis Data Firehose .    Associate that firehose to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, AWS WAF will create a service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more information, see Logging Web ACL Traffic Information in the AWS WAF Developer Guide.
       */
    def putLoggingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLoggingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a LoggingConfiguration with a specified web ACL. You can access information about all traffic that AWS WAF inspects using the following steps:   Create an Amazon Kinesis Data Firehose .    Associate that firehose to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, AWS WAF will create a service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more information, see Logging Web ACL Traffic Information in the AWS WAF Developer Guide.
       */
    def putLoggingConfiguration(params: PutLoggingConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a LoggingConfiguration with a specified web ACL. You can access information about all traffic that AWS WAF inspects using the following steps:   Create an Amazon Kinesis Data Firehose .    Associate that firehose to your web ACL using a PutLoggingConfiguration request.   When you successfully enable logging using a PutLoggingConfiguration request, AWS WAF will create a service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more information, see Logging Web ACL Traffic Information in the AWS WAF Developer Guide.
       */
    def putLoggingConfiguration(
      params: PutLoggingConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutLoggingConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutLoggingConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup across accounts. The PutPermissionPolicy is subject to the following restrictions:   You can attach only one policy with each PutPermissionPolicy request.   The policy must include an Effect, Action and Principal.     Effect must specify Allow.   The Action in the policy must be waf:UpdateWebACL, waf-regional:UpdateWebACL, waf:GetRuleGroup and waf-regional:GetRuleGroup . Any extra or wildcard actions in the policy will be rejected.   The policy cannot include a Resource parameter.   The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.   The user making the request must be the owner of the RuleGroup.   Your policy must be composed using IAM Policy version 2012-10-17.   For more information, see IAM Policies.  An example of a valid policy parameter is shown in the Examples section below.
       */
    def putPermissionPolicy(): awsDashSdkLib.libRequestMod.Request[PutPermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup across accounts. The PutPermissionPolicy is subject to the following restrictions:   You can attach only one policy with each PutPermissionPolicy request.   The policy must include an Effect, Action and Principal.     Effect must specify Allow.   The Action in the policy must be waf:UpdateWebACL, waf-regional:UpdateWebACL, waf:GetRuleGroup and waf-regional:GetRuleGroup . Any extra or wildcard actions in the policy will be rejected.   The policy cannot include a Resource parameter.   The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.   The user making the request must be the owner of the RuleGroup.   Your policy must be composed using IAM Policy version 2012-10-17.   For more information, see IAM Policies.  An example of a valid policy parameter is shown in the Examples section below.
       */
    def putPermissionPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutPermissionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutPermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup across accounts. The PutPermissionPolicy is subject to the following restrictions:   You can attach only one policy with each PutPermissionPolicy request.   The policy must include an Effect, Action and Principal.     Effect must specify Allow.   The Action in the policy must be waf:UpdateWebACL, waf-regional:UpdateWebACL, waf:GetRuleGroup and waf-regional:GetRuleGroup . Any extra or wildcard actions in the policy will be rejected.   The policy cannot include a Resource parameter.   The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.   The user making the request must be the owner of the RuleGroup.   Your policy must be composed using IAM Policy version 2012-10-17.   For more information, see IAM Policies.  An example of a valid policy parameter is shown in the Examples section below.
       */
    def putPermissionPolicy(params: PutPermissionPolicyRequest): awsDashSdkLib.libRequestMod.Request[PutPermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup across accounts. The PutPermissionPolicy is subject to the following restrictions:   You can attach only one policy with each PutPermissionPolicy request.   The policy must include an Effect, Action and Principal.     Effect must specify Allow.   The Action in the policy must be waf:UpdateWebACL, waf-regional:UpdateWebACL, waf:GetRuleGroup and waf-regional:GetRuleGroup . Any extra or wildcard actions in the policy will be rejected.   The policy cannot include a Resource parameter.   The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.   The user making the request must be the owner of the RuleGroup.   Your policy must be composed using IAM Policy version 2012-10-17.   For more information, see IAM Policies.  An example of a valid policy parameter is shown in the Examples section below.
       */
    def putPermissionPolicy(
      params: PutPermissionPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutPermissionPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutPermissionPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet. For each ByteMatchTuple object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a ByteMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the User-Agent header.    The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see TargetString in the ByteMatchTuple data type.    Where to look, such as at the beginning or the end of a query string.   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.   For example, you can add a ByteMatchSetUpdate object that matches web requests in which User-Agent headers contain the string BadBot. You can then configure AWS WAF to block those requests. To create and configure a ByteMatchSet, perform the following steps:   Create a ByteMatchSet. For more information, see CreateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateByteMatchSet(): awsDashSdkLib.libRequestMod.Request[UpdateByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet. For each ByteMatchTuple object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a ByteMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the User-Agent header.    The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see TargetString in the ByteMatchTuple data type.    Where to look, such as at the beginning or the end of a query string.   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.   For example, you can add a ByteMatchSetUpdate object that matches web requests in which User-Agent headers contain the string BadBot. You can then configure AWS WAF to block those requests. To create and configure a ByteMatchSet, perform the following steps:   Create a ByteMatchSet. For more information, see CreateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateByteMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateByteMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet. For each ByteMatchTuple object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a ByteMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the User-Agent header.    The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see TargetString in the ByteMatchTuple data type.    Where to look, such as at the beginning or the end of a query string.   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.   For example, you can add a ByteMatchSetUpdate object that matches web requests in which User-Agent headers contain the string BadBot. You can then configure AWS WAF to block those requests. To create and configure a ByteMatchSet, perform the following steps:   Create a ByteMatchSet. For more information, see CreateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateByteMatchSet(params: UpdateByteMatchSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ByteMatchTuple objects (filters) in a ByteMatchSet. For each ByteMatchTuple object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a ByteMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the User-Agent header.    The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see TargetString in the ByteMatchTuple data type.    Where to look, such as at the beginning or the end of a query string.   Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.   For example, you can add a ByteMatchSetUpdate object that matches web requests in which User-Agent headers contain the string BadBot. You can then configure AWS WAF to block those requests. To create and configure a ByteMatchSet, perform the following steps:   Create a ByteMatchSet. For more information, see CreateByteMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateByteMatchSet request.   Submit an UpdateByteMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateByteMatchSet(
      params: UpdateByteMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateByteMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateByteMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes GeoMatchConstraint objects in an GeoMatchSet. For each GeoMatchConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an GeoMatchConstraint object, you delete the existing object and add a new one.   The Type. The only valid value for Type is Country.   The Value, which is a two character code for the country to add to the GeoMatchConstraint object. Valid codes are listed in GeoMatchConstraint$Value.   To create and configure an GeoMatchSet, perform the following steps:   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSet request to specify the country that you want AWS WAF to watch for.   When you update an GeoMatchSet, you specify the country that you want to add and/or the country that you want to delete. If you want to change a country, you delete the existing country and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateGeoMatchSet(): awsDashSdkLib.libRequestMod.Request[UpdateGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes GeoMatchConstraint objects in an GeoMatchSet. For each GeoMatchConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an GeoMatchConstraint object, you delete the existing object and add a new one.   The Type. The only valid value for Type is Country.   The Value, which is a two character code for the country to add to the GeoMatchConstraint object. Valid codes are listed in GeoMatchConstraint$Value.   To create and configure an GeoMatchSet, perform the following steps:   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSet request to specify the country that you want AWS WAF to watch for.   When you update an GeoMatchSet, you specify the country that you want to add and/or the country that you want to delete. If you want to change a country, you delete the existing country and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateGeoMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGeoMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes GeoMatchConstraint objects in an GeoMatchSet. For each GeoMatchConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an GeoMatchConstraint object, you delete the existing object and add a new one.   The Type. The only valid value for Type is Country.   The Value, which is a two character code for the country to add to the GeoMatchConstraint object. Valid codes are listed in GeoMatchConstraint$Value.   To create and configure an GeoMatchSet, perform the following steps:   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSet request to specify the country that you want AWS WAF to watch for.   When you update an GeoMatchSet, you specify the country that you want to add and/or the country that you want to delete. If you want to change a country, you delete the existing country and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateGeoMatchSet(params: UpdateGeoMatchSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes GeoMatchConstraint objects in an GeoMatchSet. For each GeoMatchConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an GeoMatchConstraint object, you delete the existing object and add a new one.   The Type. The only valid value for Type is Country.   The Value, which is a two character code for the country to add to the GeoMatchConstraint object. Valid codes are listed in GeoMatchConstraint$Value.   To create and configure an GeoMatchSet, perform the following steps:   Submit a CreateGeoMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateGeoMatchSet request.   Submit an UpdateGeoMatchSet request to specify the country that you want AWS WAF to watch for.   When you update an GeoMatchSet, you specify the country that you want to add and/or the country that you want to delete. If you want to change a country, you delete the existing country and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateGeoMatchSet(
      params: UpdateGeoMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGeoMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGeoMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes IPSetDescriptor objects in an IPSet. For each IPSetDescriptor object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an IPSetDescriptor object, you delete the existing object and add a new one.   The IP address version, IPv4 or IPv6.    The IP address in CIDR notation, for example, 192.0.2.0/24 (for the range of IP addresses from 192.0.2.0 to 192.0.2.255) or 192.0.2.44/32 (for the individual IP address 192.0.2.44).    AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /16, /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing. IPv6 addresses can be represented using any of the following formats:   1111:0000:0000:0000:0000:0000:0000:0111/128   1111:0:0:0:0:0:0:0111/128   1111::0111/128   1111::111/128   You use an IPSet to specify which web requests you want to allow or block based on the IP addresses that the requests originated from. For example, if you're receiving a lot of requests from one or a small number of IP addresses and you want to block the requests, you can create an IPSet that specifies those IP addresses, and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   When you update an IPSet, you specify the IP addresses that you want to add and/or the IP addresses that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new one. You can insert a maximum of 1000 addresses in a single request. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateIPSet(): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes IPSetDescriptor objects in an IPSet. For each IPSetDescriptor object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an IPSetDescriptor object, you delete the existing object and add a new one.   The IP address version, IPv4 or IPv6.    The IP address in CIDR notation, for example, 192.0.2.0/24 (for the range of IP addresses from 192.0.2.0 to 192.0.2.255) or 192.0.2.44/32 (for the individual IP address 192.0.2.44).    AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /16, /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing. IPv6 addresses can be represented using any of the following formats:   1111:0000:0000:0000:0000:0000:0000:0111/128   1111:0:0:0:0:0:0:0111/128   1111::0111/128   1111::111/128   You use an IPSet to specify which web requests you want to allow or block based on the IP addresses that the requests originated from. For example, if you're receiving a lot of requests from one or a small number of IP addresses and you want to block the requests, you can create an IPSet that specifies those IP addresses, and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   When you update an IPSet, you specify the IP addresses that you want to add and/or the IP addresses that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new one. You can insert a maximum of 1000 addresses in a single request. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateIPSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes IPSetDescriptor objects in an IPSet. For each IPSetDescriptor object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an IPSetDescriptor object, you delete the existing object and add a new one.   The IP address version, IPv4 or IPv6.    The IP address in CIDR notation, for example, 192.0.2.0/24 (for the range of IP addresses from 192.0.2.0 to 192.0.2.255) or 192.0.2.44/32 (for the individual IP address 192.0.2.44).    AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /16, /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing. IPv6 addresses can be represented using any of the following formats:   1111:0000:0000:0000:0000:0000:0000:0111/128   1111:0:0:0:0:0:0:0111/128   1111::0111/128   1111::111/128   You use an IPSet to specify which web requests you want to allow or block based on the IP addresses that the requests originated from. For example, if you're receiving a lot of requests from one or a small number of IP addresses and you want to block the requests, you can create an IPSet that specifies those IP addresses, and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   When you update an IPSet, you specify the IP addresses that you want to add and/or the IP addresses that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new one. You can insert a maximum of 1000 addresses in a single request. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateIPSet(params: UpdateIPSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes IPSetDescriptor objects in an IPSet. For each IPSetDescriptor object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change an IPSetDescriptor object, you delete the existing object and add a new one.   The IP address version, IPv4 or IPv6.    The IP address in CIDR notation, for example, 192.0.2.0/24 (for the range of IP addresses from 192.0.2.0 to 192.0.2.255) or 192.0.2.44/32 (for the individual IP address 192.0.2.44).    AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address ranges: /16, /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry Classless Inter-Domain Routing. IPv6 addresses can be represented using any of the following formats:   1111:0000:0000:0000:0000:0000:0000:0111/128   1111:0:0:0:0:0:0:0111/128   1111::0111/128   1111::111/128   You use an IPSet to specify which web requests you want to allow or block based on the IP addresses that the requests originated from. For example, if you're receiving a lot of requests from one or a small number of IP addresses and you want to block the requests, you can create an IPSet that specifies those IP addresses, and then configure AWS WAF to block the requests.  To create and configure an IPSet, perform the following steps:   Submit a CreateIPSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateIPSet request to specify the IP addresses that you want AWS WAF to watch for.   When you update an IPSet, you specify the IP addresses that you want to add and/or the IP addresses that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new one. You can insert a maximum of 1000 addresses in a single request. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateIPSet(
      params: UpdateIPSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateIPSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateIPSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes Predicate objects in a rule and updates the RateLimit in the rule.  Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to block or count. The RateLimit specifies the number of requests every five minutes that triggers the rule. If you add more than one predicate to a RateBasedRule, a request must match all the predicates and exceed the RateLimit to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions much be received at a rate of more than 15,000 every five minutes. If the rate drops below this limit, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site.
       */
    def updateRateBasedRule(): awsDashSdkLib.libRequestMod.Request[UpdateRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes Predicate objects in a rule and updates the RateLimit in the rule.  Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to block or count. The RateLimit specifies the number of requests every five minutes that triggers the rule. If you add more than one predicate to a RateBasedRule, a request must match all the predicates and exceed the RateLimit to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions much be received at a rate of more than 15,000 every five minutes. If the rate drops below this limit, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site.
       */
    def updateRateBasedRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRateBasedRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes Predicate objects in a rule and updates the RateLimit in the rule.  Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to block or count. The RateLimit specifies the number of requests every five minutes that triggers the rule. If you add more than one predicate to a RateBasedRule, a request must match all the predicates and exceed the RateLimit to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions much be received at a rate of more than 15,000 every five minutes. If the rate drops below this limit, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site.
       */
    def updateRateBasedRule(params: UpdateRateBasedRuleRequest): awsDashSdkLib.libRequestMod.Request[UpdateRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes Predicate objects in a rule and updates the RateLimit in the rule.  Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to block or count. The RateLimit specifies the number of requests every five minutes that triggers the rule. If you add more than one predicate to a RateBasedRule, a request must match all the predicates and exceed the RateLimit to be counted or blocked. For example, suppose you add the following to a RateBasedRule:   An IPSet that matches the IP address 192.0.2.44/32    A ByteMatchSet that matches BadBot in the User-Agent header   Further, you specify a RateLimit of 15,000. You then add the RateBasedRule to a WebACL and specify that you want to block requests that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 and the User-Agent header in the request must contain the value BadBot. Further, requests that match these two conditions much be received at a rate of more than 15,000 every five minutes. If the rate drops below this limit, AWS WAF no longer blocks the requests. As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could add the following to a RateBasedRule:   A ByteMatchSet with FieldToMatch of URI    A PositionalConstraint of STARTS_WITH    A TargetString of login    Further, you specify a RateLimit of 15,000. By adding this RateBasedRule to a WebACL, you could limit requests to your login page without affecting the rest of your site.
       */
    def updateRateBasedRule(
      params: UpdateRateBasedRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRateBasedRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRateBasedRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes RegexMatchTuple objects (filters) in a RegexMatchSet. For each RegexMatchSetUpdate object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a RegexMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the User-Agent header.    The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see RegexPatternSet.    Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.    For example, you can create a RegexPatternSet that matches any requests with User-Agent headers that contain the string B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Create a RegexMatchSet. For more information, see CreateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the identifier of the RegexPatternSet that contain the regular expression patters you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRegexMatchSet(): awsDashSdkLib.libRequestMod.Request[UpdateRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes RegexMatchTuple objects (filters) in a RegexMatchSet. For each RegexMatchSetUpdate object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a RegexMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the User-Agent header.    The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see RegexPatternSet.    Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.    For example, you can create a RegexPatternSet that matches any requests with User-Agent headers that contain the string B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Create a RegexMatchSet. For more information, see CreateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the identifier of the RegexPatternSet that contain the regular expression patters you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRegexMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRegexMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes RegexMatchTuple objects (filters) in a RegexMatchSet. For each RegexMatchSetUpdate object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a RegexMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the User-Agent header.    The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see RegexPatternSet.    Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.    For example, you can create a RegexPatternSet that matches any requests with User-Agent headers that contain the string B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Create a RegexMatchSet. For more information, see CreateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the identifier of the RegexPatternSet that contain the regular expression patters you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRegexMatchSet(params: UpdateRegexMatchSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes RegexMatchTuple objects (filters) in a RegexMatchSet. For each RegexMatchSetUpdate object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a RegexMatchSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the User-Agent header.    The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see RegexPatternSet.    Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for the specified string.    For example, you can create a RegexPatternSet that matches any requests with User-Agent headers that contain the string B[a@]dB[o0]t. You can then configure AWS WAF to reject those requests. To create and configure a RegexMatchSet, perform the following steps:   Create a RegexMatchSet. For more information, see CreateRegexMatchSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexMatchSet request.   Submit an UpdateRegexMatchSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the identifier of the RegexPatternSet that contain the regular expression patters you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRegexMatchSet(
      params: UpdateRegexMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRegexMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRegexMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes RegexPatternString objects in a RegexPatternSet. For each RegexPatternString object, you specify the following values:    Whether to insert or delete the RegexPatternString.   The regular expression pattern that you want to insert or delete. For more information, see RegexPatternSet.     For example, you can create a RegexPatternString such as B[a@]dB[o0]t. AWS WAF will match this RegexPatternString to:   BadBot   BadB0t   B@dBot   B@dB0t   To create and configure a RegexPatternSet, perform the following steps:   Create a RegexPatternSet. For more information, see CreateRegexPatternSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the regular expression pattern that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRegexPatternSet(): awsDashSdkLib.libRequestMod.Request[UpdateRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes RegexPatternString objects in a RegexPatternSet. For each RegexPatternString object, you specify the following values:    Whether to insert or delete the RegexPatternString.   The regular expression pattern that you want to insert or delete. For more information, see RegexPatternSet.     For example, you can create a RegexPatternString such as B[a@]dB[o0]t. AWS WAF will match this RegexPatternString to:   BadBot   BadB0t   B@dBot   B@dB0t   To create and configure a RegexPatternSet, perform the following steps:   Create a RegexPatternSet. For more information, see CreateRegexPatternSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the regular expression pattern that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRegexPatternSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRegexPatternSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes RegexPatternString objects in a RegexPatternSet. For each RegexPatternString object, you specify the following values:    Whether to insert or delete the RegexPatternString.   The regular expression pattern that you want to insert or delete. For more information, see RegexPatternSet.     For example, you can create a RegexPatternString such as B[a@]dB[o0]t. AWS WAF will match this RegexPatternString to:   BadBot   BadB0t   B@dBot   B@dB0t   To create and configure a RegexPatternSet, perform the following steps:   Create a RegexPatternSet. For more information, see CreateRegexPatternSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the regular expression pattern that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRegexPatternSet(params: UpdateRegexPatternSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes RegexPatternString objects in a RegexPatternSet. For each RegexPatternString object, you specify the following values:    Whether to insert or delete the RegexPatternString.   The regular expression pattern that you want to insert or delete. For more information, see RegexPatternSet.     For example, you can create a RegexPatternString such as B[a@]dB[o0]t. AWS WAF will match this RegexPatternString to:   BadBot   BadB0t   B@dBot   B@dB0t   To create and configure a RegexPatternSet, perform the following steps:   Create a RegexPatternSet. For more information, see CreateRegexPatternSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRegexPatternSet request.   Submit an UpdateRegexPatternSet request to specify the regular expression pattern that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRegexPatternSet(
      params: UpdateRegexPatternSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRegexPatternSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRegexPatternSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes Predicate objects in a Rule. Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to allow, block, or count. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a Rule:    A ByteMatchSet that matches the value BadBot in the User-Agent header   An IPSet that matches the IP address 192.0.2.44    You then add the Rule to a WebACL and specify that you want to block requests that satisfy the Rule. For a request to be blocked, the User-Agent header in the request must contain the value BadBot and the request must originate from the IP address 192.0.2.44. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule.   Create the Rule. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to add predicates to the Rule.   Create and update a WebACL that contains the Rule. See CreateWebACL.   If you want to replace one ByteMatchSet or IPSet with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRule(): awsDashSdkLib.libRequestMod.Request[UpdateRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes Predicate objects in a Rule. Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to allow, block, or count. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a Rule:    A ByteMatchSet that matches the value BadBot in the User-Agent header   An IPSet that matches the IP address 192.0.2.44    You then add the Rule to a WebACL and specify that you want to block requests that satisfy the Rule. For a request to be blocked, the User-Agent header in the request must contain the value BadBot and the request must originate from the IP address 192.0.2.44. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule.   Create the Rule. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to add predicates to the Rule.   Create and update a WebACL that contains the Rule. See CreateWebACL.   If you want to replace one ByteMatchSet or IPSet with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes Predicate objects in a Rule. Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to allow, block, or count. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a Rule:    A ByteMatchSet that matches the value BadBot in the User-Agent header   An IPSet that matches the IP address 192.0.2.44    You then add the Rule to a WebACL and specify that you want to block requests that satisfy the Rule. For a request to be blocked, the User-Agent header in the request must contain the value BadBot and the request must originate from the IP address 192.0.2.44. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule.   Create the Rule. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to add predicates to the Rule.   Create and update a WebACL that contains the Rule. See CreateWebACL.   If you want to replace one ByteMatchSet or IPSet with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRule(params: UpdateRuleRequest): awsDashSdkLib.libRequestMod.Request[UpdateRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes Predicate objects in a Rule. Each Predicate object identifies a predicate, such as a ByteMatchSet or an IPSet, that specifies the web requests that you want to allow, block, or count. If you add more than one predicate to a Rule, a request must match all of the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a Rule:    A ByteMatchSet that matches the value BadBot in the User-Agent header   An IPSet that matches the IP address 192.0.2.44    You then add the Rule to a WebACL and specify that you want to block requests that satisfy the Rule. For a request to be blocked, the User-Agent header in the request must contain the value BadBot and the request must originate from the IP address 192.0.2.44. To create and configure a Rule, perform the following steps:   Create and update the predicates that you want to include in the Rule.   Create the Rule. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRule request.   Submit an UpdateRule request to add predicates to the Rule.   Create and update a WebACL that contains the Rule. See CreateWebACL.   If you want to replace one ByteMatchSet or IPSet with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRule(
      params: UpdateRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRuleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRuleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ActivatedRule objects in a RuleGroup. You can only insert REGULAR rules into a rule group. You can have a maximum of ten rules per rule group. To create and configure a RuleGroup, perform the following steps:   Create and update the Rules that you want to include in the RuleGroup. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRuleGroup request.   Submit an UpdateRuleGroup request to add Rules to the RuleGroup.   Create and update a WebACL that contains the RuleGroup. See CreateWebACL.   If you want to replace one Rule with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRuleGroup(): awsDashSdkLib.libRequestMod.Request[UpdateRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ActivatedRule objects in a RuleGroup. You can only insert REGULAR rules into a rule group. You can have a maximum of ten rules per rule group. To create and configure a RuleGroup, perform the following steps:   Create and update the Rules that you want to include in the RuleGroup. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRuleGroup request.   Submit an UpdateRuleGroup request to add Rules to the RuleGroup.   Create and update a WebACL that contains the RuleGroup. See CreateWebACL.   If you want to replace one Rule with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRuleGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ActivatedRule objects in a RuleGroup. You can only insert REGULAR rules into a rule group. You can have a maximum of ten rules per rule group. To create and configure a RuleGroup, perform the following steps:   Create and update the Rules that you want to include in the RuleGroup. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRuleGroup request.   Submit an UpdateRuleGroup request to add Rules to the RuleGroup.   Create and update a WebACL that contains the RuleGroup. See CreateWebACL.   If you want to replace one Rule with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRuleGroup(params: UpdateRuleGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ActivatedRule objects in a RuleGroup. You can only insert REGULAR rules into a rule group. You can have a maximum of ten rules per rule group. To create and configure a RuleGroup, perform the following steps:   Create and update the Rules that you want to include in the RuleGroup. See CreateRule.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateRuleGroup request.   Submit an UpdateRuleGroup request to add Rules to the RuleGroup.   Create and update a WebACL that contains the RuleGroup. See CreateWebACL.   If you want to replace one Rule with another, you delete the existing one and add the new one. For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateRuleGroup(
      params: UpdateRuleGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRuleGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRuleGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet. For each SizeConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a SizeConstraintSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length of the User-Agent header.   Whether to perform any transformations on the request, such as converting it to lowercase, before checking its length. Note that transformations of the request body are not supported because the AWS resource forwards only the first 8192 bytes of your request to AWS WAF. You can only specify a single type of TextTransformation.   A ComparisonOperator used for evaluating the selected part of the request against the specified Size, such as equals, greater than, less than, and so on.   The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed after applying the transformation.   For example, you can add a SizeConstraintSetUpdate object that matches web requests in which the length of the User-Agent header is greater than 100 bytes. You can then configure AWS WAF to block those requests. To create and configure a SizeConstraintSet, perform the following steps:   Create a SizeConstraintSet. For more information, see CreateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateSizeConstraintSet(): awsDashSdkLib.libRequestMod.Request[UpdateSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet. For each SizeConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a SizeConstraintSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length of the User-Agent header.   Whether to perform any transformations on the request, such as converting it to lowercase, before checking its length. Note that transformations of the request body are not supported because the AWS resource forwards only the first 8192 bytes of your request to AWS WAF. You can only specify a single type of TextTransformation.   A ComparisonOperator used for evaluating the selected part of the request against the specified Size, such as equals, greater than, less than, and so on.   The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed after applying the transformation.   For example, you can add a SizeConstraintSetUpdate object that matches web requests in which the length of the User-Agent header is greater than 100 bytes. You can then configure AWS WAF to block those requests. To create and configure a SizeConstraintSet, perform the following steps:   Create a SizeConstraintSet. For more information, see CreateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateSizeConstraintSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSizeConstraintSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet. For each SizeConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a SizeConstraintSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length of the User-Agent header.   Whether to perform any transformations on the request, such as converting it to lowercase, before checking its length. Note that transformations of the request body are not supported because the AWS resource forwards only the first 8192 bytes of your request to AWS WAF. You can only specify a single type of TextTransformation.   A ComparisonOperator used for evaluating the selected part of the request against the specified Size, such as equals, greater than, less than, and so on.   The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed after applying the transformation.   For example, you can add a SizeConstraintSetUpdate object that matches web requests in which the length of the User-Agent header is greater than 100 bytes. You can then configure AWS WAF to block those requests. To create and configure a SizeConstraintSet, perform the following steps:   Create a SizeConstraintSet. For more information, see CreateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateSizeConstraintSet(params: UpdateSizeConstraintSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes SizeConstraint objects (filters) in a SizeConstraintSet. For each SizeConstraint object, you specify the following values:    Whether to insert or delete the object from the array. If you want to change a SizeConstraintSetUpdate object, you delete the existing object and add a new one.   The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length of the User-Agent header.   Whether to perform any transformations on the request, such as converting it to lowercase, before checking its length. Note that transformations of the request body are not supported because the AWS resource forwards only the first 8192 bytes of your request to AWS WAF. You can only specify a single type of TextTransformation.   A ComparisonOperator used for evaluating the selected part of the request against the specified Size, such as equals, greater than, less than, and so on.   The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed after applying the transformation.   For example, you can add a SizeConstraintSetUpdate object that matches web requests in which the length of the User-Agent header is greater than 100 bytes. You can then configure AWS WAF to block those requests. To create and configure a SizeConstraintSet, perform the following steps:   Create a SizeConstraintSet. For more information, see CreateSizeConstraintSet.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateSizeConstraintSet request.   Submit an UpdateSizeConstraintSet request to specify the part of the request that you want AWS WAF to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateSizeConstraintSet(
      params: UpdateSizeConstraintSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSizeConstraintSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSizeConstraintSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes SqlInjectionMatchTuple objects (filters) in a SqlInjectionMatchSet. For each SqlInjectionMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change a SqlInjectionMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for snippets of malicious SQL code. You can only specify a single type of TextTransformation.   You use SqlInjectionMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string and you want to block the requests, you can create a SqlInjectionMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure a SqlInjectionMatchSet, perform the following steps:   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for snippets of SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateSqlInjectionMatchSet(): awsDashSdkLib.libRequestMod.Request[UpdateSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes SqlInjectionMatchTuple objects (filters) in a SqlInjectionMatchSet. For each SqlInjectionMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change a SqlInjectionMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for snippets of malicious SQL code. You can only specify a single type of TextTransformation.   You use SqlInjectionMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string and you want to block the requests, you can create a SqlInjectionMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure a SqlInjectionMatchSet, perform the following steps:   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for snippets of SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateSqlInjectionMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSqlInjectionMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes SqlInjectionMatchTuple objects (filters) in a SqlInjectionMatchSet. For each SqlInjectionMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change a SqlInjectionMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for snippets of malicious SQL code. You can only specify a single type of TextTransformation.   You use SqlInjectionMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string and you want to block the requests, you can create a SqlInjectionMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure a SqlInjectionMatchSet, perform the following steps:   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for snippets of SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateSqlInjectionMatchSet(params: UpdateSqlInjectionMatchSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes SqlInjectionMatchTuple objects (filters) in a SqlInjectionMatchSet. For each SqlInjectionMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change a SqlInjectionMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for snippets of malicious SQL code. You can only specify a single type of TextTransformation.   You use SqlInjectionMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string and you want to block the requests, you can create a SqlInjectionMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure a SqlInjectionMatchSet, perform the following steps:   Submit a CreateSqlInjectionMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateSqlInjectionMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for snippets of SQL code.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateSqlInjectionMatchSet(
      params: UpdateSqlInjectionMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSqlInjectionMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSqlInjectionMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ActivatedRule objects in a WebACL. Each Rule identifies web requests that you want to allow, block, or count. When you update a WebACL, you specify the following values:   A default action for the WebACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the Rules in a WebACL.   The Rules that you want to add or delete. If you want to replace one Rule with another, you delete the existing Rule and add the new one.   For each Rule, whether you want AWS WAF to allow requests, block requests, or count requests that match the conditions in the Rule.   The order in which you want AWS WAF to evaluate the Rules in a WebACL. If you add more than one Rule to a WebACL, AWS WAF evaluates each request against the Rules in order based on the value of Priority. (The Rule that has the lowest value for Priority is evaluated first.) When a web request matches all the predicates (such as ByteMatchSets and IPSets) in a Rule, AWS WAF immediately takes the corresponding action, allow or block, and doesn't evaluate the request against the remaining Rules in the WebACL, if any.    To create and configure a WebACL, perform the following steps:   Create and update the predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Create a WebACL. See CreateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.  The ActivatedRule can be a rule group. If you specify a rule group as your ActivatedRule, you can exclude specific rules from that rule group. If you already have a rule group associated with a web ACL and want to submit an UpdateWebACL request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the re-insert it again, specifying the excluded rules. For details, see ActivatedRule$ExcludedRules.    Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating the rule, the UpdateWebACL request will fail because the request tries to add a REGULAR rule (the default rule type) with the specified ID, which does not exist.  For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateWebACL(): awsDashSdkLib.libRequestMod.Request[UpdateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ActivatedRule objects in a WebACL. Each Rule identifies web requests that you want to allow, block, or count. When you update a WebACL, you specify the following values:   A default action for the WebACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the Rules in a WebACL.   The Rules that you want to add or delete. If you want to replace one Rule with another, you delete the existing Rule and add the new one.   For each Rule, whether you want AWS WAF to allow requests, block requests, or count requests that match the conditions in the Rule.   The order in which you want AWS WAF to evaluate the Rules in a WebACL. If you add more than one Rule to a WebACL, AWS WAF evaluates each request against the Rules in order based on the value of Priority. (The Rule that has the lowest value for Priority is evaluated first.) When a web request matches all the predicates (such as ByteMatchSets and IPSets) in a Rule, AWS WAF immediately takes the corresponding action, allow or block, and doesn't evaluate the request against the remaining Rules in the WebACL, if any.    To create and configure a WebACL, perform the following steps:   Create and update the predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Create a WebACL. See CreateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.  The ActivatedRule can be a rule group. If you specify a rule group as your ActivatedRule, you can exclude specific rules from that rule group. If you already have a rule group associated with a web ACL and want to submit an UpdateWebACL request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the re-insert it again, specifying the excluded rules. For details, see ActivatedRule$ExcludedRules.    Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating the rule, the UpdateWebACL request will fail because the request tries to add a REGULAR rule (the default rule type) with the specified ID, which does not exist.  For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateWebACL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ActivatedRule objects in a WebACL. Each Rule identifies web requests that you want to allow, block, or count. When you update a WebACL, you specify the following values:   A default action for the WebACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the Rules in a WebACL.   The Rules that you want to add or delete. If you want to replace one Rule with another, you delete the existing Rule and add the new one.   For each Rule, whether you want AWS WAF to allow requests, block requests, or count requests that match the conditions in the Rule.   The order in which you want AWS WAF to evaluate the Rules in a WebACL. If you add more than one Rule to a WebACL, AWS WAF evaluates each request against the Rules in order based on the value of Priority. (The Rule that has the lowest value for Priority is evaluated first.) When a web request matches all the predicates (such as ByteMatchSets and IPSets) in a Rule, AWS WAF immediately takes the corresponding action, allow or block, and doesn't evaluate the request against the remaining Rules in the WebACL, if any.    To create and configure a WebACL, perform the following steps:   Create and update the predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Create a WebACL. See CreateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.  The ActivatedRule can be a rule group. If you specify a rule group as your ActivatedRule, you can exclude specific rules from that rule group. If you already have a rule group associated with a web ACL and want to submit an UpdateWebACL request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the re-insert it again, specifying the excluded rules. For details, see ActivatedRule$ExcludedRules.    Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating the rule, the UpdateWebACL request will fail because the request tries to add a REGULAR rule (the default rule type) with the specified ID, which does not exist.  For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateWebACL(params: UpdateWebACLRequest): awsDashSdkLib.libRequestMod.Request[UpdateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes ActivatedRule objects in a WebACL. Each Rule identifies web requests that you want to allow, block, or count. When you update a WebACL, you specify the following values:   A default action for the WebACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the Rules in a WebACL.   The Rules that you want to add or delete. If you want to replace one Rule with another, you delete the existing Rule and add the new one.   For each Rule, whether you want AWS WAF to allow requests, block requests, or count requests that match the conditions in the Rule.   The order in which you want AWS WAF to evaluate the Rules in a WebACL. If you add more than one Rule to a WebACL, AWS WAF evaluates each request against the Rules in order based on the value of Priority. (The Rule that has the lowest value for Priority is evaluated first.) When a web request matches all the predicates (such as ByteMatchSets and IPSets) in a Rule, AWS WAF immediately takes the corresponding action, allow or block, and doesn't evaluate the request against the remaining Rules in the WebACL, if any.    To create and configure a WebACL, perform the following steps:   Create and update the predicates that you want to include in Rules. For more information, see CreateByteMatchSet, UpdateByteMatchSet, CreateIPSet, UpdateIPSet, CreateSqlInjectionMatchSet, and UpdateSqlInjectionMatchSet.   Create and update the Rules that you want to include in the WebACL. For more information, see CreateRule and UpdateRule.   Create a WebACL. See CreateWebACL.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateWebACL request.   Submit an UpdateWebACL request to specify the Rules that you want to include in the WebACL, to specify the default action, and to associate the WebACL with a CloudFront distribution.  The ActivatedRule can be a rule group. If you specify a rule group as your ActivatedRule, you can exclude specific rules from that rule group. If you already have a rule group associated with a web ACL and want to submit an UpdateWebACL request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the re-insert it again, specifying the excluded rules. For details, see ActivatedRule$ExcludedRules.    Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating the rule, the UpdateWebACL request will fail because the request tries to add a REGULAR rule (the default rule type) with the specified ID, which does not exist.  For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateWebACL(
      params: UpdateWebACLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateWebACLResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateWebACLResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet. For each XssMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change an XssMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks. You can only specify a single type of TextTransformation.   You use XssMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body and you want to block the requests, you can create an XssMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure an XssMatchSet, perform the following steps:   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateXssMatchSet(): awsDashSdkLib.libRequestMod.Request[UpdateXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet. For each XssMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change an XssMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks. You can only specify a single type of TextTransformation.   You use XssMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body and you want to block the requests, you can create an XssMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure an XssMatchSet, perform the following steps:   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateXssMatchSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateXssMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet. For each XssMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change an XssMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks. You can only specify a single type of TextTransformation.   You use XssMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body and you want to block the requests, you can create an XssMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure an XssMatchSet, perform the following steps:   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateXssMatchSet(params: UpdateXssMatchSetRequest): awsDashSdkLib.libRequestMod.Request[UpdateXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Inserts or deletes XssMatchTuple objects (filters) in an XssMatchSet. For each XssMatchTuple object, you specify the following values:    Action: Whether to insert the object into or delete the object from the array. To change an XssMatchTuple, you delete the existing object and add a new one.    FieldToMatch: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to inspect a header or custom query parameter, the name of the header or parameter.    TextTransformation: Which text transformation, if any, to perform on the web request before inspecting the request for cross-site scripting attacks. You can only specify a single type of TextTransformation.   You use XssMatchSet objects to specify which CloudFront requests that you want to allow, block, or count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body and you want to block the requests, you can create an XssMatchSet with the applicable settings, and then configure AWS WAF to block the requests.  To create and configure an XssMatchSet, perform the following steps:   Submit a CreateXssMatchSet request.   Use GetChangeToken to get the change token that you provide in the ChangeToken parameter of an UpdateIPSet request.   Submit an UpdateXssMatchSet request to specify the parts of web requests that you want AWS WAF to inspect for cross-site scripting attacks.   For more information about how to use the AWS WAF API to allow or block HTTP requests, see the AWS WAF Developer Guide.
       */
    def updateXssMatchSet(
      params: UpdateXssMatchSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateXssMatchSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateXssMatchSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateByteMatchSetRequest extends js.Object {
    /**
         * The ByteMatchSetId of the ByteMatchSet that you want to update. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
         */
    var ByteMatchSetId: ResourceId
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * An array of ByteMatchSetUpdate objects that you want to insert into or delete from a ByteMatchSet. For more information, see the applicable data types:    ByteMatchSetUpdate: Contains Action and ByteMatchTuple     ByteMatchTuple: Contains FieldToMatch, PositionalConstraint, TargetString, and TextTransformation     FieldToMatch: Contains Data and Type   
         */
    var Updates: ByteMatchSetUpdates
  }
  
  
  trait UpdateByteMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateByteMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateGeoMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The GeoMatchSetId of the GeoMatchSet that you want to update. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
         */
    var GeoMatchSetId: ResourceId
    /**
         * An array of GeoMatchSetUpdate objects that you want to insert into or delete from an GeoMatchSet. For more information, see the applicable data types:    GeoMatchSetUpdate: Contains Action and GeoMatchConstraint     GeoMatchConstraint: Contains Type and Value  You can have only one Type and Value per GeoMatchConstraint. To add multiple countries, include multiple GeoMatchSetUpdate objects in your request.  
         */
    var Updates: GeoMatchSetUpdates
  }
  
  
  trait UpdateGeoMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateGeoMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateIPSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The IPSetId of the IPSet that you want to update. IPSetId is returned by CreateIPSet and by ListIPSets.
         */
    var IPSetId: ResourceId
    /**
         * An array of IPSetUpdate objects that you want to insert into or delete from an IPSet. For more information, see the applicable data types:    IPSetUpdate: Contains Action and IPSetDescriptor     IPSetDescriptor: Contains Type and Value    You can insert a maximum of 1000 addresses in a single request.
         */
    var Updates: IPSetUpdates
  }
  
  
  trait UpdateIPSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateIPSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateRateBasedRuleRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
         */
    var RateLimit: RateLimit
    /**
         * The RuleId of the RateBasedRule that you want to update. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
         */
    var RuleId: ResourceId
    /**
         * An array of RuleUpdate objects that you want to insert into or delete from a RateBasedRule. 
         */
    var Updates: RuleUpdates
  }
  
  
  trait UpdateRateBasedRuleResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateRegexMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The RegexMatchSetId of the RegexMatchSet that you want to update. RegexMatchSetId is returned by CreateRegexMatchSet and by ListRegexMatchSets.
         */
    var RegexMatchSetId: ResourceId
    /**
         * An array of RegexMatchSetUpdate objects that you want to insert into or delete from a RegexMatchSet. For more information, see RegexMatchTuple.
         */
    var Updates: RegexMatchSetUpdates
  }
  
  
  trait UpdateRegexMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateRegexMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateRegexPatternSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The RegexPatternSetId of the RegexPatternSet that you want to update. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
         */
    var RegexPatternSetId: ResourceId
    /**
         * An array of RegexPatternSetUpdate objects that you want to insert into or delete from a RegexPatternSet.
         */
    var Updates: RegexPatternSetUpdates
  }
  
  
  trait UpdateRegexPatternSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateRegexPatternSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateRuleGroupRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The RuleGroupId of the RuleGroup that you want to update. RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
         */
    var RuleGroupId: ResourceId
    /**
         * An array of RuleGroupUpdate objects that you want to insert into or delete from a RuleGroup. You can only insert REGULAR rules into a rule group.  ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.
         */
    var Updates: RuleGroupUpdates
  }
  
  
  trait UpdateRuleGroupResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateRuleRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The RuleId of the Rule that you want to update. RuleId is returned by CreateRule and by ListRules.
         */
    var RuleId: ResourceId
    /**
         * An array of RuleUpdate objects that you want to insert into or delete from a Rule. For more information, see the applicable data types:    RuleUpdate: Contains Action and Predicate     Predicate: Contains DataId, Negated, and Type     FieldToMatch: Contains Data and Type   
         */
    var Updates: RuleUpdates
  }
  
  
  trait UpdateRuleResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateSizeConstraintSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The SizeConstraintSetId of the SizeConstraintSet that you want to update. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
         */
    var SizeConstraintSetId: ResourceId
    /**
         * An array of SizeConstraintSetUpdate objects that you want to insert into or delete from a SizeConstraintSet. For more information, see the applicable data types:    SizeConstraintSetUpdate: Contains Action and SizeConstraint     SizeConstraint: Contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
         */
    var Updates: SizeConstraintSetUpdates
  }
  
  
  trait UpdateSizeConstraintSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateSqlInjectionMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * The SqlInjectionMatchSetId of the SqlInjectionMatchSet that you want to update. SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
         */
    var SqlInjectionMatchSetId: ResourceId
    /**
         * An array of SqlInjectionMatchSetUpdate objects that you want to insert into or delete from a SqlInjectionMatchSet. For more information, see the applicable data types:    SqlInjectionMatchSetUpdate: Contains Action and SqlInjectionMatchTuple     SqlInjectionMatchTuple: Contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
         */
    var Updates: SqlInjectionMatchSetUpdates
  }
  
  
  trait UpdateSqlInjectionMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateWebACLRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the rules in a web ACL.
         */
    var DefaultAction: js.UndefOr[WafAction] = js.undefined
    /**
         * An array of updates to make to the WebACL. An array of WebACLUpdate objects that you want to insert into or delete from a WebACL. For more information, see the applicable data types:    WebACLUpdate: Contains Action and ActivatedRule     ActivatedRule: Contains Action, OverrideAction, Priority, RuleId, and Type. ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case, you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.     WafAction: Contains Type   
         */
    var Updates: js.UndefOr[WebACLUpdates] = js.undefined
    /**
         * The WebACLId of the WebACL that you want to update. WebACLId is returned by CreateWebACL and by ListWebACLs.
         */
    var WebACLId: ResourceId
  }
  
  
  trait UpdateWebACLResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateWebACL request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait UpdateXssMatchSetRequest extends js.Object {
    /**
         * The value returned by the most recent call to GetChangeToken.
         */
    var ChangeToken: ChangeToken
    /**
         * An array of XssMatchSetUpdate objects that you want to insert into or delete from an XssMatchSet. For more information, see the applicable data types:    XssMatchSetUpdate: Contains Action and XssMatchTuple     XssMatchTuple: Contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
         */
    var Updates: XssMatchSetUpdates
    /**
         * The XssMatchSetId of the XssMatchSet that you want to update. XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
         */
    var XssMatchSetId: ResourceId
  }
  
  
  trait UpdateXssMatchSetResponse extends js.Object {
    /**
         * The ChangeToken that you used to submit the UpdateXssMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
         */
    var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  }
  
  
  trait WafAction extends js.Object {
    /**
         * Specifies how you want AWS WAF to respond to requests that match the settings in a Rule. Valid settings include the following:    ALLOW: AWS WAF allows requests    BLOCK: AWS WAF blocks requests    COUNT: AWS WAF increments a counter of the requests that match all of the conditions in the rule. AWS WAF then continues to inspect the web request based on the remaining rules in the web ACL. You can't specify COUNT for the default action for a WebACL.  
         */
    var Type: WafActionType
  }
  
  
  trait WafOverrideAction extends js.Object {
    /**
         *  COUNT overrides the action specified by the individual rule within a RuleGroup . If set to NONE, the rule's action will take place.
         */
    var Type: WafOverrideActionType
  }
  
  
  trait WebACL extends js.Object {
    /**
         * The action to perform if none of the Rules contained in the WebACL match. The action is specified by the WafAction object.
         */
    var DefaultAction: WafAction
    /**
         * A friendly name or description for the metrics for this WebACL. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change MetricName after you create the WebACL.
         */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
         * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * An array that contains the action for each Rule in a WebACL, the priority of the Rule, and the ID of the Rule.
         */
    var Rules: ActivatedRules
    /**
         * Tha Amazon Resource Name (ARN) of the web ACL.
         */
    var WebACLArn: js.UndefOr[ResourceArn] = js.undefined
    /**
         * A unique identifier for a WebACL. You use WebACLId to get information about a WebACL (see GetWebACL), update a WebACL (see UpdateWebACL), and delete a WebACL from AWS WAF (see DeleteWebACL).  WebACLId is returned by CreateWebACL and by ListWebACLs.
         */
    var WebACLId: ResourceId
  }
  
  
  trait WebACLSummary extends js.Object {
    /**
         * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
         */
    var Name: ResourceName
    /**
         * A unique identifier for a WebACL. You use WebACLId to get information about a WebACL (see GetWebACL), update a WebACL (see UpdateWebACL), and delete a WebACL from AWS WAF (see DeleteWebACL).  WebACLId is returned by CreateWebACL and by ListWebACLs.
         */
    var WebACLId: ResourceId
  }
  
  
  trait WebACLUpdate extends js.Object {
    /**
         * Specifies whether to insert a Rule into or delete a Rule from a WebACL.
         */
    var Action: ChangeAction
    /**
         * The ActivatedRule object in an UpdateWebACL request specifies a Rule that you want to insert or delete, the priority of the Rule in the WebACL, and the action that you want AWS WAF to take when a web request matches the Rule (ALLOW, BLOCK, or COUNT).
         */
    var ActivatedRule: ActivatedRule
  }
  
  
  trait XssMatchSet extends js.Object {
    /**
         * The name, if any, of the XssMatchSet.
         */
    var Name: js.UndefOr[ResourceName] = js.undefined
    /**
         * A unique identifier for an XssMatchSet. You use XssMatchSetId to get information about an XssMatchSet (see GetXssMatchSet), update an XssMatchSet (see UpdateXssMatchSet), insert an XssMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete an XssMatchSet from AWS WAF (see DeleteXssMatchSet).  XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
         */
    var XssMatchSetId: ResourceId
    /**
         * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
         */
    var XssMatchTuples: XssMatchTuples
  }
  
  
  trait XssMatchSetSummary extends js.Object {
    /**
         * The name of the XssMatchSet, if any, specified by Id.
         */
    var Name: ResourceName
    /**
         * A unique identifier for an XssMatchSet. You use XssMatchSetId to get information about a XssMatchSet (see GetXssMatchSet), update an XssMatchSet (see UpdateXssMatchSet), insert an XssMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete an XssMatchSet from AWS WAF (see DeleteXssMatchSet).  XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
         */
    var XssMatchSetId: ResourceId
  }
  
  
  trait XssMatchSetUpdate extends js.Object {
    /**
         * Specify INSERT to add an XssMatchSetUpdate to an XssMatchSet. Use DELETE to remove an XssMatchSetUpdate from an XssMatchSet.
         */
    var Action: ChangeAction
    /**
         * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header.
         */
    var XssMatchTuple: XssMatchTuple
  }
  
  
  trait XssMatchTuple extends js.Object {
    /**
         * Specifies where in a web request to look for cross-site scripting attacks.
         */
    var FieldToMatch: FieldToMatch
    /**
         * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass AWS WAF. If you specify a transformation, AWS WAF performs the transformation on FieldToMatch before inspecting a request for a match. You can only specify a single type of TextTransformation.  CMD_LINE  When you're concerned that attackers are injecting an operating system command line command and using unusual formatting to disguise some or all of the command, use this option to perform the following transformations:   Delete the following characters: \ " ' ^   Delete spaces before the following characters: / (   Replace the following characters with a space: , ;   Replace multiple spaces with one space   Convert uppercase letters (A-Z) to lowercase (a-z)    COMPRESS_WHITE_SPACE  Use this option to replace the following characters with a space character (decimal 32):   \f, formfeed, decimal 12   \t, tab, decimal 9   \n, newline, decimal 10   \r, carriage return, decimal 13   \v, vertical tab, decimal 11   non-breaking space, decimal 160    COMPRESS_WHITE_SPACE also replaces multiple spaces with one space.  HTML_ENTITY_DECODE  Use this option to replace HTML-encoded characters with unencoded characters. HTML_ENTITY_DECODE performs the following operations:   Replaces (ampersand)quot; with "    Replaces (ampersand)nbsp; with a non-breaking space, decimal 160   Replaces (ampersand)lt; with a "less than" symbol   Replaces (ampersand)gt; with &gt;    Replaces characters that are represented in hexadecimal format, (ampersand)#xhhhh;, with the corresponding characters   Replaces characters that are represented in decimal format, (ampersand)#nnnn;, with the corresponding characters    LOWERCASE  Use this option to convert uppercase letters (A-Z) to lowercase (a-z).  URL_DECODE  Use this option to decode a URL-encoded value.  NONE  Specify NONE if you don't want to perform any text transformations.
         */
    var TextTransformation: TextTransformation
  }
  
  val TypesNs: this.type = js.native
  type Action = java.lang.String
  type ActivatedRules = js.Array[ActivatedRule]
  type ByteMatchSetSummaries = js.Array[ByteMatchSetSummary]
  type ByteMatchSetUpdates = js.Array[ByteMatchSetUpdate]
  type ByteMatchTargetString = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsWafregionalMod.Blob | java.lang.String
  type ByteMatchTuples = js.Array[ByteMatchTuple]
  type ChangeAction = awsDashSdkLib.awsDashSdkLibStrings.INSERT | awsDashSdkLib.awsDashSdkLibStrings.DELETE | java.lang.String
  type ChangeToken = java.lang.String
  type ChangeTokenStatus = awsDashSdkLib.awsDashSdkLibStrings.PROVISIONED | awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.INSYNC | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComparisonOperator = awsDashSdkLib.awsDashSdkLibStrings.EQ | awsDashSdkLib.awsDashSdkLibStrings.NE | awsDashSdkLib.awsDashSdkLibStrings.LE | awsDashSdkLib.awsDashSdkLibStrings.LT | awsDashSdkLib.awsDashSdkLibStrings.GE | awsDashSdkLib.awsDashSdkLibStrings.GT | java.lang.String
  type Country = java.lang.String
  type ExcludedRules = js.Array[ExcludedRule]
  type GeoMatchConstraintType = awsDashSdkLib.awsDashSdkLibStrings.Country | java.lang.String
  type GeoMatchConstraintValue = /* LimitUnionLength: was union type with length 250 */js.Any
  type GeoMatchConstraints = js.Array[GeoMatchConstraint]
  type GeoMatchSetSummaries = js.Array[GeoMatchSetSummary]
  type GeoMatchSetUpdates = js.Array[GeoMatchSetUpdate]
  type GetSampledRequestsMaxItems = scala.Double
  type HTTPHeaders = js.Array[HTTPHeader]
  type HTTPMethod = java.lang.String
  type HTTPVersion = java.lang.String
  type HeaderName = java.lang.String
  type HeaderValue = java.lang.String
  type IPSetDescriptorType = awsDashSdkLib.awsDashSdkLibStrings.IPV4 | awsDashSdkLib.awsDashSdkLibStrings.IPV6 | java.lang.String
  type IPSetDescriptorValue = java.lang.String
  type IPSetDescriptors = js.Array[IPSetDescriptor]
  type IPSetSummaries = js.Array[IPSetSummary]
  type IPSetUpdates = js.Array[IPSetUpdate]
  type IPString = java.lang.String
  type LogDestinationConfigs = js.Array[ResourceArn]
  type LoggingConfigurations = js.Array[LoggingConfiguration]
  type ManagedKey = java.lang.String
  type ManagedKeys = js.Array[ManagedKey]
  type MatchFieldData = java.lang.String
  type MatchFieldType = awsDashSdkLib.awsDashSdkLibStrings.URI | awsDashSdkLib.awsDashSdkLibStrings.QUERY_STRING | awsDashSdkLib.awsDashSdkLibStrings.HEADER | awsDashSdkLib.awsDashSdkLibStrings.METHOD | awsDashSdkLib.awsDashSdkLibStrings.BODY | awsDashSdkLib.awsDashSdkLibStrings.SINGLE_QUERY_ARG | awsDashSdkLib.awsDashSdkLibStrings.ALL_QUERY_ARGS | java.lang.String
  type MetricName = java.lang.String
  type Negated = scala.Boolean
  type NextMarker = java.lang.String
  type PaginationLimit = scala.Double
  type PolicyString = java.lang.String
  type PopulationSize = scala.Double
  type PositionalConstraint = awsDashSdkLib.awsDashSdkLibStrings.EXACTLY | awsDashSdkLib.awsDashSdkLibStrings.STARTS_WITH | awsDashSdkLib.awsDashSdkLibStrings.ENDS_WITH | awsDashSdkLib.awsDashSdkLibStrings.CONTAINS | awsDashSdkLib.awsDashSdkLibStrings.CONTAINS_WORD | java.lang.String
  type PredicateType = awsDashSdkLib.awsDashSdkLibStrings.IPMatch | awsDashSdkLib.awsDashSdkLibStrings.ByteMatch | awsDashSdkLib.awsDashSdkLibStrings.SqlInjectionMatch | awsDashSdkLib.awsDashSdkLibStrings.GeoMatch | awsDashSdkLib.awsDashSdkLibStrings.SizeConstraint | awsDashSdkLib.awsDashSdkLibStrings.XssMatch | awsDashSdkLib.awsDashSdkLibStrings.RegexMatch | java.lang.String
  type Predicates = js.Array[Predicate]
  type RateKey = awsDashSdkLib.awsDashSdkLibStrings.IP | java.lang.String
  type RateLimit = scala.Double
  type RedactedFields = js.Array[FieldToMatch]
  type RegexMatchSetSummaries = js.Array[RegexMatchSetSummary]
  type RegexMatchSetUpdates = js.Array[RegexMatchSetUpdate]
  type RegexMatchTuples = js.Array[RegexMatchTuple]
  type RegexPatternSetSummaries = js.Array[RegexPatternSetSummary]
  type RegexPatternSetUpdates = js.Array[RegexPatternSetUpdate]
  type RegexPatternString = java.lang.String
  type RegexPatternStrings = js.Array[RegexPatternString]
  type ResourceArn = java.lang.String
  type ResourceArns = js.Array[ResourceArn]
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type ResourceType = awsDashSdkLib.awsDashSdkLibStrings.APPLICATION_LOAD_BALANCER | awsDashSdkLib.awsDashSdkLibStrings.API_GATEWAY | java.lang.String
  type RuleGroupSummaries = js.Array[RuleGroupSummary]
  type RuleGroupUpdates = js.Array[RuleGroupUpdate]
  type RulePriority = scala.Double
  type RuleSummaries = js.Array[RuleSummary]
  type RuleUpdates = js.Array[RuleUpdate]
  type SampleWeight = scala.Double
  type SampledHTTPRequests = js.Array[SampledHTTPRequest]
  type Size = scala.Double
  type SizeConstraintSetSummaries = js.Array[SizeConstraintSetSummary]
  type SizeConstraintSetUpdates = js.Array[SizeConstraintSetUpdate]
  type SizeConstraints = js.Array[SizeConstraint]
  type SqlInjectionMatchSetSummaries = js.Array[SqlInjectionMatchSetSummary]
  type SqlInjectionMatchSetUpdates = js.Array[SqlInjectionMatchSetUpdate]
  type SqlInjectionMatchTuples = js.Array[SqlInjectionMatchTuple]
  type SubscribedRuleGroupSummaries = js.Array[SubscribedRuleGroupSummary]
  type TextTransformation = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.COMPRESS_WHITE_SPACE | awsDashSdkLib.awsDashSdkLibStrings.HTML_ENTITY_DECODE | awsDashSdkLib.awsDashSdkLibStrings.LOWERCASE | awsDashSdkLib.awsDashSdkLibStrings.CMD_LINE | awsDashSdkLib.awsDashSdkLibStrings.URL_DECODE | java.lang.String
  type Timestamp = stdLib.Date
  type URIString = java.lang.String
  type WafActionType = awsDashSdkLib.awsDashSdkLibStrings.BLOCK | awsDashSdkLib.awsDashSdkLibStrings.ALLOW | awsDashSdkLib.awsDashSdkLibStrings.COUNT | java.lang.String
  type WafOverrideActionType = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.COUNT | java.lang.String
  type WafRuleType = awsDashSdkLib.awsDashSdkLibStrings.REGULAR | awsDashSdkLib.awsDashSdkLibStrings.RATE_BASED | awsDashSdkLib.awsDashSdkLibStrings.GROUP | java.lang.String
  type WebACLSummaries = js.Array[WebACLSummary]
  type WebACLUpdates = js.Array[WebACLUpdate]
  type XssMatchSetSummaries = js.Array[XssMatchSetSummary]
  type XssMatchSetUpdates = js.Array[XssMatchSetUpdate]
  type XssMatchTuples = js.Array[XssMatchTuple]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-11-28` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

