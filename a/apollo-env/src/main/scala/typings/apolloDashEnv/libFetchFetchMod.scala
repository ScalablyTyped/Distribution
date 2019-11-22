package typings.apolloDashEnv

import typings.node.httpMod.Agent
import typings.nodeDashFetch.Anon_Size
import typings.nodeDashFetch.nodeDashFetchMod.BodyInit
import typings.nodeDashFetch.nodeDashFetchMod.HeadersInit
import typings.nodeDashFetch.nodeDashFetchMod.RequestInfo
import typings.nodeDashFetch.nodeDashFetchMod.RequestInit
import typings.nodeDashFetch.nodeDashFetchMod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", JSImport.Namespace)
@js.native
object libFetchFetchMod extends js.Object {
  @js.native
  class Body ()
    extends typings.nodeDashFetch.nodeDashFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: Anon_Size) = this()
  }
  
  @js.native
  class Headers ()
    extends typings.nodeDashFetch.nodeDashFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apolloDashEnv.apolloDashEnvStrings.Empty
    - typings.apolloDashEnv.apolloDashEnvStrings.`no-referrer`
    - typings.apolloDashEnv.apolloDashEnvStrings.`no-referrer-when-downgrade`
    - typings.apolloDashEnv.apolloDashEnvStrings.`same-origin`
    - typings.apolloDashEnv.apolloDashEnvStrings.origin
    - typings.apolloDashEnv.apolloDashEnvStrings.`strict-origin`
    - typings.apolloDashEnv.apolloDashEnvStrings.`origin-when-cross-origin`
    - typings.apolloDashEnv.apolloDashEnvStrings.`strict-origin-when-cross-origin`
    - typings.apolloDashEnv.apolloDashEnvStrings.`unsafe-url`
  */
  trait ReferrerPolicy extends js.Object
  
  @js.native
  class Request protected ()
    extends typings.nodeDashFetch.nodeDashFetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typings.nodeDashFetch.nodeDashFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
    def redirect(url: String, status: Double): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(url: RequestInfo): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
  type RequestAgent = Agent | typings.node.httpsMod.Agent
}

