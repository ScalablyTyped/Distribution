package typings.apolloEnv

import typings.node.NodeJS.Dict
import typings.node.cryptoMod.Hash
import typings.node.urlMod.URL_
import typings.nodeFetch.anon.Size
import typings.nodeFetch.mod.BodyInit
import typings.nodeFetch.mod.HeadersInit
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.ResponseInit
import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apollo-env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("apollo-env", "Body")
  @js.native
  class Body ()
    extends typings.apolloEnv.fetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: Size) = this()
    def this(body: Unit, opts: Size) = this()
  }
  
  @JSImport("apollo-env", "Headers")
  @js.native
  class Headers ()
    extends typings.apolloEnv.fetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("apollo-env", "Request")
  @js.native
  class Request protected ()
    extends typings.apolloEnv.fetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @JSImport("apollo-env", "Response")
  @js.native
  class Response ()
    extends typings.apolloEnv.fetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-env", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def error(): typings.nodeFetch.mod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.nodeFetch.mod.Response]
    
    @scala.inline
    def redirect(url: String, status: Double): typings.nodeFetch.mod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.nodeFetch.mod.Response]
  }
  
  @JSImport("apollo-env", "URL")
  @js.native
  class URL protected ()
    extends typings.apolloEnv.fetchMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @JSImport("apollo-env", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typings.apolloEnv.fetchMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: Dict[String | js.Array[String]]) = this()
    def this(init: typings.node.urlMod.URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
  }
  
  @scala.inline
  def createHash(kind: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(kind.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  object fetch {
    
    @scala.inline
    def apply(url: RequestInfo): js.Promise[typings.nodeFetch.mod.Response] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodeFetch.mod.Response]]
    @scala.inline
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeFetch.mod.Response] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodeFetch.mod.Response]]
    
    @JSImport("apollo-env", "fetch")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isRedirect(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("apollo-env", "isNodeLike")
  @js.native
  val isNodeLike: Boolean = js.native
  
  @scala.inline
  def isNotNullOrUndefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")().asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  @scala.inline
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Record[String, U]]
}
