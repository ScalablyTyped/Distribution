package typings
package awsDashSdkLib.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mediastoredata", "MediaStoreData")
@js.native
object MediaStoreDataNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DeleteObjectRequest extends js.Object {
    /**
         * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
         */
    var Path: PathNaming
  }
  
  
  trait DeleteObjectResponse extends js.Object
  
  
  trait DescribeObjectRequest extends js.Object {
    /**
         * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
         */
    var Path: PathNaming
  }
  
  
  trait DescribeObjectResponse extends js.Object {
    /**
         * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
         */
    var CacheControl: js.UndefOr[StringPrimitive] = js.undefined
    /**
         * The length of the object in bytes.
         */
    var ContentLength: js.UndefOr[NonNegativeLong] = js.undefined
    /**
         * The content type of the object.
         */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
         * The ETag that represents a unique instance of the object.
         */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
         * The date and time that the object was last modified.
         */
    var LastModified: js.UndefOr[TimeStamp] = js.undefined
  }
  
  
  trait GetObjectRequest extends js.Object {
    /**
         * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt; For example, to upload the file mlaw.avi to the folder path premium\canada in the container movies, enter the path premium/canada/mlaw.avi. Do not include the container name in this path. If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an existing premium/usa subfolder. If you specify premium/canada, the service creates a canada subfolder in the premium folder. You then have two subfolders, usa and canada, in the premium folder.  There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental MediaStore. For more information about folders and how they exist in a container, see the AWS Elemental MediaStore User Guide. The file name is the name that is assigned to the file that you upload. The file can have the same name inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an extension. 
         */
    var Path: PathNaming
    /**
         * The range bytes of an object to retrieve. For more information about the Range header, go to http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.
         */
    var Range: js.UndefOr[RangePattern] = js.undefined
  }
  
  
  trait GetObjectResponse extends js.Object {
    /**
         * The bytes of the object. 
         */
    var Body: js.UndefOr[PayloadBlob] = js.undefined
    /**
         * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP spec at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
         */
    var CacheControl: js.UndefOr[StringPrimitive] = js.undefined
    /**
         * The length of the object in bytes.
         */
    var ContentLength: js.UndefOr[NonNegativeLong] = js.undefined
    /**
         * The range of bytes to retrieve.
         */
    var ContentRange: js.UndefOr[ContentRangePattern] = js.undefined
    /**
         * The content type of the object.
         */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
         * The ETag that represents a unique instance of the object.
         */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
         * The date and time that the object was last modified.
         */
    var LastModified: js.UndefOr[TimeStamp] = js.undefined
    /**
         * The HTML status code of the request. Status codes ranging from 200 to 299 indicate success. All other status codes indicate the type of error that occurred.
         */
    var StatusCode: statusCode
  }
  
  
  trait Item extends js.Object {
    /**
         * The length of the item in bytes.
         */
    var ContentLength: js.UndefOr[NonNegativeLong] = js.undefined
    /**
         * The content type of the item.
         */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
         * The ETag that represents a unique instance of the item.
         */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
         * The date and time that the item was last modified.
         */
    var LastModified: js.UndefOr[TimeStamp] = js.undefined
    /**
         * The name of the item.
         */
    var Name: js.UndefOr[ItemName] = js.undefined
    /**
         * The item type (folder or object).
         */
    var Type: js.UndefOr[ItemType] = js.undefined
  }
  
  
  trait ListItemsRequest extends js.Object {
    /**
         * The maximum number of results to return per API request. For example, you submit a ListItems request with MaxResults set at 500. Although 2,000 items match your request, the service returns no more than the first 500 items. (The service also returns a NextToken value that you can use to fetch the next batch of results.) The service might return fewer results than the MaxResults value. If MaxResults is not included in the request, the service defaults to pagination with a maximum of 1,000 results per page.
         */
    var MaxResults: js.UndefOr[ListLimit] = js.undefined
    /**
         * The token that identifies which batch of results that you want to see. For example, you submit a ListItems request with MaxResults set at 500. The service returns the first batch of results (up to 500) and a NextToken value. To see the next batch of results, you can submit the ListItems request a second time and specify the NextToken value. Tokens expire after 15 minutes.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The path in the container from which to retrieve items. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt;
         */
    var Path: js.UndefOr[ListPathNaming] = js.undefined
  }
  
  
  trait ListItemsResponse extends js.Object {
    /**
         * The metadata entries for the folders and objects at the requested path.
         */
    var Items: js.UndefOr[ItemList] = js.undefined
    /**
         * The token that can be used in a request to view the next set of results. For example, you submit a ListItems request that matches 2,000 items with MaxResults set at 500. The service returns the first batch of results (up to 500) and a NextToken value that can be used to fetch the next batch of results.
         */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait PutObjectRequest extends js.Object {
    /**
         * The bytes to be stored. 
         */
    var Body: PayloadBlob
    /**
         * An optional CacheControl header that allows the caller to control the object's cache behavior. Headers can be passed in as specified in the HTTP at https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9. Headers with a custom user-defined value are also accepted.
         */
    var CacheControl: js.UndefOr[StringPrimitive] = js.undefined
    /**
         * The content type of the object.
         */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
         * The path (including the file name) where the object is stored in the container. Format: &lt;folder name&gt;/&lt;folder name&gt;/&lt;file name&gt; For example, to upload the file mlaw.avi to the folder path premium\canada in the container movies, enter the path premium/canada/mlaw.avi. Do not include the container name in this path. If the path includes any folders that don't exist yet, the service creates them. For example, suppose you have an existing premium/usa subfolder. If you specify premium/canada, the service creates a canada subfolder in the premium folder. You then have two subfolders, usa and canada, in the premium folder.  There is no correlation between the path to the source and the path (folders) in the container in AWS Elemental MediaStore. For more information about folders and how they exist in a container, see the AWS Elemental MediaStore User Guide. The file name is the name that is assigned to the file that you upload. The file can have the same name inside and outside of AWS Elemental MediaStore, or it can have the same name. The file name can include or omit an extension. 
         */
    var Path: PathNaming
    /**
         * Indicates the storage class of a Put request. Defaults to high-performance temporal storage class, and objects are persisted into durable storage shortly after being received.
         */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
  }
  
  
  trait PutObjectResponse extends js.Object {
    /**
         * The SHA256 digest of the object that is persisted.
         */
    var ContentSHA256: js.UndefOr[SHA256Hash] = js.undefined
    /**
         * Unique identifier of the object in the container.
         */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
         * The storage class where the object was persisted. The class should be “Temporal”.
         */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Deletes an object at the specified path.
       */
    def deleteObject(): awsDashSdkLib.libRequestMod.Request[DeleteObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an object at the specified path.
       */
    def deleteObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an object at the specified path.
       */
    def deleteObject(params: DeleteObjectRequest): awsDashSdkLib.libRequestMod.Request[DeleteObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an object at the specified path.
       */
    def deleteObject(
      params: DeleteObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the headers for an object at the specified path.
       */
    def describeObject(): awsDashSdkLib.libRequestMod.Request[DescribeObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the headers for an object at the specified path.
       */
    def describeObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the headers for an object at the specified path.
       */
    def describeObject(params: DescribeObjectRequest): awsDashSdkLib.libRequestMod.Request[DescribeObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the headers for an object at the specified path.
       */
    def describeObject(
      params: DescribeObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Downloads the object at the specified path.
       */
    def getObject(): awsDashSdkLib.libRequestMod.Request[GetObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Downloads the object at the specified path.
       */
    def getObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Downloads the object at the specified path.
       */
    def getObject(params: GetObjectRequest): awsDashSdkLib.libRequestMod.Request[GetObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Downloads the object at the specified path.
       */
    def getObject(
      params: GetObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of metadata entries about folders and objects in the specified folder.
       */
    def listItems(): awsDashSdkLib.libRequestMod.Request[ListItemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of metadata entries about folders and objects in the specified folder.
       */
    def listItems(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListItemsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListItemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of metadata entries about folders and objects in the specified folder.
       */
    def listItems(params: ListItemsRequest): awsDashSdkLib.libRequestMod.Request[ListItemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Provides a list of metadata entries about folders and objects in the specified folder.
       */
    def listItems(
      params: ListItemsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListItemsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListItemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Uploads an object to the specified path. Object sizes are limited to 25 MB.
       */
    def putObject(): awsDashSdkLib.libRequestMod.Request[PutObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Uploads an object to the specified path. Object sizes are limited to 25 MB.
       */
    def putObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Uploads an object to the specified path. Object sizes are limited to 25 MB.
       */
    def putObject(params: PutObjectRequest): awsDashSdkLib.libRequestMod.Request[PutObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Uploads an object to the specified path. Object sizes are limited to 25 MB.
       */
    def putObject(
      params: PutObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContentRangePattern = java.lang.String
  type ContentType = java.lang.String
  type ETag = java.lang.String
  type ItemList = js.Array[Item]
  type ItemName = java.lang.String
  type ItemType = awsDashSdkLib.awsDashSdkLibStrings.OBJECT | awsDashSdkLib.awsDashSdkLibStrings.FOLDER | java.lang.String
  type ListLimit = scala.Double
  type ListPathNaming = java.lang.String
  type NonNegativeLong = scala.Double
  type PaginationToken = java.lang.String
  type PathNaming = java.lang.String
  type PayloadBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsMediastoredataMod.Blob | java.lang.String | nodeLib.streamMod.Readable
  type RangePattern = java.lang.String
  type SHA256Hash = java.lang.String
  type StorageClass = awsDashSdkLib.awsDashSdkLibStrings.TEMPORAL | java.lang.String
  type StringPrimitive = java.lang.String
  type TimeStamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-09-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type statusCode = scala.Double
}

