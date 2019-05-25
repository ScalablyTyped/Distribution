package typings
package awsDashSdkLib.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStoreData
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaStoreData: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes an object at the specified path.
    */
  def deleteObject(): awsDashSdkLib.libRequestMod.Request[DeleteObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def describeObject(
    params: DescribeObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Downloads the object at the specified path. If the object’s upload availability is set to streaming, AWS Elemental MediaStore downloads the object even if it’s still uploading the object.
    */
  def getObject(): awsDashSdkLib.libRequestMod.Request[GetObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Downloads the object at the specified path. If the object’s upload availability is set to streaming, AWS Elemental MediaStore downloads the object even if it’s still uploading the object.
    */
  def getObject(params: GetObjectRequest): awsDashSdkLib.libRequestMod.Request[GetObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def listItems(
    params: ListItemsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListItemsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListItemsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads an object to the specified path. Object sizes are limited to 25 MB for standard upload availability and 10 MB for streaming upload availability.
    */
  def putObject(): awsDashSdkLib.libRequestMod.Request[PutObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Uploads an object to the specified path. Object sizes are limited to 25 MB for standard upload availability and 10 MB for streaming upload availability.
    */
  def putObject(params: PutObjectRequest): awsDashSdkLib.libRequestMod.Request[PutObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putObject(
    params: PutObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

