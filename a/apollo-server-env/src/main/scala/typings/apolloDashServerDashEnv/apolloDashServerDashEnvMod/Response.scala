package typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod

import typings.apolloDashServerDashEnv.distFetchMod.BodyInit
import typings.apolloDashServerDashEnv.distFetchMod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-env", "Response")
@js.native
class Response ()
  extends typings.apolloDashServerDashEnv.distFetchMod.Response {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
}

/* static members */
@JSImport("apollo-server-env", "Response")
@js.native
object Response extends js.Object {
  def error(): typings.apolloDashServerDashEnv.distFetchMod.Response = js.native
  def redirect(url: String): typings.apolloDashServerDashEnv.distFetchMod.Response = js.native
  def redirect(url: String, status: Double): typings.apolloDashServerDashEnv.distFetchMod.Response = js.native
}

