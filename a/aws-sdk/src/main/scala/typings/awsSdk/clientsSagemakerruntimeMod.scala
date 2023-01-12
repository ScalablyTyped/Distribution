package typings.awsSdk

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import typings.awsSdk.libServiceMod.ServiceConfigurationOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsSagemakerruntimeMod {
  
  @JSImport("aws-sdk/clients/sagemakerruntime", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends SageMakerRuntime {
    def this(options: ClientConfiguration) = this()
  }
  
  trait Blob extends StObject
  
  type BodyBlob = Buffer | js.typedarray.Uint8Array | Blob | String
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.clientsSagemakerruntimeMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type CustomAttributesHeader = String
  
  type EnableExplanationsHeader = String
  
  type EndpointName = String
  
  type Header = String
  
  type InferenceId = String
  
  type InputLocationHeader = String
  
  trait InvokeEndpointAsyncInput extends StObject {
    
    /**
      * The desired MIME type of the inference in the response.
      */
    var Accept: js.UndefOr[Header] = js.undefined
    
    /**
      * The MIME type of the input data in the request body.
      */
    var ContentType: js.UndefOr[Header] = js.undefined
    
    /**
      * Provides additional information about a request for an inference submitted to a model hosted at an Amazon SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for example, to provide an ID that you can use to track a request or to provide other metadata that a service endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII characters as specified in Section 3.3.6. Field Value Components of the Hypertext Transfer Protocol (HTTP/1.1).  The code in your model is responsible for setting or updating any custom attributes in the response. If your code does not set this value in the response, an empty value is returned. For example, if a custom attribute represents the trace ID, your model can prepend the custom attribute with Trace ID: in your post-processing function.  This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker Python SDK. 
      */
    var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined
    
    /**
      * The name of the endpoint that you specified when you created the endpoint using the  CreateEndpoint  API.
      */
    var EndpointName: typings.awsSdk.clientsSagemakerruntimeMod.EndpointName
    
    /**
      * The identifier for the inference request. Amazon SageMaker will generate an identifier for you if none is specified. 
      */
    var InferenceId: js.UndefOr[typings.awsSdk.clientsSagemakerruntimeMod.InferenceId] = js.undefined
    
    /**
      * The Amazon S3 URI where the inference request payload is stored.
      */
    var InputLocation: InputLocationHeader
    
    /**
      * Maximum age in seconds a request can be in the queue before it is marked as expired.
      */
    var RequestTTLSeconds: js.UndefOr[RequestTTLSecondsHeader] = js.undefined
  }
  object InvokeEndpointAsyncInput {
    
    inline def apply(EndpointName: EndpointName, InputLocation: InputLocationHeader): InvokeEndpointAsyncInput = {
      val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any], InputLocation = InputLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvokeEndpointAsyncInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvokeEndpointAsyncInput] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: Header): Self = StObject.set(x, "Accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "Accept", js.undefined)
      
      inline def setContentType(value: Header): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      inline def setCustomAttributes(value: CustomAttributesHeader): Self = StObject.set(x, "CustomAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "CustomAttributes", js.undefined)
      
      inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
      
      inline def setInferenceId(value: InferenceId): Self = StObject.set(x, "InferenceId", value.asInstanceOf[js.Any])
      
      inline def setInferenceIdUndefined: Self = StObject.set(x, "InferenceId", js.undefined)
      
      inline def setInputLocation(value: InputLocationHeader): Self = StObject.set(x, "InputLocation", value.asInstanceOf[js.Any])
      
      inline def setRequestTTLSeconds(value: RequestTTLSecondsHeader): Self = StObject.set(x, "RequestTTLSeconds", value.asInstanceOf[js.Any])
      
      inline def setRequestTTLSecondsUndefined: Self = StObject.set(x, "RequestTTLSeconds", js.undefined)
    }
  }
  
  trait InvokeEndpointAsyncOutput extends StObject {
    
    /**
      * Identifier for an inference request. This will be the same as the InferenceId specified in the input. Amazon SageMaker will generate an identifier for you if you do not specify one.
      */
    var InferenceId: js.UndefOr[Header] = js.undefined
    
    /**
      * The Amazon S3 URI where the inference response payload is stored.
      */
    var OutputLocation: js.UndefOr[Header] = js.undefined
  }
  object InvokeEndpointAsyncOutput {
    
    inline def apply(): InvokeEndpointAsyncOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvokeEndpointAsyncOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvokeEndpointAsyncOutput] (val x: Self) extends AnyVal {
      
      inline def setInferenceId(value: Header): Self = StObject.set(x, "InferenceId", value.asInstanceOf[js.Any])
      
      inline def setInferenceIdUndefined: Self = StObject.set(x, "InferenceId", js.undefined)
      
      inline def setOutputLocation(value: Header): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
      
      inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    }
  }
  
  trait InvokeEndpointInput extends StObject {
    
    /**
      * The desired MIME type of the inference in the response.
      */
    var Accept: js.UndefOr[Header] = js.undefined
    
    /**
      * Provides input data, in the format specified in the ContentType request header. Amazon SageMaker passes all of the data in the body to the model.  For information about the format of the request body, see Common Data Formats-Inference.
      */
    var Body: BodyBlob
    
    /**
      * The MIME type of the input data in the request body.
      */
    var ContentType: js.UndefOr[Header] = js.undefined
    
    /**
      * Provides additional information about a request for an inference submitted to a model hosted at an Amazon SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for example, to provide an ID that you can use to track a request or to provide other metadata that a service endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII characters as specified in Section 3.3.6. Field Value Components of the Hypertext Transfer Protocol (HTTP/1.1).  The code in your model is responsible for setting or updating any custom attributes in the response. If your code does not set this value in the response, an empty value is returned. For example, if a custom attribute represents the trace ID, your model can prepend the custom attribute with Trace ID: in your post-processing function. This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker Python SDK.
      */
    var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined
    
    /**
      * An optional JMESPath expression used to override the EnableExplanations parameter of the ClarifyExplainerConfig API. See the EnableExplanations section in the developer guide for more information. 
      */
    var EnableExplanations: js.UndefOr[EnableExplanationsHeader] = js.undefined
    
    /**
      * The name of the endpoint that you specified when you created the endpoint using the CreateEndpoint API. 
      */
    var EndpointName: typings.awsSdk.clientsSagemakerruntimeMod.EndpointName
    
    /**
      * If you provide a value, it is added to the captured data when you enable data capture on the endpoint. For information about data capture, see Capture Data.
      */
    var InferenceId: js.UndefOr[typings.awsSdk.clientsSagemakerruntimeMod.InferenceId] = js.undefined
    
    /**
      * If the endpoint hosts multiple containers and is configured to use direct invocation, this parameter specifies the host name of the container to invoke.
      */
    var TargetContainerHostname: js.UndefOr[TargetContainerHostnameHeader] = js.undefined
    
    /**
      * The model to request for inference when invoking a multi-model endpoint.
      */
    var TargetModel: js.UndefOr[TargetModelHeader] = js.undefined
    
    /**
      * Specify the production variant to send the inference request to when invoking an endpoint that is running two or more variants. Note that this parameter overrides the default behavior for the endpoint, which is to distribute the invocation traffic based on the variant weights. For information about how to use variant targeting to perform a/b testing, see Test models in production 
      */
    var TargetVariant: js.UndefOr[TargetVariantHeader] = js.undefined
  }
  object InvokeEndpointInput {
    
    inline def apply(Body: BodyBlob, EndpointName: EndpointName): InvokeEndpointInput = {
      val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvokeEndpointInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvokeEndpointInput] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: Header): Self = StObject.set(x, "Accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "Accept", js.undefined)
      
      inline def setBody(value: BodyBlob): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: Header): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      inline def setCustomAttributes(value: CustomAttributesHeader): Self = StObject.set(x, "CustomAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "CustomAttributes", js.undefined)
      
      inline def setEnableExplanations(value: EnableExplanationsHeader): Self = StObject.set(x, "EnableExplanations", value.asInstanceOf[js.Any])
      
      inline def setEnableExplanationsUndefined: Self = StObject.set(x, "EnableExplanations", js.undefined)
      
      inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
      
      inline def setInferenceId(value: InferenceId): Self = StObject.set(x, "InferenceId", value.asInstanceOf[js.Any])
      
      inline def setInferenceIdUndefined: Self = StObject.set(x, "InferenceId", js.undefined)
      
      inline def setTargetContainerHostname(value: TargetContainerHostnameHeader): Self = StObject.set(x, "TargetContainerHostname", value.asInstanceOf[js.Any])
      
      inline def setTargetContainerHostnameUndefined: Self = StObject.set(x, "TargetContainerHostname", js.undefined)
      
      inline def setTargetModel(value: TargetModelHeader): Self = StObject.set(x, "TargetModel", value.asInstanceOf[js.Any])
      
      inline def setTargetModelUndefined: Self = StObject.set(x, "TargetModel", js.undefined)
      
      inline def setTargetVariant(value: TargetVariantHeader): Self = StObject.set(x, "TargetVariant", value.asInstanceOf[js.Any])
      
      inline def setTargetVariantUndefined: Self = StObject.set(x, "TargetVariant", js.undefined)
    }
  }
  
  trait InvokeEndpointOutput extends StObject {
    
    /**
      * Includes the inference provided by the model.  For information about the format of the response body, see Common Data Formats-Inference. If the explainer is activated, the body includes the explanations provided by the model. For more information, see the Response section under Invoke the Endpoint in the Developer Guide.
      */
    var Body: BodyBlob
    
    /**
      * The MIME type of the inference returned in the response body.
      */
    var ContentType: js.UndefOr[Header] = js.undefined
    
    /**
      * Provides additional information in the response about the inference returned by a model hosted at an Amazon SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for example, to return an ID received in the CustomAttributes header of a request or other metadata that a service endpoint was programmed to produce. The value must consist of no more than 1024 visible US-ASCII characters as specified in Section 3.3.6. Field Value Components of the Hypertext Transfer Protocol (HTTP/1.1). If the customer wants the custom attribute returned, the model must set the custom attribute to be included on the way back.  The code in your model is responsible for setting or updating any custom attributes in the response. If your code does not set this value in the response, an empty value is returned. For example, if a custom attribute represents the trace ID, your model can prepend the custom attribute with Trace ID: in your post-processing function. This feature is currently supported in the Amazon Web Services SDKs but not in the Amazon SageMaker Python SDK.
      */
    var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined
    
    /**
      * Identifies the production variant that was invoked.
      */
    var InvokedProductionVariant: js.UndefOr[Header] = js.undefined
  }
  object InvokeEndpointOutput {
    
    inline def apply(Body: BodyBlob): InvokeEndpointOutput = {
      val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvokeEndpointOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvokeEndpointOutput] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BodyBlob): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: Header): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
      
      inline def setCustomAttributes(value: CustomAttributesHeader): Self = StObject.set(x, "CustomAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "CustomAttributes", js.undefined)
      
      inline def setInvokedProductionVariant(value: Header): Self = StObject.set(x, "InvokedProductionVariant", value.asInstanceOf[js.Any])
      
      inline def setInvokedProductionVariantUndefined: Self = StObject.set(x, "InvokedProductionVariant", js.undefined)
    }
  }
  
  type RequestTTLSecondsHeader = Double
  
  @js.native
  trait SageMakerRuntime extends Service {
    
    @JSName("config")
    var config_SageMakerRuntime: ConfigBase & ClientConfiguration = js.native
    
    /**
      * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Calls to InvokeEndpoint are authenticated by using Amazon Web Services Signature Version 4. For information, see Authenticating Requests (Amazon Web Services Signature Version 4) in the Amazon S3 API Reference. A customer's model containers must respond to requests within 60 seconds. The model itself can have a maximum processing time of 60 seconds before responding to invocations. If your model is going to take 50-60 seconds of processing time, the SDK socket timeout should be set to be 70 seconds.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
      */
    def invokeEndpoint(): Request[InvokeEndpointOutput, AWSError] = js.native
    def invokeEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ InvokeEndpointOutput, Unit]): Request[InvokeEndpointOutput, AWSError] = js.native
    /**
      * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint.  For an overview of Amazon SageMaker, see How It Works.  Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax.  Calls to InvokeEndpoint are authenticated by using Amazon Web Services Signature Version 4. For information, see Authenticating Requests (Amazon Web Services Signature Version 4) in the Amazon S3 API Reference. A customer's model containers must respond to requests within 60 seconds. The model itself can have a maximum processing time of 60 seconds before responding to invocations. If your model is going to take 50-60 seconds of processing time, the SDK socket timeout should be set to be 70 seconds.  Endpoints are scoped to an individual account, and are not public. The URL does not contain the account ID, but Amazon SageMaker determines the account ID from the authentication token that is supplied by the caller. 
      */
    def invokeEndpoint(params: InvokeEndpointInput): Request[InvokeEndpointOutput, AWSError] = js.native
    def invokeEndpoint(
      params: InvokeEndpointInput,
      callback: js.Function2[/* err */ AWSError, /* data */ InvokeEndpointOutput, Unit]
    ): Request[InvokeEndpointOutput, AWSError] = js.native
    
    /**
      * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint in an asynchronous manner. Inference requests sent to this API are enqueued for asynchronous processing. The processing of the inference request may or may not complete before the you receive a response from this API. The response from this API will not contain the result of the inference request but contain information about where you can locate it. Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax. Calls to InvokeEndpointAsync are authenticated by using Amazon Web Services Signature Version 4. For information, see Authenticating Requests (Amazon Web Services Signature Version 4) in the Amazon S3 API Reference.
      */
    def invokeEndpointAsync(): Request[InvokeEndpointAsyncOutput, AWSError] = js.native
    def invokeEndpointAsync(callback: js.Function2[/* err */ AWSError, /* data */ InvokeEndpointAsyncOutput, Unit]): Request[InvokeEndpointAsyncOutput, AWSError] = js.native
    /**
      * After you deploy a model into production using Amazon SageMaker hosting services, your client applications use this API to get inferences from the model hosted at the specified endpoint in an asynchronous manner. Inference requests sent to this API are enqueued for asynchronous processing. The processing of the inference request may or may not complete before the you receive a response from this API. The response from this API will not contain the result of the inference request but contain information about where you can locate it. Amazon SageMaker strips all POST headers except those supported by the API. Amazon SageMaker might add additional headers. You should not rely on the behavior of headers outside those enumerated in the request syntax. Calls to InvokeEndpointAsync are authenticated by using Amazon Web Services Signature Version 4. For information, see Authenticating Requests (Amazon Web Services Signature Version 4) in the Amazon S3 API Reference.
      */
    def invokeEndpointAsync(params: InvokeEndpointAsyncInput): Request[InvokeEndpointAsyncOutput, AWSError] = js.native
    def invokeEndpointAsync(
      params: InvokeEndpointAsyncInput,
      callback: js.Function2[/* err */ AWSError, /* data */ InvokeEndpointAsyncOutput, Unit]
    ): Request[InvokeEndpointAsyncOutput, AWSError] = js.native
  }
  
  type TargetContainerHostnameHeader = String
  
  type TargetModelHeader = String
  
  type TargetVariantHeader = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-05-13`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
