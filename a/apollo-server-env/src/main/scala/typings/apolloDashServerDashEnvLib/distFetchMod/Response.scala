package typings
package apolloDashServerDashEnvLib.distFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/fetch", "Response")
@js.native
class Response () extends Body {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  val headers: Headers = js.native
  val ok: scala.Boolean = js.native
  val redirected: scala.Boolean = js.native
  val status: scala.Double = js.native
  val statusText: java.lang.String = js.native
  val url: java.lang.String = js.native
}

@JSImport("apollo-server-env/dist/fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): apolloDashServerDashEnvLib.distFetchMod.Response = js.native
  def redirect(url: java.lang.String): apolloDashServerDashEnvLib.distFetchMod.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): apolloDashServerDashEnvLib.distFetchMod.Response = js.native
}

