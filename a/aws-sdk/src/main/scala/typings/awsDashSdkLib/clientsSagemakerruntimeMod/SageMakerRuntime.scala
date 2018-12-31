package typings
package awsDashSdkLib.clientsSagemakerruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SageMakerRuntime
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SageMakerRuntime: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsSagemakerruntimeMod.SageMakerRuntimeNs.ClientConfiguration = js.native
  /**
    * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Cals to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests (AWS Signature Version 4) in the Amazon S3 API Reference.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
    */
  def invokeEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerruntimeMod.SageMakerRuntimeNs.InvokeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invokeEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerruntimeMod.SageMakerRuntimeNs.InvokeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerruntimeMod.SageMakerRuntimeNs.InvokeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Cals to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests (AWS Signature Version 4) in the Amazon S3 API Reference.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
    */
  def invokeEndpoint(params: awsDashSdkLib.clientsSagemakerruntimeMod.SageMakerRuntimeNs.InvokeEndpointInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerruntimeMod.SageMakerRuntimeNs.InvokeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invokeEndpoint(
    params: awsDashSdkLib.clientsSagemakerruntimeMod.SageMakerRuntimeNs.InvokeEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSagemakerruntimeMod.SageMakerRuntimeNs.InvokeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSagemakerruntimeMod.SageMakerRuntimeNs.InvokeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

