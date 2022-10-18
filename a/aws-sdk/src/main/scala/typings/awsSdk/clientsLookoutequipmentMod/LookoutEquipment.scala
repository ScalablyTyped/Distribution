package typings.awsSdk.clientsLookoutequipmentMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookoutEquipment extends Service {
  
  @JSName("config")
  var config_LookoutEquipment: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a container for a collection of data being ingested for analysis. The dataset contains the metadata describing where the data is and what the data actually looks like. In other words, it contains the location of the data source, the data schema, and other information. A dataset also contains any tags associated with the ingested data. 
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates a container for a collection of data being ingested for analysis. The dataset contains the metadata describing where the data is and what the data actually looks like. In other words, it contains the location of the data source, the data schema, and other information. A dataset also contains any tags associated with the ingested data. 
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    *  Creates a scheduled inference. Scheduling an inference is setting up a continuous real-time inference plan to analyze new measurement data. When setting up the schedule, you provide an S3 bucket location for the input data, assign it a delimiter between separate entries in the data, set an offset delay if desired, and set the frequency of inferencing. You must also provide an S3 bucket location for the output data. 
    */
  def createInferenceScheduler(): Request[CreateInferenceSchedulerResponse, AWSError] = js.native
  def createInferenceScheduler(callback: js.Function2[/* err */ AWSError, /* data */ CreateInferenceSchedulerResponse, Unit]): Request[CreateInferenceSchedulerResponse, AWSError] = js.native
  /**
    *  Creates a scheduled inference. Scheduling an inference is setting up a continuous real-time inference plan to analyze new measurement data. When setting up the schedule, you provide an S3 bucket location for the input data, assign it a delimiter between separate entries in the data, set an offset delay if desired, and set the frequency of inferencing. You must also provide an S3 bucket location for the output data. 
    */
  def createInferenceScheduler(params: CreateInferenceSchedulerRequest): Request[CreateInferenceSchedulerResponse, AWSError] = js.native
  def createInferenceScheduler(
    params: CreateInferenceSchedulerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInferenceSchedulerResponse, Unit]
  ): Request[CreateInferenceSchedulerResponse, AWSError] = js.native
  
  /**
    *  Creates a label for an event. 
    */
  def createLabel(): Request[CreateLabelResponse, AWSError] = js.native
  def createLabel(callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelResponse, Unit]): Request[CreateLabelResponse, AWSError] = js.native
  /**
    *  Creates a label for an event. 
    */
  def createLabel(params: CreateLabelRequest): Request[CreateLabelResponse, AWSError] = js.native
  def createLabel(
    params: CreateLabelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelResponse, Unit]
  ): Request[CreateLabelResponse, AWSError] = js.native
  
  /**
    *  Creates a group of labels. 
    */
  def createLabelGroup(): Request[CreateLabelGroupResponse, AWSError] = js.native
  def createLabelGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelGroupResponse, Unit]): Request[CreateLabelGroupResponse, AWSError] = js.native
  /**
    *  Creates a group of labels. 
    */
  def createLabelGroup(params: CreateLabelGroupRequest): Request[CreateLabelGroupResponse, AWSError] = js.native
  def createLabelGroup(
    params: CreateLabelGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLabelGroupResponse, Unit]
  ): Request[CreateLabelGroupResponse, AWSError] = js.native
  
  /**
    * Creates an ML model for data inference.  A machine-learning (ML) model is a mathematical model that finds patterns in your data. In Amazon Lookout for Equipment, the model learns the patterns of normal behavior and detects abnormal behavior that could be potential equipment failure (or maintenance events). The models are made by analyzing normal data and abnormalities in machine behavior that have already occurred. Your model is trained using a portion of the data from your dataset and uses that data to learn patterns of normal behavior and abnormal patterns that lead to equipment failure. Another portion of the data is used to evaluate the model's accuracy. 
    */
  def createModel(): Request[CreateModelResponse, AWSError] = js.native
  def createModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelResponse, Unit]): Request[CreateModelResponse, AWSError] = js.native
  /**
    * Creates an ML model for data inference.  A machine-learning (ML) model is a mathematical model that finds patterns in your data. In Amazon Lookout for Equipment, the model learns the patterns of normal behavior and detects abnormal behavior that could be potential equipment failure (or maintenance events). The models are made by analyzing normal data and abnormalities in machine behavior that have already occurred. Your model is trained using a portion of the data from your dataset and uses that data to learn patterns of normal behavior and abnormal patterns that lead to equipment failure. Another portion of the data is used to evaluate the model's accuracy. 
    */
  def createModel(params: CreateModelRequest): Request[CreateModelResponse, AWSError] = js.native
  def createModel(
    params: CreateModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelResponse, Unit]
  ): Request[CreateModelResponse, AWSError] = js.native
  
  /**
    *  Deletes a dataset and associated artifacts. The operation will check to see if any inference scheduler or data ingestion job is currently using the dataset, and if there isn't, the dataset, its metadata, and any associated data stored in S3 will be deleted. This does not affect any models that used this dataset for training and evaluation, but does prevent it from being used in the future. 
    */
  def deleteDataset(): Request[js.Object, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes a dataset and associated artifacts. The operation will check to see if any inference scheduler or data ingestion job is currently using the dataset, and if there isn't, the dataset, its metadata, and any associated data stored in S3 will be deleted. This does not affect any models that used this dataset for training and evaluation, but does prevent it from being used in the future. 
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[js.Object, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an inference scheduler that has been set up. Already processed output results are not affected. 
    */
  def deleteInferenceScheduler(): Request[js.Object, AWSError] = js.native
  def deleteInferenceScheduler(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an inference scheduler that has been set up. Already processed output results are not affected. 
    */
  def deleteInferenceScheduler(params: DeleteInferenceSchedulerRequest): Request[js.Object, AWSError] = js.native
  def deleteInferenceScheduler(
    params: DeleteInferenceSchedulerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Deletes a label. 
    */
  def deleteLabel(): Request[js.Object, AWSError] = js.native
  def deleteLabel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes a label. 
    */
  def deleteLabel(params: DeleteLabelRequest): Request[js.Object, AWSError] = js.native
  def deleteLabel(params: DeleteLabelRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    *  Deletes a group of labels. 
    */
  def deleteLabelGroup(): Request[js.Object, AWSError] = js.native
  def deleteLabelGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Deletes a group of labels. 
    */
  def deleteLabelGroup(params: DeleteLabelGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteLabelGroup(
    params: DeleteLabelGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an ML model currently available for Amazon Lookout for Equipment. This will prevent it from being used with an inference scheduler, even one that is already set up. 
    */
  def deleteModel(): Request[js.Object, AWSError] = js.native
  def deleteModel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an ML model currently available for Amazon Lookout for Equipment. This will prevent it from being used with an inference scheduler, even one that is already set up. 
    */
  def deleteModel(params: DeleteModelRequest): Request[js.Object, AWSError] = js.native
  def deleteModel(params: DeleteModelRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Provides information on a specific data ingestion job such as creation time, dataset ARN, and status.
    */
  def describeDataIngestionJob(): Request[DescribeDataIngestionJobResponse, AWSError] = js.native
  def describeDataIngestionJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataIngestionJobResponse, Unit]): Request[DescribeDataIngestionJobResponse, AWSError] = js.native
  /**
    * Provides information on a specific data ingestion job such as creation time, dataset ARN, and status.
    */
  def describeDataIngestionJob(params: DescribeDataIngestionJobRequest): Request[DescribeDataIngestionJobResponse, AWSError] = js.native
  def describeDataIngestionJob(
    params: DescribeDataIngestionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataIngestionJobResponse, Unit]
  ): Request[DescribeDataIngestionJobResponse, AWSError] = js.native
  
  /**
    * Provides a JSON description of the data in each time series dataset, including names, column names, and data types.
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Provides a JSON description of the data in each time series dataset, including names, column names, and data types.
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  
  /**
    *  Specifies information about the inference scheduler being used, including name, model, status, and associated metadata 
    */
  def describeInferenceScheduler(): Request[DescribeInferenceSchedulerResponse, AWSError] = js.native
  def describeInferenceScheduler(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInferenceSchedulerResponse, Unit]): Request[DescribeInferenceSchedulerResponse, AWSError] = js.native
  /**
    *  Specifies information about the inference scheduler being used, including name, model, status, and associated metadata 
    */
  def describeInferenceScheduler(params: DescribeInferenceSchedulerRequest): Request[DescribeInferenceSchedulerResponse, AWSError] = js.native
  def describeInferenceScheduler(
    params: DescribeInferenceSchedulerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInferenceSchedulerResponse, Unit]
  ): Request[DescribeInferenceSchedulerResponse, AWSError] = js.native
  
  /**
    *  Returns the name of the label. 
    */
  def describeLabel(): Request[DescribeLabelResponse, AWSError] = js.native
  def describeLabel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLabelResponse, Unit]): Request[DescribeLabelResponse, AWSError] = js.native
  /**
    *  Returns the name of the label. 
    */
  def describeLabel(params: DescribeLabelRequest): Request[DescribeLabelResponse, AWSError] = js.native
  def describeLabel(
    params: DescribeLabelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLabelResponse, Unit]
  ): Request[DescribeLabelResponse, AWSError] = js.native
  
  /**
    *  Returns information about the label group. 
    */
  def describeLabelGroup(): Request[DescribeLabelGroupResponse, AWSError] = js.native
  def describeLabelGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLabelGroupResponse, Unit]): Request[DescribeLabelGroupResponse, AWSError] = js.native
  /**
    *  Returns information about the label group. 
    */
  def describeLabelGroup(params: DescribeLabelGroupRequest): Request[DescribeLabelGroupResponse, AWSError] = js.native
  def describeLabelGroup(
    params: DescribeLabelGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLabelGroupResponse, Unit]
  ): Request[DescribeLabelGroupResponse, AWSError] = js.native
  
  /**
    * Provides a JSON containing the overall information about a specific ML model, including model name and ARN, dataset, training and evaluation information, status, and so on. 
    */
  def describeModel(): Request[DescribeModelResponse, AWSError] = js.native
  def describeModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelResponse, Unit]): Request[DescribeModelResponse, AWSError] = js.native
  /**
    * Provides a JSON containing the overall information about a specific ML model, including model name and ARN, dataset, training and evaluation information, status, and so on. 
    */
  def describeModel(params: DescribeModelRequest): Request[DescribeModelResponse, AWSError] = js.native
  def describeModel(
    params: DescribeModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelResponse, Unit]
  ): Request[DescribeModelResponse, AWSError] = js.native
  
  /**
    * Provides a list of all data ingestion jobs, including dataset name and ARN, S3 location of the input data, status, and so on. 
    */
  def listDataIngestionJobs(): Request[ListDataIngestionJobsResponse, AWSError] = js.native
  def listDataIngestionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDataIngestionJobsResponse, Unit]): Request[ListDataIngestionJobsResponse, AWSError] = js.native
  /**
    * Provides a list of all data ingestion jobs, including dataset name and ARN, S3 location of the input data, status, and so on. 
    */
  def listDataIngestionJobs(params: ListDataIngestionJobsRequest): Request[ListDataIngestionJobsResponse, AWSError] = js.native
  def listDataIngestionJobs(
    params: ListDataIngestionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataIngestionJobsResponse, Unit]
  ): Request[ListDataIngestionJobsResponse, AWSError] = js.native
  
  /**
    * Lists all datasets currently available in your account, filtering on the dataset name. 
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Lists all datasets currently available in your account, filtering on the dataset name. 
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  
  /**
    *  Lists all inference events that have been found for the specified inference scheduler. 
    */
  def listInferenceEvents(): Request[ListInferenceEventsResponse, AWSError] = js.native
  def listInferenceEvents(callback: js.Function2[/* err */ AWSError, /* data */ ListInferenceEventsResponse, Unit]): Request[ListInferenceEventsResponse, AWSError] = js.native
  /**
    *  Lists all inference events that have been found for the specified inference scheduler. 
    */
  def listInferenceEvents(params: ListInferenceEventsRequest): Request[ListInferenceEventsResponse, AWSError] = js.native
  def listInferenceEvents(
    params: ListInferenceEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInferenceEventsResponse, Unit]
  ): Request[ListInferenceEventsResponse, AWSError] = js.native
  
  /**
    *  Lists all inference executions that have been performed by the specified inference scheduler. 
    */
  def listInferenceExecutions(): Request[ListInferenceExecutionsResponse, AWSError] = js.native
  def listInferenceExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListInferenceExecutionsResponse, Unit]): Request[ListInferenceExecutionsResponse, AWSError] = js.native
  /**
    *  Lists all inference executions that have been performed by the specified inference scheduler. 
    */
  def listInferenceExecutions(params: ListInferenceExecutionsRequest): Request[ListInferenceExecutionsResponse, AWSError] = js.native
  def listInferenceExecutions(
    params: ListInferenceExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInferenceExecutionsResponse, Unit]
  ): Request[ListInferenceExecutionsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of all inference schedulers currently available for your account. 
    */
  def listInferenceSchedulers(): Request[ListInferenceSchedulersResponse, AWSError] = js.native
  def listInferenceSchedulers(callback: js.Function2[/* err */ AWSError, /* data */ ListInferenceSchedulersResponse, Unit]): Request[ListInferenceSchedulersResponse, AWSError] = js.native
  /**
    * Retrieves a list of all inference schedulers currently available for your account. 
    */
  def listInferenceSchedulers(params: ListInferenceSchedulersRequest): Request[ListInferenceSchedulersResponse, AWSError] = js.native
  def listInferenceSchedulers(
    params: ListInferenceSchedulersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInferenceSchedulersResponse, Unit]
  ): Request[ListInferenceSchedulersResponse, AWSError] = js.native
  
  /**
    *  Returns a list of the label groups. 
    */
  def listLabelGroups(): Request[ListLabelGroupsResponse, AWSError] = js.native
  def listLabelGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListLabelGroupsResponse, Unit]): Request[ListLabelGroupsResponse, AWSError] = js.native
  /**
    *  Returns a list of the label groups. 
    */
  def listLabelGroups(params: ListLabelGroupsRequest): Request[ListLabelGroupsResponse, AWSError] = js.native
  def listLabelGroups(
    params: ListLabelGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLabelGroupsResponse, Unit]
  ): Request[ListLabelGroupsResponse, AWSError] = js.native
  
  /**
    *  Provides a list of labels. 
    */
  def listLabels(): Request[ListLabelsResponse, AWSError] = js.native
  def listLabels(callback: js.Function2[/* err */ AWSError, /* data */ ListLabelsResponse, Unit]): Request[ListLabelsResponse, AWSError] = js.native
  /**
    *  Provides a list of labels. 
    */
  def listLabels(params: ListLabelsRequest): Request[ListLabelsResponse, AWSError] = js.native
  def listLabels(
    params: ListLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLabelsResponse, Unit]
  ): Request[ListLabelsResponse, AWSError] = js.native
  
  /**
    * Generates a list of all models in the account, including model name and ARN, dataset, and status. 
    */
  def listModels(): Request[ListModelsResponse, AWSError] = js.native
  def listModels(callback: js.Function2[/* err */ AWSError, /* data */ ListModelsResponse, Unit]): Request[ListModelsResponse, AWSError] = js.native
  /**
    * Generates a list of all models in the account, including model name and ARN, dataset, and status. 
    */
  def listModels(params: ListModelsRequest): Request[ListModelsResponse, AWSError] = js.native
  def listModels(
    params: ListModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListModelsResponse, Unit]
  ): Request[ListModelsResponse, AWSError] = js.native
  
  /**
    *  Lists statistics about the data collected for each of the sensors that have been successfully ingested in the particular dataset. Can also be used to retreive Sensor Statistics for a previous ingestion job. 
    */
  def listSensorStatistics(): Request[ListSensorStatisticsResponse, AWSError] = js.native
  def listSensorStatistics(callback: js.Function2[/* err */ AWSError, /* data */ ListSensorStatisticsResponse, Unit]): Request[ListSensorStatisticsResponse, AWSError] = js.native
  /**
    *  Lists statistics about the data collected for each of the sensors that have been successfully ingested in the particular dataset. Can also be used to retreive Sensor Statistics for a previous ingestion job. 
    */
  def listSensorStatistics(params: ListSensorStatisticsRequest): Request[ListSensorStatisticsResponse, AWSError] = js.native
  def listSensorStatistics(
    params: ListSensorStatisticsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSensorStatisticsResponse, Unit]
  ): Request[ListSensorStatisticsResponse, AWSError] = js.native
  
  /**
    * Lists all the tags for a specified resource, including key and value. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all the tags for a specified resource, including key and value. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Starts a data ingestion job. Amazon Lookout for Equipment returns the job status. 
    */
  def startDataIngestionJob(): Request[StartDataIngestionJobResponse, AWSError] = js.native
  def startDataIngestionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartDataIngestionJobResponse, Unit]): Request[StartDataIngestionJobResponse, AWSError] = js.native
  /**
    * Starts a data ingestion job. Amazon Lookout for Equipment returns the job status. 
    */
  def startDataIngestionJob(params: StartDataIngestionJobRequest): Request[StartDataIngestionJobResponse, AWSError] = js.native
  def startDataIngestionJob(
    params: StartDataIngestionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDataIngestionJobResponse, Unit]
  ): Request[StartDataIngestionJobResponse, AWSError] = js.native
  
  /**
    * Starts an inference scheduler. 
    */
  def startInferenceScheduler(): Request[StartInferenceSchedulerResponse, AWSError] = js.native
  def startInferenceScheduler(callback: js.Function2[/* err */ AWSError, /* data */ StartInferenceSchedulerResponse, Unit]): Request[StartInferenceSchedulerResponse, AWSError] = js.native
  /**
    * Starts an inference scheduler. 
    */
  def startInferenceScheduler(params: StartInferenceSchedulerRequest): Request[StartInferenceSchedulerResponse, AWSError] = js.native
  def startInferenceScheduler(
    params: StartInferenceSchedulerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartInferenceSchedulerResponse, Unit]
  ): Request[StartInferenceSchedulerResponse, AWSError] = js.native
  
  /**
    * Stops an inference scheduler. 
    */
  def stopInferenceScheduler(): Request[StopInferenceSchedulerResponse, AWSError] = js.native
  def stopInferenceScheduler(callback: js.Function2[/* err */ AWSError, /* data */ StopInferenceSchedulerResponse, Unit]): Request[StopInferenceSchedulerResponse, AWSError] = js.native
  /**
    * Stops an inference scheduler. 
    */
  def stopInferenceScheduler(params: StopInferenceSchedulerRequest): Request[StopInferenceSchedulerResponse, AWSError] = js.native
  def stopInferenceScheduler(
    params: StopInferenceSchedulerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopInferenceSchedulerResponse, Unit]
  ): Request[StopInferenceSchedulerResponse, AWSError] = js.native
  
  /**
    * Associates a given tag to a resource in your account. A tag is a key-value pair which can be added to an Amazon Lookout for Equipment resource as metadata. Tags can be used for organizing your resources as well as helping you to search and filter by tag. Multiple tags can be added to a resource, either when you create it, or later. Up to 50 tags can be associated with each resource. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates a given tag to a resource in your account. A tag is a key-value pair which can be added to an Amazon Lookout for Equipment resource as metadata. Tags can be used for organizing your resources as well as helping you to search and filter by tag. Multiple tags can be added to a resource, either when you create it, or later. Up to 50 tags can be associated with each resource. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a specific tag from a given resource. The tag is specified by its key. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a specific tag from a given resource. The tag is specified by its key. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an inference scheduler. 
    */
  def updateInferenceScheduler(): Request[js.Object, AWSError] = js.native
  def updateInferenceScheduler(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an inference scheduler. 
    */
  def updateInferenceScheduler(params: UpdateInferenceSchedulerRequest): Request[js.Object, AWSError] = js.native
  def updateInferenceScheduler(
    params: UpdateInferenceSchedulerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  Updates the label group. 
    */
  def updateLabelGroup(): Request[js.Object, AWSError] = js.native
  def updateLabelGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  Updates the label group. 
    */
  def updateLabelGroup(params: UpdateLabelGroupRequest): Request[js.Object, AWSError] = js.native
  def updateLabelGroup(
    params: UpdateLabelGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
