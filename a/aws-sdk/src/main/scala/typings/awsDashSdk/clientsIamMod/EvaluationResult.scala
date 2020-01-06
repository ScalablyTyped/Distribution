package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResult extends js.Object {
  /**
    * The name of the API operation tested on the indicated resource.
    */
  var EvalActionName: ActionNameType = js.native
  /**
    * The result of the simulation.
    */
  var EvalDecision: PolicyEvaluationDecisionType = js.native
  /**
    * Additional details about the results of the evaluation decision. When there are both IAM policies and resource policies, this parameter explains how each set of policies contributes to the final evaluation decision. When simulating cross-account access to a resource, both the resource-based policy and the caller's IAM policy must grant access. See How IAM Roles Differ from Resource-based Policies 
    */
  var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.native
  /**
    * The ARN of the resource that the indicated API operation was tested on.
    */
  var EvalResourceName: js.UndefOr[ResourceNameType] = js.native
  /**
    * A list of the statements in the input policies that determine the result for this scenario. Remember that even if multiple statements allow the operation on the resource, if only one statement denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry included in the result.
    */
  var MatchedStatements: js.UndefOr[StatementListType] = js.native
  /**
    * A list of context keys that are required by the included input policies but that were not provided by one of the input parameters. This list is used when the resource in a simulation is "*", either explicitly, or when the ResourceArns parameter blank. If you include a list of resources, then any missing context values are instead included under the ResourceSpecificResults section. To discover the context keys used by a set of policies, you can call GetContextKeysForCustomPolicy or GetContextKeysForPrincipalPolicy.
    */
  var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.native
  /**
    * A structure that details how Organizations and its service control policies affect the results of the simulation. Only applies if the simulated user's account is part of an organization.
    */
  var OrganizationsDecisionDetail: js.UndefOr[typings.awsDashSdk.clientsIamMod.OrganizationsDecisionDetail] = js.native
  /**
    * The individual results of the simulation of the API operation specified in EvalActionName on each resource.
    */
  var ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType] = js.native
}

object EvaluationResult {
  @scala.inline
  def apply(
    EvalActionName: ActionNameType,
    EvalDecision: PolicyEvaluationDecisionType,
    EvalDecisionDetails: EvalDecisionDetailsType = null,
    EvalResourceName: ResourceNameType = null,
    MatchedStatements: StatementListType = null,
    MissingContextValues: ContextKeyNamesResultListType = null,
    OrganizationsDecisionDetail: OrganizationsDecisionDetail = null,
    ResourceSpecificResults: ResourceSpecificResultListType = null
  ): EvaluationResult = {
    val __obj = js.Dynamic.literal(EvalActionName = EvalActionName.asInstanceOf[js.Any], EvalDecision = EvalDecision.asInstanceOf[js.Any])
    if (EvalDecisionDetails != null) __obj.updateDynamic("EvalDecisionDetails")(EvalDecisionDetails.asInstanceOf[js.Any])
    if (EvalResourceName != null) __obj.updateDynamic("EvalResourceName")(EvalResourceName.asInstanceOf[js.Any])
    if (MatchedStatements != null) __obj.updateDynamic("MatchedStatements")(MatchedStatements.asInstanceOf[js.Any])
    if (MissingContextValues != null) __obj.updateDynamic("MissingContextValues")(MissingContextValues.asInstanceOf[js.Any])
    if (OrganizationsDecisionDetail != null) __obj.updateDynamic("OrganizationsDecisionDetail")(OrganizationsDecisionDetail.asInstanceOf[js.Any])
    if (ResourceSpecificResults != null) __obj.updateDynamic("ResourceSpecificResults")(ResourceSpecificResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResult]
  }
}

