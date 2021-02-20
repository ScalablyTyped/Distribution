package typings.apolloServerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  @JSImport("apollo-server-env/dist/global", "fetch")
  @js.native
  def fetch(): js.Promise[Response] = js.native
  @JSImport("apollo-server-env/dist/global", "fetch")
  @js.native
  def fetch(input: js.UndefOr[RequestInfo], init: RequestInit): js.Promise[Response] = js.native
  @JSImport("apollo-server-env/dist/global", "fetch")
  @js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  
  type Body = typings.apolloServerEnv.fetchMod.Body
  
  type BodyInit = typings.apolloServerEnv.fetchMod.BodyInit
  
  @js.native
  trait GlobalFetch extends StObject {
    
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  type Headers = typings.apolloServerEnv.fetchMod.Headers
  
  type HeadersInit = typings.apolloServerEnv.fetchMod.HeadersInit
  
  type ReferrerPolicy = typings.apolloServerEnv.fetchMod.ReferrerPolicy
  
  type Request = typings.apolloServerEnv.fetchMod.Request
  
  type RequestAgent = typings.apolloServerEnv.fetchMod.RequestAgent
  
  type RequestCache = typings.apolloServerEnv.fetchMod.RequestCache
  
  type RequestCredentials = typings.apolloServerEnv.fetchMod.RequestCredentials
  
  type RequestInfo = typings.apolloServerEnv.fetchMod.RequestInfo
  
  type RequestInit = typings.apolloServerEnv.fetchMod.RequestInit
  
  type RequestMode = typings.apolloServerEnv.fetchMod.RequestMode
  
  type RequestRedirect = typings.apolloServerEnv.fetchMod.RequestRedirect
  
  type Response = typings.apolloServerEnv.fetchMod.Response
  
  type ResponseInit = typings.apolloServerEnv.fetchMod.ResponseInit
  
  type URLSearchParams = typings.apolloServerEnv.urlMod.URLSearchParams
  
  type URLSearchParamsInit = typings.apolloServerEnv.urlMod.URLSearchParamsInit
}
