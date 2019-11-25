package typings.apolloDashEnv.libFetchFetchMod

import typings.nodeDashFetch.nodeDashFetchMod.RequestInfo
import typings.nodeDashFetch.nodeDashFetchMod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "fetch")
@js.native
object fetch extends js.Object {
  def apply(url: RequestInfo): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
  def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
  def isRedirect(code: Double): Boolean = js.native
}

