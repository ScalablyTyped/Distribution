package typings.apolloDashServerDashEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/global", JSImport.Namespace)
@js.native
object distGlobalMod extends js.Object {
  @js.native
  trait GlobalFetch extends js.Object {
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  def fetch(): js.Promise[Response] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  type Body = typings.apolloDashServerDashEnv.distFetchMod.Body
  type BodyInit = typings.apolloDashServerDashEnv.distFetchMod.BodyInit
  type Headers = typings.apolloDashServerDashEnv.distFetchMod.Headers
  type HeadersInit = typings.apolloDashServerDashEnv.distFetchMod.HeadersInit
  type ReferrerPolicy = typings.apolloDashServerDashEnv.distFetchMod.ReferrerPolicy
  type Request = typings.apolloDashServerDashEnv.distFetchMod.Request
  type RequestAgent = typings.apolloDashServerDashEnv.distFetchMod.RequestAgent
  type RequestCache = typings.apolloDashServerDashEnv.distFetchMod.RequestCache
  type RequestCredentials = typings.apolloDashServerDashEnv.distFetchMod.RequestCredentials
  type RequestInfo = typings.apolloDashServerDashEnv.distFetchMod.RequestInfo
  type RequestInit = typings.apolloDashServerDashEnv.distFetchMod.RequestInit
  type RequestMode = typings.apolloDashServerDashEnv.distFetchMod.RequestMode
  type RequestRedirect = typings.apolloDashServerDashEnv.distFetchMod.RequestRedirect
  type Response = typings.apolloDashServerDashEnv.distFetchMod.Response
  type ResponseInit = typings.apolloDashServerDashEnv.distFetchMod.ResponseInit
  type URLSearchParams = typings.apolloDashServerDashEnv.distUrlMod.URLSearchParams
  type URLSearchParamsInit = typings.apolloDashServerDashEnv.distUrlMod.URLSearchParamsInit
}

