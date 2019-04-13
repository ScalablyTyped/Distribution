package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTAnalytics
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoTAnalytics: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Sends messages to a channel.
    */
  def batchPutMessage(): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchPutMessage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchPutMessageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends messages to a channel.
    */
  def batchPutMessage(params: BatchPutMessageRequest): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchPutMessage(
    params: BatchPutMessageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchPutMessageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels the reprocessing of data through the pipeline.
    */
  def cancelPipelineReprocessing(): awsDashSdkLib.libRequestMod.Request[CancelPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelPipelineReprocessing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelPipelineReprocessingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels the reprocessing of data through the pipeline.
    */
  def cancelPipelineReprocessing(params: CancelPipelineReprocessingRequest): awsDashSdkLib.libRequestMod.Request[CancelPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def cancelPipelineReprocessing(
    params: CancelPipelineReprocessingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CancelPipelineReprocessingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CancelPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before publishing the data to a pipeline.
    */
  def createChannel(): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before publishing the data to a pipeline.
    */
  def createChannel(params: CreateChannelRequest): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createChannel(
    params: CreateChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a "trigger" you specify.
    */
  def createDataset(): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a "trigger" you specify.
    */
  def createDataset(params: CreateDatasetRequest): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application).
    */
  def createDatasetContent(): awsDashSdkLib.libRequestMod.Request[CreateDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatasetContent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetContentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application).
    */
  def createDatasetContent(params: CreateDatasetContentRequest): awsDashSdkLib.libRequestMod.Request[CreateDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatasetContent(
    params: CreateDatasetContentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatasetContentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a data store, which is a repository for messages.
    */
  def createDatastore(): awsDashSdkLib.libRequestMod.Request[CreateDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatastore(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatastoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a data store, which is a repository for messages.
    */
  def createDatastore(params: CreateDatastoreRequest): awsDashSdkLib.libRequestMod.Request[CreateDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatastore(
    params: CreateDatastoreRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatastoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages before storing them in a data store. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def createPipeline(): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages before storing them in a data store. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def createPipeline(params: CreatePipelineRequest): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPipeline(
    params: CreatePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified channel.
    */
  def deleteChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteChannel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified channel.
    */
  def deleteChannel(params: DeleteChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteChannel(
    params: DeleteChannelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified data set. You do not have to delete the content of the data set before you perform this operation.
    */
  def deleteDataset(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataset(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified data set. You do not have to delete the content of the data set before you perform this operation.
    */
  def deleteDataset(params: DeleteDatasetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the content of the specified data set.
    */
  def deleteDatasetContent(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatasetContent(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the content of the specified data set.
    */
  def deleteDatasetContent(params: DeleteDatasetContentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatasetContent(
    params: DeleteDatasetContentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified data store.
    */
  def deleteDatastore(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatastore(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified data store.
    */
  def deleteDatastore(params: DeleteDatastoreRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatastore(
    params: DeleteDatastoreRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified pipeline.
    */
  def deletePipeline(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePipeline(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified pipeline.
    */
  def deletePipeline(params: DeletePipelineRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePipeline(
    params: DeletePipelineRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a channel.
    */
  def describeChannel(): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a channel.
    */
  def describeChannel(params: DescribeChannelRequest): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeChannel(
    params: DescribeChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeChannelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a data set.
    */
  def describeDataset(): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a data set.
    */
  def describeDataset(params: DescribeDatasetRequest): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a data store.
    */
  def describeDatastore(): awsDashSdkLib.libRequestMod.Request[DescribeDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDatastore(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatastoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a data store.
    */
  def describeDatastore(params: DescribeDatastoreRequest): awsDashSdkLib.libRequestMod.Request[DescribeDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDatastore(
    params: DescribeDatastoreRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDatastoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDatastoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Analytics logging options.
    */
  def describeLoggingOptions(): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoggingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Analytics logging options.
    */
  def describeLoggingOptions(params: DescribeLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoggingOptions(
    params: DescribeLoggingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a pipeline.
    */
  def describePipeline(): awsDashSdkLib.libRequestMod.Request[DescribePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a pipeline.
    */
  def describePipeline(params: DescribePipelineRequest): awsDashSdkLib.libRequestMod.Request[DescribePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describePipeline(
    params: DescribePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribePipelineResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the contents of a data set as pre-signed URIs.
    */
  def getDatasetContent(): awsDashSdkLib.libRequestMod.Request[GetDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDatasetContent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDatasetContentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the contents of a data set as pre-signed URIs.
    */
  def getDatasetContent(params: GetDatasetContentRequest): awsDashSdkLib.libRequestMod.Request[GetDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDatasetContent(
    params: GetDatasetContentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDatasetContentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDatasetContentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of channels.
    */
  def listChannels(): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listChannels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of channels.
    */
  def listChannels(params: ListChannelsRequest): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listChannels(
    params: ListChannelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListChannelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about data set contents that have been created.
    */
  def listDatasetContents(): awsDashSdkLib.libRequestMod.Request[ListDatasetContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasetContents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetContentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about data set contents that have been created.
    */
  def listDatasetContents(params: ListDatasetContentsRequest): awsDashSdkLib.libRequestMod.Request[ListDatasetContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasetContents(
    params: ListDatasetContentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetContentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetContentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about data sets.
    */
  def listDatasets(): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about data sets.
    */
  def listDatasets(params: ListDatasetsRequest): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatasetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatasetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of data stores.
    */
  def listDatastores(): awsDashSdkLib.libRequestMod.Request[ListDatastoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatastores(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatastoresResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatastoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of data stores.
    */
  def listDatastores(params: ListDatastoresRequest): awsDashSdkLib.libRequestMod.Request[ListDatastoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDatastores(
    params: ListDatastoresRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDatastoresResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDatastoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of pipelines.
    */
  def listPipelines(): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPipelines(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPipelinesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of pipelines.
    */
  def listPipelines(params: ListPipelinesRequest): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPipelines(
    params: ListPipelinesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPipelinesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPipelinesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags (metadata) which you have assigned to the resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags (metadata) which you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets or updates the AWS IoT Analytics logging options. Note that if you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect. 
    */
  def putLoggingOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLoggingOptions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets or updates the AWS IoT Analytics logging options. Note that if you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect. 
    */
  def putLoggingOptions(params: PutLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLoggingOptions(
    params: PutLoggingOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Simulates the results of running a pipeline activity on a message payload.
    */
  def runPipelineActivity(): awsDashSdkLib.libRequestMod.Request[RunPipelineActivityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def runPipelineActivity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RunPipelineActivityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RunPipelineActivityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Simulates the results of running a pipeline activity on a message payload.
    */
  def runPipelineActivity(params: RunPipelineActivityRequest): awsDashSdkLib.libRequestMod.Request[RunPipelineActivityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def runPipelineActivity(
    params: RunPipelineActivityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RunPipelineActivityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RunPipelineActivityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10 messages can be retrieved.
    */
  def sampleChannelData(): awsDashSdkLib.libRequestMod.Request[SampleChannelDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sampleChannelData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SampleChannelDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SampleChannelDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10 messages can be retrieved.
    */
  def sampleChannelData(params: SampleChannelDataRequest): awsDashSdkLib.libRequestMod.Request[SampleChannelDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sampleChannelData(
    params: SampleChannelDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SampleChannelDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SampleChannelDataResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the reprocessing of raw message data through the pipeline.
    */
  def startPipelineReprocessing(): awsDashSdkLib.libRequestMod.Request[StartPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startPipelineReprocessing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartPipelineReprocessingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the reprocessing of raw message data through the pipeline.
    */
  def startPipelineReprocessing(params: StartPipelineReprocessingRequest): awsDashSdkLib.libRequestMod.Request[StartPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startPipelineReprocessing(
    params: StartPipelineReprocessingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartPipelineReprocessingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartPipelineReprocessingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of a channel.
    */
  def updateChannel(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateChannel(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of a channel.
    */
  def updateChannel(params: UpdateChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateChannel(
    params: UpdateChannelRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of a data set.
    */
  def updateDataset(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDataset(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of a data set.
    */
  def updateDataset(params: UpdateDatasetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDataset(
    params: UpdateDatasetRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of a data store.
    */
  def updateDatastore(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDatastore(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of a data store.
    */
  def updateDatastore(params: UpdateDatastoreRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDatastore(
    params: UpdateDatastoreRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of a pipeline. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def updatePipeline(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePipeline(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings of a pipeline. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def updatePipeline(params: UpdatePipelineRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePipeline(
    params: UpdatePipelineRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

