package typings.apolloDashEnv.libFetchFetchMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Body")
@js.native
class Body () extends js.Object {
  val bodyUsed: Boolean = js.native
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  def json(): js.Promise[_] = js.native
  def text(): js.Promise[String] = js.native
}

