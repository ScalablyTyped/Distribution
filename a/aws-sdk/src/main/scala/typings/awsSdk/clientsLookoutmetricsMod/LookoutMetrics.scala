package typings.awsSdk.clientsLookoutmetricsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookoutMetrics extends Service {
  
  /**
    * Activates an anomaly detector.
    */
  def activateAnomalyDetector(): Request[ActivateAnomalyDetectorResponse, AWSError] = js.native
  def activateAnomalyDetector(callback: js.Function2[/* err */ AWSError, /* data */ ActivateAnomalyDetectorResponse, Unit]): Request[ActivateAnomalyDetectorResponse, AWSError] = js.native
  /**
    * Activates an anomaly detector.
    */
  def activateAnomalyDetector(params: ActivateAnomalyDetectorRequest): Request[ActivateAnomalyDetectorResponse, AWSError] = js.native
  def activateAnomalyDetector(
    params: ActivateAnomalyDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ActivateAnomalyDetectorResponse, Unit]
  ): Request[ActivateAnomalyDetectorResponse, AWSError] = js.native
  
  /**
    * Runs a backtest for anomaly detection for the specified resource.
    */
  def backTestAnomalyDetector(): Request[BackTestAnomalyDetectorResponse, AWSError] = js.native
  def backTestAnomalyDetector(callback: js.Function2[/* err */ AWSError, /* data */ BackTestAnomalyDetectorResponse, Unit]): Request[BackTestAnomalyDetectorResponse, AWSError] = js.native
  /**
    * Runs a backtest for anomaly detection for the specified resource.
    */
  def backTestAnomalyDetector(params: BackTestAnomalyDetectorRequest): Request[BackTestAnomalyDetectorResponse, AWSError] = js.native
  def backTestAnomalyDetector(
    params: BackTestAnomalyDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BackTestAnomalyDetectorResponse, Unit]
  ): Request[BackTestAnomalyDetectorResponse, AWSError] = js.native
  
  @JSName("config")
  var config_LookoutMetrics: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an alert for an anomaly detector.
    */
  def createAlert(): Request[CreateAlertResponse, AWSError] = js.native
  def createAlert(callback: js.Function2[/* err */ AWSError, /* data */ CreateAlertResponse, Unit]): Request[CreateAlertResponse, AWSError] = js.native
  /**
    * Creates an alert for an anomaly detector.
    */
  def createAlert(params: CreateAlertRequest): Request[CreateAlertResponse, AWSError] = js.native
  def createAlert(
    params: CreateAlertRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAlertResponse, Unit]
  ): Request[CreateAlertResponse, AWSError] = js.native
  
  /**
    * Creates an anomaly detector.
    */
  def createAnomalyDetector(): Request[CreateAnomalyDetectorResponse, AWSError] = js.native
  def createAnomalyDetector(callback: js.Function2[/* err */ AWSError, /* data */ CreateAnomalyDetectorResponse, Unit]): Request[CreateAnomalyDetectorResponse, AWSError] = js.native
  /**
    * Creates an anomaly detector.
    */
  def createAnomalyDetector(params: CreateAnomalyDetectorRequest): Request[CreateAnomalyDetectorResponse, AWSError] = js.native
  def createAnomalyDetector(
    params: CreateAnomalyDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAnomalyDetectorResponse, Unit]
  ): Request[CreateAnomalyDetectorResponse, AWSError] = js.native
  
  /**
    * Creates a dataset.
    */
  def createMetricSet(): Request[CreateMetricSetResponse, AWSError] = js.native
  def createMetricSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateMetricSetResponse, Unit]): Request[CreateMetricSetResponse, AWSError] = js.native
  /**
    * Creates a dataset.
    */
  def createMetricSet(params: CreateMetricSetRequest): Request[CreateMetricSetResponse, AWSError] = js.native
  def createMetricSet(
    params: CreateMetricSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMetricSetResponse, Unit]
  ): Request[CreateMetricSetResponse, AWSError] = js.native
  
  /**
    * Deactivates an anomaly detector.
    */
  def deactivateAnomalyDetector(): Request[DeactivateAnomalyDetectorResponse, AWSError] = js.native
  def deactivateAnomalyDetector(callback: js.Function2[/* err */ AWSError, /* data */ DeactivateAnomalyDetectorResponse, Unit]): Request[DeactivateAnomalyDetectorResponse, AWSError] = js.native
  /**
    * Deactivates an anomaly detector.
    */
  def deactivateAnomalyDetector(params: DeactivateAnomalyDetectorRequest): Request[DeactivateAnomalyDetectorResponse, AWSError] = js.native
  def deactivateAnomalyDetector(
    params: DeactivateAnomalyDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeactivateAnomalyDetectorResponse, Unit]
  ): Request[DeactivateAnomalyDetectorResponse, AWSError] = js.native
  
  /**
    * Deletes an alert.
    */
  def deleteAlert(): Request[DeleteAlertResponse, AWSError] = js.native
  def deleteAlert(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAlertResponse, Unit]): Request[DeleteAlertResponse, AWSError] = js.native
  /**
    * Deletes an alert.
    */
  def deleteAlert(params: DeleteAlertRequest): Request[DeleteAlertResponse, AWSError] = js.native
  def deleteAlert(
    params: DeleteAlertRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAlertResponse, Unit]
  ): Request[DeleteAlertResponse, AWSError] = js.native
  
  /**
    * Deletes a detector. Deleting an anomaly detector will delete all of its corresponding resources including any configured datasets and alerts.
    */
  def deleteAnomalyDetector(): Request[DeleteAnomalyDetectorResponse, AWSError] = js.native
  def deleteAnomalyDetector(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnomalyDetectorResponse, Unit]): Request[DeleteAnomalyDetectorResponse, AWSError] = js.native
  /**
    * Deletes a detector. Deleting an anomaly detector will delete all of its corresponding resources including any configured datasets and alerts.
    */
  def deleteAnomalyDetector(params: DeleteAnomalyDetectorRequest): Request[DeleteAnomalyDetectorResponse, AWSError] = js.native
  def deleteAnomalyDetector(
    params: DeleteAnomalyDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnomalyDetectorResponse, Unit]
  ): Request[DeleteAnomalyDetectorResponse, AWSError] = js.native
  
  /**
    * Describes an alert. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def describeAlert(): Request[DescribeAlertResponse, AWSError] = js.native
  def describeAlert(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlertResponse, Unit]): Request[DescribeAlertResponse, AWSError] = js.native
  /**
    * Describes an alert. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def describeAlert(params: DescribeAlertRequest): Request[DescribeAlertResponse, AWSError] = js.native
  def describeAlert(
    params: DescribeAlertRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlertResponse, Unit]
  ): Request[DescribeAlertResponse, AWSError] = js.native
  
  /**
    * Returns information about the status of the specified anomaly detection jobs.
    */
  def describeAnomalyDetectionExecutions(): Request[DescribeAnomalyDetectionExecutionsResponse, AWSError] = js.native
  def describeAnomalyDetectionExecutions(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnomalyDetectionExecutionsResponse, Unit]
  ): Request[DescribeAnomalyDetectionExecutionsResponse, AWSError] = js.native
  /**
    * Returns information about the status of the specified anomaly detection jobs.
    */
  def describeAnomalyDetectionExecutions(params: DescribeAnomalyDetectionExecutionsRequest): Request[DescribeAnomalyDetectionExecutionsResponse, AWSError] = js.native
  def describeAnomalyDetectionExecutions(
    params: DescribeAnomalyDetectionExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnomalyDetectionExecutionsResponse, Unit]
  ): Request[DescribeAnomalyDetectionExecutionsResponse, AWSError] = js.native
  
  /**
    * Describes a detector. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def describeAnomalyDetector(): Request[DescribeAnomalyDetectorResponse, AWSError] = js.native
  def describeAnomalyDetector(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnomalyDetectorResponse, Unit]): Request[DescribeAnomalyDetectorResponse, AWSError] = js.native
  /**
    * Describes a detector. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def describeAnomalyDetector(params: DescribeAnomalyDetectorRequest): Request[DescribeAnomalyDetectorResponse, AWSError] = js.native
  def describeAnomalyDetector(
    params: DescribeAnomalyDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnomalyDetectorResponse, Unit]
  ): Request[DescribeAnomalyDetectorResponse, AWSError] = js.native
  
  /**
    * Describes a dataset. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def describeMetricSet(): Request[DescribeMetricSetResponse, AWSError] = js.native
  def describeMetricSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMetricSetResponse, Unit]): Request[DescribeMetricSetResponse, AWSError] = js.native
  /**
    * Describes a dataset. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def describeMetricSet(params: DescribeMetricSetRequest): Request[DescribeMetricSetResponse, AWSError] = js.native
  def describeMetricSet(
    params: DescribeMetricSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMetricSetResponse, Unit]
  ): Request[DescribeMetricSetResponse, AWSError] = js.native
  
  /**
    * Detects an Amazon S3 dataset's file format, interval, and offset.
    */
  def detectMetricSetConfig(): Request[DetectMetricSetConfigResponse, AWSError] = js.native
  def detectMetricSetConfig(callback: js.Function2[/* err */ AWSError, /* data */ DetectMetricSetConfigResponse, Unit]): Request[DetectMetricSetConfigResponse, AWSError] = js.native
  /**
    * Detects an Amazon S3 dataset's file format, interval, and offset.
    */
  def detectMetricSetConfig(params: DetectMetricSetConfigRequest): Request[DetectMetricSetConfigResponse, AWSError] = js.native
  def detectMetricSetConfig(
    params: DetectMetricSetConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectMetricSetConfigResponse, Unit]
  ): Request[DetectMetricSetConfigResponse, AWSError] = js.native
  
  /**
    * Returns details about a group of anomalous metrics.
    */
  def getAnomalyGroup(): Request[GetAnomalyGroupResponse, AWSError] = js.native
  def getAnomalyGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetAnomalyGroupResponse, Unit]): Request[GetAnomalyGroupResponse, AWSError] = js.native
  /**
    * Returns details about a group of anomalous metrics.
    */
  def getAnomalyGroup(params: GetAnomalyGroupRequest): Request[GetAnomalyGroupResponse, AWSError] = js.native
  def getAnomalyGroup(
    params: GetAnomalyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAnomalyGroupResponse, Unit]
  ): Request[GetAnomalyGroupResponse, AWSError] = js.native
  
  /**
    * Returns details about the requested data quality metrics.
    */
  def getDataQualityMetrics(): Request[GetDataQualityMetricsResponse, AWSError] = js.native
  def getDataQualityMetrics(callback: js.Function2[/* err */ AWSError, /* data */ GetDataQualityMetricsResponse, Unit]): Request[GetDataQualityMetricsResponse, AWSError] = js.native
  /**
    * Returns details about the requested data quality metrics.
    */
  def getDataQualityMetrics(params: GetDataQualityMetricsRequest): Request[GetDataQualityMetricsResponse, AWSError] = js.native
  def getDataQualityMetrics(
    params: GetDataQualityMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataQualityMetricsResponse, Unit]
  ): Request[GetDataQualityMetricsResponse, AWSError] = js.native
  
  /**
    * Get feedback for an anomaly group.
    */
  def getFeedback(): Request[GetFeedbackResponse, AWSError] = js.native
  def getFeedback(callback: js.Function2[/* err */ AWSError, /* data */ GetFeedbackResponse, Unit]): Request[GetFeedbackResponse, AWSError] = js.native
  /**
    * Get feedback for an anomaly group.
    */
  def getFeedback(params: GetFeedbackRequest): Request[GetFeedbackResponse, AWSError] = js.native
  def getFeedback(
    params: GetFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFeedbackResponse, Unit]
  ): Request[GetFeedbackResponse, AWSError] = js.native
  
  /**
    * Returns a selection of sample records from an Amazon S3 datasource.
    */
  def getSampleData(): Request[GetSampleDataResponse, AWSError] = js.native
  def getSampleData(callback: js.Function2[/* err */ AWSError, /* data */ GetSampleDataResponse, Unit]): Request[GetSampleDataResponse, AWSError] = js.native
  /**
    * Returns a selection of sample records from an Amazon S3 datasource.
    */
  def getSampleData(params: GetSampleDataRequest): Request[GetSampleDataResponse, AWSError] = js.native
  def getSampleData(
    params: GetSampleDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSampleDataResponse, Unit]
  ): Request[GetSampleDataResponse, AWSError] = js.native
  
  /**
    * Lists the alerts attached to a detector. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def listAlerts(): Request[ListAlertsResponse, AWSError] = js.native
  def listAlerts(callback: js.Function2[/* err */ AWSError, /* data */ ListAlertsResponse, Unit]): Request[ListAlertsResponse, AWSError] = js.native
  /**
    * Lists the alerts attached to a detector. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def listAlerts(params: ListAlertsRequest): Request[ListAlertsResponse, AWSError] = js.native
  def listAlerts(
    params: ListAlertsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAlertsResponse, Unit]
  ): Request[ListAlertsResponse, AWSError] = js.native
  
  /**
    * Lists the detectors in the current AWS Region. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def listAnomalyDetectors(): Request[ListAnomalyDetectorsResponse, AWSError] = js.native
  def listAnomalyDetectors(callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalyDetectorsResponse, Unit]): Request[ListAnomalyDetectorsResponse, AWSError] = js.native
  /**
    * Lists the detectors in the current AWS Region. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def listAnomalyDetectors(params: ListAnomalyDetectorsRequest): Request[ListAnomalyDetectorsResponse, AWSError] = js.native
  def listAnomalyDetectors(
    params: ListAnomalyDetectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalyDetectorsResponse, Unit]
  ): Request[ListAnomalyDetectorsResponse, AWSError] = js.native
  
  /**
    * Returns a list of measures that are potential causes or effects of an anomaly group.
    */
  def listAnomalyGroupRelatedMetrics(): Request[ListAnomalyGroupRelatedMetricsResponse, AWSError] = js.native
  def listAnomalyGroupRelatedMetrics(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalyGroupRelatedMetricsResponse, Unit]
  ): Request[ListAnomalyGroupRelatedMetricsResponse, AWSError] = js.native
  /**
    * Returns a list of measures that are potential causes or effects of an anomaly group.
    */
  def listAnomalyGroupRelatedMetrics(params: ListAnomalyGroupRelatedMetricsRequest): Request[ListAnomalyGroupRelatedMetricsResponse, AWSError] = js.native
  def listAnomalyGroupRelatedMetrics(
    params: ListAnomalyGroupRelatedMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalyGroupRelatedMetricsResponse, Unit]
  ): Request[ListAnomalyGroupRelatedMetricsResponse, AWSError] = js.native
  
  /**
    * Returns a list of anomaly groups.
    */
  def listAnomalyGroupSummaries(): Request[ListAnomalyGroupSummariesResponse, AWSError] = js.native
  def listAnomalyGroupSummaries(callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalyGroupSummariesResponse, Unit]): Request[ListAnomalyGroupSummariesResponse, AWSError] = js.native
  /**
    * Returns a list of anomaly groups.
    */
  def listAnomalyGroupSummaries(params: ListAnomalyGroupSummariesRequest): Request[ListAnomalyGroupSummariesResponse, AWSError] = js.native
  def listAnomalyGroupSummaries(
    params: ListAnomalyGroupSummariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalyGroupSummariesResponse, Unit]
  ): Request[ListAnomalyGroupSummariesResponse, AWSError] = js.native
  
  /**
    * Gets a list of anomalous metrics for a measure in an anomaly group.
    */
  def listAnomalyGroupTimeSeries(): Request[ListAnomalyGroupTimeSeriesResponse, AWSError] = js.native
  def listAnomalyGroupTimeSeries(callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalyGroupTimeSeriesResponse, Unit]): Request[ListAnomalyGroupTimeSeriesResponse, AWSError] = js.native
  /**
    * Gets a list of anomalous metrics for a measure in an anomaly group.
    */
  def listAnomalyGroupTimeSeries(params: ListAnomalyGroupTimeSeriesRequest): Request[ListAnomalyGroupTimeSeriesResponse, AWSError] = js.native
  def listAnomalyGroupTimeSeries(
    params: ListAnomalyGroupTimeSeriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnomalyGroupTimeSeriesResponse, Unit]
  ): Request[ListAnomalyGroupTimeSeriesResponse, AWSError] = js.native
  
  /**
    * Lists the datasets in the current AWS Region. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def listMetricSets(): Request[ListMetricSetsResponse, AWSError] = js.native
  def listMetricSets(callback: js.Function2[/* err */ AWSError, /* data */ ListMetricSetsResponse, Unit]): Request[ListMetricSetsResponse, AWSError] = js.native
  /**
    * Lists the datasets in the current AWS Region. Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource immediately after creating or modifying it, use retries to allow time for the write operation to complete.
    */
  def listMetricSets(params: ListMetricSetsRequest): Request[ListMetricSetsResponse, AWSError] = js.native
  def listMetricSets(
    params: ListMetricSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMetricSetsResponse, Unit]
  ): Request[ListMetricSetsResponse, AWSError] = js.native
  
  /**
    * Gets a list of tags for a detector, dataset, or alert.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets a list of tags for a detector, dataset, or alert.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Add feedback for an anomalous metric.
    */
  def putFeedback(): Request[PutFeedbackResponse, AWSError] = js.native
  def putFeedback(callback: js.Function2[/* err */ AWSError, /* data */ PutFeedbackResponse, Unit]): Request[PutFeedbackResponse, AWSError] = js.native
  /**
    * Add feedback for an anomalous metric.
    */
  def putFeedback(params: PutFeedbackRequest): Request[PutFeedbackResponse, AWSError] = js.native
  def putFeedback(
    params: PutFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutFeedbackResponse, Unit]
  ): Request[PutFeedbackResponse, AWSError] = js.native
  
  /**
    * Adds tags to a detector, dataset, or alert.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds tags to a detector, dataset, or alert.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a detector, dataset, or alert.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a detector, dataset, or alert.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Make changes to an existing alert.
    */
  def updateAlert(): Request[UpdateAlertResponse, AWSError] = js.native
  def updateAlert(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAlertResponse, Unit]): Request[UpdateAlertResponse, AWSError] = js.native
  /**
    * Make changes to an existing alert.
    */
  def updateAlert(params: UpdateAlertRequest): Request[UpdateAlertResponse, AWSError] = js.native
  def updateAlert(
    params: UpdateAlertRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAlertResponse, Unit]
  ): Request[UpdateAlertResponse, AWSError] = js.native
  
  /**
    * Updates a detector. After activation, you can only change a detector's ingestion delay and description.
    */
  def updateAnomalyDetector(): Request[UpdateAnomalyDetectorResponse, AWSError] = js.native
  def updateAnomalyDetector(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnomalyDetectorResponse, Unit]): Request[UpdateAnomalyDetectorResponse, AWSError] = js.native
  /**
    * Updates a detector. After activation, you can only change a detector's ingestion delay and description.
    */
  def updateAnomalyDetector(params: UpdateAnomalyDetectorRequest): Request[UpdateAnomalyDetectorResponse, AWSError] = js.native
  def updateAnomalyDetector(
    params: UpdateAnomalyDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnomalyDetectorResponse, Unit]
  ): Request[UpdateAnomalyDetectorResponse, AWSError] = js.native
  
  /**
    * Updates a dataset.
    */
  def updateMetricSet(): Request[UpdateMetricSetResponse, AWSError] = js.native
  def updateMetricSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMetricSetResponse, Unit]): Request[UpdateMetricSetResponse, AWSError] = js.native
  /**
    * Updates a dataset.
    */
  def updateMetricSet(params: UpdateMetricSetRequest): Request[UpdateMetricSetResponse, AWSError] = js.native
  def updateMetricSet(
    params: UpdateMetricSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMetricSetResponse, Unit]
  ): Request[UpdateMetricSetResponse, AWSError] = js.native
}
