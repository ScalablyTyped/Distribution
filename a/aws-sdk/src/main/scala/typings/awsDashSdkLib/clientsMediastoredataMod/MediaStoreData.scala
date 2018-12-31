package typings
package awsDashSdkLib.clientsMediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStoreData
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MediaStoreData: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.ClientConfiguration = js.native
  /**
    * Deletes an object at the specified path.
    */
  def deleteObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DeleteObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DeleteObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DeleteObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an object at the specified path.
    */
  def deleteObject(params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DeleteObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DeleteObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteObject(
    params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DeleteObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DeleteObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DeleteObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the headers for an object at the specified path.
    */
  def describeObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DescribeObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DescribeObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DescribeObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the headers for an object at the specified path.
    */
  def describeObject(params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DescribeObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DescribeObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeObject(
    params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DescribeObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DescribeObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.DescribeObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads the object at the specified path.
    */
  def getObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.GetObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.GetObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.GetObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Downloads the object at the specified path.
    */
  def getObject(params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.GetObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.GetObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getObject(
    params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.GetObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.GetObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.GetObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of metadata entries about folders and objects in the specified folder.
    */
  def listItems(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.ListItemsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listItems(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.ListItemsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.ListItemsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of metadata entries about folders and objects in the specified folder.
    */
  def listItems(params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.ListItemsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.ListItemsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listItems(
    params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.ListItemsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.ListItemsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.ListItemsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uploads an object to the specified path. Object sizes are limited to 25 MB.
    */
  def putObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.PutObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.PutObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.PutObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uploads an object to the specified path. Object sizes are limited to 25 MB.
    */
  def putObject(params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.PutObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.PutObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putObject(
    params: awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.PutObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.PutObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMediastoredataMod.MediaStoreDataNs.PutObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

