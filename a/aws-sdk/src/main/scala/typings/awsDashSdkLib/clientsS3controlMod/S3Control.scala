package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Control
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_S3Control: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Removes the Public Access Block configuration for an Amazon Web Services account.
    */
  def deletePublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePublicAccessBlock(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the Public Access Block configuration for an Amazon Web Services account.
    */
  def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePublicAccessBlock(
    params: DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the Public Access Block configuration for an Amazon Web Services account.
    */
  def getPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPublicAccessBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPublicAccessBlockOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the Public Access Block configuration for an Amazon Web Services account.
    */
  def getPublicAccessBlock(params: GetPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPublicAccessBlock(
    params: GetPublicAccessBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPublicAccessBlockOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or modifies the Public Access Block configuration for an Amazon Web Services account.
    */
  def putPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putPublicAccessBlock(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates or modifies the Public Access Block configuration for an Amazon Web Services account.
    */
  def putPublicAccessBlock(params: PutPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putPublicAccessBlock(
    params: PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

