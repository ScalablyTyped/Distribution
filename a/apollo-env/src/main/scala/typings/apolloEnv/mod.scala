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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Body ()
    extends typings.apolloEnv.fetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.UndefOr[scala.Nothing], opts: Size) = this()
    def this(body: js.Any, opts: Size) = this()
  }
  
  @js.native
  class Headers ()
    extends typings.apolloEnv.fetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typings.apolloEnv.fetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typings.apolloEnv.fetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typings.apolloEnv.fetchMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typings.apolloEnv.fetchMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: Dict[String | js.Array[String]]) = this()
    def this(init: typings.node.urlMod.URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
  }
  
  val isNodeLike: Boolean = js.native
  def createHash(kind: String): Hash = js.native
  def isNotNullOrUndefined[T](): /* is T */ Boolean = js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = js.native
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = js.native
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typings.nodeFetch.mod.Response = js.native
    def redirect(url: String, status: Double): typings.nodeFetch.mod.Response = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(url: RequestInfo): js.Promise[typings.nodeFetch.mod.Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeFetch.mod.Response] = js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
}

