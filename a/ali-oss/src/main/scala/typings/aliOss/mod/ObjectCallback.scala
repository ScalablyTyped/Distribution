package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectCallback extends StObject {
  
  /** The value of the request body when a callback is initiated, for example, key=$(key)&etag=$(etag)&my_var=$(x:my_var). */
  var body: String
  
  /** The Content-Type of the callback requests initiatiated, It supports application/x-www-form-urlencoded and application/json, and the former is the default value. */
  var contentType: js.UndefOr[String] = js.undefined
  
  var customValue: js.UndefOr[js.Object] = js.undefined
  
  /** extra headers, detail see RFC 2616 */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The host header value for initiating callback requests. */
  var host: js.UndefOr[String] = js.undefined
  
  /** After a file is uploaded successfully, the OSS sends a callback request to this URL. */
  var url: String
}
object ObjectCallback {
  
  inline def apply(body: String, url: String): ObjectCallback = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectCallback]
  }
  
  extension [Self <: ObjectCallback](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCustomValue(value: js.Object): Self = StObject.set(x, "customValue", value.asInstanceOf[js.Any])
    
    inline def setCustomValueUndefined: Self = StObject.set(x, "customValue", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
