package typings.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-env/dist/fetch", "Response")
@js.native
class Response () extends Body {
  def this(body: BodyInit) = this()
  def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  
  val headers: Headers = js.native
  
  val ok: Boolean = js.native
  
  val redirected: Boolean = js.native
  
  val status: Double = js.native
  
  val statusText: String = js.native
  
  val url: String = js.native
}
/* static members */
@JSImport("apollo-server-env/dist/fetch", "Response")
@js.native
object Response extends js.Object {
  
  def error(): Response = js.native
  
  def redirect(url: String): Response = js.native
  def redirect(url: String, status: Double): Response = js.native
}
