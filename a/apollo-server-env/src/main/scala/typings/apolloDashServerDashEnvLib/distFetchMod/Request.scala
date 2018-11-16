package typings
package apolloDashServerDashEnvLib.distFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env/dist/fetch", "Request")
@js.native
class Request protected () extends Body {
  def this(input: Request) = this()
  def this(input: java.lang.String) = this()
  def this(input: Request, init: RequestInit) = this()
  def this(input: java.lang.String, init: RequestInit) = this()
  val headers: Headers = js.native
  val method: java.lang.String = js.native
  val url: java.lang.String = js.native
}

