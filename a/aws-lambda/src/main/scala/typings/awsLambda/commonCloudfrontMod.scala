package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.Action
import typings.awsLambda.anon.Cookies
import typings.awsLambda.anon.DistributionDomainName
import typings.awsLambda.anon.DistributionId
import typings.awsLambda.anon.Headers
import typings.awsLambda.anon.Ip
import typings.awsLambda.anon.Key
import typings.awsLambda.anon.MultiValue
import typings.awsLambda.anon.MultiValueValue
import typings.awsLambda.awsLambdaStrings.`origin-access-identity`
import typings.awsLambda.awsLambdaStrings.base64
import typings.awsLambda.awsLambdaStrings.http
import typings.awsLambda.awsLambdaStrings.https
import typings.awsLambda.awsLambdaStrings.none_
import typings.awsLambda.awsLambdaStrings.text_
import typings.awsLambda.triggerCloudfrontRequestMod._CloudFrontRequestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonCloudfrontMod {
  
  trait CloudFrontCustomOrigin extends StObject {
    
    var customHeaders: CloudFrontHeaders
    
    var domainName: String
    
    var keepaliveTimeout: Double
    
    var path: String
    
    var port: Double
    
    var protocol: http | https
    
    var readTimeout: Double
    
    var sslProtocols: js.Array[String]
  }
  object CloudFrontCustomOrigin {
    
    inline def apply(
      customHeaders: CloudFrontHeaders,
      domainName: String,
      keepaliveTimeout: Double,
      path: String,
      port: Double,
      protocol: http | https,
      readTimeout: Double,
      sslProtocols: js.Array[String]
    ): CloudFrontCustomOrigin = {
      val __obj = js.Dynamic.literal(customHeaders = customHeaders.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], keepaliveTimeout = keepaliveTimeout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], readTimeout = readTimeout.asInstanceOf[js.Any], sslProtocols = sslProtocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontCustomOrigin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontCustomOrigin] (val x: Self) extends AnyVal {
      
      inline def setCustomHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveTimeout(value: Double): Self = StObject.set(x, "keepaliveTimeout", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
      
      inline def setSslProtocols(value: js.Array[String]): Self = StObject.set(x, "sslProtocols", value.asInstanceOf[js.Any])
      
      inline def setSslProtocolsVarargs(value: String*): Self = StObject.set(x, "sslProtocols", js.Array(value*))
    }
  }
  
  trait CloudFrontEvent extends StObject {
    
    var config: DistributionDomainName
  }
  object CloudFrontEvent {
    
    inline def apply(config: DistributionDomainName): CloudFrontEvent = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontEvent] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: DistributionDomainName): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudFrontFunctionsCookies = StringDictionary[MultiValue]
  
  trait CloudFrontFunctionsEvent extends StObject {
    
    /**
      * ## Context object
      * The `context` object contains contextual information about the event. It includes the following fields:
      * - `distributionDomainName`
      * - `distributionId`
      * - `eventType`
      * - `requestId`
      */
    var context: DistributionId
    
    /**
      * ## Request object
      * The `request` object contains a representation of a viewer-to-CloudFront HTTP request.
      * In the `event` object that’s passed to your function, the `request` object represents the
      * actual request that CloudFront received from the viewer.
      *
      * If your function code returns a `request` object to CloudFront, it must use this same structure.
      *
      * The `request` object contains the following fields:
      * - `method`
      * - `uri`
      * - `querystring`
      * - `headers`
      * - `cookies`
      */
    var request: Cookies
    
    /**
      * ## Response object
      *
      * The `response` object contains a representation of a CloudFront-to-viewer HTTP response.
      * In the `event` object that’s passed to your function, the `response` object represents CloudFront’s actual response to a viewer request.
      *
      * If your function code returns a `response` object, it must use this same structure.
      *
      * The `response` object contains the following fields:
      */
    var response: Headers
    
    /**
      * ## Version field
      * The version field contains a string that specifies the version of the
      * CloudFront Functions event object. The current version is 1.0.
      */
    var version: String
    
    /**
      * ## Viewer object
      * The `viewer` object contains an `ip` field whose value is the IP address of the viewer (client) that sent the request.
      * If the viewer request came through an HTTP proxy or a load balancer, the value is the IP address of the proxy or load balancer.
      */
    var viewer: Ip
  }
  object CloudFrontFunctionsEvent {
    
    inline def apply(context: DistributionId, request: Cookies, response: Headers, version: String, viewer: Ip): CloudFrontFunctionsEvent = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontFunctionsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontFunctionsEvent] (val x: Self) extends AnyVal {
      
      inline def setContext(value: DistributionId): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Cookies): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Headers): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setViewer(value: Ip): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudFrontFunctionsHeaders = StringDictionary[MultiValueValue]
  
  type CloudFrontFunctionsQuerystring = StringDictionary[MultiValueValue]
  
  type CloudFrontHeaders = StringDictionary[js.Array[Key]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.anon.Custom
    - typings.awsLambda.anon.S3
  */
  trait CloudFrontOrigin extends StObject
  object CloudFrontOrigin {
    
    inline def Custom(s3: CloudFrontS3Origin): typings.awsLambda.anon.Custom = {
      val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.anon.Custom]
    }
    
    inline def S3(custom: CloudFrontCustomOrigin): typings.awsLambda.anon.S3 = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.anon.S3]
    }
  }
  
  trait CloudFrontRequest
    extends StObject
       with _CloudFrontRequestResult {
    
    var body: js.UndefOr[Action] = js.undefined
    
    val clientIp: String
    
    var headers: CloudFrontHeaders
    
    val method: String
    
    var origin: js.UndefOr[CloudFrontOrigin] = js.undefined
    
    var querystring: String
    
    var uri: String
  }
  object CloudFrontRequest {
    
    inline def apply(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): CloudFrontRequest = {
      val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontRequest] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Action): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setClientIp(value: String): Self = StObject.set(x, "clientIp", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: CloudFrontOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudFrontResponse extends StObject {
    
    var headers: CloudFrontHeaders
    
    var status: String
    
    var statusDescription: String
  }
  object CloudFrontResponse {
    
    inline def apply(headers: CloudFrontHeaders, status: String, statusDescription: String): CloudFrontResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontResponse] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudFrontResultResponse
    extends StObject
       with _CloudFrontRequestResult {
    
    var body: js.UndefOr[String] = js.undefined
    
    var bodyEncoding: js.UndefOr[text_ | base64] = js.undefined
    
    var headers: js.UndefOr[CloudFrontHeaders] = js.undefined
    
    var status: String
    
    var statusDescription: js.UndefOr[String] = js.undefined
  }
  object CloudFrontResultResponse {
    
    inline def apply(status: String): CloudFrontResultResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResultResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontResultResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyEncoding(value: text_ | base64): Self = StObject.set(x, "bodyEncoding", value.asInstanceOf[js.Any])
      
      inline def setBodyEncodingUndefined: Self = StObject.set(x, "bodyEncoding", js.undefined)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
      
      inline def setStatusDescriptionUndefined: Self = StObject.set(x, "statusDescription", js.undefined)
    }
  }
  
  trait CloudFrontS3Origin extends StObject {
    
    var authMethod: `origin-access-identity` | none_
    
    var customHeaders: CloudFrontHeaders
    
    var domainName: String
    
    var path: String
    
    var region: String
  }
  object CloudFrontS3Origin {
    
    inline def apply(
      authMethod: `origin-access-identity` | none_,
      customHeaders: CloudFrontHeaders,
      domainName: String,
      path: String,
      region: String
    ): CloudFrontS3Origin = {
      val __obj = js.Dynamic.literal(authMethod = authMethod.asInstanceOf[js.Any], customHeaders = customHeaders.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontS3Origin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudFrontS3Origin] (val x: Self) extends AnyVal {
      
      inline def setAuthMethod(value: `origin-access-identity` | none_): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
}
