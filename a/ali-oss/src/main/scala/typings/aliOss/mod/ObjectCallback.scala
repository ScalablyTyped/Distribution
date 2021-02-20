package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectCallback extends StObject {
  
  // The host header value for initiating callback requests.
  var body: String = js.native
  
  // The value of the request body when a callback is initiated, for example, key=$(key)&etag=$(etag)&my_var=$(x:my_var).
  var contentType: js.UndefOr[String] = js.native
  
  // The Content-Type of the callback requests initiatiated, It supports application/x-www-form-urlencoded and application/json, and the former is the default value.
  var customValue: js.UndefOr[js.Object] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  // After a file is uploaded successfully, the OSS sends a callback request to this URL.
  var host: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object ObjectCallback {
  
  @scala.inline
  def apply(body: String, url: String): ObjectCallback = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectCallback]
  }
  
  @scala.inline
  implicit class ObjectCallbackMutableBuilder[Self <: ObjectCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCustomValue(value: js.Object): Self = StObject.set(x, "customValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomValueUndefined: Self = StObject.set(x, "customValue", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
