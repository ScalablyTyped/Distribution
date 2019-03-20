package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ConfigService: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ClientConfiguration = js.native
  /**
    * Returns the current configuration items for resources that are present in your AWS Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
    */
  def batchGetAggregateResourceConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetAggregateResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetAggregateResourceConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetAggregateResourceConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetAggregateResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current configuration items for resources that are present in your AWS Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
    */
  def batchGetAggregateResourceConfig(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetAggregateResourceConfigRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetAggregateResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetAggregateResourceConfig(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetAggregateResourceConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetAggregateResourceConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetAggregateResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current configuration for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
    */
  def batchGetResourceConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetResourceConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetResourceConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current configuration for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
    */
  def batchGetResourceConfig(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetResourceConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetResourceConfig(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetResourceConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetResourceConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.BatchGetResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
    */
  def deleteAggregationAuthorization(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAggregationAuthorization(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
    */
  def deleteAggregationAuthorization(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteAggregationAuthorizationRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAggregationAuthorization(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteAggregationAuthorizationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified AWS Config rule and all of its evaluation results. AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
    */
  def deleteConfigRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfigRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified AWS Config rule and all of its evaluation results. AWS Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
    */
  def deleteConfigRule(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteConfigRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfigRule(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteConfigRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
    */
  def deleteConfigurationAggregator(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfigurationAggregator(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
    */
  def deleteConfigurationAggregator(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteConfigurationAggregatorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfigurationAggregator(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteConfigurationAggregatorRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the configuration recorder. After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the AWS Config console until you create a new configuration recorder.
    */
  def deleteConfigurationRecorder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfigurationRecorder(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the configuration recorder. After the configuration recorder is deleted, AWS Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the AWS Config console until you create a new configuration recorder.
    */
  def deleteConfigurationRecorder(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteConfigurationRecorderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConfigurationRecorder(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteConfigurationRecorderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
    */
  def deleteDeliveryChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeliveryChannel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
    */
  def deleteDeliveryChannel(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteDeliveryChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeliveryChannel(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteDeliveryChannelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your AWS resources against the rule.
    */
  def deleteEvaluationResults(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteEvaluationResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEvaluationResults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteEvaluationResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteEvaluationResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the evaluation results for the specified AWS Config rule. You can specify one AWS Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your AWS resources against the rule.
    */
  def deleteEvaluationResults(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteEvaluationResultsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteEvaluationResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEvaluationResults(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteEvaluationResultsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteEvaluationResultsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteEvaluationResultsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes pending authorization requests for a specified aggregator account in a specified region.
    */
  def deletePendingAggregationRequest(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePendingAggregationRequest(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes pending authorization requests for a specified aggregator account in a specified region.
    */
  def deletePendingAggregationRequest(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeletePendingAggregationRequestRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePendingAggregationRequest(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeletePendingAggregationRequestRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the remediation configuration.
    */
  def deleteRemediationConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRemediationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRemediationConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRemediationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRemediationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the remediation configuration.
    */
  def deleteRemediationConfiguration(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRemediationConfigurationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRemediationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRemediationConfiguration(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRemediationConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRemediationConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRemediationConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the retention configuration.
    */
  def deleteRetentionConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRetentionConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the retention configuration.
    */
  def deleteRetentionConfiguration(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRetentionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteRetentionConfiguration(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeleteRetentionConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
    */
  def deliverConfigSnapshot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeliverConfigSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deliverConfigSnapshot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeliverConfigSnapshotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeliverConfigSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, AWS Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
    */
  def deliverConfigSnapshot(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeliverConfigSnapshotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeliverConfigSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deliverConfigSnapshot(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeliverConfigSnapshotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeliverConfigSnapshotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DeliverConfigSnapshotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def describeAggregateComplianceByConfigRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregateComplianceByConfigRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAggregateComplianceByConfigRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregateComplianceByConfigRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregateComplianceByConfigRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def describeAggregateComplianceByConfigRules(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregateComplianceByConfigRulesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregateComplianceByConfigRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAggregateComplianceByConfigRules(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregateComplianceByConfigRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregateComplianceByConfigRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregateComplianceByConfigRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  def describeAggregationAuthorizations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregationAuthorizationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAggregationAuthorizations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregationAuthorizationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregationAuthorizationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  def describeAggregationAuthorizations(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregationAuthorizationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregationAuthorizationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAggregationAuthorizations(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregationAuthorizationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregationAuthorizationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeAggregationAuthorizationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns the number of AWS resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If AWS Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByConfigRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeComplianceByConfigRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByConfigRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Indicates whether the specified AWS Config rules are compliant. If a rule is noncompliant, this action returns the number of AWS resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If AWS Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByConfigRule(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByConfigRuleRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeComplianceByConfigRule(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByConfigRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByConfigRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns the number of AWS Config rules that the resource does not comply with. A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If AWS Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeComplianceByResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Indicates whether the specified AWS resources are compliant. If a resource is noncompliant, this action returns the number of AWS Config rules that the resource does not comply with. A resource is compliant if it complies with all the AWS Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If AWS Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   AWS Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's AWS Lambda function is failing to send evaluation results to AWS Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the AWS Lambda execution role includes the config:PutEvaluations permission.   The rule's AWS Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByResource(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeComplianceByResource(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeComplianceByResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns status information for each of your AWS managed Config rules. The status includes information such as the last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error for the last failure.
    */
  def describeConfigRuleEvaluationStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRuleEvaluationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigRuleEvaluationStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRuleEvaluationStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRuleEvaluationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns status information for each of your AWS managed Config rules. The status includes information such as the last time AWS Config invoked the rule, the last time AWS Config failed to invoke the rule, and the related error for the last failure.
    */
  def describeConfigRuleEvaluationStatus(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRuleEvaluationStatusRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRuleEvaluationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigRuleEvaluationStatus(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRuleEvaluationStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRuleEvaluationStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRuleEvaluationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns details about your AWS Config rules.
    */
  def describeConfigRules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigRules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns details about your AWS Config rules.
    */
  def describeConfigRules(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRulesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigRules(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigRulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns status information for sources within an aggregator. The status includes information about the last time AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the status contains the related error code or message. 
    */
  def describeConfigurationAggregatorSourcesStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorSourcesStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationAggregatorSourcesStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorSourcesStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorSourcesStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns status information for sources within an aggregator. The status includes information about the last time AWS Config verified authorization between the source account and an aggregator account. In case of a failure, the status contains the related error code or message. 
    */
  def describeConfigurationAggregatorSourcesStatus(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorSourcesStatusRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorSourcesStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationAggregatorSourcesStatus(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorSourcesStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorSourcesStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorSourcesStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
    */
  def describeConfigurationAggregators(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationAggregators(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
    */
  def describeConfigurationAggregators(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationAggregators(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationAggregatorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorderStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecorderStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationRecorderStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecorderStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecorderStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorderStatus(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecorderStatusRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecorderStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationRecorderStatus(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecorderStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecorderStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecorderStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorders(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecordersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationRecorders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecordersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecordersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorders(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecordersRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecordersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeConfigurationRecorders(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecordersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecordersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeConfigurationRecordersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannelStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDeliveryChannelStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannelStatus(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDeliveryChannelStatus(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDeliveryChannels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannels(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDeliveryChannels(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeDeliveryChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of all pending aggregation requests.
    */
  def describePendingAggregationRequests(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribePendingAggregationRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePendingAggregationRequests(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribePendingAggregationRequestsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribePendingAggregationRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of all pending aggregation requests.
    */
  def describePendingAggregationRequests(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribePendingAggregationRequestsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribePendingAggregationRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePendingAggregationRequests(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribePendingAggregationRequestsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribePendingAggregationRequestsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribePendingAggregationRequestsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of one or more remediation configurations.
    */
  def describeRemediationConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRemediationConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of one or more remediation configurations.
    */
  def describeRemediationConfigurations(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationConfigurationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRemediationConfigurations(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when steps for the remediation execution occur, and any error messages for steps that have failed. When you specify the limit and the next token, you receive a paginated response.
    */
  def describeRemediationExecutionStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationExecutionStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRemediationExecutionStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationExecutionStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationExecutionStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when steps for the remediation execution occur, and any error messages for steps that have failed. When you specify the limit and the next token, you receive a paginated response.
    */
  def describeRemediationExecutionStatus(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationExecutionStatusRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationExecutionStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRemediationExecutionStatus(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationExecutionStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationExecutionStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRemediationExecutionStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  def describeRetentionConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRetentionConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRetentionConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRetentionConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRetentionConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  def describeRetentionConfigurations(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRetentionConfigurationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRetentionConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRetentionConfigurations(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRetentionConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRetentionConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.DescribeRetentionConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateComplianceDetailsByConfigRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateComplianceDetailsByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAggregateComplianceDetailsByConfigRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateComplianceDetailsByConfigRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateComplianceDetailsByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the evaluation results for the specified AWS Config rule for a specific resource in a rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateComplianceDetailsByConfigRule(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateComplianceDetailsByConfigRuleRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateComplianceDetailsByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAggregateComplianceDetailsByConfigRule(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateComplianceDetailsByConfigRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateComplianceDetailsByConfigRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateComplianceDetailsByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateConfigRuleComplianceSummary(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateConfigRuleComplianceSummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAggregateConfigRuleComplianceSummary(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateConfigRuleComplianceSummaryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateConfigRuleComplianceSummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateConfigRuleComplianceSummary(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateConfigRuleComplianceSummaryRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateConfigRuleComplianceSummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAggregateConfigRuleComplianceSummary(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateConfigRuleComplianceSummaryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateConfigRuleComplianceSummaryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateConfigRuleComplianceSummaryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
    */
  def getAggregateDiscoveredResourceCounts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateDiscoveredResourceCountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAggregateDiscoveredResourceCounts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateDiscoveredResourceCountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateDiscoveredResourceCountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the resource counts across accounts and regions that are present in your AWS Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
    */
  def getAggregateDiscoveredResourceCounts(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateDiscoveredResourceCountsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateDiscoveredResourceCountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAggregateDiscoveredResourceCounts(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateDiscoveredResourceCountsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateDiscoveredResourceCountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateDiscoveredResourceCountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
    */
  def getAggregateResourceConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAggregateResourceConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateResourceConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
    */
  def getAggregateResourceConfig(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateResourceConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAggregateResourceConfig(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateResourceConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateResourceConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetAggregateResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
    */
  def getComplianceDetailsByConfigRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getComplianceDetailsByConfigRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByConfigRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the evaluation results for the specified AWS Config rule. The results indicate which AWS resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
    */
  def getComplianceDetailsByConfigRule(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByConfigRuleRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getComplianceDetailsByConfigRule(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByConfigRuleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByConfigRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
    */
  def getComplianceDetailsByResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getComplianceDetailsByResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the evaluation results for the specified AWS resource. The results indicate which AWS Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
    */
  def getComplianceDetailsByResource(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByResourceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getComplianceDetailsByResource(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceDetailsByResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the number of AWS Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
    */
  def getComplianceSummaryByConfigRule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getComplianceSummaryByConfigRule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByConfigRuleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByConfigRuleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
    */
  def getComplianceSummaryByResourceType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByResourceTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getComplianceSummaryByResourceType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByResourceTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByResourceTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
    */
  def getComplianceSummaryByResourceType(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByResourceTypeRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByResourceTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getComplianceSummaryByResourceType(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByResourceTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByResourceTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetComplianceSummaryByResourceTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in this region for your AWS account.   Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    AWS Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, AWS Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new AWS Config customer.   You just enabled resource recording.   It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
    */
  def getDiscoveredResourceCounts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetDiscoveredResourceCountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDiscoveredResourceCounts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetDiscoveredResourceCountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetDiscoveredResourceCountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in this region for your AWS account.   Example    AWS Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    AWS Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, AWS Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new AWS Config customer.   You just enabled resource recording.   It might take a few minutes for AWS Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
    */
  def getDiscoveredResourceCounts(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetDiscoveredResourceCountsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetDiscoveredResourceCountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDiscoveredResourceCounts(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetDiscoveredResourceCountsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetDiscoveredResourceCountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetDiscoveredResourceCountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of configuration items for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
    */
  def getResourceConfigHistory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetResourceConfigHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResourceConfigHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetResourceConfigHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetResourceConfigHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of configuration items for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), AWS Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, AWS Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
    */
  def getResourceConfigHistory(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetResourceConfigHistoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetResourceConfigHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResourceConfigHistory(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetResourceConfigHistoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetResourceConfigHistoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.GetResourceConfigHistoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
    */
  def listAggregateDiscoveredResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListAggregateDiscoveredResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAggregateDiscoveredResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListAggregateDiscoveredResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListAggregateDiscoveredResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
    */
  def listAggregateDiscoveredResources(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListAggregateDiscoveredResourcesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListAggregateDiscoveredResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAggregateDiscoveredResources(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListAggregateDiscoveredResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListAggregateDiscoveredResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListAggregateDiscoveredResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
    */
  def listDiscoveredResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListDiscoveredResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDiscoveredResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListDiscoveredResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListDiscoveredResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that AWS Config has discovered, including those that AWS Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, AWS Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
    */
  def listDiscoveredResources(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListDiscoveredResourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListDiscoveredResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDiscoveredResources(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListDiscoveredResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListDiscoveredResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListDiscoveredResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the tags for AWS Config resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the tags for AWS Config resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Authorizes the aggregator account and region to collect data from the source account and region. 
    */
  def putAggregationAuthorization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutAggregationAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAggregationAuthorization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutAggregationAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutAggregationAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Authorizes the aggregator account and region to collect data from the source account and region. 
    */
  def putAggregationAuthorization(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutAggregationAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutAggregationAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAggregationAuthorization(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutAggregationAuthorizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutAggregationAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutAggregationAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired configurations. You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides. If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule invokes to evaluate your resources. When you use the PutConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  If you are adding an AWS managed Config rule, specify the rule's identifier for the SourceIdentifier key. To reference AWS managed Config rule identifiers, see About AWS Managed Config Rules. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by AWS Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. The maximum number of rules that AWS Config supports is 150. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide. For more information about developing and using AWS Config rules, see Evaluating AWS Resource Configurations with AWS Config in the AWS Config Developer Guide.
    */
  def putConfigRule(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putConfigRule(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or updates an AWS Config rule for evaluating whether your AWS resources comply with your desired configurations. You can use this action for custom AWS Config rules and AWS managed Config rules. A custom AWS Config rule is a rule that you develop and maintain. An AWS managed Config rule is a customizable, predefined rule that AWS Config provides. If you are adding a new custom AWS Config rule, you must first create the AWS Lambda function that the rule invokes to evaluate your resources. When you use the PutConfigRule action to add the rule to AWS Config, you must specify the Amazon Resource Name (ARN) that AWS Lambda assigns to the function. Specify the ARN for the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  If you are adding an AWS managed Config rule, specify the rule's identifier for the SourceIdentifier key. To reference AWS managed Config rule identifiers, see About AWS Managed Config Rules. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by AWS Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. The maximum number of rules that AWS Config supports is 150. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide. For more information about developing and using AWS Config rules, see Evaluating AWS Resource Configurations with AWS Config in the AWS Config Developer Guide.
    */
  def putConfigRule(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigRuleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putConfigRule(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigRuleRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  AWS Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the master account and all features must be enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration between AWS Config and AWS Organizations.  
    */
  def putConfigurationAggregator(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationAggregatorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putConfigurationAggregator(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationAggregatorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationAggregatorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  AWS Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the master account and all features must be enabled in your organization. AWS Config calls EnableAwsServiceAccess API to enable integration between AWS Config and AWS Organizations.  
    */
  def putConfigurationAggregator(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationAggregatorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationAggregatorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putConfigurationAggregator(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationAggregatorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationAggregatorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationAggregatorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
    */
  def putConfigurationRecorder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putConfigurationRecorder(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
    */
  def putConfigurationRecorder(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationRecorderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putConfigurationRecorder(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutConfigurationRecorderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
    */
  def putDeliveryChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putDeliveryChannel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
    */
  def putDeliveryChannel(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutDeliveryChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putDeliveryChannel(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutDeliveryChannelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS Lambda function that is invoked by an AWS Config rule.
    */
  def putEvaluations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutEvaluationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putEvaluations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutEvaluationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutEvaluationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Used by an AWS Lambda function to deliver evaluation results to AWS Config. This action is required in every AWS Lambda function that is invoked by an AWS Config rule.
    */
  def putEvaluations(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutEvaluationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutEvaluationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putEvaluations(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutEvaluationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutEvaluationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutEvaluationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action. The API creates the RemediationConfiguration object for the AWS Config rule. The AWS Config rule must already exist for you to add a remediation configuration. The target (SSM document) must exist and have permissions to use the target. 
    */
  def putRemediationConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRemediationConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putRemediationConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRemediationConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRemediationConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds or updates the remediation configuration with a specific AWS Config rule with the selected target or action. The API creates the RemediationConfiguration object for the AWS Config rule. The AWS Config rule must already exist for you to add a remediation configuration. The target (SSM document) must exist and have permissions to use the target. 
    */
  def putRemediationConfigurations(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRemediationConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRemediationConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putRemediationConfigurations(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRemediationConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRemediationConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRemediationConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates and updates the retention configuration with details about retention period (number of days) that AWS Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  def putRetentionConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRetentionConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putRetentionConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRetentionConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRetentionConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates and updates the retention configuration with details about retention period (number of days) that AWS Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  def putRetentionConfiguration(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRetentionConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRetentionConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putRetentionConfiguration(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRetentionConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRetentionConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.PutRetentionConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a structured query language (SQL) SELECT command, performs the corresponding search, and returns resource configurations matching the properties. For more information about query components, see the  Query Components  section in the AWS Config Developer Guide.
    */
  def selectResourceConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.SelectResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def selectResourceConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.SelectResourceConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.SelectResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Accepts a structured query language (SQL) SELECT command, performs the corresponding search, and returns resource configurations matching the properties. For more information about query components, see the  Query Components  section in the AWS Config Developer Guide.
    */
  def selectResourceConfig(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.SelectResourceConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.SelectResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def selectResourceConfig(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.SelectResourceConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.SelectResourceConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.SelectResourceConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 AWS Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, AWS Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   AWS Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
    */
  def startConfigRulesEvaluation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigRulesEvaluationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startConfigRulesEvaluation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigRulesEvaluationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigRulesEvaluationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Runs an on-demand evaluation for the specified AWS Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 AWS Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have AWS Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, AWS Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   AWS Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
    */
  def startConfigRulesEvaluation(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigRulesEvaluationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigRulesEvaluationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startConfigRulesEvaluation(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigRulesEvaluationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigRulesEvaluationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigRulesEvaluationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts recording configurations of the AWS resources you have selected to record in your AWS account. You must have created at least one delivery channel to successfully start the configuration recorder.
    */
  def startConfigurationRecorder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startConfigurationRecorder(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts recording configurations of the AWS resources you have selected to record in your AWS account. You must have created at least one delivery channel to successfully start the configuration recorder.
    */
  def startConfigurationRecorder(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigurationRecorderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startConfigurationRecorder(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartConfigurationRecorderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs an on-demand remediation for the specified AWS Config rules against the last known remediation configuration. It runs an execution against the current state of your resources. Remediation execution is asynchronous. You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified resource keys must complete before you can call the API again.
    */
  def startRemediationExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartRemediationExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startRemediationExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartRemediationExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartRemediationExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Runs an on-demand remediation for the specified AWS Config rules against the last known remediation configuration. It runs an execution against the current state of your resources. Remediation execution is asynchronous. You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified resource keys must complete before you can call the API again.
    */
  def startRemediationExecution(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartRemediationExecutionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartRemediationExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startRemediationExecution(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartRemediationExecutionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartRemediationExecutionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StartRemediationExecutionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
    */
  def stopConfigurationRecorder(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopConfigurationRecorder(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops recording configurations of the AWS resources you have selected to record in your AWS account.
    */
  def stopConfigurationRecorder(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StopConfigurationRecorderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopConfigurationRecorder(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.StopConfigurationRecorderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsConfigserviceMod.ConfigServiceNs.UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

