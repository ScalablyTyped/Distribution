package typings.arangodb

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.Bearer
import typings.arangodb.anon.FnCall
import typings.arangodb.anon.Password
import typings.arangodb.anon.urlstringRequestOptions
import typings.arangodb.anon.urlstringmethodHttpMethod
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arangodbRequestMod extends Shortcut {
  
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
  
  @js.native
  trait RequestOptions extends StObject {
    
    var auth: js.UndefOr[Password | Bearer] = js.native
    
    var body: js.UndefOr[js.Any] = js.native
    
    var encoding: js.UndefOr[String | Null] = js.native
    
    var followRedirect: js.UndefOr[Boolean] = js.native
    
    var form: js.UndefOr[js.Any] = js.native
    
    var headers: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var qs: js.UndefOr[js.Object] = js.native
    
    var returnBodyOnError: js.UndefOr[Boolean] = js.native
    
    var sslProtocol: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var useQuerystring: js.UndefOr[Boolean] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
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
      def setUseQuerystring(value: Boolean): Self = StObject.set(x, "useQuerystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseQuerystringUndefined: Self = StObject.set(x, "useQuerystring", js.undefined)
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var body: String | Buffer = js.native
    
    var headers: StringDictionary[js.UndefOr[String]] = js.native
    
    var json: js.UndefOr[js.Any] = js.native
    
    var message: String = js.native
    
    var rawBody: Buffer = js.native
    
    var status: Double = js.native
    
    var statusCode: Double = js.native
    
    def `throw`(): Unit | scala.Nothing = js.native
    def `throw`(message: String): Unit | scala.Nothing = js.native
  }
  
  type _To = Request
  
  /* This means you don't have to write `^`, but can instead just say `arangodbRequestMod.foo` */
  override def _to: Request = ^
}
