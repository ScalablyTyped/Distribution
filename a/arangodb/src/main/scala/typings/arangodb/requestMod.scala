package typings.arangodb

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.Bearer
import typings.arangodb.anon.FnCall
import typings.arangodb.anon.Password
import typings.arangodb.anon.urlstringRequestOptions
import typings.arangodb.anon.urlstringmethodHttpMethod
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod extends Shortcut {
  
  @JSImport("@arangodb/request", JSImport.Namespace)
  @js.native
  val ^ : Request = js.native
  
  @js.native
  trait Request extends StObject {
    
    def apply(options: urlstringmethodHttpMethod): Response = js.native
    
    def delete(options: urlstringRequestOptions): Response = js.native
    def delete(url: String): Response = js.native
    def delete(url: String, options: RequestOptions): Response = js.native
    @JSName("delete")
    var delete_Original: FnCall = js.native
    
    def get(options: urlstringRequestOptions): Response = js.native
    def get(url: String): Response = js.native
    def get(url: String, options: RequestOptions): Response = js.native
    @JSName("get")
    var get_Original: FnCall = js.native
    
    def head(options: urlstringRequestOptions): Response = js.native
    def head(url: String): Response = js.native
    def head(url: String, options: RequestOptions): Response = js.native
    @JSName("head")
    var head_Original: FnCall = js.native
    
    def patch(options: urlstringRequestOptions): Response = js.native
    def patch(url: String): Response = js.native
    def patch(url: String, options: RequestOptions): Response = js.native
    @JSName("patch")
    var patch_Original: FnCall = js.native
    
    def post(options: urlstringRequestOptions): Response = js.native
    def post(url: String): Response = js.native
    def post(url: String, options: RequestOptions): Response = js.native
    @JSName("post")
    var post_Original: FnCall = js.native
    
    def put(options: urlstringRequestOptions): Response = js.native
    def put(url: String): Response = js.native
    def put(url: String, options: RequestOptions): Response = js.native
    @JSName("put")
    var put_Original: FnCall = js.native
  }
  
  trait RequestOptions extends StObject {
    
    var auth: js.UndefOr[Password | Bearer] = js.undefined
    
    var body: js.UndefOr[Any] = js.undefined
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var qs: js.UndefOr[js.Object] = js.undefined
    
    var returnBodyOnError: js.UndefOr[Boolean] = js.undefined
    
    var sslProtocol: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var useQuerystring: js.UndefOr[Boolean] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def setReturnBodyOnError(value: Boolean): Self = StObject.set(x, "returnBodyOnError", value.asInstanceOf[js.Any])
      
      inline def setReturnBodyOnErrorUndefined: Self = StObject.set(x, "returnBodyOnError", js.undefined)
      
      inline def setSslProtocol(value: Double): Self = StObject.set(x, "sslProtocol", value.asInstanceOf[js.Any])
      
      inline def setSslProtocolUndefined: Self = StObject.set(x, "sslProtocol", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseQuerystring(value: Boolean): Self = StObject.set(x, "useQuerystring", value.asInstanceOf[js.Any])
      
      inline def setUseQuerystringUndefined: Self = StObject.set(x, "useQuerystring", js.undefined)
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var body: String | Buffer = js.native
    
    var headers: StringDictionary[js.UndefOr[String]] = js.native
    
    var json: js.UndefOr[Any] = js.native
    
    var message: String = js.native
    
    var rawBody: Buffer = js.native
    
    var status: Double = js.native
    
    var statusCode: Double = js.native
    
    def `throw`(): Unit | scala.Nothing = js.native
    def `throw`(message: String): Unit | scala.Nothing = js.native
  }
  
  type _To = Request
  
  /* This means you don't have to write `^`, but can instead just say `requestMod.foo` */
  override def _to: Request = ^
}
