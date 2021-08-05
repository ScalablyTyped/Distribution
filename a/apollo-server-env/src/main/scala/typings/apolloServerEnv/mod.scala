package typings.apolloServerEnv

import typings.apolloServerEnv.fetchMod.BodyInit
import typings.apolloServerEnv.fetchMod.HeadersInit
import typings.apolloServerEnv.fetchMod.RequestInfo
import typings.apolloServerEnv.fetchMod.RequestInit
import typings.apolloServerEnv.fetchMod.ResponseInit
import typings.apolloServerEnv.urlMod.URLSearchParamsInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apollo-server-env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("apollo-server-env", "Body")
  @js.native
  class Body ()
    extends typings.apolloServerEnv.fetchMod.Body
  
  @JSImport("apollo-server-env", "Headers")
  @js.native
  class Headers ()
    extends typings.apolloServerEnv.fetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("apollo-server-env", "Request")
  @js.native
  class Request protected ()
    extends typings.apolloServerEnv.fetchMod.Request {
    def this(input: String) = this()
    def this(input: typings.apolloServerEnv.fetchMod.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typings.apolloServerEnv.fetchMod.Request, init: RequestInit) = this()
  }
  
  @JSImport("apollo-server-env", "Response")
  @js.native
  class Response ()
    extends typings.apolloServerEnv.fetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-server-env", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): typings.apolloServerEnv.fetchMod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.apolloServerEnv.fetchMod.Response]
    
    inline def redirect(url: String): typings.apolloServerEnv.fetchMod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.apolloServerEnv.fetchMod.Response]
    inline def redirect(url: String, status: Double): typings.apolloServerEnv.fetchMod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.apolloServerEnv.fetchMod.Response]
  }
  
  @JSImport("apollo-server-env", "URL")
  @js.native
  class URL protected ()
    extends typings.apolloServerEnv.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typings.apolloServerEnv.urlMod.URL) = this()
  }
  
  @JSImport("apollo-server-env", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typings.apolloServerEnv.urlMod.URLSearchParams {
    def this(init: URLSearchParamsInit) = this()
  }
  
  inline def fetch(): js.Promise[typings.apolloServerEnv.fetchMod.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")().asInstanceOf[js.Promise[typings.apolloServerEnv.fetchMod.Response]]
  inline def fetch(input: Unit, init: RequestInit): js.Promise[typings.apolloServerEnv.fetchMod.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.apolloServerEnv.fetchMod.Response]]
  inline def fetch(input: RequestInfo): js.Promise[typings.apolloServerEnv.fetchMod.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.apolloServerEnv.fetchMod.Response]]
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.apolloServerEnv.fetchMod.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.apolloServerEnv.fetchMod.Response]]
}
