package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cognitosync", "CognitoSync")
@js.native
object CognitoSyncNs extends js.Object {
  
  trait BulkPublishRequest extends js.Object {
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait BulkPublishResponse extends js.Object {
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CognitoStreams extends js.Object {
    /**
         * The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant access to Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
         */
    var RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined
    /**
         * The name of the Cognito stream to receive updates. This stream must be in the developers account and in the same region as the identity pool.
         */
    var StreamName: js.UndefOr[StreamName] = js.undefined
    /**
         * Status of the Cognito streams. Valid values are: ENABLED - Streaming of updates to identity pool is enabled. DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is DISABLED.
         */
    var StreamingStatus: js.UndefOr[StreamingStatus] = js.undefined
  }
  
  
  trait Dataset extends js.Object {
    /**
         * Date on which the dataset was created.
         */
    var CreationDate: js.UndefOr[_Date] = js.undefined
    /**
         * Total size in bytes of the records in this dataset.
         */
    var DataStorage: js.UndefOr[Long] = js.undefined
    /**
         * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
         */
    var DatasetName: js.UndefOr[DatasetName] = js.undefined
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
    /**
         * The device that made the last change to this dataset.
         */
    var LastModifiedBy: js.UndefOr[String] = js.undefined
    /**
         * Date when the dataset was last modified.
         */
    var LastModifiedDate: js.UndefOr[_Date] = js.undefined
    /**
         * Number of records in this dataset.
         */
    var NumRecords: js.UndefOr[Long] = js.undefined
  }
  
  
  trait DeleteDatasetRequest extends js.Object {
    /**
         * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
         */
    var DatasetName: DatasetName
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityId: IdentityId
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait DeleteDatasetResponse extends js.Object {
    /**
         * A collection of data for an identity pool. An identity pool can have multiple datasets. A dataset is per identity and can be general or associated with a particular entity in an application (like a saved game). Datasets are automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
         */
    var Dataset: js.UndefOr[Dataset] = js.undefined
  }
  
  
  trait DescribeDatasetRequest extends js.Object {
    /**
         * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
         */
    var DatasetName: DatasetName
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityId: IdentityId
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait DescribeDatasetResponse extends js.Object {
    /**
         * Meta data for a collection of data for an identity. An identity can have multiple datasets. A dataset can be general or associated with a particular entity in an application (like a saved game). Datasets are automatically created if they don't exist. Data is synced by dataset, and a dataset can hold up to 1MB of key-value pairs.
         */
    var Dataset: js.UndefOr[Dataset] = js.undefined
  }
  
  
  trait DescribeIdentityPoolUsageRequest extends js.Object {
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait DescribeIdentityPoolUsageResponse extends js.Object {
    /**
         * Information about the usage of the identity pool.
         */
    var IdentityPoolUsage: js.UndefOr[IdentityPoolUsage] = js.undefined
  }
  
  
  trait DescribeIdentityUsageRequest extends js.Object {
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityId: IdentityId
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait DescribeIdentityUsageResponse extends js.Object {
    /**
         * Usage information for the identity.
         */
    var IdentityUsage: js.UndefOr[IdentityUsage] = js.undefined
  }
  
  
  trait Events
    extends /* key */ org.scalablytyped.runtime.StringDictionary[LambdaFunctionArn]
  
  
  trait GetBulkPublishDetailsRequest extends js.Object {
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait GetBulkPublishDetailsResponse extends js.Object {
    /**
         * If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
         */
    var BulkPublishCompleteTime: js.UndefOr[_Date] = js.undefined
    /**
         * The date/time at which the last bulk publish was initiated.
         */
    var BulkPublishStartTime: js.UndefOr[_Date] = js.undefined
    /**
         * Status of the last bulk publish operation, valid values are: NOT_STARTED - No bulk publish has been requested for this identity pool IN_PROGRESS - Data is being published to the configured stream SUCCEEDED - All data for the identity pool has been published to the configured stream FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
         */
    var BulkPublishStatus: js.UndefOr[BulkPublishStatus] = js.undefined
    /**
         * If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to fail.
         */
    var FailureMessage: js.UndefOr[String] = js.undefined
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
  }
  
  
  trait GetCognitoEventsRequest extends js.Object {
    /**
         * The Cognito Identity Pool ID for the request
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait GetCognitoEventsResponse extends js.Object {
    /**
         * The Cognito Events returned from the GetCognitoEvents request
         */
    var Events: js.UndefOr[Events] = js.undefined
  }
  
  
  trait GetIdentityPoolConfigurationRequest extends js.Object {
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. This is the ID of the pool for which to return a configuration.
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait GetIdentityPoolConfigurationResponse extends js.Object {
    /**
         * Options to apply to this identity pool for Amazon Cognito streams.
         */
    var CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito.
         */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    /**
         * Options to apply to this identity pool for push synchronization.
         */
    var PushSync: js.UndefOr[PushSync] = js.undefined
  }
  
  
  trait IdentityPoolUsage extends js.Object {
    /**
         * Data storage information for the identity pool.
         */
    var DataStorage: js.UndefOr[Long] = js.undefined
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    /**
         * Date on which the identity pool was last modified.
         */
    var LastModifiedDate: js.UndefOr[_Date] = js.undefined
    /**
         * Number of sync sessions for the identity pool.
         */
    var SyncSessionsCount: js.UndefOr[Long] = js.undefined
  }
  
  
  trait IdentityUsage extends js.Object {
    /**
         * Total data storage for this identity.
         */
    var DataStorage: js.UndefOr[Long] = js.undefined
    /**
         * Number of datasets for the identity.
         */
    var DatasetCount: js.UndefOr[Integer] = js.undefined
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityId: js.UndefOr[IdentityId] = js.undefined
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    /**
         * Date on which the identity was last modified.
         */
    var LastModifiedDate: js.UndefOr[_Date] = js.undefined
  }
  
  
  trait ListDatasetsRequest extends js.Object {
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityId: IdentityId
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: IdentityPoolId
    /**
         * The maximum number of results to be returned.
         */
    var MaxResults: js.UndefOr[IntegerString] = js.undefined
    /**
         * A pagination token for obtaining the next page of results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListDatasetsResponse extends js.Object {
    /**
         * Number of datasets returned.
         */
    var Count: js.UndefOr[Integer] = js.undefined
    /**
         * A set of datasets.
         */
    var Datasets: js.UndefOr[DatasetList] = js.undefined
    /**
         * A pagination token for obtaining the next page of results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListIdentityPoolUsageRequest extends js.Object {
    /**
         * The maximum number of results to be returned.
         */
    var MaxResults: js.UndefOr[IntegerString] = js.undefined
    /**
         * A pagination token for obtaining the next page of results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListIdentityPoolUsageResponse extends js.Object {
    /**
         * Total number of identities for the identity pool.
         */
    var Count: js.UndefOr[Integer] = js.undefined
    /**
         * Usage information for the identity pools.
         */
    var IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList] = js.undefined
    /**
         * The maximum number of results to be returned.
         */
    var MaxResults: js.UndefOr[Integer] = js.undefined
    /**
         * A pagination token for obtaining the next page of results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListRecordsRequest extends js.Object {
    /**
         * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
         */
    var DatasetName: DatasetName
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityId: IdentityId
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: IdentityPoolId
    /**
         * The last server sync count for this record.
         */
    var LastSyncCount: js.UndefOr[Long] = js.undefined
    /**
         * The maximum number of results to be returned.
         */
    var MaxResults: js.UndefOr[IntegerString] = js.undefined
    /**
         * A pagination token for obtaining the next page of results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
         * A token containing a session ID, identity ID, and expiration.
         */
    var SyncSessionToken: js.UndefOr[SyncSessionToken] = js.undefined
  }
  
  
  trait ListRecordsResponse extends js.Object {
    /**
         * Total number of records.
         */
    var Count: js.UndefOr[Integer] = js.undefined
    /**
         * A boolean value specifying whether to delete the dataset locally.
         */
    var DatasetDeletedAfterRequestedSyncCount: js.UndefOr[Boolean] = js.undefined
    /**
         * Indicates whether the dataset exists.
         */
    var DatasetExists: js.UndefOr[Boolean] = js.undefined
    /**
         * Server sync count for this dataset.
         */
    var DatasetSyncCount: js.UndefOr[Long] = js.undefined
    /**
         * The user/device that made the last change to this record.
         */
    var LastModifiedBy: js.UndefOr[String] = js.undefined
    /**
         * Names of merged datasets.
         */
    var MergedDatasetNames: js.UndefOr[MergedDatasetNameList] = js.undefined
    /**
         * A pagination token for obtaining the next page of results.
         */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
         * A list of all records.
         */
    var Records: js.UndefOr[RecordList] = js.undefined
    /**
         * A token containing a session ID, identity ID, and expiration.
         */
    var SyncSessionToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait PushSync extends js.Object {
    /**
         * List of SNS platform application ARNs that could be used by clients.
         */
    var ApplicationArns: js.UndefOr[ApplicationArnList] = js.undefined
    /**
         * A role configured to allow Cognito to call SNS on behalf of the developer.
         */
    var RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined
  }
  
  
  trait Record extends js.Object {
    /**
         * The last modified date of the client device.
         */
    var DeviceLastModifiedDate: js.UndefOr[_Date] = js.undefined
    /**
         * The key for the record.
         */
    var Key: js.UndefOr[RecordKey] = js.undefined
    /**
         * The user/device that made the last change to this record.
         */
    var LastModifiedBy: js.UndefOr[String] = js.undefined
    /**
         * The date on which the record was last modified.
         */
    var LastModifiedDate: js.UndefOr[_Date] = js.undefined
    /**
         * The server sync count for this record.
         */
    var SyncCount: js.UndefOr[Long] = js.undefined
    /**
         * The value for the record.
         */
    var Value: js.UndefOr[RecordValue] = js.undefined
  }
  
  
  trait RecordPatch extends js.Object {
    /**
         * The last modified date of the client device.
         */
    var DeviceLastModifiedDate: js.UndefOr[_Date] = js.undefined
    /**
         * The key associated with the record patch.
         */
    var Key: RecordKey
    /**
         * An operation, either replace or remove.
         */
    var Op: Operation
    /**
         * Last known server sync count for this record. Set to 0 if unknown.
         */
    var SyncCount: Long
    /**
         * The value associated with the record patch.
         */
    var Value: js.UndefOr[RecordValue] = js.undefined
  }
  
  
  trait RegisterDeviceRequest extends js.Object {
    /**
         * The unique ID for this identity.
         */
    var IdentityId: IdentityId
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. Here, the ID of the pool that the identity belongs to.
         */
    var IdentityPoolId: IdentityPoolId
    /**
         * The SNS platform type (e.g. GCM, SDM, APNS, APNS_SANDBOX).
         */
    var Platform: Platform
    /**
         * The push token.
         */
    var Token: PushToken
  }
  
  
  trait RegisterDeviceResponse extends js.Object {
    /**
         * The unique ID generated for this device by Cognito.
         */
    var DeviceId: js.UndefOr[DeviceId] = js.undefined
  }
  
  
  trait SetCognitoEventsRequest extends js.Object {
    /**
         * The events to configure
         */
    var Events: Events
    /**
         * The Cognito Identity Pool to use when configuring Cognito Events
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait SetIdentityPoolConfigurationRequest extends js.Object {
    /**
         * Options to apply to this identity pool for Amazon Cognito streams.
         */
    var CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. This is the ID of the pool to modify.
         */
    var IdentityPoolId: IdentityPoolId
    /**
         * Options to apply to this identity pool for push synchronization.
         */
    var PushSync: js.UndefOr[PushSync] = js.undefined
  }
  
  
  trait SetIdentityPoolConfigurationResponse extends js.Object {
    /**
         * Options to apply to this identity pool for Amazon Cognito streams.
         */
    var CognitoStreams: js.UndefOr[CognitoStreams] = js.undefined
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito.
         */
    var IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    /**
         * Options to apply to this identity pool for push synchronization.
         */
    var PushSync: js.UndefOr[PushSync] = js.undefined
  }
  
  
  trait SubscribeToDatasetRequest extends js.Object {
    /**
         * The name of the dataset to subcribe to.
         */
    var DatasetName: DatasetName
    /**
         * The unique ID generated for this device by Cognito.
         */
    var DeviceId: DeviceId
    /**
         * Unique ID for this identity.
         */
    var IdentityId: IdentityId
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The ID of the pool to which the identity belongs.
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait SubscribeToDatasetResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
    def bulkPublish(): awsDashSdkLib.libRequestMod.Request[BulkPublishResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
       */
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
    /**
       * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
       */
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
    /**
       * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
       */
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
    /**
       * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
       */
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
    /**
       * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
       */
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
    /**
       * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
       */
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
    /**
       * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
       */
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
    /**
       * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
       */
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
    /**
       * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
       */
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
    /**
       * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
       */
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
    /**
       * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
       */
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
    /**
       * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
       */
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
    /**
       * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
    def setCognitoEvents(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
    def setCognitoEvents(params: SetCognitoEventsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
    def setCognitoEvents(
      params: SetCognitoEventsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
    def setIdentityPoolConfiguration(): awsDashSdkLib.libRequestMod.Request[SetIdentityPoolConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
       */
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
    /**
       * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
       */
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
    /**
       * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
       */
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
    /**
       * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
       */
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
    /**
       * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
       */
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
    /**
       * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
       */
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
    /**
       * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
       */
    def updateRecords(
      params: UpdateRecordsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRecordsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRecordsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UnsubscribeFromDatasetRequest extends js.Object {
    /**
         * The name of the dataset from which to unsubcribe.
         */
    var DatasetName: DatasetName
    /**
         * The unique ID generated for this device by Cognito.
         */
    var DeviceId: DeviceId
    /**
         * Unique ID for this identity.
         */
    var IdentityId: IdentityId
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The ID of the pool to which this identity belongs.
         */
    var IdentityPoolId: IdentityPoolId
  }
  
  
  trait UnsubscribeFromDatasetResponse extends js.Object
  
  
  trait UpdateRecordsRequest extends js.Object {
    /**
         * Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods. The ClientContext field is not yet implemented.
         */
    var ClientContext: js.UndefOr[ClientContext] = js.undefined
    /**
         * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
         */
    var DatasetName: DatasetName
    /**
         * The unique ID generated for this device by Cognito.
         */
    var DeviceId: js.UndefOr[DeviceId] = js.undefined
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityId: IdentityId
    /**
         * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
         */
    var IdentityPoolId: IdentityPoolId
    /**
         * A list of patch operations.
         */
    var RecordPatches: js.UndefOr[RecordPatchList] = js.undefined
    /**
         * The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
         */
    var SyncSessionToken: SyncSessionToken
  }
  
  
  trait UpdateRecordsResponse extends js.Object {
    /**
         * A list of records that have been updated.
         */
    var Records: js.UndefOr[RecordList] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ApplicationArn = java.lang.String
  type ApplicationArnList = js.Array[ApplicationArn]
  type AssumeRoleArn = java.lang.String
  type Boolean = scala.Boolean
  type BulkPublishStatus = awsDashSdkLib.awsDashSdkLibStrings.NOT_STARTED | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientContext = java.lang.String
  type CognitoEventType = java.lang.String
  type DatasetList = js.Array[Dataset]
  type DatasetName = java.lang.String
  type DeviceId = java.lang.String
  type IdentityId = java.lang.String
  type IdentityPoolId = java.lang.String
  type IdentityPoolUsageList = js.Array[IdentityPoolUsage]
  type Integer = scala.Double
  type IntegerString = scala.Double
  type LambdaFunctionArn = java.lang.String
  type Long = scala.Double
  type MergedDatasetNameList = js.Array[String]
  type Operation = awsDashSdkLib.awsDashSdkLibStrings.replace | awsDashSdkLib.awsDashSdkLibStrings.remove | java.lang.String
  type Platform = awsDashSdkLib.awsDashSdkLibStrings.APNS | awsDashSdkLib.awsDashSdkLibStrings.APNS_SANDBOX | awsDashSdkLib.awsDashSdkLibStrings.GCM | awsDashSdkLib.awsDashSdkLibStrings.ADM | java.lang.String
  type PushToken = java.lang.String
  type RecordKey = java.lang.String
  type RecordList = js.Array[Record]
  type RecordPatchList = js.Array[RecordPatch]
  type RecordValue = java.lang.String
  type StreamName = java.lang.String
  type StreamingStatus = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type String = java.lang.String
  type SyncSessionToken = java.lang.String
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2014-06-30` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

