package typings.apolloDashServerDashEnv

import typings.apolloDashServerDashEnv.distFetchMod.BodyInit
import typings.apolloDashServerDashEnv.distFetchMod.HeadersInit
import typings.apolloDashServerDashEnv.distFetchMod.RequestInfo
import typings.apolloDashServerDashEnv.distFetchMod.RequestInit
import typings.apolloDashServerDashEnv.distFetchMod.ResponseInit
import typings.apolloDashServerDashEnv.distUrlMod.URLSearchParamsInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env", JSImport.Namespace)
@js.native
object apolloDashServerDashEnvMod extends js.Object {
  @js.native
  class Body ()
    extends typings.apolloDashServerDashEnv.distFetchMod.Body
  
  @js.native
  class Headers ()
    extends typings.apolloDashServerDashEnv.distFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typings.apolloDashServerDashEnv.distFetchMod.Request {
    def this(input: String) = this()
    def this(input: typings.apolloDashServerDashEnv.distFetchMod.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.apolloDashServerDashEnv.distFetchMod.Request, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typings.apolloDashServerDashEnv.distFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typings.apolloDashServerDashEnv.distUrlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typings.apolloDashServerDashEnv.distUrlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typings.apolloDashServerDashEnv.distUrlMod.URLSearchParams {
    def this(init: URLSearchParamsInit) = this()
  }
  
  def fetch(): js.Promise[typings.apolloDashServerDashEnv.distFetchMod.Response] = js.native
  def fetch(input: RequestInfo): js.Promise[typings.apolloDashServerDashEnv.distFetchMod.Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.apolloDashServerDashEnv.distFetchMod.Response] = js.native
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typings.apolloDashServerDashEnv.distFetchMod.Response = js.native
    def redirect(url: String): typings.apolloDashServerDashEnv.distFetchMod.Response = js.native
    def redirect(url: String, status: Double): typings.apolloDashServerDashEnv.distFetchMod.Response = js.native
  }
  
}

