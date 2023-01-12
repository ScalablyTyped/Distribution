package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  url :string,   method :arangodb.ArangoDB.HttpMethod | undefined} & arangodb.@arangodb/request.RequestOptions */
trait urlstringmethodHttpMethod extends StObject {
  
  var auth: js.UndefOr[Password | Bearer] = js.undefined
  
  var body: js.UndefOr[Any] = js.undefined
  
  var encoding: js.UndefOr[String | Null] = js.undefined
  
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[Any] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var json: js.UndefOr[Boolean] = js.undefined
  
  var maxRedirects: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[HttpMethod] = js.undefined
  
  var qs: js.UndefOr[js.Object] = js.undefined
  
  var returnBodyOnError: js.UndefOr[Boolean] = js.undefined
  
  var sslProtocol: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: String
  
  var useQuerystring: js.UndefOr[Boolean] = js.undefined
}
object urlstringmethodHttpMethod {
  
  inline def apply(url: String): urlstringmethodHttpMethod = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[urlstringmethodHttpMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: urlstringmethodHttpMethod] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: Password | Bearer): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
    
    inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
    
    inline def setForm(value: Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHeaders(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
    
    inline def setReturnBodyOnError(value: Boolean): Self = StObject.set(x, "returnBodyOnError", value.asInstanceOf[js.Any])
    
    inline def setReturnBodyOnErrorUndefined: Self = StObject.set(x, "returnBodyOnError", js.undefined)
    
    inline def setSslProtocol(value: Double): Self = StObject.set(x, "sslProtocol", value.asInstanceOf[js.Any])
    
    inline def setSslProtocolUndefined: Self = StObject.set(x, "sslProtocol", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUseQuerystring(value: Boolean): Self = StObject.set(x, "useQuerystring", value.asInstanceOf[js.Any])
    
    inline def setUseQuerystringUndefined: Self = StObject.set(x, "useQuerystring", js.undefined)
  }
}
