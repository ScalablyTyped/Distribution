package typings.apolloDashEnv.libFetchFetchMod

import typings.nodeDashFetch.nodeDashFetchMod.BodyInit
import typings.nodeDashFetch.nodeDashFetchMod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
class Response ()
  extends typings.nodeDashFetch.nodeDashFetchMod.Response {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
}

/* static members */
@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
  def redirect(url: String, status: Double): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
}

