package typings.argon2.mod

import typings.argon2.AnonFalse
import typings.argon2.AnonRaw
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2", "hash")
@js.native
object hash extends js.Object {
  def apply(plain: String): js.Promise[String] = js.native
  def apply(plain: String, options: Options with AnonRaw with AnonFalse): js.Promise[Buffer] = js.native
  def apply(plain: Buffer): js.Promise[String] = js.native
  def apply(plain: Buffer, options: Options with AnonRaw with AnonFalse): js.Promise[Buffer] = js.native
}

