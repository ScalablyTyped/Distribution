package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.Action
import typings.awsLambda.anon.DistributionDomainName
import typings.awsLambda.anon.Key
import typings.awsLambda.awsLambdaStrings.`origin-access-identity`
import typings.awsLambda.awsLambdaStrings.base64
import typings.awsLambda.awsLambdaStrings.http
import typings.awsLambda.awsLambdaStrings.https
import typings.awsLambda.awsLambdaStrings.none_
import typings.awsLambda.awsLambdaStrings.text_
import typings.awsLambda.cloudfrontRequestMod._CloudFrontRequestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudfrontMod {
  
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
    
    @scala.inline
    def apply(
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
    implicit class CloudFrontCustomOriginMutableBuilder[Self <: CloudFrontCustomOrigin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveTimeout(value: Double): Self = StObject.set(x, "keepaliveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslProtocols(value: js.Array[String]): Self = StObject.set(x, "sslProtocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslProtocolsVarargs(value: String*): Self = StObject.set(x, "sslProtocols", js.Array(value :_*))
    }
  }
  
  trait CloudFrontEvent extends StObject {
    
    var config: DistributionDomainName
  }
  object CloudFrontEvent {
    
    @scala.inline
    def apply(config: DistributionDomainName): CloudFrontEvent = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontEvent]
    }
    
    @scala.inline
    implicit class CloudFrontEventMutableBuilder[Self <: CloudFrontEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: DistributionDomainName): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudFrontHeaders = StringDictionary[js.Array[Key]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.anon.Custom
    - typings.awsLambda.anon.S3
  */
  trait CloudFrontOrigin extends StObject
  object CloudFrontOrigin {
    
    @scala.inline
    def Custom(s3: CloudFrontS3Origin): typings.awsLambda.anon.Custom = {
      val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsLambda.anon.Custom]
    }
    
    @scala.inline
    def S3(custom: CloudFrontCustomOrigin): typings.awsLambda.anon.S3 = {
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
    
    @scala.inline
    def apply(clientIp: String, headers: CloudFrontHeaders, method: String, querystring: String, uri: String): CloudFrontRequest = {
      val __obj = js.Dynamic.literal(clientIp = clientIp.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], querystring = querystring.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontRequest]
    }
    
    @scala.inline
    implicit class CloudFrontRequestMutableBuilder[Self <: CloudFrontRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Action): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setClientIp(value: String): Self = StObject.set(x, "clientIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: CloudFrontOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudFrontResponse extends StObject {
    
    var headers: CloudFrontHeaders
    
    var status: String
    
    var statusDescription: String
  }
  object CloudFrontResponse {
    
    @scala.inline
    def apply(headers: CloudFrontHeaders, status: String, statusDescription: String): CloudFrontResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResponse]
    }
    
    @scala.inline
    implicit class CloudFrontResponseMutableBuilder[Self <: CloudFrontResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(status: String): CloudFrontResultResponse = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudFrontResultResponse]
    }
    
    @scala.inline
    implicit class CloudFrontResultResponseMutableBuilder[Self <: CloudFrontResultResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyEncoding(value: text_ | base64): Self = StObject.set(x, "bodyEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyEncodingUndefined: Self = StObject.set(x, "bodyEncoding", js.undefined)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDescriptionUndefined: Self = StObject.set(x, "statusDescription", js.undefined)
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
    
    @scala.inline
    def apply(
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
    implicit class CloudFrontS3OriginMutableBuilder[Self <: CloudFrontS3Origin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthMethod(value: `origin-access-identity` | none_): Self = StObject.set(x, "authMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaders(value: CloudFrontHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
}
