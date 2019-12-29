package typings.apolloDashEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/global", JSImport.Namespace)
@js.native
object libFetchGlobalMod extends js.Object {
  @js.native
  trait GlobalFetch extends js.Object {
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  def fetch(): js.Promise[Response] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  type Body = typings.apolloDashEnv.libFetchFetchMod.Body
  type BodyInit = typings.nodeDashFetch.nodeDashFetchMod.BodyInit
  type Headers = typings.apolloDashEnv.libFetchFetchMod.Headers
  type HeadersInit = typings.nodeDashFetch.nodeDashFetchMod.HeadersInit
  type ReferrerPolicy = typings.apolloDashEnv.libFetchFetchMod.ReferrerPolicy
  type Request = typings.apolloDashEnv.libFetchFetchMod.Request
  type RequestAgent = typings.apolloDashEnv.libFetchFetchMod.RequestAgent
  type RequestCache = typings.nodeDashFetch.nodeDashFetchMod.RequestCache
  type RequestCredentials = typings.nodeDashFetch.nodeDashFetchMod.RequestCredentials
  type RequestInfo = typings.nodeDashFetch.nodeDashFetchMod.RequestInfo
  type RequestInit = typings.nodeDashFetch.nodeDashFetchMod.RequestInit
  type RequestMode = typings.nodeDashFetch.nodeDashFetchMod.RequestMode
  type RequestRedirect = typings.nodeDashFetch.nodeDashFetchMod.RequestRedirect
  type Response = typings.apolloDashEnv.libFetchFetchMod.Response
  type ResponseInit = typings.nodeDashFetch.nodeDashFetchMod.ResponseInit
  type URLSearchParams = typings.apolloDashEnv.libFetchUrlMod.URLSearchParams
  type URLSearchParamsInit = typings.apolloDashEnv.libFetchUrlMod.URLSearchParamsInit
}

