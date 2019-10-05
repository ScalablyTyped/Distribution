package typings.apolloDashEnv

import typings.apolloDashEnv.libFetchFetchMod.BodyInit
import typings.apolloDashEnv.libFetchFetchMod.HeadersInit
import typings.apolloDashEnv.libFetchFetchMod.RequestInfo
import typings.apolloDashEnv.libFetchFetchMod.RequestInit
import typings.apolloDashEnv.libFetchFetchMod.ResponseInit
import typings.apolloDashEnv.libFetchUrlMod.URLSearchParamsInit
import typings.node.cryptoMod.Hash
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env", JSImport.Namespace)
@js.native
object apolloDashEnvMod extends js.Object {
  @js.native
  class Body ()
    extends typings.apolloDashEnv.libFetchMod.Body
  
  @js.native
  class Headers ()
    extends typings.apolloDashEnv.libFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typings.apolloDashEnv.libFetchMod.Request {
    def this(input: String) = this()
    def this(input: typings.apolloDashEnv.libFetchFetchMod.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.apolloDashEnv.libFetchFetchMod.Request, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typings.apolloDashEnv.libFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typings.apolloDashEnv.libFetchMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typings.apolloDashEnv.libFetchUrlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typings.apolloDashEnv.libFetchMod.URLSearchParams {
    def this(init: URLSearchParamsInit) = this()
  }
  
  val isNodeLike: Boolean = js.native
  def createHash(kind: String): Hash = js.native
  def fetch(): js.Promise[typings.apolloDashEnv.libFetchFetchMod.Response] = js.native
  def fetch(input: RequestInfo): js.Promise[typings.apolloDashEnv.libFetchFetchMod.Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.apolloDashEnv.libFetchFetchMod.Response] = js.native
  def isNotNullOrUndefined[T](): /* is T */ Boolean = js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = js.native
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = js.native
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typings.apolloDashEnv.libFetchFetchMod.Response = js.native
    def redirect(url: String): typings.apolloDashEnv.libFetchFetchMod.Response = js.native
    def redirect(url: String, status: Double): typings.apolloDashEnv.libFetchFetchMod.Response = js.native
  }
  
}

