package typings.awsDashSdk.clientsConfigserviceMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigService extends Service {
  @JSName("config")
  var config_ConfigService: ConfigBase with ClientConfiguration = js.native
  /**
    * Returns the current configuration items for resources that are present in your AWS Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
    */
  def batchGetAggregateResourceConfig(): Request[BatchGetAggregateResourceConfigResponse, AWSError] = js.native
  def batchGetAggregateResourceConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetAggregateResourceConfigResponse, Unit]
  ): Request[BatchGetAggregateResourceConfigResponse, AWSError] = js.native
  /**
    * Returns the current configuration items for resources that are present in your AWS Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
    */
  def batchGetAggregateResourceConfig(params: BatchGetAggregateResourceConfigRequest): Request[BatchGetAggregateResourceConfigResponse, AWSError] = js.native
  def batchGetAggregateResourceConfig(
    params: BatchGetAggregateResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetAggregateResourceConfigResponse, Unit]
  ): Request[BatchGetAggregateResourceConfigResponse, AWSError] = js.native
  /**
    * Returns the current configuration for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
    */
  def batchGetResourceConfig(): Request[BatchGetResourceConfigResponse, AWSError] = js.native
  def batchGetResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetResourceConfigResponse, Unit]): Request[BatchGetResourceConfigResponse, AWSError] = js.native
  /**
    * Returns the current configuration for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
    */
  def batchGetResourceConfig(params: BatchGetResourceConfigRequest): Request[BatchGetResourceConfigResponse, AWSError] = js.native
  def batchGetResourceConfig(
    params: BatchGetResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetResourceConfigResponse, Unit]
  ): Request[BatchGetResourceConfigResponse, AWSError] = js.native
  /**
    * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
    */
  def deleteAggregationAuthorization(): Request[js.Object, AWSError] = js.native
  def deleteAggregationAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
    */
  def deleteAggregationAuthorization(params: DeleteAggregationAuthorizationRequest): Request[js.Object, AWSError] = js.native
  def deleteAggregationAuthorization(
    params: DeleteAggregationAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified AWS Config rule and all of its evaluation results. AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
    */
  def deleteConfigRule(): Request[js.Object, AWSError] = js.native
  def deleteConfigRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified AWS Config rule and all of its evaluation results. AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
    */
  def deleteConfigRule(params: DeleteConfigRuleRequest): Request[js.Object, AWSError] = js.native
  def deleteConfigRule(
    params: DeleteConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
    */
  def deleteConfigurationAggregator(): Request[js.Object, AWSError] = js.native
  def deleteConfigurationAggregator(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
    */
  def deleteConfigurationAggregator(params: DeleteConfigurationAggregatorRequest): Request[js.Object, AWSError] = js.native
  def deleteConfigurationAggregator(
    params: DeleteConfigurationAggregatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the configuration recorder. After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the AWS Config console until you create a new configuration recorder.
    */
  def deleteConfigurationRecorder(): Request[js.Object, AWSError] = js.native
  def deleteConfigurationRecorder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the configuration recorder. After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the AWS Config console until you create a new configuration recorder.
    */
  def deleteConfigurationRecorder(params: DeleteConfigurationRecorderRequest): Request[js.Object, AWSError] = js.native
  def deleteConfigurationRecorder(
    params: DeleteConfigurationRecorderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified conformance pack and all the AWS Config rules, remediation actions, and all evaluation results within that conformance pack. AWS Config sets the conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a conformance pack while it is in this state.
    */
  def deleteConformancePack(): Request[js.Object, AWSError] = js.native
  def deleteConformancePack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified conformance pack and all the AWS Config rules, remediation actions, and all evaluation results within that conformance pack. AWS Config sets the conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a conformance pack while it is in this state.
    */
  def deleteConformancePack(params: DeleteConformancePackRequest): Request[js.Object, AWSError] = js.native
  def deleteConformancePack(
    params: DeleteConformancePackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
    */
  def deleteDeliveryChannel(): Request[js.Object, AWSError] = js.native
  def deleteDeliveryChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
    */
  def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest): Request[js.Object, AWSError] = js.native
  def deleteDeliveryChannel(
    params: DeleteDeliveryChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your AWS resources against the rule.
    */
  def deleteEvaluationResults(): Request[DeleteEvaluationResultsResponse, AWSError] = js.native
  def deleteEvaluationResults(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEvaluationResultsResponse, Unit]): Request[DeleteEvaluationResultsResponse, AWSError] = js.native
  /**
    * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your AWS resources against the rule.
    */
  def deleteEvaluationResults(params: DeleteEvaluationResultsRequest): Request[DeleteEvaluationResultsResponse, AWSError] = js.native
  def deleteEvaluationResults(
    params: DeleteEvaluationResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEvaluationResultsResponse, Unit]
  ): Request[DeleteEvaluationResultsResponse, AWSError] = js.native
  /**
    * Deletes the specified organization config rule and all of its evaluation results from all member accounts in that organization. Only a master account can delete an organization config rule. AWS Config sets the state of a rule to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a rule while it is in this state.
    */
  def deleteOrganizationConfigRule(): Request[js.Object, AWSError] = js.native
  def deleteOrganizationConfigRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified organization config rule and all of its evaluation results from all member accounts in that organization. Only a master account can delete an organization config rule. AWS Config sets the state of a rule to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a rule while it is in this state.
    */
  def deleteOrganizationConfigRule(params: DeleteOrganizationConfigRuleRequest): Request[js.Object, AWSError] = js.native
  def deleteOrganizationConfigRule(
    params: DeleteOrganizationConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified organization conformance pack and all of the config rules and remediation actions from all member accounts in that organization. Only a master account can delete an organization conformance pack. AWS Config sets the state of a conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a conformance pack while it is in this state. 
    */
  def deleteOrganizationConformancePack(): Request[js.Object, AWSError] = js.native
  def deleteOrganizationConformancePack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified organization conformance pack and all of the config rules and remediation actions from all member accounts in that organization. Only a master account can delete an organization conformance pack. AWS Config sets the state of a conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a conformance pack while it is in this state. 
    */
  def deleteOrganizationConformancePack(params: DeleteOrganizationConformancePackRequest): Request[js.Object, AWSError] = js.native
  def deleteOrganizationConformancePack(
    params: DeleteOrganizationConformancePackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes pending authorization requests for a specified aggregator account in a specified region.
    */
  def deletePendingAggregationRequest(): Request[js.Object, AWSError] = js.native
  def deletePendingAggregationRequest(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes pending authorization requests for a specified aggregator account in a specified region.
    */
  def deletePendingAggregationRequest(params: DeletePendingAggregationRequestRequest): Request[js.Object, AWSError] = js.native
  def deletePendingAggregationRequest(
    params: DeletePendingAggregationRequestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the remediation configuration.
    */
  def deleteRemediationConfiguration(): Request[DeleteRemediationConfigurationResponse, AWSError] = js.native
  def deleteRemediationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemediationConfigurationResponse, Unit]
  ): Request[DeleteRemediationConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the remediation configuration.
    */
  def deleteRemediationConfiguration(params: DeleteRemediationConfigurationRequest): Request[DeleteRemediationConfigurationResponse, AWSError] = js.native
  def deleteRemediationConfiguration(
    params: DeleteRemediationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemediationConfigurationResponse, Unit]
  ): Request[DeleteRemediationConfigurationResponse, AWSError] = js.native
  /**
    * Deletes one or more remediation exceptions mentioned in the resource keys.
    */
  def deleteRemediationExceptions(): Request[DeleteRemediationExceptionsResponse, AWSError] = js.native
  def deleteRemediationExceptions(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemediationExceptionsResponse, Unit]): Request[DeleteRemediationExceptionsResponse, AWSError] = js.native
  /**
    * Deletes one or more remediation exceptions mentioned in the resource keys.
    */
  def deleteRemediationExceptions(params: DeleteRemediationExceptionsRequest): Request[DeleteRemediationExceptionsResponse, AWSError] = js.native
  def deleteRemediationExceptions(
    params: DeleteRemediationExceptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemediationExceptionsResponse, Unit]
  ): Request[DeleteRemediationExceptionsResponse, AWSError] = js.native
  /**
    * Records the configuration state for a custom resource that has been deleted. This API records a new ConfigurationItem with a ResourceDeleted status. You can retrieve the ConfigurationItems recorded for this resource in your AWS Config History. 
    */
  def deleteResourceConfig(): Request[js.Object, AWSError] = js.native
  def deleteResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Records the configuration state for a custom resource that has been deleted. This API records a new ConfigurationItem with a ResourceDeleted status. You can retrieve the ConfigurationItems recorded for this resource in your AWS Config History. 
    */
  def deleteResourceConfig(params: DeleteResourceConfigRequest): Request[js.Object, AWSError] = js.native
  def deleteResourceConfig(
    params: DeleteResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the retention configuration.
    */
  def deleteRetentionConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteRetentionConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the retention configuration.
    */
  def deleteRetentionConfiguration(params: DeleteRetentionConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteRetentionConfiguration(
    params: DeleteRetentionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
    */
  def deliverConfigSnapshot(): Request[DeliverConfigSnapshotResponse, AWSError] = js.native
  def deliverConfigSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeliverConfigSnapshotResponse, Unit]): Request[DeliverConfigSnapshotResponse, AWSError] = js.native
  /**
    * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
    */
  def deliverConfigSnapshot(params: DeliverConfigSnapshotRequest): Request[DeliverConfigSnapshotResponse, AWSError] = js.native
  def deliverConfigSnapshot(
    params: DeliverConfigSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeliverConfigSnapshotResponse, Unit]
  ): Request[DeliverConfigSnapshotResponse, AWSError] = js.native
  /**
    * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def describeAggregateComplianceByConfigRules(): Request[DescribeAggregateComplianceByConfigRulesResponse, AWSError] = js.native
  def describeAggregateComplianceByConfigRules(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeAggregateComplianceByConfigRulesResponse, 
      Unit
    ]
  ): Request[DescribeAggregateComplianceByConfigRulesResponse, AWSError] = js.native
  /**
    * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def describeAggregateComplianceByConfigRules(params: DescribeAggregateComplianceByConfigRulesRequest): Request[DescribeAggregateComplianceByConfigRulesResponse, AWSError] = js.native
  def describeAggregateComplianceByConfigRules(
    params: DescribeAggregateComplianceByConfigRulesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeAggregateComplianceByConfigRulesResponse, 
      Unit
    ]
  ): Request[DescribeAggregateComplianceByConfigRulesResponse, AWSError] = js.native
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  def describeAggregationAuthorizations(): Request[DescribeAggregationAuthorizationsResponse, AWSError] = js.native
  def describeAggregationAuthorizations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAggregationAuthorizationsResponse, Unit]
  ): Request[DescribeAggregationAuthorizationsResponse, AWSError] = js.native
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  def describeAggregationAuthorizations(params: DescribeAggregationAuthorizationsRequest): Request[DescribeAggregationAuthorizationsResponse, AWSError] = js.native
  def describeAggregationAuthorizations(
    params: DescribeAggregationAuthorizationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAggregationAuthorizationsResponse, Unit]
  ): Request[DescribeAggregationAuthorizationsResponse, AWSError] = js.native
  /**
    * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns the number of AWS resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If AWS Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByConfigRule(): Request[DescribeComplianceByConfigRuleResponse, AWSError] = js.native
  def describeComplianceByConfigRule(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComplianceByConfigRuleResponse, Unit]
  ): Request[DescribeComplianceByConfigRuleResponse, AWSError] = js.native
  /**
    * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns the number of AWS resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If AWS Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByConfigRule(params: DescribeComplianceByConfigRuleRequest): Request[DescribeComplianceByConfigRuleResponse, AWSError] = js.native
  def describeComplianceByConfigRule(
    params: DescribeComplianceByConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComplianceByConfigRuleResponse, Unit]
  ): Request[DescribeComplianceByConfigRuleResponse, AWSError] = js.native
  /**
    * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns the number of AWS Config rules that the resource does not comply with. A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If AWS Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByResource(): Request[DescribeComplianceByResourceResponse, AWSError] = js.native
  def describeComplianceByResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeComplianceByResourceResponse, Unit]): Request[DescribeComplianceByResourceResponse, AWSError] = js.native
  /**
    * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns the number of AWS Config rules that the resource does not comply with. A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If AWS Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByResource(params: DescribeComplianceByResourceRequest): Request[DescribeComplianceByResourceResponse, AWSError] = js.native
  def describeComplianceByResource(
    params: DescribeComplianceByResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComplianceByResourceResponse, Unit]
  ): Request[DescribeComplianceByResourceResponse, AWSError] = js.native
  /**
    * Returns status information for each of your AWS managed Config rules. The status includes information such as the last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error for the last failure.
    */
  def describeConfigRuleEvaluationStatus(): Request[DescribeConfigRuleEvaluationStatusResponse, AWSError] = js.native
  def describeConfigRuleEvaluationStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigRuleEvaluationStatusResponse, Unit]
  ): Request[DescribeConfigRuleEvaluationStatusResponse, AWSError] = js.native
  /**
    * Returns status information for each of your AWS managed Config rules. The status includes information such as the last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error for the last failure.
    */
  def describeConfigRuleEvaluationStatus(params: DescribeConfigRuleEvaluationStatusRequest): Request[DescribeConfigRuleEvaluationStatusResponse, AWSError] = js.native
  def describeConfigRuleEvaluationStatus(
    params: DescribeConfigRuleEvaluationStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigRuleEvaluationStatusResponse, Unit]
  ): Request[DescribeConfigRuleEvaluationStatusResponse, AWSError] = js.native
  /**
    * Returns details about your AWS Config rules.
    */
  def describeConfigRules(): Request[DescribeConfigRulesResponse, AWSError] = js.native
  def describeConfigRules(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigRulesResponse, Unit]): Request[DescribeConfigRulesResponse, AWSError] = js.native
  /**
    * Returns details about your AWS Config rules.
    */
  def describeConfigRules(params: DescribeConfigRulesRequest): Request[DescribeConfigRulesResponse, AWSError] = js.native
  def describeConfigRules(
    params: DescribeConfigRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigRulesResponse, Unit]
  ): Request[DescribeConfigRulesResponse, AWSError] = js.native
  /**
    * Returns status information for sources within an aggregator. The status includes information about the last time AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the status contains the related error code or message. 
    */
  def describeConfigurationAggregatorSourcesStatus(): Request[DescribeConfigurationAggregatorSourcesStatusResponse, AWSError] = js.native
  def describeConfigurationAggregatorSourcesStatus(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeConfigurationAggregatorSourcesStatusResponse, 
      Unit
    ]
  ): Request[DescribeConfigurationAggregatorSourcesStatusResponse, AWSError] = js.native
  /**
    * Returns status information for sources within an aggregator. The status includes information about the last time AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the status contains the related error code or message. 
    */
  def describeConfigurationAggregatorSourcesStatus(params: DescribeConfigurationAggregatorSourcesStatusRequest): Request[DescribeConfigurationAggregatorSourcesStatusResponse, AWSError] = js.native
  def describeConfigurationAggregatorSourcesStatus(
    params: DescribeConfigurationAggregatorSourcesStatusRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeConfigurationAggregatorSourcesStatusResponse, 
      Unit
    ]
  ): Request[DescribeConfigurationAggregatorSourcesStatusResponse, AWSError] = js.native
  /**
    * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
    */
  def describeConfigurationAggregators(): Request[DescribeConfigurationAggregatorsResponse, AWSError] = js.native
  def describeConfigurationAggregators(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationAggregatorsResponse, Unit]
  ): Request[DescribeConfigurationAggregatorsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
    */
  def describeConfigurationAggregators(params: DescribeConfigurationAggregatorsRequest): Request[DescribeConfigurationAggregatorsResponse, AWSError] = js.native
  def describeConfigurationAggregators(
    params: DescribeConfigurationAggregatorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationAggregatorsResponse, Unit]
  ): Request[DescribeConfigurationAggregatorsResponse, AWSError] = js.native
  /**
    * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorderStatus(): Request[DescribeConfigurationRecorderStatusResponse, AWSError] = js.native
  def describeConfigurationRecorderStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRecorderStatusResponse, Unit]
  ): Request[DescribeConfigurationRecorderStatusResponse, AWSError] = js.native
  /**
    * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorderStatus(params: DescribeConfigurationRecorderStatusRequest): Request[DescribeConfigurationRecorderStatusResponse, AWSError] = js.native
  def describeConfigurationRecorderStatus(
    params: DescribeConfigurationRecorderStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRecorderStatusResponse, Unit]
  ): Request[DescribeConfigurationRecorderStatusResponse, AWSError] = js.native
  /**
    * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorders(): Request[DescribeConfigurationRecordersResponse, AWSError] = js.native
  def describeConfigurationRecorders(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRecordersResponse, Unit]
  ): Request[DescribeConfigurationRecordersResponse, AWSError] = js.native
  /**
    * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorders(params: DescribeConfigurationRecordersRequest): Request[DescribeConfigurationRecordersResponse, AWSError] = js.native
  def describeConfigurationRecorders(
    params: DescribeConfigurationRecordersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRecordersResponse, Unit]
  ): Request[DescribeConfigurationRecordersResponse, AWSError] = js.native
  /**
    * Returns compliance details for each rule in that conformance pack.  You must provide exact rule names. 
    */
  def describeConformancePackCompliance(): Request[DescribeConformancePackComplianceResponse, AWSError] = js.native
  def describeConformancePackCompliance(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePackComplianceResponse, Unit]
  ): Request[DescribeConformancePackComplianceResponse, AWSError] = js.native
  /**
    * Returns compliance details for each rule in that conformance pack.  You must provide exact rule names. 
    */
  def describeConformancePackCompliance(params: DescribeConformancePackComplianceRequest): Request[DescribeConformancePackComplianceResponse, AWSError] = js.native
  def describeConformancePackCompliance(
    params: DescribeConformancePackComplianceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePackComplianceResponse, Unit]
  ): Request[DescribeConformancePackComplianceResponse, AWSError] = js.native
  /**
    * Provides one or more conformance packs deployment status.  If there are no conformance packs then you will see an empty result. 
    */
  def describeConformancePackStatus(): Request[DescribeConformancePackStatusResponse, AWSError] = js.native
  def describeConformancePackStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePackStatusResponse, Unit]): Request[DescribeConformancePackStatusResponse, AWSError] = js.native
  /**
    * Provides one or more conformance packs deployment status.  If there are no conformance packs then you will see an empty result. 
    */
  def describeConformancePackStatus(params: DescribeConformancePackStatusRequest): Request[DescribeConformancePackStatusResponse, AWSError] = js.native
  def describeConformancePackStatus(
    params: DescribeConformancePackStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePackStatusResponse, Unit]
  ): Request[DescribeConformancePackStatusResponse, AWSError] = js.native
  /**
    * Returns a list of one or more conformance packs.
    */
  def describeConformancePacks(): Request[DescribeConformancePacksResponse, AWSError] = js.native
  def describeConformancePacks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePacksResponse, Unit]): Request[DescribeConformancePacksResponse, AWSError] = js.native
  /**
    * Returns a list of one or more conformance packs.
    */
  def describeConformancePacks(params: DescribeConformancePacksRequest): Request[DescribeConformancePacksResponse, AWSError] = js.native
  def describeConformancePacks(
    params: DescribeConformancePacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePacksResponse, Unit]
  ): Request[DescribeConformancePacksResponse, AWSError] = js.native
  /**
    * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannelStatus(): Request[DescribeDeliveryChannelStatusResponse, AWSError] = js.native
  def describeDeliveryChannelStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeliveryChannelStatusResponse, Unit]): Request[DescribeDeliveryChannelStatusResponse, AWSError] = js.native
  /**
    * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannelStatus(params: DescribeDeliveryChannelStatusRequest): Request[DescribeDeliveryChannelStatusResponse, AWSError] = js.native
  def describeDeliveryChannelStatus(
    params: DescribeDeliveryChannelStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeliveryChannelStatusResponse, Unit]
  ): Request[DescribeDeliveryChannelStatusResponse, AWSError] = js.native
  /**
    * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannels(): Request[DescribeDeliveryChannelsResponse, AWSError] = js.native
  def describeDeliveryChannels(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeliveryChannelsResponse, Unit]): Request[DescribeDeliveryChannelsResponse, AWSError] = js.native
  /**
    * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannels(params: DescribeDeliveryChannelsRequest): Request[DescribeDeliveryChannelsResponse, AWSError] = js.native
  def describeDeliveryChannels(
    params: DescribeDeliveryChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeliveryChannelsResponse, Unit]
  ): Request[DescribeDeliveryChannelsResponse, AWSError] = js.native
  /**
    * Provides organization config rule deployment status for an organization.  The status is not considered successful until organization config rule is successfully deployed in all the member accounts with an exception of excluded accounts. When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization config rule names. It is only applicable, when you request all the organization config rules. Only a master account can call this API. 
    */
  def describeOrganizationConfigRuleStatuses(): Request[DescribeOrganizationConfigRuleStatusesResponse, AWSError] = js.native
  def describeOrganizationConfigRuleStatuses(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigRuleStatusesResponse, Unit]
  ): Request[DescribeOrganizationConfigRuleStatusesResponse, AWSError] = js.native
  /**
    * Provides organization config rule deployment status for an organization.  The status is not considered successful until organization config rule is successfully deployed in all the member accounts with an exception of excluded accounts. When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization config rule names. It is only applicable, when you request all the organization config rules. Only a master account can call this API. 
    */
  def describeOrganizationConfigRuleStatuses(params: DescribeOrganizationConfigRuleStatusesRequest): Request[DescribeOrganizationConfigRuleStatusesResponse, AWSError] = js.native
  def describeOrganizationConfigRuleStatuses(
    params: DescribeOrganizationConfigRuleStatusesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigRuleStatusesResponse, Unit]
  ): Request[DescribeOrganizationConfigRuleStatusesResponse, AWSError] = js.native
  /**
    * Returns a list of organization config rules.  When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization config rule names. It is only applicable, when you request all the organization config rules. Only a master account can call this API. 
    */
  def describeOrganizationConfigRules(): Request[DescribeOrganizationConfigRulesResponse, AWSError] = js.native
  def describeOrganizationConfigRules(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigRulesResponse, Unit]
  ): Request[DescribeOrganizationConfigRulesResponse, AWSError] = js.native
  /**
    * Returns a list of organization config rules.  When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization config rule names. It is only applicable, when you request all the organization config rules. Only a master account can call this API. 
    */
  def describeOrganizationConfigRules(params: DescribeOrganizationConfigRulesRequest): Request[DescribeOrganizationConfigRulesResponse, AWSError] = js.native
  def describeOrganizationConfigRules(
    params: DescribeOrganizationConfigRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigRulesResponse, Unit]
  ): Request[DescribeOrganizationConfigRulesResponse, AWSError] = js.native
  /**
    * Provides organization conformance pack deployment status for an organization.  The status is not considered successful until organization conformance pack is successfully deployed in all the member accounts with an exception of excluded accounts. When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization conformance pack names. They are only applicable, when you request all the organization conformance packs. Only a master account can call this API. 
    */
  def describeOrganizationConformancePackStatuses(): Request[DescribeOrganizationConformancePackStatusesResponse, AWSError] = js.native
  def describeOrganizationConformancePackStatuses(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeOrganizationConformancePackStatusesResponse, 
      Unit
    ]
  ): Request[DescribeOrganizationConformancePackStatusesResponse, AWSError] = js.native
  /**
    * Provides organization conformance pack deployment status for an organization.  The status is not considered successful until organization conformance pack is successfully deployed in all the member accounts with an exception of excluded accounts. When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization conformance pack names. They are only applicable, when you request all the organization conformance packs. Only a master account can call this API. 
    */
  def describeOrganizationConformancePackStatuses(params: DescribeOrganizationConformancePackStatusesRequest): Request[DescribeOrganizationConformancePackStatusesResponse, AWSError] = js.native
  def describeOrganizationConformancePackStatuses(
    params: DescribeOrganizationConformancePackStatusesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeOrganizationConformancePackStatusesResponse, 
      Unit
    ]
  ): Request[DescribeOrganizationConformancePackStatusesResponse, AWSError] = js.native
  /**
    * Returns a list of organization conformance packs.  When you specify the limit and the next token, you receive a paginated response.  Limit and next token are not applicable if you specify organization conformance packs names. They are only applicable, when you request all the organization conformance packs.  Only a master account can call this API. 
    */
  def describeOrganizationConformancePacks(): Request[DescribeOrganizationConformancePacksResponse, AWSError] = js.native
  def describeOrganizationConformancePacks(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConformancePacksResponse, Unit]
  ): Request[DescribeOrganizationConformancePacksResponse, AWSError] = js.native
  /**
    * Returns a list of organization conformance packs.  When you specify the limit and the next token, you receive a paginated response.  Limit and next token are not applicable if you specify organization conformance packs names. They are only applicable, when you request all the organization conformance packs.  Only a master account can call this API. 
    */
  def describeOrganizationConformancePacks(params: DescribeOrganizationConformancePacksRequest): Request[DescribeOrganizationConformancePacksResponse, AWSError] = js.native
  def describeOrganizationConformancePacks(
    params: DescribeOrganizationConformancePacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConformancePacksResponse, Unit]
  ): Request[DescribeOrganizationConformancePacksResponse, AWSError] = js.native
  /**
    * Returns a list of all pending aggregation requests.
    */
  def describePendingAggregationRequests(): Request[DescribePendingAggregationRequestsResponse, AWSError] = js.native
  def describePendingAggregationRequests(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePendingAggregationRequestsResponse, Unit]
  ): Request[DescribePendingAggregationRequestsResponse, AWSError] = js.native
  /**
    * Returns a list of all pending aggregation requests.
    */
  def describePendingAggregationRequests(params: DescribePendingAggregationRequestsRequest): Request[DescribePendingAggregationRequestsResponse, AWSError] = js.native
  def describePendingAggregationRequests(
    params: DescribePendingAggregationRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePendingAggregationRequestsResponse, Unit]
  ): Request[DescribePendingAggregationRequestsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more remediation configurations.
    */
  def describeRemediationConfigurations(): Request[DescribeRemediationConfigurationsResponse, AWSError] = js.native
  def describeRemediationConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationConfigurationsResponse, Unit]
  ): Request[DescribeRemediationConfigurationsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more remediation configurations.
    */
  def describeRemediationConfigurations(params: DescribeRemediationConfigurationsRequest): Request[DescribeRemediationConfigurationsResponse, AWSError] = js.native
  def describeRemediationConfigurations(
    params: DescribeRemediationConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationConfigurationsResponse, Unit]
  ): Request[DescribeRemediationConfigurationsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more remediation exceptions. A detailed view of a remediation exception for a set of resources that includes an explanation of an exception and the time when the exception will be deleted. When you specify the limit and the next token, you receive a paginated response.   When you specify the limit and the next token, you receive a paginated response.  Limit and next token are not applicable if you request resources in batch. It is only applicable, when you request all resources. 
    */
  def describeRemediationExceptions(): Request[DescribeRemediationExceptionsResponse, AWSError] = js.native
  def describeRemediationExceptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationExceptionsResponse, Unit]): Request[DescribeRemediationExceptionsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more remediation exceptions. A detailed view of a remediation exception for a set of resources that includes an explanation of an exception and the time when the exception will be deleted. When you specify the limit and the next token, you receive a paginated response.   When you specify the limit and the next token, you receive a paginated response.  Limit and next token are not applicable if you request resources in batch. It is only applicable, when you request all resources. 
    */
  def describeRemediationExceptions(params: DescribeRemediationExceptionsRequest): Request[DescribeRemediationExceptionsResponse, AWSError] = js.native
  def describeRemediationExceptions(
    params: DescribeRemediationExceptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationExceptionsResponse, Unit]
  ): Request[DescribeRemediationExceptionsResponse, AWSError] = js.native
  /**
    * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when steps for the remediation execution occur, and any error messages for steps that have failed. When you specify the limit and the next token, you receive a paginated response.
    */
  def describeRemediationExecutionStatus(): Request[DescribeRemediationExecutionStatusResponse, AWSError] = js.native
  def describeRemediationExecutionStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationExecutionStatusResponse, Unit]
  ): Request[DescribeRemediationExecutionStatusResponse, AWSError] = js.native
  /**
    * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when steps for the remediation execution occur, and any error messages for steps that have failed. When you specify the limit and the next token, you receive a paginated response.
    */
  def describeRemediationExecutionStatus(params: DescribeRemediationExecutionStatusRequest): Request[DescribeRemediationExecutionStatusResponse, AWSError] = js.native
  def describeRemediationExecutionStatus(
    params: DescribeRemediationExecutionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationExecutionStatusResponse, Unit]
  ): Request[DescribeRemediationExecutionStatusResponse, AWSError] = js.native
  /**
    * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  def describeRetentionConfigurations(): Request[DescribeRetentionConfigurationsResponse, AWSError] = js.native
  def describeRetentionConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRetentionConfigurationsResponse, Unit]
  ): Request[DescribeRetentionConfigurationsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  def describeRetentionConfigurations(params: DescribeRetentionConfigurationsRequest): Request[DescribeRetentionConfigurationsResponse, AWSError] = js.native
  def describeRetentionConfigurations(
    params: DescribeRetentionConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRetentionConfigurationsResponse, Unit]
  ): Request[DescribeRetentionConfigurationsResponse, AWSError] = js.native
  /**
    * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateComplianceDetailsByConfigRule(): Request[GetAggregateComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  def getAggregateComplianceDetailsByConfigRule(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetAggregateComplianceDetailsByConfigRuleResponse, 
      Unit
    ]
  ): Request[GetAggregateComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  /**
    * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateComplianceDetailsByConfigRule(params: GetAggregateComplianceDetailsByConfigRuleRequest): Request[GetAggregateComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  def getAggregateComplianceDetailsByConfigRule(
    params: GetAggregateComplianceDetailsByConfigRuleRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetAggregateComplianceDetailsByConfigRuleResponse, 
      Unit
    ]
  ): Request[GetAggregateComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  /**
    * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateConfigRuleComplianceSummary(): Request[GetAggregateConfigRuleComplianceSummaryResponse, AWSError] = js.native
  def getAggregateConfigRuleComplianceSummary(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateConfigRuleComplianceSummaryResponse, Unit]
  ): Request[GetAggregateConfigRuleComplianceSummaryResponse, AWSError] = js.native
  /**
    * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateConfigRuleComplianceSummary(params: GetAggregateConfigRuleComplianceSummaryRequest): Request[GetAggregateConfigRuleComplianceSummaryResponse, AWSError] = js.native
  def getAggregateConfigRuleComplianceSummary(
    params: GetAggregateConfigRuleComplianceSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateConfigRuleComplianceSummaryResponse, Unit]
  ): Request[GetAggregateConfigRuleComplianceSummaryResponse, AWSError] = js.native
  /**
    * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
    */
  def getAggregateDiscoveredResourceCounts(): Request[GetAggregateDiscoveredResourceCountsResponse, AWSError] = js.native
  def getAggregateDiscoveredResourceCounts(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateDiscoveredResourceCountsResponse, Unit]
  ): Request[GetAggregateDiscoveredResourceCountsResponse, AWSError] = js.native
  /**
    * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
    */
  def getAggregateDiscoveredResourceCounts(params: GetAggregateDiscoveredResourceCountsRequest): Request[GetAggregateDiscoveredResourceCountsResponse, AWSError] = js.native
  def getAggregateDiscoveredResourceCounts(
    params: GetAggregateDiscoveredResourceCountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateDiscoveredResourceCountsResponse, Unit]
  ): Request[GetAggregateDiscoveredResourceCountsResponse, AWSError] = js.native
  /**
    * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
    */
  def getAggregateResourceConfig(): Request[GetAggregateResourceConfigResponse, AWSError] = js.native
  def getAggregateResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateResourceConfigResponse, Unit]): Request[GetAggregateResourceConfigResponse, AWSError] = js.native
  /**
    * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
    */
  def getAggregateResourceConfig(params: GetAggregateResourceConfigRequest): Request[GetAggregateResourceConfigResponse, AWSError] = js.native
  def getAggregateResourceConfig(
    params: GetAggregateResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateResourceConfigResponse, Unit]
  ): Request[GetAggregateResourceConfigResponse, AWSError] = js.native
  /**
    * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
    */
  def getComplianceDetailsByConfigRule(): Request[GetComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  def getComplianceDetailsByConfigRule(
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailsByConfigRuleResponse, Unit]
  ): Request[GetComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  /**
    * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
    */
  def getComplianceDetailsByConfigRule(params: GetComplianceDetailsByConfigRuleRequest): Request[GetComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  def getComplianceDetailsByConfigRule(
    params: GetComplianceDetailsByConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailsByConfigRuleResponse, Unit]
  ): Request[GetComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  /**
    * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
    */
  def getComplianceDetailsByResource(): Request[GetComplianceDetailsByResourceResponse, AWSError] = js.native
  def getComplianceDetailsByResource(
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailsByResourceResponse, Unit]
  ): Request[GetComplianceDetailsByResourceResponse, AWSError] = js.native
  /**
    * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
    */
  def getComplianceDetailsByResource(params: GetComplianceDetailsByResourceRequest): Request[GetComplianceDetailsByResourceResponse, AWSError] = js.native
  def getComplianceDetailsByResource(
    params: GetComplianceDetailsByResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailsByResourceResponse, Unit]
  ): Request[GetComplianceDetailsByResourceResponse, AWSError] = js.native
  /**
    * Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
    */
  def getComplianceSummaryByConfigRule(): Request[GetComplianceSummaryByConfigRuleResponse, AWSError] = js.native
  def getComplianceSummaryByConfigRule(
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceSummaryByConfigRuleResponse, Unit]
  ): Request[GetComplianceSummaryByConfigRuleResponse, AWSError] = js.native
  /**
    * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
    */
  def getComplianceSummaryByResourceType(): Request[GetComplianceSummaryByResourceTypeResponse, AWSError] = js.native
  def getComplianceSummaryByResourceType(
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceSummaryByResourceTypeResponse, Unit]
  ): Request[GetComplianceSummaryByResourceTypeResponse, AWSError] = js.native
  /**
    * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
    */
  def getComplianceSummaryByResourceType(params: GetComplianceSummaryByResourceTypeRequest): Request[GetComplianceSummaryByResourceTypeResponse, AWSError] = js.native
  def getComplianceSummaryByResourceType(
    params: GetComplianceSummaryByResourceTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceSummaryByResourceTypeResponse, Unit]
  ): Request[GetComplianceSummaryByResourceTypeResponse, AWSError] = js.native
  /**
    * Returns compliance details of a conformance pack for all AWS resources that are monitered by conformance pack.
    */
  def getConformancePackComplianceDetails(): Request[GetConformancePackComplianceDetailsResponse, AWSError] = js.native
  def getConformancePackComplianceDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ GetConformancePackComplianceDetailsResponse, Unit]
  ): Request[GetConformancePackComplianceDetailsResponse, AWSError] = js.native
  /**
    * Returns compliance details of a conformance pack for all AWS resources that are monitered by conformance pack.
    */
  def getConformancePackComplianceDetails(params: GetConformancePackComplianceDetailsRequest): Request[GetConformancePackComplianceDetailsResponse, AWSError] = js.native
  def getConformancePackComplianceDetails(
    params: GetConformancePackComplianceDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConformancePackComplianceDetailsResponse, Unit]
  ): Request[GetConformancePackComplianceDetailsResponse, AWSError] = js.native
  /**
    * Returns compliance details for the conformance pack based on the cumulative compliance results of all the rules in that conformance pack.
    */
  def getConformancePackComplianceSummary(): Request[GetConformancePackComplianceSummaryResponse, AWSError] = js.native
  def getConformancePackComplianceSummary(
    callback: js.Function2[/* err */ AWSError, /* data */ GetConformancePackComplianceSummaryResponse, Unit]
  ): Request[GetConformancePackComplianceSummaryResponse, AWSError] = js.native
  /**
    * Returns compliance details for the conformance pack based on the cumulative compliance results of all the rules in that conformance pack.
    */
  def getConformancePackComplianceSummary(params: GetConformancePackComplianceSummaryRequest): Request[GetConformancePackComplianceSummaryResponse, AWSError] = js.native
  def getConformancePackComplianceSummary(
    params: GetConformancePackComplianceSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConformancePackComplianceSummaryResponse, Unit]
  ): Request[GetConformancePackComplianceSummaryResponse, AWSError] = js.native
  /**
    * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in this region for your AWS account.   Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    AWS Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, AWS Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new AWS Config customer.   You just enabled resource recording.   It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
    */
  def getDiscoveredResourceCounts(): Request[GetDiscoveredResourceCountsResponse, AWSError] = js.native
  def getDiscoveredResourceCounts(callback: js.Function2[/* err */ AWSError, /* data */ GetDiscoveredResourceCountsResponse, Unit]): Request[GetDiscoveredResourceCountsResponse, AWSError] = js.native
  /**
    * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in this region for your AWS account.   Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    AWS Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, AWS Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new AWS Config customer.   You just enabled resource recording.   It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
    */
  def getDiscoveredResourceCounts(params: GetDiscoveredResourceCountsRequest): Request[GetDiscoveredResourceCountsResponse, AWSError] = js.native
  def getDiscoveredResourceCounts(
    params: GetDiscoveredResourceCountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDiscoveredResourceCountsResponse, Unit]
  ): Request[GetDiscoveredResourceCountsResponse, AWSError] = js.native
  /**
    * Returns detailed status for each member account within an organization for a given organization config rule.  Only a master account can call this API. 
    */
  def getOrganizationConfigRuleDetailedStatus(): Request[GetOrganizationConfigRuleDetailedStatusResponse, AWSError] = js.native
  def getOrganizationConfigRuleDetailedStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationConfigRuleDetailedStatusResponse, Unit]
  ): Request[GetOrganizationConfigRuleDetailedStatusResponse, AWSError] = js.native
  /**
    * Returns detailed status for each member account within an organization for a given organization config rule.  Only a master account can call this API. 
    */
  def getOrganizationConfigRuleDetailedStatus(params: GetOrganizationConfigRuleDetailedStatusRequest): Request[GetOrganizationConfigRuleDetailedStatusResponse, AWSError] = js.native
  def getOrganizationConfigRuleDetailedStatus(
    params: GetOrganizationConfigRuleDetailedStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationConfigRuleDetailedStatusResponse, Unit]
  ): Request[GetOrganizationConfigRuleDetailedStatusResponse, AWSError] = js.native
  /**
    * Returns detailed status for each member account within an organization for a given organization conformance pack. Only a master account can call this API.
    */
  def getOrganizationConformancePackDetailedStatus(): Request[GetOrganizationConformancePackDetailedStatusResponse, AWSError] = js.native
  def getOrganizationConformancePackDetailedStatus(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetOrganizationConformancePackDetailedStatusResponse, 
      Unit
    ]
  ): Request[GetOrganizationConformancePackDetailedStatusResponse, AWSError] = js.native
  /**
    * Returns detailed status for each member account within an organization for a given organization conformance pack. Only a master account can call this API.
    */
  def getOrganizationConformancePackDetailedStatus(params: GetOrganizationConformancePackDetailedStatusRequest): Request[GetOrganizationConformancePackDetailedStatusResponse, AWSError] = js.native
  def getOrganizationConformancePackDetailedStatus(
    params: GetOrganizationConformancePackDetailedStatusRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetOrganizationConformancePackDetailedStatusResponse, 
      Unit
    ]
  ): Request[GetOrganizationConformancePackDetailedStatusResponse, AWSError] = js.native
  /**
    * Returns a list of configuration items for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
    */
  def getResourceConfigHistory(): Request[GetResourceConfigHistoryResponse, AWSError] = js.native
  def getResourceConfigHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceConfigHistoryResponse, Unit]): Request[GetResourceConfigHistoryResponse, AWSError] = js.native
  /**
    * Returns a list of configuration items for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
    */
  def getResourceConfigHistory(params: GetResourceConfigHistoryRequest): Request[GetResourceConfigHistoryResponse, AWSError] = js.native
  def getResourceConfigHistory(
    params: GetResourceConfigHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceConfigHistoryResponse, Unit]
  ): Request[GetResourceConfigHistoryResponse, AWSError] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
    */
  def listAggregateDiscoveredResources(): Request[ListAggregateDiscoveredResourcesResponse, AWSError] = js.native
  def listAggregateDiscoveredResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAggregateDiscoveredResourcesResponse, Unit]
  ): Request[ListAggregateDiscoveredResourcesResponse, AWSError] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
    */
  def listAggregateDiscoveredResources(params: ListAggregateDiscoveredResourcesRequest): Request[ListAggregateDiscoveredResourcesResponse, AWSError] = js.native
  def listAggregateDiscoveredResources(
    params: ListAggregateDiscoveredResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAggregateDiscoveredResourcesResponse, Unit]
  ): Request[ListAggregateDiscoveredResourcesResponse, AWSError] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
    */
  def listDiscoveredResources(): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  def listDiscoveredResources(callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoveredResourcesResponse, Unit]): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
    */
  def listDiscoveredResources(params: ListDiscoveredResourcesRequest): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  def listDiscoveredResources(
    params: ListDiscoveredResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoveredResourcesResponse, Unit]
  ): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  /**
    * List the tags for AWS Config resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List the tags for AWS Config resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Authorizes the aggregator account and region to collect data from the source account and region. 
    */
  def putAggregationAuthorization(): Request[PutAggregationAuthorizationResponse, AWSError] = js.native
  def putAggregationAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ PutAggregationAuthorizationResponse, Unit]): Request[PutAggregationAuthorizationResponse, AWSError] = js.native
  /**
    * Authorizes the aggregator account and region to collect data from the source account and region. 
    */
  def putAggregationAuthorization(params: PutAggregationAuthorizationRequest): Request[PutAggregationAuthorizationResponse, AWSError] = js.native
  def putAggregationAuthorization(
    params: PutAggregationAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAggregationAuthorizationResponse, Unit]
  ): Request[PutAggregationAuthorizationResponse, AWSError] = js.native
  /**
    * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired configurations. You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides. If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule invokes to evaluate your resources. When you use the PutConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  If you are adding an AWS managed Config rule, specify the rule's identifier for the SourceIdentifier key. To reference AWS managed Config rule identifiers, see About AWS Managed Config Rules. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by AWS Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. The maximum number of rules that AWS Config supports is 150. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide. For more information about developing and using AWS Config rules, see Evaluating AWS Resource Configurations with AWS Config in the AWS Config Developer Guide.
    */
  def putConfigRule(): Request[js.Object, AWSError] = js.native
  def putConfigRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired configurations. You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides. If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule invokes to evaluate your resources. When you use the PutConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  If you are adding an AWS managed Config rule, specify the rule's identifier for the SourceIdentifier key. To reference AWS managed Config rule identifiers, see About AWS Managed Config Rules. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by AWS Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. The maximum number of rules that AWS Config supports is 150. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide. For more information about developing and using AWS Config rules, see Evaluating AWS Resource Configurations with AWS Config in the AWS Config Developer Guide.
    */
  def putConfigRule(params: PutConfigRuleRequest): Request[js.Object, AWSError] = js.native
  def putConfigRule(
    params: PutConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  AWS Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the master account and all features must be enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration between AWS Config and AWS Organizations.  
    */
  def putConfigurationAggregator(): Request[PutConfigurationAggregatorResponse, AWSError] = js.native
  def putConfigurationAggregator(callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationAggregatorResponse, Unit]): Request[PutConfigurationAggregatorResponse, AWSError] = js.native
  /**
    * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  AWS Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the master account and all features must be enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration between AWS Config and AWS Organizations.  
    */
  def putConfigurationAggregator(params: PutConfigurationAggregatorRequest): Request[PutConfigurationAggregatorResponse, AWSError] = js.native
  def putConfigurationAggregator(
    params: PutConfigurationAggregatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationAggregatorResponse, Unit]
  ): Request[PutConfigurationAggregatorResponse, AWSError] = js.native
  /**
    * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
    */
  def putConfigurationRecorder(): Request[js.Object, AWSError] = js.native
  def putConfigurationRecorder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
    */
  def putConfigurationRecorder(params: PutConfigurationRecorderRequest): Request[js.Object, AWSError] = js.native
  def putConfigurationRecorder(
    params: PutConfigurationRecorderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates or updates a conformance pack. A conformance pack is a collection of AWS Config rules that can be easily deployed in an account and a region and across AWS Organization. This API creates a service linked role AWSServiceRoleForConfigConforms in your account. The service linked role is created only when the role does not exist in your account. AWS Config verifies the existence of role with GetRole action.  You must specify either the TemplateS3Uri or the TemplateBody parameter, but not both. If you provide both AWS Config uses the TemplateS3Uri parameter and ignores the TemplateBody parameter. 
    */
  def putConformancePack(): Request[PutConformancePackResponse, AWSError] = js.native
  def putConformancePack(callback: js.Function2[/* err */ AWSError, /* data */ PutConformancePackResponse, Unit]): Request[PutConformancePackResponse, AWSError] = js.native
  /**
    * Creates or updates a conformance pack. A conformance pack is a collection of AWS Config rules that can be easily deployed in an account and a region and across AWS Organization. This API creates a service linked role AWSServiceRoleForConfigConforms in your account. The service linked role is created only when the role does not exist in your account. AWS Config verifies the existence of role with GetRole action.  You must specify either the TemplateS3Uri or the TemplateBody parameter, but not both. If you provide both AWS Config uses the TemplateS3Uri parameter and ignores the TemplateBody parameter. 
    */
  def putConformancePack(params: PutConformancePackRequest): Request[PutConformancePackResponse, AWSError] = js.native
  def putConformancePack(
    params: PutConformancePackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConformancePackResponse, Unit]
  ): Request[PutConformancePackResponse, AWSError] = js.native
  /**
    * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
    */
  def putDeliveryChannel(): Request[js.Object, AWSError] = js.native
  def putDeliveryChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
    */
  def putDeliveryChannel(params: PutDeliveryChannelRequest): Request[js.Object, AWSError] = js.native
  def putDeliveryChannel(
    params: PutDeliveryChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS Lambda function that is invoked by an AWS Config rule.
    */
  def putEvaluations(): Request[PutEvaluationsResponse, AWSError] = js.native
  def putEvaluations(callback: js.Function2[/* err */ AWSError, /* data */ PutEvaluationsResponse, Unit]): Request[PutEvaluationsResponse, AWSError] = js.native
  /**
    * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS Lambda function that is invoked by an AWS Config rule.
    */
  def putEvaluations(params: PutEvaluationsRequest): Request[PutEvaluationsResponse, AWSError] = js.native
  def putEvaluations(
    params: PutEvaluationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEvaluationsResponse, Unit]
  ): Request[PutEvaluationsResponse, AWSError] = js.native
  /**
    * Adds or updates organization config rule for your entire organization evaluating whether your AWS resources comply with your desired configurations. Only a master account can create or update an organization config rule. This API enables organization service access through the EnableAWSServiceAccess action and creates a service linked role AWSServiceRoleForConfigMultiAccountSetup in the master account of your organization. The service linked role is created only when the role does not exist in the master account. AWS Config verifies the existence of role with GetRole action. You can use this action to create both custom AWS Config rules and AWS managed Config rules. If you are adding a new custom AWS Config rule, you must first create AWS Lambda function in the master account that the rule invokes to evaluate your resources. When you use the PutOrganizationConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. If you are adding an AWS managed Config rule, specify the rule's identifier for the RuleIdentifier key. The maximum number of organization config rules that AWS Config supports is 150.  Specify either OrganizationCustomRuleMetadata or OrganizationManagedRuleMetadata. 
    */
  def putOrganizationConfigRule(): Request[PutOrganizationConfigRuleResponse, AWSError] = js.native
  def putOrganizationConfigRule(callback: js.Function2[/* err */ AWSError, /* data */ PutOrganizationConfigRuleResponse, Unit]): Request[PutOrganizationConfigRuleResponse, AWSError] = js.native
  /**
    * Adds or updates organization config rule for your entire organization evaluating whether your AWS resources comply with your desired configurations. Only a master account can create or update an organization config rule. This API enables organization service access through the EnableAWSServiceAccess action and creates a service linked role AWSServiceRoleForConfigMultiAccountSetup in the master account of your organization. The service linked role is created only when the role does not exist in the master account. AWS Config verifies the existence of role with GetRole action. You can use this action to create both custom AWS Config rules and AWS managed Config rules. If you are adding a new custom AWS Config rule, you must first create AWS Lambda function in the master account that the rule invokes to evaluate your resources. When you use the PutOrganizationConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. If you are adding an AWS managed Config rule, specify the rule's identifier for the RuleIdentifier key. The maximum number of organization config rules that AWS Config supports is 150.  Specify either OrganizationCustomRuleMetadata or OrganizationManagedRuleMetadata. 
    */
  def putOrganizationConfigRule(params: PutOrganizationConfigRuleRequest): Request[PutOrganizationConfigRuleResponse, AWSError] = js.native
  def putOrganizationConfigRule(
    params: PutOrganizationConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutOrganizationConfigRuleResponse, Unit]
  ): Request[PutOrganizationConfigRuleResponse, AWSError] = js.native
  /**
    * Deploys conformance packs across member accounts in an AWS Organization. This API enables organization service access for config-multiaccountsetup.amazonaws.com through the EnableAWSServiceAccess action and creates a service linked role AWSServiceRoleForConfigMultiAccountSetup in the master account of your organization. The service linked role is created only when the role does not exist in the master account. AWS Config verifies the existence of role with GetRole action.  You must specify either the TemplateS3Uri or the TemplateBody parameter, but not both. If you provide both AWS Config uses the TemplateS3Uri parameter and ignores the TemplateBody parameter. AWS Config sets the state of a conformance pack to CREATE_IN_PROGRESS and UPDATE_IN_PROGRESS until the confomance pack is created or updated. You cannot update a conformance pack while it is in this state. You can create 6 conformance packs with 25 AWS Config rules in each pack. 
    */
  def putOrganizationConformancePack(): Request[PutOrganizationConformancePackResponse, AWSError] = js.native
  def putOrganizationConformancePack(
    callback: js.Function2[/* err */ AWSError, /* data */ PutOrganizationConformancePackResponse, Unit]
  ): Request[PutOrganizationConformancePackResponse, AWSError] = js.native
  /**
    * Deploys conformance packs across member accounts in an AWS Organization. This API enables organization service access for config-multiaccountsetup.amazonaws.com through the EnableAWSServiceAccess action and creates a service linked role AWSServiceRoleForConfigMultiAccountSetup in the master account of your organization. The service linked role is created only when the role does not exist in the master account. AWS Config verifies the existence of role with GetRole action.  You must specify either the TemplateS3Uri or the TemplateBody parameter, but not both. If you provide both AWS Config uses the TemplateS3Uri parameter and ignores the TemplateBody parameter. AWS Config sets the state of a conformance pack to CREATE_IN_PROGRESS and UPDATE_IN_PROGRESS until the confomance pack is created or updated. You cannot update a conformance pack while it is in this state. You can create 6 conformance packs with 25 AWS Config rules in each pack. 
    */
  def putOrganizationConformancePack(params: PutOrganizationConformancePackRequest): Request[PutOrganizationConformancePackResponse, AWSError] = js.native
  def putOrganizationConformancePack(
    params: PutOrganizationConformancePackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutOrganizationConformancePackResponse, Unit]
  ): Request[PutOrganizationConformancePackResponse, AWSError] = js.native
  /**
    * Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action. The API creates the RemediationConfiguration object for the AWS Config rule. The AWS Config rule must already exist for you to add a remediation configuration. The target (SSM document) must exist and have permissions to use the target. 
    */
  def putRemediationConfigurations(): Request[PutRemediationConfigurationsResponse, AWSError] = js.native
  def putRemediationConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ PutRemediationConfigurationsResponse, Unit]): Request[PutRemediationConfigurationsResponse, AWSError] = js.native
  /**
    * Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action. The API creates the RemediationConfiguration object for the AWS Config rule. The AWS Config rule must already exist for you to add a remediation configuration. The target (SSM document) must exist and have permissions to use the target. 
    */
  def putRemediationConfigurations(params: PutRemediationConfigurationsRequest): Request[PutRemediationConfigurationsResponse, AWSError] = js.native
  def putRemediationConfigurations(
    params: PutRemediationConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRemediationConfigurationsResponse, Unit]
  ): Request[PutRemediationConfigurationsResponse, AWSError] = js.native
  /**
    * A remediation exception is when a specific resource is no longer considered for auto-remediation. This API adds a new exception or updates an exisiting exception for a specific resource with a specific AWS Config rule. 
    */
  def putRemediationExceptions(): Request[PutRemediationExceptionsResponse, AWSError] = js.native
  def putRemediationExceptions(callback: js.Function2[/* err */ AWSError, /* data */ PutRemediationExceptionsResponse, Unit]): Request[PutRemediationExceptionsResponse, AWSError] = js.native
  /**
    * A remediation exception is when a specific resource is no longer considered for auto-remediation. This API adds a new exception or updates an exisiting exception for a specific resource with a specific AWS Config rule. 
    */
  def putRemediationExceptions(params: PutRemediationExceptionsRequest): Request[PutRemediationExceptionsResponse, AWSError] = js.native
  def putRemediationExceptions(
    params: PutRemediationExceptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRemediationExceptionsResponse, Unit]
  ): Request[PutRemediationExceptionsResponse, AWSError] = js.native
  /**
    * Records the configuration state for the resource provided in the request. The configuration state of a resource is represented in AWS Config as Configuration Items. Once this API records the configuration item, you can retrieve the list of configuration items for the custom resource type using existing AWS Config APIs.   The custom resource type must be registered with AWS CloudFormation. This API accepts the configuration item registered with AWS CloudFormation. When you call this API, AWS Config only stores configuration state of the resource provided in the request. This API does not change or remediate the configuration of the resource.  
    */
  def putResourceConfig(): Request[js.Object, AWSError] = js.native
  def putResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Records the configuration state for the resource provided in the request. The configuration state of a resource is represented in AWS Config as Configuration Items. Once this API records the configuration item, you can retrieve the list of configuration items for the custom resource type using existing AWS Config APIs.   The custom resource type must be registered with AWS CloudFormation. This API accepts the configuration item registered with AWS CloudFormation. When you call this API, AWS Config only stores configuration state of the resource provided in the request. This API does not change or remediate the configuration of the resource.  
    */
  def putResourceConfig(params: PutResourceConfigRequest): Request[js.Object, AWSError] = js.native
  def putResourceConfig(
    params: PutResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Creates and updates the retention configuration with details about retention period (number of days) that AWS Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  def putRetentionConfiguration(): Request[PutRetentionConfigurationResponse, AWSError] = js.native
  def putRetentionConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutRetentionConfigurationResponse, Unit]): Request[PutRetentionConfigurationResponse, AWSError] = js.native
  /**
    * Creates and updates the retention configuration with details about retention period (number of days) that AWS Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  def putRetentionConfiguration(params: PutRetentionConfigurationRequest): Request[PutRetentionConfigurationResponse, AWSError] = js.native
  def putRetentionConfiguration(
    params: PutRetentionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRetentionConfigurationResponse, Unit]
  ): Request[PutRetentionConfigurationResponse, AWSError] = js.native
  /**
    * Accepts a structured query language (SQL) SELECT command, performs the corresponding search, and returns resource configurations matching the properties. For more information about query components, see the  Query Components  section in the AWS Config Developer Guide.
    */
  def selectResourceConfig(): Request[SelectResourceConfigResponse, AWSError] = js.native
  def selectResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ SelectResourceConfigResponse, Unit]): Request[SelectResourceConfigResponse, AWSError] = js.native
  /**
    * Accepts a structured query language (SQL) SELECT command, performs the corresponding search, and returns resource configurations matching the properties. For more information about query components, see the  Query Components  section in the AWS Config Developer Guide.
    */
  def selectResourceConfig(params: SelectResourceConfigRequest): Request[SelectResourceConfigResponse, AWSError] = js.native
  def selectResourceConfig(
    params: SelectResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SelectResourceConfigResponse, Unit]
  ): Request[SelectResourceConfigResponse, AWSError] = js.native
  /**
    * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 AWS Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, AWS Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   AWS Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
    */
  def startConfigRulesEvaluation(): Request[StartConfigRulesEvaluationResponse, AWSError] = js.native
  def startConfigRulesEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ StartConfigRulesEvaluationResponse, Unit]): Request[StartConfigRulesEvaluationResponse, AWSError] = js.native
  /**
    * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 AWS Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, AWS Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   AWS Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
    */
  def startConfigRulesEvaluation(params: StartConfigRulesEvaluationRequest): Request[StartConfigRulesEvaluationResponse, AWSError] = js.native
  def startConfigRulesEvaluation(
    params: StartConfigRulesEvaluationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartConfigRulesEvaluationResponse, Unit]
  ): Request[StartConfigRulesEvaluationResponse, AWSError] = js.native
  /**
    * Starts recording configurations of the AWS resources you have selected to record in your AWS account. You must have created at least one delivery channel to successfully start the configuration recorder.
    */
  def startConfigurationRecorder(): Request[js.Object, AWSError] = js.native
  def startConfigurationRecorder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts recording configurations of the AWS resources you have selected to record in your AWS account. You must have created at least one delivery channel to successfully start the configuration recorder.
    */
  def startConfigurationRecorder(params: StartConfigurationRecorderRequest): Request[js.Object, AWSError] = js.native
  def startConfigurationRecorder(
    params: StartConfigurationRecorderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Runs an on-demand remediation for the specified AWS Config rules against the last known remediation configuration. It runs an execution against the current state of your resources. Remediation execution is asynchronous. You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified resource keys must complete before you can call the API again.
    */
  def startRemediationExecution(): Request[StartRemediationExecutionResponse, AWSError] = js.native
  def startRemediationExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartRemediationExecutionResponse, Unit]): Request[StartRemediationExecutionResponse, AWSError] = js.native
  /**
    * Runs an on-demand remediation for the specified AWS Config rules against the last known remediation configuration. It runs an execution against the current state of your resources. Remediation execution is asynchronous. You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified resource keys must complete before you can call the API again.
    */
  def startRemediationExecution(params: StartRemediationExecutionRequest): Request[StartRemediationExecutionResponse, AWSError] = js.native
  def startRemediationExecution(
    params: StartRemediationExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRemediationExecutionResponse, Unit]
  ): Request[StartRemediationExecutionResponse, AWSError] = js.native
  /**
    * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
    */
  def stopConfigurationRecorder(): Request[js.Object, AWSError] = js.native
  def stopConfigurationRecorder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
    */
  def stopConfigurationRecorder(params: StopConfigurationRecorderRequest): Request[js.Object, AWSError] = js.native
  def stopConfigurationRecorder(
    params: StopConfigurationRecorderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}

