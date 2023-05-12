package typings.awsSdk.clientsComputeoptimizerMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeOptimizer extends Service {
  
  @JSName("config")
  var config_ComputeOptimizer: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deletes a recommendation preference, such as enhanced infrastructure metrics. For more information, see Activating enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  def deleteRecommendationPreferences(): Request[DeleteRecommendationPreferencesResponse, AWSError] = js.native
  def deleteRecommendationPreferences(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRecommendationPreferencesResponse, Unit]
  ): Request[DeleteRecommendationPreferencesResponse, AWSError] = js.native
  /**
    * Deletes a recommendation preference, such as enhanced infrastructure metrics. For more information, see Activating enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  def deleteRecommendationPreferences(params: DeleteRecommendationPreferencesRequest): Request[DeleteRecommendationPreferencesResponse, AWSError] = js.native
  def deleteRecommendationPreferences(
    params: DeleteRecommendationPreferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRecommendationPreferencesResponse, Unit]
  ): Request[DeleteRecommendationPreferencesResponse, AWSError] = js.native
  
  /**
    * Describes recommendation export jobs created in the last seven days. Use the ExportAutoScalingGroupRecommendations or ExportEC2InstanceRecommendations actions to request an export of your recommendations. Then use the DescribeRecommendationExportJobs action to view your export jobs.
    */
  def describeRecommendationExportJobs(): Request[DescribeRecommendationExportJobsResponse, AWSError] = js.native
  def describeRecommendationExportJobs(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommendationExportJobsResponse, Unit]
  ): Request[DescribeRecommendationExportJobsResponse, AWSError] = js.native
  /**
    * Describes recommendation export jobs created in the last seven days. Use the ExportAutoScalingGroupRecommendations or ExportEC2InstanceRecommendations actions to request an export of your recommendations. Then use the DescribeRecommendationExportJobs action to view your export jobs.
    */
  def describeRecommendationExportJobs(params: DescribeRecommendationExportJobsRequest): Request[DescribeRecommendationExportJobsResponse, AWSError] = js.native
  def describeRecommendationExportJobs(
    params: DescribeRecommendationExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommendationExportJobsResponse, Unit]
  ): Request[DescribeRecommendationExportJobsResponse, AWSError] = js.native
  
  /**
    * Exports optimization recommendations for Auto Scaling groups. Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can have only one Auto Scaling group export job in progress per Amazon Web Services Region.
    */
  def exportAutoScalingGroupRecommendations(): Request[ExportAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  def exportAutoScalingGroupRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ ExportAutoScalingGroupRecommendationsResponse, Unit]
  ): Request[ExportAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  /**
    * Exports optimization recommendations for Auto Scaling groups. Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can have only one Auto Scaling group export job in progress per Amazon Web Services Region.
    */
  def exportAutoScalingGroupRecommendations(params: ExportAutoScalingGroupRecommendationsRequest): Request[ExportAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  def exportAutoScalingGroupRecommendations(
    params: ExportAutoScalingGroupRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportAutoScalingGroupRecommendationsResponse, Unit]
  ): Request[ExportAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  
  /**
    * Exports optimization recommendations for Amazon EBS volumes. Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can have only one Amazon EBS volume export job in progress per Amazon Web Services Region.
    */
  def exportEBSVolumeRecommendations(): Request[ExportEBSVolumeRecommendationsResponse, AWSError] = js.native
  def exportEBSVolumeRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ ExportEBSVolumeRecommendationsResponse, Unit]
  ): Request[ExportEBSVolumeRecommendationsResponse, AWSError] = js.native
  /**
    * Exports optimization recommendations for Amazon EBS volumes. Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can have only one Amazon EBS volume export job in progress per Amazon Web Services Region.
    */
  def exportEBSVolumeRecommendations(params: ExportEBSVolumeRecommendationsRequest): Request[ExportEBSVolumeRecommendationsResponse, AWSError] = js.native
  def exportEBSVolumeRecommendations(
    params: ExportEBSVolumeRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportEBSVolumeRecommendationsResponse, Unit]
  ): Request[ExportEBSVolumeRecommendationsResponse, AWSError] = js.native
  
  /**
    * Exports optimization recommendations for Amazon EC2 instances. Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can have only one Amazon EC2 instance export job in progress per Amazon Web Services Region.
    */
  def exportEC2InstanceRecommendations(): Request[ExportEC2InstanceRecommendationsResponse, AWSError] = js.native
  def exportEC2InstanceRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ ExportEC2InstanceRecommendationsResponse, Unit]
  ): Request[ExportEC2InstanceRecommendationsResponse, AWSError] = js.native
  /**
    * Exports optimization recommendations for Amazon EC2 instances. Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can have only one Amazon EC2 instance export job in progress per Amazon Web Services Region.
    */
  def exportEC2InstanceRecommendations(params: ExportEC2InstanceRecommendationsRequest): Request[ExportEC2InstanceRecommendationsResponse, AWSError] = js.native
  def exportEC2InstanceRecommendations(
    params: ExportEC2InstanceRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportEC2InstanceRecommendationsResponse, Unit]
  ): Request[ExportEC2InstanceRecommendationsResponse, AWSError] = js.native
  
  /**
    *  Exports optimization recommendations for Amazon ECS services on Fargate.  Recommendations are exported in a CSV file, and its metadata in a JSON file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can only have one Amazon ECS service export job in progress per Amazon Web Services Region.
    */
  def exportECSServiceRecommendations(): Request[ExportECSServiceRecommendationsResponse, AWSError] = js.native
  def exportECSServiceRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ ExportECSServiceRecommendationsResponse, Unit]
  ): Request[ExportECSServiceRecommendationsResponse, AWSError] = js.native
  /**
    *  Exports optimization recommendations for Amazon ECS services on Fargate.  Recommendations are exported in a CSV file, and its metadata in a JSON file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can only have one Amazon ECS service export job in progress per Amazon Web Services Region.
    */
  def exportECSServiceRecommendations(params: ExportECSServiceRecommendationsRequest): Request[ExportECSServiceRecommendationsResponse, AWSError] = js.native
  def exportECSServiceRecommendations(
    params: ExportECSServiceRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportECSServiceRecommendationsResponse, Unit]
  ): Request[ExportECSServiceRecommendationsResponse, AWSError] = js.native
  
  /**
    * Exports optimization recommendations for Lambda functions. Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can have only one Lambda function export job in progress per Amazon Web Services Region.
    */
  def exportLambdaFunctionRecommendations(): Request[ExportLambdaFunctionRecommendationsResponse, AWSError] = js.native
  def exportLambdaFunctionRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ ExportLambdaFunctionRecommendationsResponse, Unit]
  ): Request[ExportLambdaFunctionRecommendationsResponse, AWSError] = js.native
  /**
    * Exports optimization recommendations for Lambda functions. Recommendations are exported in a comma-separated values (.csv) file, and its metadata in a JavaScript Object Notation (JSON) (.json) file, to an existing Amazon Simple Storage Service (Amazon S3) bucket that you specify. For more information, see Exporting Recommendations in the Compute Optimizer User Guide. You can have only one Lambda function export job in progress per Amazon Web Services Region.
    */
  def exportLambdaFunctionRecommendations(params: ExportLambdaFunctionRecommendationsRequest): Request[ExportLambdaFunctionRecommendationsResponse, AWSError] = js.native
  def exportLambdaFunctionRecommendations(
    params: ExportLambdaFunctionRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportLambdaFunctionRecommendationsResponse, Unit]
  ): Request[ExportLambdaFunctionRecommendationsResponse, AWSError] = js.native
  
  /**
    * Returns Auto Scaling group recommendations. Compute Optimizer generates recommendations for Amazon EC2 Auto Scaling groups that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide.
    */
  def getAutoScalingGroupRecommendations(): Request[GetAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  def getAutoScalingGroupRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAutoScalingGroupRecommendationsResponse, Unit]
  ): Request[GetAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  /**
    * Returns Auto Scaling group recommendations. Compute Optimizer generates recommendations for Amazon EC2 Auto Scaling groups that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide.
    */
  def getAutoScalingGroupRecommendations(params: GetAutoScalingGroupRecommendationsRequest): Request[GetAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  def getAutoScalingGroupRecommendations(
    params: GetAutoScalingGroupRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAutoScalingGroupRecommendationsResponse, Unit]
  ): Request[GetAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  
  /**
    * Returns Amazon Elastic Block Store (Amazon EBS) volume recommendations. Compute Optimizer generates recommendations for Amazon EBS volumes that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide.
    */
  def getEBSVolumeRecommendations(): Request[GetEBSVolumeRecommendationsResponse, AWSError] = js.native
  def getEBSVolumeRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ GetEBSVolumeRecommendationsResponse, Unit]): Request[GetEBSVolumeRecommendationsResponse, AWSError] = js.native
  /**
    * Returns Amazon Elastic Block Store (Amazon EBS) volume recommendations. Compute Optimizer generates recommendations for Amazon EBS volumes that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide.
    */
  def getEBSVolumeRecommendations(params: GetEBSVolumeRecommendationsRequest): Request[GetEBSVolumeRecommendationsResponse, AWSError] = js.native
  def getEBSVolumeRecommendations(
    params: GetEBSVolumeRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEBSVolumeRecommendationsResponse, Unit]
  ): Request[GetEBSVolumeRecommendationsResponse, AWSError] = js.native
  
  /**
    * Returns Amazon EC2 instance recommendations. Compute Optimizer generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) instances that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide.
    */
  def getEC2InstanceRecommendations(): Request[GetEC2InstanceRecommendationsResponse, AWSError] = js.native
  def getEC2InstanceRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ GetEC2InstanceRecommendationsResponse, Unit]): Request[GetEC2InstanceRecommendationsResponse, AWSError] = js.native
  /**
    * Returns Amazon EC2 instance recommendations. Compute Optimizer generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) instances that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide.
    */
  def getEC2InstanceRecommendations(params: GetEC2InstanceRecommendationsRequest): Request[GetEC2InstanceRecommendationsResponse, AWSError] = js.native
  def getEC2InstanceRecommendations(
    params: GetEC2InstanceRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEC2InstanceRecommendationsResponse, Unit]
  ): Request[GetEC2InstanceRecommendationsResponse, AWSError] = js.native
  
  /**
    * Returns the projected utilization metrics of Amazon EC2 instance recommendations.  The Cpu and Memory metrics are the only projected utilization metrics returned when you run this action. Additionally, the Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  def getEC2RecommendationProjectedMetrics(): Request[GetEC2RecommendationProjectedMetricsResponse, AWSError] = js.native
  def getEC2RecommendationProjectedMetrics(
    callback: js.Function2[/* err */ AWSError, /* data */ GetEC2RecommendationProjectedMetricsResponse, Unit]
  ): Request[GetEC2RecommendationProjectedMetricsResponse, AWSError] = js.native
  /**
    * Returns the projected utilization metrics of Amazon EC2 instance recommendations.  The Cpu and Memory metrics are the only projected utilization metrics returned when you run this action. Additionally, the Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  def getEC2RecommendationProjectedMetrics(params: GetEC2RecommendationProjectedMetricsRequest): Request[GetEC2RecommendationProjectedMetricsResponse, AWSError] = js.native
  def getEC2RecommendationProjectedMetrics(
    params: GetEC2RecommendationProjectedMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEC2RecommendationProjectedMetricsResponse, Unit]
  ): Request[GetEC2RecommendationProjectedMetricsResponse, AWSError] = js.native
  
  /**
    *  Returns the projected metrics of Amazon ECS service recommendations. 
    */
  def getECSServiceRecommendationProjectedMetrics(): Request[GetECSServiceRecommendationProjectedMetricsResponse, AWSError] = js.native
  def getECSServiceRecommendationProjectedMetrics(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetECSServiceRecommendationProjectedMetricsResponse, 
      Unit
    ]
  ): Request[GetECSServiceRecommendationProjectedMetricsResponse, AWSError] = js.native
  /**
    *  Returns the projected metrics of Amazon ECS service recommendations. 
    */
  def getECSServiceRecommendationProjectedMetrics(params: GetECSServiceRecommendationProjectedMetricsRequest): Request[GetECSServiceRecommendationProjectedMetricsResponse, AWSError] = js.native
  def getECSServiceRecommendationProjectedMetrics(
    params: GetECSServiceRecommendationProjectedMetricsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetECSServiceRecommendationProjectedMetricsResponse, 
      Unit
    ]
  ): Request[GetECSServiceRecommendationProjectedMetricsResponse, AWSError] = js.native
  
  /**
    *  Returns Amazon ECS service recommendations.   Compute Optimizer generates recommendations for Amazon ECS services on Fargate that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide. 
    */
  def getECSServiceRecommendations(): Request[GetECSServiceRecommendationsResponse, AWSError] = js.native
  def getECSServiceRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ GetECSServiceRecommendationsResponse, Unit]): Request[GetECSServiceRecommendationsResponse, AWSError] = js.native
  /**
    *  Returns Amazon ECS service recommendations.   Compute Optimizer generates recommendations for Amazon ECS services on Fargate that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide. 
    */
  def getECSServiceRecommendations(params: GetECSServiceRecommendationsRequest): Request[GetECSServiceRecommendationsResponse, AWSError] = js.native
  def getECSServiceRecommendations(
    params: GetECSServiceRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetECSServiceRecommendationsResponse, Unit]
  ): Request[GetECSServiceRecommendationsResponse, AWSError] = js.native
  
  /**
    * Returns the recommendation preferences that are in effect for a given resource, such as enhanced infrastructure metrics. Considers all applicable preferences that you might have set at the resource, account, and organization level. When you create a recommendation preference, you can set its status to Active or Inactive. Use this action to view the recommendation preferences that are in effect, or Active.
    */
  def getEffectiveRecommendationPreferences(): Request[GetEffectiveRecommendationPreferencesResponse, AWSError] = js.native
  def getEffectiveRecommendationPreferences(
    callback: js.Function2[/* err */ AWSError, /* data */ GetEffectiveRecommendationPreferencesResponse, Unit]
  ): Request[GetEffectiveRecommendationPreferencesResponse, AWSError] = js.native
  /**
    * Returns the recommendation preferences that are in effect for a given resource, such as enhanced infrastructure metrics. Considers all applicable preferences that you might have set at the resource, account, and organization level. When you create a recommendation preference, you can set its status to Active or Inactive. Use this action to view the recommendation preferences that are in effect, or Active.
    */
  def getEffectiveRecommendationPreferences(params: GetEffectiveRecommendationPreferencesRequest): Request[GetEffectiveRecommendationPreferencesResponse, AWSError] = js.native
  def getEffectiveRecommendationPreferences(
    params: GetEffectiveRecommendationPreferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEffectiveRecommendationPreferencesResponse, Unit]
  ): Request[GetEffectiveRecommendationPreferencesResponse, AWSError] = js.native
  
  /**
    * Returns the enrollment (opt in) status of an account to the Compute Optimizer service. If the account is the management account of an organization, this action also confirms the enrollment status of member accounts of the organization. Use the GetEnrollmentStatusesForOrganization action to get detailed information about the enrollment status of member accounts of an organization.
    */
  def getEnrollmentStatus(): Request[GetEnrollmentStatusResponse, AWSError] = js.native
  def getEnrollmentStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetEnrollmentStatusResponse, Unit]): Request[GetEnrollmentStatusResponse, AWSError] = js.native
  /**
    * Returns the enrollment (opt in) status of an account to the Compute Optimizer service. If the account is the management account of an organization, this action also confirms the enrollment status of member accounts of the organization. Use the GetEnrollmentStatusesForOrganization action to get detailed information about the enrollment status of member accounts of an organization.
    */
  def getEnrollmentStatus(params: GetEnrollmentStatusRequest): Request[GetEnrollmentStatusResponse, AWSError] = js.native
  def getEnrollmentStatus(
    params: GetEnrollmentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnrollmentStatusResponse, Unit]
  ): Request[GetEnrollmentStatusResponse, AWSError] = js.native
  
  /**
    * Returns the Compute Optimizer enrollment (opt-in) status of organization member accounts, if your account is an organization management account. To get the enrollment status of standalone accounts, use the GetEnrollmentStatus action.
    */
  def getEnrollmentStatusesForOrganization(): Request[GetEnrollmentStatusesForOrganizationResponse, AWSError] = js.native
  def getEnrollmentStatusesForOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnrollmentStatusesForOrganizationResponse, Unit]
  ): Request[GetEnrollmentStatusesForOrganizationResponse, AWSError] = js.native
  /**
    * Returns the Compute Optimizer enrollment (opt-in) status of organization member accounts, if your account is an organization management account. To get the enrollment status of standalone accounts, use the GetEnrollmentStatus action.
    */
  def getEnrollmentStatusesForOrganization(params: GetEnrollmentStatusesForOrganizationRequest): Request[GetEnrollmentStatusesForOrganizationResponse, AWSError] = js.native
  def getEnrollmentStatusesForOrganization(
    params: GetEnrollmentStatusesForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnrollmentStatusesForOrganizationResponse, Unit]
  ): Request[GetEnrollmentStatusesForOrganizationResponse, AWSError] = js.native
  
  /**
    * Returns Lambda function recommendations. Compute Optimizer generates recommendations for functions that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide.
    */
  def getLambdaFunctionRecommendations(): Request[GetLambdaFunctionRecommendationsResponse, AWSError] = js.native
  def getLambdaFunctionRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetLambdaFunctionRecommendationsResponse, Unit]
  ): Request[GetLambdaFunctionRecommendationsResponse, AWSError] = js.native
  /**
    * Returns Lambda function recommendations. Compute Optimizer generates recommendations for functions that meet a specific set of requirements. For more information, see the Supported resources and requirements in the Compute Optimizer User Guide.
    */
  def getLambdaFunctionRecommendations(params: GetLambdaFunctionRecommendationsRequest): Request[GetLambdaFunctionRecommendationsResponse, AWSError] = js.native
  def getLambdaFunctionRecommendations(
    params: GetLambdaFunctionRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLambdaFunctionRecommendationsResponse, Unit]
  ): Request[GetLambdaFunctionRecommendationsResponse, AWSError] = js.native
  
  /**
    * Returns existing recommendation preferences, such as enhanced infrastructure metrics. Use the scope parameter to specify which preferences to return. You can specify to return preferences for an organization, a specific account ID, or a specific EC2 instance or Auto Scaling group Amazon Resource Name (ARN). For more information, see Activating enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  def getRecommendationPreferences(): Request[GetRecommendationPreferencesResponse, AWSError] = js.native
  def getRecommendationPreferences(callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationPreferencesResponse, Unit]): Request[GetRecommendationPreferencesResponse, AWSError] = js.native
  /**
    * Returns existing recommendation preferences, such as enhanced infrastructure metrics. Use the scope parameter to specify which preferences to return. You can specify to return preferences for an organization, a specific account ID, or a specific EC2 instance or Auto Scaling group Amazon Resource Name (ARN). For more information, see Activating enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  def getRecommendationPreferences(params: GetRecommendationPreferencesRequest): Request[GetRecommendationPreferencesResponse, AWSError] = js.native
  def getRecommendationPreferences(
    params: GetRecommendationPreferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationPreferencesResponse, Unit]
  ): Request[GetRecommendationPreferencesResponse, AWSError] = js.native
  
  /**
    * Returns the optimization findings for an account. It returns the number of:   Amazon EC2 instances in an account that are Underprovisioned, Overprovisioned, or Optimized.   Auto Scaling groups in an account that are NotOptimized, or Optimized.   Amazon EBS volumes in an account that are NotOptimized, or Optimized.   Lambda functions in an account that are NotOptimized, or Optimized.   Amazon ECS services in an account that are Underprovisioned, Overprovisioned, or Optimized.  
    */
  def getRecommendationSummaries(): Request[GetRecommendationSummariesResponse, AWSError] = js.native
  def getRecommendationSummaries(callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationSummariesResponse, Unit]): Request[GetRecommendationSummariesResponse, AWSError] = js.native
  /**
    * Returns the optimization findings for an account. It returns the number of:   Amazon EC2 instances in an account that are Underprovisioned, Overprovisioned, or Optimized.   Auto Scaling groups in an account that are NotOptimized, or Optimized.   Amazon EBS volumes in an account that are NotOptimized, or Optimized.   Lambda functions in an account that are NotOptimized, or Optimized.   Amazon ECS services in an account that are Underprovisioned, Overprovisioned, or Optimized.  
    */
  def getRecommendationSummaries(params: GetRecommendationSummariesRequest): Request[GetRecommendationSummariesResponse, AWSError] = js.native
  def getRecommendationSummaries(
    params: GetRecommendationSummariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationSummariesResponse, Unit]
  ): Request[GetRecommendationSummariesResponse, AWSError] = js.native
  
  /**
    * Creates a new recommendation preference or updates an existing recommendation preference, such as enhanced infrastructure metrics. For more information, see Activating enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  def putRecommendationPreferences(): Request[PutRecommendationPreferencesResponse, AWSError] = js.native
  def putRecommendationPreferences(callback: js.Function2[/* err */ AWSError, /* data */ PutRecommendationPreferencesResponse, Unit]): Request[PutRecommendationPreferencesResponse, AWSError] = js.native
  /**
    * Creates a new recommendation preference or updates an existing recommendation preference, such as enhanced infrastructure metrics. For more information, see Activating enhanced infrastructure metrics in the Compute Optimizer User Guide.
    */
  def putRecommendationPreferences(params: PutRecommendationPreferencesRequest): Request[PutRecommendationPreferencesResponse, AWSError] = js.native
  def putRecommendationPreferences(
    params: PutRecommendationPreferencesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRecommendationPreferencesResponse, Unit]
  ): Request[PutRecommendationPreferencesResponse, AWSError] = js.native
  
  /**
    * Updates the enrollment (opt in and opt out) status of an account to the Compute Optimizer service. If the account is a management account of an organization, this action can also be used to enroll member accounts of the organization. You must have the appropriate permissions to opt in to Compute Optimizer, to view its recommendations, and to opt out. For more information, see Controlling access with Amazon Web Services Identity and Access Management in the Compute Optimizer User Guide. When you opt in, Compute Optimizer automatically creates a service-linked role in your account to access its data. For more information, see Using Service-Linked Roles for Compute Optimizer in the Compute Optimizer User Guide.
    */
  def updateEnrollmentStatus(): Request[UpdateEnrollmentStatusResponse, AWSError] = js.native
  def updateEnrollmentStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnrollmentStatusResponse, Unit]): Request[UpdateEnrollmentStatusResponse, AWSError] = js.native
  /**
    * Updates the enrollment (opt in and opt out) status of an account to the Compute Optimizer service. If the account is a management account of an organization, this action can also be used to enroll member accounts of the organization. You must have the appropriate permissions to opt in to Compute Optimizer, to view its recommendations, and to opt out. For more information, see Controlling access with Amazon Web Services Identity and Access Management in the Compute Optimizer User Guide. When you opt in, Compute Optimizer automatically creates a service-linked role in your account to access its data. For more information, see Using Service-Linked Roles for Compute Optimizer in the Compute Optimizer User Guide.
    */
  def updateEnrollmentStatus(params: UpdateEnrollmentStatusRequest): Request[UpdateEnrollmentStatusResponse, AWSError] = js.native
  def updateEnrollmentStatus(
    params: UpdateEnrollmentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnrollmentStatusResponse, Unit]
  ): Request[UpdateEnrollmentStatusResponse, AWSError] = js.native
}
