package typings.argon2.argon2Mod

import typings.argon2.Anon_False
import typings.argon2.Anon_Raw
import typings.argon2.argon2Numbers.`0`
import typings.argon2.argon2Numbers.`1`
import typings.argon2.argon2Numbers.`2`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val argon2d: `0` = js.native
  val argon2i: `1` = js.native
  val argon2id: `2` = js.native
  val defaults: Options = js.native
  val limits: OptionLimits = js.native
  def hash(plain: String): js.Promise[String] = js.native
  def hash(plain: String, options: Options with (Anon_False | Anon_Raw)): js.Promise[Buffer] = js.native
  def hash(plain: Buffer): js.Promise[String] = js.native
  def hash(plain: Buffer, options: Options with (Anon_False | Anon_Raw)): js.Promise[Buffer] = js.native
  def needsRehash(hash: String): Boolean = js.native
  def needsRehash(hash: String, options: Options): Boolean = js.native
  def verify(hash: String, plain: String): js.Promise[Boolean] = js.native
  def verify(hash: String, plain: String, options: Options): js.Promise[Boolean] = js.native
  def verify(hash: String, plain: Buffer): js.Promise[Boolean] = js.native
  def verify(hash: String, plain: Buffer, options: Options): js.Promise[Boolean] = js.native
}

