package typings.apolloDashEnv.libFetchFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
class Response () extends Body {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  val headers: Headers = js.native
  val ok: Boolean = js.native
  val redirected: Boolean = js.native
  val status: Double = js.native
  val statusText: String = js.native
  val url: String = js.native
}

/* static members */
@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): Response = js.native
  def redirect(url: String): Response = js.native
  def redirect(url: String, status: Double): Response = js.native
}

