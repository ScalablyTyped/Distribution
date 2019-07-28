package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverRuleAssociation extends js.Object {
  /**
    * The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit an AssociateResolverRule request.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  /**
    * The name of an association between a resolver rule and a VPC.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Name] = js.undefined
  /**
    * The ID of the resolver rule that you associated with the VPC that is specified by VPCId.
    */
  var ResolverRuleId: js.UndefOr[ResourceId] = js.undefined
  /**
    * A code that specifies the current status of the association between a resolver rule and a VPC.
    */
  var Status: js.UndefOr[ResolverRuleAssociationStatus] = js.undefined
  /**
    * A detailed description of the status of the association between a resolver rule and a VPC.
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.StatusMessage] = js.undefined
  /**
    * The ID of the VPC that you associated the resolver rule with.
    */
  var VPCId: js.UndefOr[ResourceId] = js.undefined
}

object ResolverRuleAssociation {
  @scala.inline
  def apply(
    Id: ResourceId = null,
    Name: Name = null,
    ResolverRuleId: ResourceId = null,
    Status: ResolverRuleAssociationStatus = null,
    StatusMessage: StatusMessage = null,
    VPCId: ResourceId = null
  ): ResolverRuleAssociation = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ResolverRuleId != null) __obj.updateDynamic("ResolverRuleId")(ResolverRuleId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (VPCId != null) __obj.updateDynamic("VPCId")(VPCId)
    __obj.asInstanceOf[ResolverRuleAssociation]
  }
}

