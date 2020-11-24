package typings.apolloEnv.fetchFetchMod

import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-env/lib/fetch/fetch", "fetch")
@js.native
object fetch extends js.Object {
  
  def apply(url: RequestInfo): js.Promise[typings.nodeFetch.mod.Response] = js.native
  def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeFetch.mod.Response] = js.native
  
  def isRedirect(code: Double): Boolean = js.native
}
