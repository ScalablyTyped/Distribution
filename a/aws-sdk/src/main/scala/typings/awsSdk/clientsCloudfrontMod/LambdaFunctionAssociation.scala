package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionAssociation extends StObject {
  
  /**
    * Specifies the event type that triggers a Lambda@Edge function invocation. You can specify the following values:    viewer-request: The function executes when CloudFront receives a request from a viewer and before it checks to see whether the requested object is in the edge cache.     origin-request: The function executes only when CloudFront sends a request to your origin. When the requested object is in the edge cache, the function doesn't execute.    origin-response: The function executes after CloudFront receives a response from the origin and before it caches the object in the response. When the requested object is in the edge cache, the function doesn't execute.    viewer-response: The function executes before CloudFront returns the requested object to the viewer. The function executes regardless of whether the object was already in the edge cache. If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.  
    */
  var EventType: typings.awsSdk.clientsCloudfrontMod.EventType
  
  /**
    * A flag that allows a Lambda@Edge function to have read access to the body content. For more information, see Accessing the Request Body by Choosing the Include Body Option in the Amazon CloudFront Developer Guide.
    */
  var IncludeBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the Lambda@Edge function. You must specify the ARN of a function version; you can't specify an alias or $LATEST.
    */
  var LambdaFunctionARN: typings.awsSdk.clientsCloudfrontMod.LambdaFunctionARN
}
object LambdaFunctionAssociation {
  
  inline def apply(EventType: EventType, LambdaFunctionARN: LambdaFunctionARN): LambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], LambdaFunctionARN = LambdaFunctionARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunctionAssociation] (val x: Self) extends AnyVal {
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setIncludeBody(value: Boolean): Self = StObject.set(x, "IncludeBody", value.asInstanceOf[js.Any])
    
    inline def setIncludeBodyUndefined: Self = StObject.set(x, "IncludeBody", js.undefined)
    
    inline def setLambdaFunctionARN(value: LambdaFunctionARN): Self = StObject.set(x, "LambdaFunctionARN", value.asInstanceOf[js.Any])
  }
}
