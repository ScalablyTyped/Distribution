package typings
package awsDashSdkLib.clientsSagemakerruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/sagemakerruntime", "SageMakerRuntime")
@js.native
object SageMakerRuntimeNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait InvokeEndpointInput extends js.Object {
    /**
         * The desired MIME type of the inference in the response.
         */
    var Accept: js.UndefOr[Header] = js.undefined
    /**
         * Provides input data, in the format specified in the ContentType request header. Amazon SageMaker passes all of the data in the body to the model.  For information about the format of the request body, see Common Data Formats—Inference.
         */
    var Body: BodyBlob
    /**
         * The MIME type of the input data in the request body.
         */
    var ContentType: js.UndefOr[Header] = js.undefined
    /**
         * 
         */
    var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined
    /**
         * The name of the endpoint that you specified when you created the endpoint using the CreateEndpoint API. 
         */
    var EndpointName: EndpointName
  }
  
  
  trait InvokeEndpointOutput extends js.Object {
    /**
         * Includes the inference provided by the model. For information about the format of the response body, see Common Data Formats—Inference.
         */
    var Body: BodyBlob
    /**
         * The MIME type of the inference returned in the response body.
         */
    var ContentType: js.UndefOr[Header] = js.undefined
    /**
         * 
         */
    var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined
    /**
         * Identifies the production variant that was invoked.
         */
    var InvokedProductionVariant: js.UndefOr[Header] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Cals to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests (AWS Signature Version 4) in the Amazon S3 API Reference.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
       */
    def invokeEndpoint(): awsDashSdkLib.libRequestMod.Request[InvokeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Cals to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests (AWS Signature Version 4) in the Amazon S3 API Reference.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
       */
    def invokeEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvokeEndpointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvokeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Cals to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests (AWS Signature Version 4) in the Amazon S3 API Reference.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
       */
    def invokeEndpoint(params: InvokeEndpointInput): awsDashSdkLib.libRequestMod.Request[InvokeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Cals to InvokeEndpoint are authenticated by using AWS Signature Version 4. For information, see Authenticating Requests (AWS Signature Version 4) in the Amazon S3 API Reference.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
       */
    def invokeEndpoint(
      params: InvokeEndpointInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvokeEndpointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvokeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type BodyBlob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsSagemakerruntimeMod.Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CustomAttributesHeader = java.lang.String
  type EndpointName = java.lang.String
  type Header = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-05-13` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

