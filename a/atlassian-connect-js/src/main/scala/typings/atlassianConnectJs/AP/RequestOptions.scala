package typings.atlassianConnectJs.AP

import typings.atlassianConnectJs.anon.Accept
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions extends StObject {
  
  /**
    * If the request should be cached.
    */
  var cache: Boolean = js.native
  
  /**
    * The content-type string value of the entity body, above; required when data is supplied.
    */
  var contentType: String = js.native
  
  /**
    * The body of the request; required if type is 'POST' or 'PUT'. Optionally, for 'GET' this will append the object as key=value pairs to the end of the URL query string.
    */
  var data: String | js.Object = js.native
  
  /**
    * An optional callback function executed when a HTTP status error code is returned.
    */
  def error(xhr: XMLHttpRequest, statusText: String, errorThrown: js.Any): Unit = js.native
  
  /**
    * If this is set to true, the developer acknowledges that the API endpoint which is being called may be in beta state, and thus may also have a shorter deprecation cycle than stable APIs.
    */
  var experimental: Boolean = js.native
  
  /**
    * An object containing headers to set; supported headers are: 'Accept', 'If-Match' and 'If-None-Match'.
    */
  var headers: Accept = js.native
  
  /**
    * An optional callback function executed on a 200 success status code.
    */
  def success(response: String): Unit = js.native
  
  /**
    * The HTTP method name.
    */
  var `type`: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(
    cache: Boolean,
    contentType: String,
    data: String | js.Object,
    error: (XMLHttpRequest, String, js.Any) => Unit,
    experimental: Boolean,
    headers: Accept,
    success: String => Unit,
    `type`: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], error = js.Any.fromFunction3(error), experimental = experimental.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: (XMLHttpRequest, String, js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Accept): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: String => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: GET | HEAD | POST | PUT | DELETE | CONNECT | OPTIONS | PATCH): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
