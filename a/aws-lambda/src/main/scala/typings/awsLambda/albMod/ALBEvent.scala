package typings.awsLambda.albMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ALBEvent extends js.Object {
  
  var body: String | Null = js.native
  
   // URL encoded
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var httpMethod: String = js.native
  
  var isBase64Encoded: Boolean = js.native
  
   // URL encoded
  var multiValueHeaders: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  var multiValueQueryStringParameters: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  var path: String = js.native
  
  var queryStringParameters: js.UndefOr[StringDictionary[String]] = js.native
  
  var requestContext: ALBEventRequestContext = js.native
}
object ALBEvent {
  
  @scala.inline
  def apply(httpMethod: String, isBase64Encoded: Boolean, path: String, requestContext: ALBEventRequestContext): ALBEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALBEvent]
  }
  
  @scala.inline
  implicit class ALBEventOps[Self <: ALBEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBase64Encoded(value: Boolean): Self = this.set("isBase64Encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestContext(value: ALBEventRequestContext): Self = this.set("requestContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMultiValueHeaders(value: StringDictionary[js.Array[String]]): Self = this.set("multiValueHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueHeaders: Self = this.set("multiValueHeaders", js.undefined)
    
    @scala.inline
    def setMultiValueQueryStringParameters(value: StringDictionary[js.Array[String]]): Self = this.set("multiValueQueryStringParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueQueryStringParameters: Self = this.set("multiValueQueryStringParameters", js.undefined)
    
    @scala.inline
    def setQueryStringParameters(value: StringDictionary[String]): Self = this.set("queryStringParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStringParameters: Self = this.set("queryStringParameters", js.undefined)
  }
}
