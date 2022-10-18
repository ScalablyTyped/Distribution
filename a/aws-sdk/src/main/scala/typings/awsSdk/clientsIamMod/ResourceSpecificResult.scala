package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSpecificResult extends StObject {
  
  /**
    * Additional details about the results of the evaluation decision on a single resource. This parameter is returned only for cross-account simulations. This parameter explains how each policy type contributes to the resource-specific evaluation decision.
    */
  var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined
  
  /**
    * The result of the simulation of the simulated API operation on the resource specified in EvalResourceName.
    */
  var EvalResourceDecision: PolicyEvaluationDecisionType
  
  /**
    * The name of the simulated resource, in Amazon Resource Name (ARN) format.
    */
  var EvalResourceName: ResourceNameType
  
  /**
    * A list of the statements in the input policies that determine the result for this part of the simulation. Remember that even if multiple statements allow the operation on the resource, if any statement denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry included in the result.
    */
  var MatchedStatements: js.UndefOr[StatementListType] = js.undefined
  
  /**
    * A list of context keys that are required by the included input policies but that were not provided by one of the input parameters. This list is used when a list of ARNs is included in the ResourceArns parameter instead of "*". If you do not specify individual resources, by setting ResourceArns to "*" or by not including the ResourceArns parameter, then any missing context values are instead included under the EvaluationResults section. To discover the context keys used by a set of policies, you can call GetContextKeysForCustomPolicy or GetContextKeysForPrincipalPolicy.
    */
  var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
  
  /**
    * Contains information about the effect that a permissions boundary has on a policy simulation when that boundary is applied to an IAM entity.
    */
  var PermissionsBoundaryDecisionDetail: js.UndefOr[typings.awsSdk.clientsIamMod.PermissionsBoundaryDecisionDetail] = js.undefined
}
object ResourceSpecificResult {
  
  inline def apply(EvalResourceDecision: PolicyEvaluationDecisionType, EvalResourceName: ResourceNameType): ResourceSpecificResult = {
    val __obj = js.Dynamic.literal(EvalResourceDecision = EvalResourceDecision.asInstanceOf[js.Any], EvalResourceName = EvalResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSpecificResult]
  }
  
  extension [Self <: ResourceSpecificResult](x: Self) {
    
    inline def setEvalDecisionDetails(value: EvalDecisionDetailsType): Self = StObject.set(x, "EvalDecisionDetails", value.asInstanceOf[js.Any])
    
    inline def setEvalDecisionDetailsUndefined: Self = StObject.set(x, "EvalDecisionDetails", js.undefined)
    
    inline def setEvalResourceDecision(value: PolicyEvaluationDecisionType): Self = StObject.set(x, "EvalResourceDecision", value.asInstanceOf[js.Any])
    
    inline def setEvalResourceName(value: ResourceNameType): Self = StObject.set(x, "EvalResourceName", value.asInstanceOf[js.Any])
    
    inline def setMatchedStatements(value: StatementListType): Self = StObject.set(x, "MatchedStatements", value.asInstanceOf[js.Any])
    
    inline def setMatchedStatementsUndefined: Self = StObject.set(x, "MatchedStatements", js.undefined)
    
    inline def setMatchedStatementsVarargs(value: Statement*): Self = StObject.set(x, "MatchedStatements", js.Array(value*))
    
    inline def setMissingContextValues(value: ContextKeyNamesResultListType): Self = StObject.set(x, "MissingContextValues", value.asInstanceOf[js.Any])
    
    inline def setMissingContextValuesUndefined: Self = StObject.set(x, "MissingContextValues", js.undefined)
    
    inline def setMissingContextValuesVarargs(value: ContextKeyNameType*): Self = StObject.set(x, "MissingContextValues", js.Array(value*))
    
    inline def setPermissionsBoundaryDecisionDetail(value: PermissionsBoundaryDecisionDetail): Self = StObject.set(x, "PermissionsBoundaryDecisionDetail", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryDecisionDetailUndefined: Self = StObject.set(x, "PermissionsBoundaryDecisionDetail", js.undefined)
  }
}
