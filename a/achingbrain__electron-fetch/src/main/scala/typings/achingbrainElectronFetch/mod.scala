package typings.achingbrainElectronFetch

import org.scalablytyped.runtime.StringDictionary
import typings.electron.mod.Session_
import typings.node.Buffer
import typings.node.httpsMod.Agent
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.std.AbortSignal
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Error
import typings.std.FormData
import typings.std.IterableIterator
import typings.std.RequestRedirect
import typings.std.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@achingbrain/electron-fetch", JSImport.Default)
  @js.native
  def default(url: String): js.Promise[Response] = js.native
  @JSImport("@achingbrain/electron-fetch", JSImport.Default)
  @js.native
  def default(url: String, options: RequestInit): js.Promise[Response] = js.native
  
  @JSImport("@achingbrain/electron-fetch", "FetchError")
  @js.native
  class FetchError () extends Error
  
  @JSImport("@achingbrain/electron-fetch", "Headers")
  @js.native
  class Headers () extends StObject {
    def this(init: HeadersInit) = this()
    
    def apply(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    // WebIDL pair iterator: iterable<ByteString, ByteString>
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callback: js.Function3[/* value */ String, /* name */ String, /* headers */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ String, /* name */ String, /* headers */ this.type, Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def values(): /* import warning: importer.ImportType#apply Failed type conversion: std.IterableIterator<string>[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.iterator * / any] */ js.Any = js.native
  }
  
  @JSImport("@achingbrain/electron-fetch", "Request")
  @js.native
  class Request protected () extends Body {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    
    val body: Readable = js.native
    
    // (/!\ only works when running on Node.js)
    var counter: Double = js.native
    
    ////////////////////////////////////////////////////////////////////////////
    // The following properties are electron-fetch extensions
    // (/!\ only works when running on Node.js) maximum redirect count. 0 to not follow redirect
    var follow: Double = js.native
    
    val headers: Headers = js.native
    
    val method: String = js.native
    
    val redirect: RequestRedirect = js.native
    
    // (/!\ only works when running on Electron)
    var session: js.UndefOr[Session_] = js.native
    
    val signal: AbortSignal = js.native
    
    val url: String = js.native
    
    // (/!\ only works when running on Electron, throws when set to true on Node.js)
    var useElectronNet: Boolean = js.native
    
    // (/!\ only works when running on Electron)
    var useSessionCookies: js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("@achingbrain/electron-fetch", "Response")
  @js.native
  class Response protected () extends Body {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    val body: Readable | String = js.native
    
    val headers: Headers = js.native
    
    val ok: Boolean = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    val url: String = js.native
  }
  
  @js.native
  trait Body extends StObject {
    
    def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    def blob(): js.Promise[Blob] = js.native
    
    val bodyUsed: Boolean = js.native
    
    def buffer(): js.Promise[Buffer] = js.native
    
    def formData(): js.Promise[FormData] = js.native
    
    def json[T](): js.Promise[T] = js.native
    
    def text(): js.Promise[String] = js.native
  }
  object Body {
    
    @scala.inline
    def apply(
      arrayBuffer: () => js.Promise[ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      buffer: () => js.Promise[Buffer],
      formData: () => js.Promise[FormData],
      json: () => js.Promise[js.Any],
      text: () => js.Promise[String]
    ): Body = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = js.Any.fromFunction0(buffer), formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayBuffer(value: () => js.Promise[ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuffer(value: () => js.Promise[Buffer]): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFormData(value: () => js.Promise[FormData]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setJson(value: () => js.Promise[js.Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
      
      @scala.inline
      def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
  
  type BodyInit = Stream | String | Blob | Buffer | Null
  
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  
  type RequestInfo = Request | String
  
  @js.native
  trait RequestInit extends StObject {
    
    var agent: js.UndefOr[Agent] = js.native
    
    var body: js.UndefOr[BodyInit] = js.native
    
    ////////////////////////////////////////////////////////////////////////////
    // The following properties are electron-fetch extensions
    // (/!\ only works when running on Node.js) maximum redirect count. 0 to not follow redirect
    var follow: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[HeadersInit] = js.native
    
    // These properties are part of the Fetch Standard
    var method: js.UndefOr[String] = js.native
    
    // When running on Electron behind an authenticated HTTP proxy, password to use to authenticate
    var password: js.UndefOr[String] = js.native
    
    // (/!\ only works when running on Node.js) set to `manual` to extract redirect headers, `error` to reject redirect
    var redirect: js.UndefOr[RequestRedirect] = js.native
    
    var session: js.UndefOr[Session_] = js.native
    
    var signal: js.UndefOr[AbortSignal] = js.native
    
    // maximum response body size in bytes. 0 to disable
    var size: js.UndefOr[Double] = js.native
    
    // req/res timeout in ms, it resets on redirect. 0 to disable (OS limit applies)
    var timeout: js.UndefOr[Double] = js.native
    
    var useElectronNet: js.UndefOr[Boolean] = js.native
    
    var useSessionCookies: js.UndefOr[Boolean] = js.native
    
    // When running on Electron behind an authenticated HTTP proxy, username to use to authenticate
    var user: js.UndefOr[String] = js.native
  }
  object RequestInit {
    
    @scala.inline
    def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    @scala.inline
    implicit class RequestInitMutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
      
      @scala.inline
      def setUseSessionCookies(value: Boolean): Self = StObject.set(x, "useSessionCookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSessionCookiesUndefined: Self = StObject.set(x, "useSessionCookies", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
