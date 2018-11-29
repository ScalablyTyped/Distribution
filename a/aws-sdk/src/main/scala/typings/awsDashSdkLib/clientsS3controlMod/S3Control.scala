package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Control
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_S3Control: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsS3controlMod.S3ControlNs.ClientConfiguration = js.native
  /**
     * Removes the Public Access Block configuration for an Amazon Web Services account.
     */
  def deletePublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the Public Access Block configuration for an Amazon Web Services account.
     */
  def deletePublicAccessBlock(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the Public Access Block configuration for an Amazon Web Services account.
     */
  def deletePublicAccessBlock(params: awsDashSdkLib.clientsS3controlMod.S3ControlNs.DeletePublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the Public Access Block configuration for an Amazon Web Services account.
     */
  def deletePublicAccessBlock(
    params: awsDashSdkLib.clientsS3controlMod.S3ControlNs.DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Retrieves the Public Access Block configuration for an Amazon Web Services account.
     */
  def getPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3controlMod.S3ControlNs.GetPublicAccessBlockOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the Public Access Block configuration for an Amazon Web Services account.
     */
  def getPublicAccessBlock(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3controlMod.S3ControlNs.GetPublicAccessBlockOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3controlMod.S3ControlNs.GetPublicAccessBlockOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the Public Access Block configuration for an Amazon Web Services account.
     */
  def getPublicAccessBlock(params: awsDashSdkLib.clientsS3controlMod.S3ControlNs.GetPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3controlMod.S3ControlNs.GetPublicAccessBlockOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the Public Access Block configuration for an Amazon Web Services account.
     */
  def getPublicAccessBlock(
    params: awsDashSdkLib.clientsS3controlMod.S3ControlNs.GetPublicAccessBlockRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsS3controlMod.S3ControlNs.GetPublicAccessBlockOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsS3controlMod.S3ControlNs.GetPublicAccessBlockOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates or modifies the Public Access Block configuration for an Amazon Web Services account.
     */
  def putPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or modifies the Public Access Block configuration for an Amazon Web Services account.
     */
  def putPublicAccessBlock(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or modifies the Public Access Block configuration for an Amazon Web Services account.
     */
  def putPublicAccessBlock(params: awsDashSdkLib.clientsS3controlMod.S3ControlNs.PutPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates or modifies the Public Access Block configuration for an Amazon Web Services account.
     */
  def putPublicAccessBlock(
    params: awsDashSdkLib.clientsS3controlMod.S3ControlNs.PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

