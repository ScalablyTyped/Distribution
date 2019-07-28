package typings.apolloDashEnv.apolloDashEnvMod

import typings.apolloDashEnv.libFetchFetchMod.BodyInit
import typings.apolloDashEnv.libFetchFetchMod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env", "Response")
@js.native
class Response ()
  extends typings.apolloDashEnv.libFetchMod.Response {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
}

/* static members */
@JSImport("apollo-env", "Response")
@js.native
object Response extends js.Object {
  def error(): typings.apolloDashEnv.libFetchFetchMod.Response = js.native
  def redirect(url: String): typings.apolloDashEnv.libFetchFetchMod.Response = js.native
  def redirect(url: String, status: Double): typings.apolloDashEnv.libFetchFetchMod.Response = js.native
}

