package typings.apolloEnv.fetchFetchMod

import typings.nodeFetch.mod.BodyInit
import typings.nodeFetch.mod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
class Response ()
  extends typings.nodeFetch.mod.Response {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
}

/* static members */
@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): typings.nodeFetch.mod.Response = js.native
  def redirect(url: String, status: Double): typings.nodeFetch.mod.Response = js.native
}

