package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoSync
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CognitoSync: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def bulkPublish(): awsDashSdkLib.libRequestMod.Request[BulkPublishResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def bulkPublish(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BulkPublishResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BulkPublishResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def bulkPublish(params: BulkPublishRequest): awsDashSdkLib.libRequestMod.Request[BulkPublishResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def bulkPublish(
    params: BulkPublishRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BulkPublishResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BulkPublishResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def deleteDataset(): awsDashSdkLib.libRequestMod.Request[DeleteDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def deleteDataset(params: DeleteDatasetRequest): awsDashSdkLib.libRequestMod.Request[DeleteDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
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
    * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
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
    * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def describeIdentityPoolUsage(): awsDashSdkLib.libRequestMod.Request[DescribeIdentityPoolUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIdentityPoolUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIdentityPoolUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIdentityPoolUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def describeIdentityPoolUsage(params: DescribeIdentityPoolUsageRequest): awsDashSdkLib.libRequestMod.Request[DescribeIdentityPoolUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIdentityPoolUsage(
    params: DescribeIdentityPoolUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIdentityPoolUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIdentityPoolUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def describeIdentityUsage(): awsDashSdkLib.libRequestMod.Request[DescribeIdentityUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIdentityUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIdentityUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIdentityUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def describeIdentityUsage(params: DescribeIdentityUsageRequest): awsDashSdkLib.libRequestMod.Request[DescribeIdentityUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIdentityUsage(
    params: DescribeIdentityUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIdentityUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIdentityUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getBulkPublishDetails(): awsDashSdkLib.libRequestMod.Request[GetBulkPublishDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBulkPublishDetails(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBulkPublishDetailsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBulkPublishDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getBulkPublishDetails(params: GetBulkPublishDetailsRequest): awsDashSdkLib.libRequestMod.Request[GetBulkPublishDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBulkPublishDetails(
    params: GetBulkPublishDetailsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBulkPublishDetailsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBulkPublishDetailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getCognitoEvents(): awsDashSdkLib.libRequestMod.Request[GetCognitoEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCognitoEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCognitoEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCognitoEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getCognitoEvents(params: GetCognitoEventsRequest): awsDashSdkLib.libRequestMod.Request[GetCognitoEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCognitoEvents(
    params: GetCognitoEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCognitoEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCognitoEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getIdentityPoolConfiguration(): awsDashSdkLib.libRequestMod.Request[GetIdentityPoolConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIdentityPoolConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIdentityPoolConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIdentityPoolConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getIdentityPoolConfiguration(params: GetIdentityPoolConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetIdentityPoolConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIdentityPoolConfiguration(
    params: GetIdentityPoolConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIdentityPoolConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIdentityPoolConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
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
    * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
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
    * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
    */
  def listIdentityPoolUsage(): awsDashSdkLib.libRequestMod.Request[ListIdentityPoolUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIdentityPoolUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIdentityPoolUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIdentityPoolUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
    */
  def listIdentityPoolUsage(params: ListIdentityPoolUsageRequest): awsDashSdkLib.libRequestMod.Request[ListIdentityPoolUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIdentityPoolUsage(
    params: ListIdentityPoolUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIdentityPoolUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIdentityPoolUsageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
    */
  def listRecords(): awsDashSdkLib.libRequestMod.Request[ListRecordsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecordsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecordsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
    */
  def listRecords(params: ListRecordsRequest): awsDashSdkLib.libRequestMod.Request[ListRecordsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listRecords(
    params: ListRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListRecordsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListRecordsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def registerDevice(): awsDashSdkLib.libRequestMod.Request[RegisterDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def registerDevice(params: RegisterDeviceRequest): awsDashSdkLib.libRequestMod.Request[RegisterDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def registerDevice(
    params: RegisterDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegisterDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegisterDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def setCognitoEvents(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setCognitoEvents(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def setCognitoEvents(params: SetCognitoEventsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setCognitoEvents(
    params: SetCognitoEventsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def setIdentityPoolConfiguration(): awsDashSdkLib.libRequestMod.Request[SetIdentityPoolConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setIdentityPoolConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetIdentityPoolConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetIdentityPoolConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def setIdentityPoolConfiguration(params: SetIdentityPoolConfigurationRequest): awsDashSdkLib.libRequestMod.Request[SetIdentityPoolConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setIdentityPoolConfiguration(
    params: SetIdentityPoolConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetIdentityPoolConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetIdentityPoolConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def subscribeToDataset(): awsDashSdkLib.libRequestMod.Request[SubscribeToDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def subscribeToDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SubscribeToDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SubscribeToDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def subscribeToDataset(params: SubscribeToDatasetRequest): awsDashSdkLib.libRequestMod.Request[SubscribeToDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def subscribeToDataset(
    params: SubscribeToDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SubscribeToDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SubscribeToDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def unsubscribeFromDataset(): awsDashSdkLib.libRequestMod.Request[UnsubscribeFromDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unsubscribeFromDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UnsubscribeFromDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UnsubscribeFromDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def unsubscribeFromDataset(params: UnsubscribeFromDatasetRequest): awsDashSdkLib.libRequestMod.Request[UnsubscribeFromDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unsubscribeFromDataset(
    params: UnsubscribeFromDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UnsubscribeFromDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UnsubscribeFromDatasetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def updateRecords(): awsDashSdkLib.libRequestMod.Request[UpdateRecordsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRecordsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRecordsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def updateRecords(params: UpdateRecordsRequest): awsDashSdkLib.libRequestMod.Request[UpdateRecordsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateRecords(
    params: UpdateRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateRecordsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateRecordsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

