package typings
package apolloDashServerDashEnvLib.apolloDashServerDashEnvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env", "Response")
@js.native
class Response ()
  extends apolloDashServerDashEnvLib.distFetchMod.Response {
  def this(body: apolloDashServerDashEnvLib.distFetchMod.BodyInit) = this()
  def this(body: apolloDashServerDashEnvLib.distFetchMod.BodyInit, init: apolloDashServerDashEnvLib.distFetchMod.ResponseInit) = this()
}

/* static members */
@JSImport("apollo-server-env", "Response")
@js.native
object Response extends js.Object {
  def error(): apolloDashServerDashEnvLib.distFetchMod.Response = js.native
  def redirect(url: java.lang.String): apolloDashServerDashEnvLib.distFetchMod.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): apolloDashServerDashEnvLib.distFetchMod.Response = js.native
}

