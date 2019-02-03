package typings
package apolloDashEnvLib.apolloDashEnvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env", "Response")
@js.native
class Response ()
  extends apolloDashEnvLib.libFetchMod.Response {
  def this(body: apolloDashEnvLib.libFetchFetchMod.BodyInit) = this()
  def this(body: apolloDashEnvLib.libFetchFetchMod.BodyInit, init: apolloDashEnvLib.libFetchFetchMod.ResponseInit) = this()
}

/* static members */
@JSImport("apollo-env", "Response")
@js.native
object Response extends js.Object {
  def error(): apolloDashEnvLib.libFetchFetchMod.Response = js.native
  def redirect(url: java.lang.String): apolloDashEnvLib.libFetchFetchMod.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): apolloDashEnvLib.libFetchFetchMod.Response = js.native
}

