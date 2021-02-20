package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  url :string,   method :arangodb.ArangoDB.HttpMethod | undefined} & arangodb.@arangodb/request.RequestOptions */
@js.native
trait urlstringmethodHttpMethod extends StObject {
  
  var auth: js.UndefOr[Password | Bearer] = js.native
  
  var body: js.UndefOr[js.Any] = js.native
  
  var encoding: js.UndefOr[String | Null] = js.native
  
  var followRedirect: js.UndefOr[Boolean] = js.native
  
  var form: js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
  
  var maxRedirects: js.UndefOr[Double] = js.native
  
  var method: js.UndefOr[HttpMethod] = js.native
  
  var qs: js.UndefOr[js.Object] = js.native
  
  var returnBodyOnError: js.UndefOr[Boolean] = js.native
  
  var sslProtocol: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: String = js.native
  
  var useQuerystring: js.UndefOr[Boolean] = js.native
}
object urlstringmethodHttpMethod {
  
  @scala.inline
  def apply(url: String): urlstringmethodHttpMethod = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[urlstringmethodHttpMethod]
  }
  
  @scala.inline
  implicit class urlstringmethodHttpMethodMutableBuilder[Self <: urlstringmethodHttpMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: Password | Bearer): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
    
    @scala.inline
    def setForm(value: js.Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    @scala.inline
    def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
    
    @scala.inline
    def setReturnBodyOnError(value: Boolean): Self = StObject.set(x, "returnBodyOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnBodyOnErrorUndefined: Self = StObject.set(x, "returnBodyOnError", js.undefined)
    
    @scala.inline
    def setSslProtocol(value: Double): Self = StObject.set(x, "sslProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslProtocolUndefined: Self = StObject.set(x, "sslProtocol", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseQuerystring(value: Boolean): Self = StObject.set(x, "useQuerystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseQuerystringUndefined: Self = StObject.set(x, "useQuerystring", js.undefined)
  }
}
