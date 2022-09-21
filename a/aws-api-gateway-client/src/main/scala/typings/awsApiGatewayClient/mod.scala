package typings.awsApiGatewayClient

import typings.awsApiGatewayClient.anon.Headers
import typings.awsApiGatewayClient.awsApiGatewayClientStrings.DELETE
import typings.awsApiGatewayClient.awsApiGatewayClientStrings.GET
import typings.awsApiGatewayClient.awsApiGatewayClientStrings.POST
import typings.awsApiGatewayClient.awsApiGatewayClientStrings.UPDATE
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("aws-api-gateway-client", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def newClient(apiGatewayClientConfig: ApiGatewayClientConfig): ApiGatewayClient = ^.asInstanceOf[js.Dynamic].applyDynamic("newClient")(apiGatewayClientConfig.asInstanceOf[js.Any]).asInstanceOf[ApiGatewayClient]
  }
  
  object apigClientFactory {
    
    @JSImport("aws-api-gateway-client", "apigClientFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def newClient(apiGatewayClientConfig: ApiGatewayClientConfig): ApiGatewayClient = ^.asInstanceOf[js.Dynamic].applyDynamic("newClient")(apiGatewayClientConfig.asInstanceOf[js.Any]).asInstanceOf[ApiGatewayClient]
  }
  
  @js.native
  trait ApiGatewayClient extends StObject {
    
    def invokeApi(params: Record[String, Any], pathTemplate: String, method: GET | POST | DELETE | UPDATE): js.Promise[Response] = js.native
    def invokeApi(
      params: Record[String, Any],
      pathTemplate: String,
      method: GET | POST | DELETE | UPDATE,
      additionalParams: Unit,
      body: String
    ): js.Promise[Response] = js.native
    def invokeApi(
      params: Record[String, Any],
      pathTemplate: String,
      method: GET | POST | DELETE | UPDATE,
      additionalParams: Headers
    ): js.Promise[Response] = js.native
    def invokeApi(
      params: Record[String, Any],
      pathTemplate: String,
      method: GET | POST | DELETE | UPDATE,
      additionalParams: Headers,
      body: String
    ): js.Promise[Response] = js.native
  }
  
  trait ApiGatewayClientConfig extends StObject {
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var defaultAcceptType: js.UndefOr[String] = js.undefined
    
    var defaultContentType: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Record[String, js.UndefOr[String]]] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var invokeUrl: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var secretKey: js.UndefOr[String] = js.undefined
    
    var service: js.UndefOr[String] = js.undefined
    
    var sessionToken: js.UndefOr[String] = js.undefined
    
    var systemClockOffset: js.UndefOr[Double] = js.undefined
  }
  object ApiGatewayClientConfig {
    
    inline def apply(): ApiGatewayClientConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiGatewayClientConfig]
    }
    
    extension [Self <: ApiGatewayClientConfig](x: Self) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setDefaultAcceptType(value: String): Self = StObject.set(x, "defaultAcceptType", value.asInstanceOf[js.Any])
      
      inline def setDefaultAcceptTypeUndefined: Self = StObject.set(x, "defaultAcceptType", js.undefined)
      
      inline def setDefaultContentType(value: String): Self = StObject.set(x, "defaultContentType", value.asInstanceOf[js.Any])
      
      inline def setDefaultContentTypeUndefined: Self = StObject.set(x, "defaultContentType", js.undefined)
      
      inline def setHeaders(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setInvokeUrl(value: String): Self = StObject.set(x, "invokeUrl", value.asInstanceOf[js.Any])
      
      inline def setInvokeUrlUndefined: Self = StObject.set(x, "invokeUrl", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
      
      inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
      
      inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    }
  }
  
  trait Response extends StObject {
    
    var data: Any
    
    var headers: Any
    
    var request: js.UndefOr[Any] = js.undefined
    
    var status: Double
    
    var statusText: String
  }
  object Response {
    
    inline def apply(data: Any, headers: Any, status: Double, statusText: String): Response = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
}
