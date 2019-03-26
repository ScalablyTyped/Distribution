package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTAnalytics
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoTAnalytics: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ClientConfiguration = js.native
  /**
    * Sends messages to a channel.
    */
  def batchPutMessage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.BatchPutMessageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchPutMessage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.BatchPutMessageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.BatchPutMessageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sends messages to a channel.
    */
  def batchPutMessage(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.BatchPutMessageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.BatchPutMessageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchPutMessage(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.BatchPutMessageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.BatchPutMessageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.BatchPutMessageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the reprocessing of data through the pipeline.
    */
  def cancelPipelineReprocessing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CancelPipelineReprocessingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelPipelineReprocessing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CancelPipelineReprocessingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CancelPipelineReprocessingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels the reprocessing of data through the pipeline.
    */
  def cancelPipelineReprocessing(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CancelPipelineReprocessingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CancelPipelineReprocessingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def cancelPipelineReprocessing(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CancelPipelineReprocessingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CancelPipelineReprocessingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CancelPipelineReprocessingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before publishing the data to a pipeline.
    */
  def createChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before publishing the data to a pipeline.
    */
  def createChannel(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createChannel(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a "trigger" you specify.
    */
  def createDataset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a "trigger" you specify.
    */
  def createDataset(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDataset(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application).
    */
  def createDatasetContent(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetContentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDatasetContent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetContentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetContentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a containerized application).
    */
  def createDatasetContent(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetContentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetContentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDatasetContent(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetContentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetContentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatasetContentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a data store, which is a repository for messages.
    */
  def createDatastore(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatastoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDatastore(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatastoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatastoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a data store, which is a repository for messages.
    */
  def createDatastore(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatastoreRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatastoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDatastore(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatastoreRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatastoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreateDatastoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages before storing them in a data store. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def createPipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages before storing them in a data store. You must specify both a channel and a datastore activity and, optionally, as many as 23 additional activities in the pipelineActivities array.
    */
  def createPipeline(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreatePipelineRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPipeline(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreatePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreatePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.CreatePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteChannel(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeleteChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteChannel(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeleteChannelRequest,
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
  def deleteDataset(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeleteDatasetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataset(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeleteDatasetRequest,
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
  def deleteDatasetContent(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeleteDatasetContentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatasetContent(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeleteDatasetContentRequest,
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
  def deleteDatastore(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeleteDatastoreRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatastore(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeleteDatastoreRequest,
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
  def deletePipeline(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeletePipelineRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePipeline(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DeletePipelineRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a channel.
    */
  def describeChannel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeChannel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a channel.
    */
  def describeChannel(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeChannelRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeChannel(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeChannelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeChannelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeChannelResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a data set.
    */
  def describeDataset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a data set.
    */
  def describeDataset(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatasetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDataset(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a data store.
    */
  def describeDatastore(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatastoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDatastore(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatastoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatastoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a data store.
    */
  def describeDatastore(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatastoreRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatastoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDatastore(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatastoreRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatastoreResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeDatastoreResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Analytics logging options.
    */
  def describeLoggingOptions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeLoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLoggingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeLoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Analytics logging options.
    */
  def describeLoggingOptions(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeLoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeLoggingOptions(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeLoggingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribeLoggingOptionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a pipeline.
    */
  def describePipeline(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePipeline(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a pipeline.
    */
  def describePipeline(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribePipelineRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePipeline(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribePipelineRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribePipelineResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.DescribePipelineResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the contents of a data set as pre-signed URIs.
    */
  def getDatasetContent(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.GetDatasetContentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDatasetContent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.GetDatasetContentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.GetDatasetContentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the contents of a data set as pre-signed URIs.
    */
  def getDatasetContent(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.GetDatasetContentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.GetDatasetContentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDatasetContent(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.GetDatasetContentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.GetDatasetContentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.GetDatasetContentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of channels.
    */
  def listChannels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listChannels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of channels.
    */
  def listChannels(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListChannelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listChannels(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListChannelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListChannelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListChannelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about data set contents that have been created.
    */
  def listDatasetContents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetContentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDatasetContents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetContentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetContentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about data set contents that have been created.
    */
  def listDatasetContents(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetContentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetContentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDatasetContents(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetContentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetContentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetContentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about data sets.
    */
  def listDatasets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDatasets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about data sets.
    */
  def listDatasets(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDatasets(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatasetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of data stores.
    */
  def listDatastores(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatastoresResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDatastores(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatastoresResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatastoresResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of data stores.
    */
  def listDatastores(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatastoresRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatastoresResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDatastores(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatastoresRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatastoresResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListDatastoresResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of pipelines.
    */
  def listPipelines(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListPipelinesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelines(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListPipelinesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListPipelinesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of pipelines.
    */
  def listPipelines(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListPipelinesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListPipelinesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPipelines(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListPipelinesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListPipelinesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListPipelinesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the tags (metadata) which you have assigned to the resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the tags (metadata) which you have assigned to the resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def putLoggingOptions(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.PutLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLoggingOptions(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.PutLoggingOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Simulates the results of running a pipeline activity on a message payload.
    */
  def runPipelineActivity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.RunPipelineActivityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def runPipelineActivity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.RunPipelineActivityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.RunPipelineActivityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Simulates the results of running a pipeline activity on a message payload.
    */
  def runPipelineActivity(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.RunPipelineActivityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.RunPipelineActivityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def runPipelineActivity(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.RunPipelineActivityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.RunPipelineActivityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.RunPipelineActivityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10 messages can be retrieved.
    */
  def sampleChannelData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.SampleChannelDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sampleChannelData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.SampleChannelDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.SampleChannelDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10 messages can be retrieved.
    */
  def sampleChannelData(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.SampleChannelDataRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.SampleChannelDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sampleChannelData(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.SampleChannelDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.SampleChannelDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.SampleChannelDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the reprocessing of raw message data through the pipeline.
    */
  def startPipelineReprocessing(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.StartPipelineReprocessingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startPipelineReprocessing(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.StartPipelineReprocessingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.StartPipelineReprocessingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the reprocessing of raw message data through the pipeline.
    */
  def startPipelineReprocessing(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.StartPipelineReprocessingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.StartPipelineReprocessingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startPipelineReprocessing(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.StartPipelineReprocessingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.StartPipelineReprocessingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.StartPipelineReprocessingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def updateChannel(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UpdateChannelRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateChannel(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UpdateChannelRequest,
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
  def updateDataset(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UpdateDatasetRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDataset(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UpdateDatasetRequest,
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
  def updateDatastore(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UpdateDatastoreRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDatastore(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UpdateDatastoreRequest,
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
  def updatePipeline(params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UpdatePipelineRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePipeline(
    params: awsDashSdkLib.clientsIotanalyticsMod.IoTAnalyticsNs.UpdatePipelineRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

