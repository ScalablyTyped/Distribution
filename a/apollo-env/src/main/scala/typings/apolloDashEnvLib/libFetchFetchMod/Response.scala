package typings
package apolloDashEnvLib.libFetchFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Response")
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

/* static members */
@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): apolloDashEnvLib.libFetchFetchMod.Response = js.native
  def redirect(url: java.lang.String): apolloDashEnvLib.libFetchFetchMod.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): apolloDashEnvLib.libFetchFetchMod.Response = js.native
}

