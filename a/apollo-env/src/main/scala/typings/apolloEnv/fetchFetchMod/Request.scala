package typings.apolloEnv.fetchFetchMod

import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Request")
@js.native
class Request protected ()
  extends typings.nodeFetch.mod.Request {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
}

