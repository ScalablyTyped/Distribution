package typings.arangodb.cookieMod

import typings.arangodb.Foxx.SessionTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/foxx/sessions/transports/cookie", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): SessionTransport = js.native
  def apply(name: String): SessionTransport = js.native
  def apply(options: CookieTransportOptions): SessionTransport = js.native
}

