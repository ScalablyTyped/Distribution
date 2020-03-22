package typings.argon2.mod

import typings.argon2.Optionsrawfalse
import typings.argon2.Optionsrawtrue
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2", "hash")
@js.native
object hash extends js.Object {
  def apply(plain: String): js.Promise[String] = js.native
  def apply(plain: String, options: Optionsrawfalse): js.Promise[String] = js.native
  def apply(plain: String, options: Optionsrawtrue): js.Promise[Buffer] = js.native
  def apply(plain: Buffer): js.Promise[String] = js.native
  def apply(plain: Buffer, options: Optionsrawfalse): js.Promise[String] = js.native
  def apply(plain: Buffer, options: Optionsrawtrue): js.Promise[Buffer] = js.native
}

