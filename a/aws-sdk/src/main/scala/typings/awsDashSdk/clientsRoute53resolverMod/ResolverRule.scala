package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverRule extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the resolver rule specified by Id.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Arn] = js.undefined
  /**
    * A unique string that you specified when you created the resolver rule. CreatorRequestIdidentifies the request and allows failed requests to be retried without the risk of executing the operation twice. 
    */
  var CreatorRequestId: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.CreatorRequestId] = js.undefined
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps. If a query matches multiple resolver rules (example.com and www.example.com), the query is routed using the resolver rule that contains the most specific domain name (www.example.com).
    */
  var DomainName: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.DomainName] = js.undefined
  /**
    * The ID that Resolver assigned to the resolver rule when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  /**
    * The name for the resolver rule, which you specified when you created the resolver rule.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Name] = js.undefined
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  var OwnerId: js.UndefOr[AccountId] = js.undefined
  /**
    * The ID of the endpoint that the rule is associated with.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined
  /**
    * This value is always FORWARD. Other resolver rule types aren't supported.
    */
  var RuleType: js.UndefOr[RuleTypeOption] = js.undefined
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    */
  var ShareStatus: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ShareStatus] = js.undefined
  /**
    * A code that specifies the current status of the resolver rule.
    */
  var Status: js.UndefOr[ResolverRuleStatus] = js.undefined
  /**
    * A detailed description of the status of a resolver rule.
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.StatusMessage] = js.undefined
  /**
    * An array that contains the IP addresses and ports that you want to forward 
    */
  var TargetIps: js.UndefOr[TargetList] = js.undefined
}

object ResolverRule {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreatorRequestId: CreatorRequestId = null,
    DomainName: DomainName = null,
    Id: ResourceId = null,
    Name: Name = null,
    OwnerId: AccountId = null,
    ResolverEndpointId: ResourceId = null,
    RuleType: RuleTypeOption = null,
    ShareStatus: ShareStatus = null,
    Status: ResolverRuleStatus = null,
    StatusMessage: StatusMessage = null,
    TargetIps: TargetList = null
  ): ResolverRule = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (ResolverEndpointId != null) __obj.updateDynamic("ResolverEndpointId")(ResolverEndpointId)
    if (RuleType != null) __obj.updateDynamic("RuleType")(RuleType.asInstanceOf[js.Any])
    if (ShareStatus != null) __obj.updateDynamic("ShareStatus")(ShareStatus.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (TargetIps != null) __obj.updateDynamic("TargetIps")(TargetIps)
    __obj.asInstanceOf[ResolverRule]
  }
}

