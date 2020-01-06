package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRule extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the resolver rule specified by Id.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Arn] = js.native
  /**
    * A unique string that you specified when you created the resolver rule. CreatorRequestIdidentifies the request and allows failed requests to be retried without the risk of executing the operation twice. 
    */
  var CreatorRequestId: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.CreatorRequestId] = js.native
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps. If a query matches multiple resolver rules (example.com and www.example.com), the query is routed using the resolver rule that contains the most specific domain name (www.example.com).
    */
  var DomainName: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.DomainName] = js.native
  /**
    * The ID that Resolver assigned to the resolver rule when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The name for the resolver rule, which you specified when you created the resolver rule.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Name] = js.native
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  var OwnerId: js.UndefOr[AccountId] = js.native
  /**
    * The ID of the endpoint that the rule is associated with.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.native
  /**
    * This value is always FORWARD. Other resolver rule types aren't supported.
    */
  var RuleType: js.UndefOr[RuleTypeOption] = js.native
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    */
  var ShareStatus: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.ShareStatus] = js.native
  /**
    * A code that specifies the current status of the resolver rule.
    */
  var Status: js.UndefOr[ResolverRuleStatus] = js.native
  /**
    * A detailed description of the status of a resolver rule.
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.StatusMessage] = js.native
  /**
    * An array that contains the IP addresses and ports that you want to forward 
    */
  var TargetIps: js.UndefOr[TargetList] = js.native
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
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (ResolverEndpointId != null) __obj.updateDynamic("ResolverEndpointId")(ResolverEndpointId.asInstanceOf[js.Any])
    if (RuleType != null) __obj.updateDynamic("RuleType")(RuleType.asInstanceOf[js.Any])
    if (ShareStatus != null) __obj.updateDynamic("ShareStatus")(ShareStatus.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (TargetIps != null) __obj.updateDynamic("TargetIps")(TargetIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRule]
  }
}

