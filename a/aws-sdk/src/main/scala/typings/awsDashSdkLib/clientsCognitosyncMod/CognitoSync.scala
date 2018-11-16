package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoSync
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CognitoSync: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ClientConfiguration = js.native
  /**
     * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def bulkPublish(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.BulkPublishResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def bulkPublish(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.BulkPublishResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.BulkPublishResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def bulkPublish(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.BulkPublishRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.BulkPublishResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def bulkPublish(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.BulkPublishRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.BulkPublishResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.BulkPublishResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def deleteDataset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DeleteDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def deleteDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DeleteDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DeleteDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def deleteDataset(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DeleteDatasetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DeleteDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def deleteDataset(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DeleteDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DeleteDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DeleteDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
     */
  def describeDataset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
     */
  def describeDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
     */
  def describeDataset(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeDatasetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
     */
  def describeDataset(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def describeIdentityPoolUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityPoolUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def describeIdentityPoolUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityPoolUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityPoolUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def describeIdentityPoolUsage(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityPoolUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityPoolUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def describeIdentityPoolUsage(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityPoolUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityPoolUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityPoolUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def describeIdentityUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def describeIdentityUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def describeIdentityUsage(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def describeIdentityUsage(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.DescribeIdentityUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getBulkPublishDetails(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetBulkPublishDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getBulkPublishDetails(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetBulkPublishDetailsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetBulkPublishDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getBulkPublishDetails(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetBulkPublishDetailsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetBulkPublishDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getBulkPublishDetails(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetBulkPublishDetailsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetBulkPublishDetailsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetBulkPublishDetailsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getCognitoEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetCognitoEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getCognitoEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetCognitoEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetCognitoEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getCognitoEvents(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetCognitoEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetCognitoEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getCognitoEvents(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetCognitoEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetCognitoEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetCognitoEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getIdentityPoolConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetIdentityPoolConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getIdentityPoolConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetIdentityPoolConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetIdentityPoolConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getIdentityPoolConfiguration(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetIdentityPoolConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetIdentityPoolConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def getIdentityPoolConfiguration(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetIdentityPoolConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetIdentityPoolConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.GetIdentityPoolConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
     */
  def listDatasets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListDatasetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
     */
  def listDatasets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListDatasetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListDatasetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
     */
  def listDatasets(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListDatasetsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListDatasetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
     */
  def listDatasets(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListDatasetsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListDatasetsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListDatasetsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
     */
  def listIdentityPoolUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListIdentityPoolUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
     */
  def listIdentityPoolUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListIdentityPoolUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListIdentityPoolUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
     */
  def listIdentityPoolUsage(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListIdentityPoolUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListIdentityPoolUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
     */
  def listIdentityPoolUsage(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListIdentityPoolUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListIdentityPoolUsageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListIdentityPoolUsageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
     */
  def listRecords(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListRecordsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
     */
  def listRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListRecordsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListRecordsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
     */
  def listRecords(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListRecordsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListRecordsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
     */
  def listRecords(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListRecordsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.ListRecordsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def registerDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.RegisterDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def registerDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.RegisterDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.RegisterDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def registerDevice(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.RegisterDeviceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.RegisterDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def registerDevice(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.RegisterDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.RegisterDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.RegisterDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def setCognitoEvents(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def setCognitoEvents(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def setCognitoEvents(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetCognitoEventsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def setCognitoEvents(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetCognitoEventsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def setIdentityPoolConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetIdentityPoolConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def setIdentityPoolConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetIdentityPoolConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetIdentityPoolConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def setIdentityPoolConfiguration(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetIdentityPoolConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetIdentityPoolConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
     */
  def setIdentityPoolConfiguration(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetIdentityPoolConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetIdentityPoolConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SetIdentityPoolConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def subscribeToDataset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SubscribeToDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def subscribeToDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SubscribeToDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SubscribeToDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def subscribeToDataset(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SubscribeToDatasetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SubscribeToDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def subscribeToDataset(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SubscribeToDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SubscribeToDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.SubscribeToDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def unsubscribeFromDataset(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UnsubscribeFromDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def unsubscribeFromDataset(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UnsubscribeFromDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UnsubscribeFromDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def unsubscribeFromDataset(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UnsubscribeFromDatasetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UnsubscribeFromDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
     */
  def unsubscribeFromDataset(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UnsubscribeFromDatasetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UnsubscribeFromDatasetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UnsubscribeFromDatasetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def updateRecords(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UpdateRecordsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def updateRecords(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UpdateRecordsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UpdateRecordsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def updateRecords(params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UpdateRecordsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UpdateRecordsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
     */
  def updateRecords(
    params: awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UpdateRecordsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UpdateRecordsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitosyncMod.CognitoSyncNs.UpdateRecordsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

