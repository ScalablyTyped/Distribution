package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.atlassianConnectJsStrings.CONNECT
import typings.atlassianConnectJs.atlassianConnectJsStrings.DELETE
import typings.atlassianConnectJs.atlassianConnectJsStrings.GET
import typings.atlassianConnectJs.atlassianConnectJsStrings.HEAD
import typings.atlassianConnectJs.atlassianConnectJsStrings.OPTIONS
import typings.atlassianConnectJs.atlassianConnectJsStrings.PATCH
import typings.atlassianConnectJs.atlassianConnectJsStrings.POST
import typings.atlassianConnectJs.atlassianConnectJsStrings.PUT
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  url :string} & std.Partial<atlassian-connect-js.AP.RequestOptions> */
trait urlstringPartialRequestOp extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[String | js.Object] = js.undefined
  
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ js.Any, Unit]
  ] = js.undefined
  
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[Accept] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.undefined
  
  var `type`: js.UndefOr[GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH] = js.undefined
  
  /**
    * The url to request from the host application, relative to the host's context path
    */
  var url: String
}
object urlstringPartialRequestOp {
  
  inline def apply(url: String): urlstringPartialRequestOp = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[urlstringPartialRequestOp]
  }
  
  extension [Self <: urlstringPartialRequestOp](x: Self) {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: (/* xhr */ XMLHttpRequest, /* statusText */ String, /* errorThrown */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setHeaders(value: Accept): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setSuccess(value: /* response */ String => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setType(value: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
