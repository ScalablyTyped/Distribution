package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.TargetGroupArn
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerAlbMod {
  
  type ALBCallback = Callback[ALBResult]
  
  trait ALBEvent extends StObject {
    
    var body: String | Null
    
    // URL encoded
    var headers: js.UndefOr[ALBEventHeaders] = js.undefined
    
    var httpMethod: String
    
    var isBase64Encoded: Boolean
    
    // URL encoded
    var multiValueHeaders: js.UndefOr[ALBEventMultiValueHeaders] = js.undefined
    
    var multiValueQueryStringParameters: js.UndefOr[ALBEventMultiValueQueryStringParameters] = js.undefined
    
    var path: String
    
    var queryStringParameters: js.UndefOr[ALBEventQueryStringParameters] = js.undefined
    
    var requestContext: ALBEventRequestContext
  }
  object ALBEvent {
    
    inline def apply(httpMethod: String, isBase64Encoded: Boolean, path: String, requestContext: ALBEventRequestContext): ALBEvent = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], body = null)
      __obj.asInstanceOf[ALBEvent]
    }
    
    extension [Self <: ALBEvent](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setHeaders(value: ALBEventHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeaders(value: ALBEventMultiValueHeaders): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
      
      inline def setMultiValueQueryStringParameters(value: ALBEventMultiValueQueryStringParameters): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setMultiValueQueryStringParametersUndefined: Self = StObject.set(x, "multiValueQueryStringParameters", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParameters(value: ALBEventQueryStringParameters): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
      
      inline def setRequestContext(value: ALBEventRequestContext): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
    }
  }
  
  type ALBEventHeaders = StringDictionary[js.UndefOr[String]]
  
  type ALBEventMultiValueHeaders = StringDictionary[js.UndefOr[js.Array[String]]]
  
  type ALBEventMultiValueQueryStringParameters = StringDictionary[js.UndefOr[js.Array[String]]]
  
  type ALBEventQueryStringParameters = StringDictionary[js.UndefOr[String]]
  
  trait ALBEventRequestContext extends StObject {
    
    var elb: TargetGroupArn
  }
  object ALBEventRequestContext {
    
    inline def apply(elb: TargetGroupArn): ALBEventRequestContext = {
      val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any])
      __obj.asInstanceOf[ALBEventRequestContext]
    }
    
    extension [Self <: ALBEventRequestContext](x: Self) {
      
      inline def setElb(value: TargetGroupArn): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
    }
  }
  
  type ALBHandler = Handler[ALBEvent, ALBResult]
  
  trait ALBResult extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[Boolean | Double | String]] = js.undefined
    
    var isBase64Encoded: js.UndefOr[Boolean] = js.undefined
    
    var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[Boolean | Double | String]]] = js.undefined
    
    var statusCode: Double
    
    var statusDescription: js.UndefOr[String] = js.undefined
  }
  object ALBResult {
    
    inline def apply(statusCode: Double): ALBResult = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ALBResult]
    }
    
    extension [Self <: ALBResult](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: StringDictionary[Boolean | Double | String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setIsBase64EncodedUndefined: Self = StObject.set(x, "isBase64Encoded", js.undefined)
      
      inline def setMultiValueHeaders(value: StringDictionary[js.Array[Boolean | Double | String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      inline def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
      
      inline def setStatusDescriptionUndefined: Self = StObject.set(x, "statusDescription", js.undefined)
    }
  }
}
