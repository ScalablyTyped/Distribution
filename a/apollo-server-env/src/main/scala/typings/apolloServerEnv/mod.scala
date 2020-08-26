package typings.apolloServerEnv

import typings.apolloServerEnv.fetchMod.BodyInit
import typings.apolloServerEnv.fetchMod.HeadersInit
import typings.apolloServerEnv.fetchMod.RequestInfo
import typings.apolloServerEnv.fetchMod.RequestInit
import typings.apolloServerEnv.fetchMod.ResponseInit
import typings.apolloServerEnv.urlMod.URLSearchParamsInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Body ()
    extends typings.apolloServerEnv.fetchMod.Body
  
  @js.native
  class Headers ()
    extends typings.apolloServerEnv.fetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typings.apolloServerEnv.fetchMod.Request {
    def this(input: String) = this()
    def this(input: typings.apolloServerEnv.fetchMod.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.apolloServerEnv.fetchMod.Request, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typings.apolloServerEnv.fetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typings.apolloServerEnv.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typings.apolloServerEnv.urlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typings.apolloServerEnv.urlMod.URLSearchParams {
    def this(init: URLSearchParamsInit) = this()
  }
  
  def fetch(): js.Promise[typings.apolloServerEnv.fetchMod.Response] = js.native
  def fetch(input: js.UndefOr[RequestInfo], init: RequestInit): js.Promise[typings.apolloServerEnv.fetchMod.Response] = js.native
  def fetch(input: RequestInfo): js.Promise[typings.apolloServerEnv.fetchMod.Response] = js.native
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typings.apolloServerEnv.fetchMod.Response = js.native
    def redirect(url: String): typings.apolloServerEnv.fetchMod.Response = js.native
    def redirect(url: String, status: Double): typings.apolloServerEnv.fetchMod.Response = js.native
  }
  
}

