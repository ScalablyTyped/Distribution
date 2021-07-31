package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.TargetGroupArn
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object albMod {
  
  type ALBCallback = Callback[ALBResult]
  
  trait ALBEvent extends StObject {
    
    var body: String | Null
    
    // URL encoded
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var httpMethod: String
    
    var isBase64Encoded: Boolean
    
    // URL encoded
    var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    var path: String
    
    var queryStringParameters: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var requestContext: ALBEventRequestContext
  }
  object ALBEvent {
    
    @scala.inline
    def apply(httpMethod: String, isBase64Encoded: Boolean, path: String, requestContext: ALBEventRequestContext): ALBEvent = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], body = null)
      __obj.asInstanceOf[ALBEvent]
    }
    
    @scala.inline
    implicit class ALBEventMutableBuilder[Self <: ALBEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
      
      @scala.inline
      def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "multiValueQueryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueQueryStringParametersUndefined: Self = StObject.set(x, "multiValueQueryStringParameters", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringParameters(value: StringDictionary[String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringParametersUndefined: Self = StObject.set(x, "queryStringParameters", js.undefined)
      
      @scala.inline
      def setRequestContext(value: ALBEventRequestContext): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait ALBEventRequestContext extends StObject {
    
    var elb: TargetGroupArn
  }
  object ALBEventRequestContext {
    
    @scala.inline
    def apply(elb: TargetGroupArn): ALBEventRequestContext = {
      val __obj = js.Dynamic.literal(elb = elb.asInstanceOf[js.Any])
      __obj.asInstanceOf[ALBEventRequestContext]
    }
    
    @scala.inline
    implicit class ALBEventRequestContextMutableBuilder[Self <: ALBEventRequestContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElb(value: TargetGroupArn): Self = StObject.set(x, "elb", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(statusCode: Double): ALBResult = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ALBResult]
    }
    
    @scala.inline
    implicit class ALBResultMutableBuilder[Self <: ALBResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[Boolean | Double | String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBase64EncodedUndefined: Self = StObject.set(x, "isBase64Encoded", js.undefined)
      
      @scala.inline
      def setMultiValueHeaders(value: StringDictionary[js.Array[Boolean | Double | String]]): Self = StObject.set(x, "multiValueHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiValueHeadersUndefined: Self = StObject.set(x, "multiValueHeaders", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusDescriptionUndefined: Self = StObject.set(x, "statusDescription", js.undefined)
    }
  }
}
