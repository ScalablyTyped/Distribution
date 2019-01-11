package typings
package argon2Lib.argon2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val argon2d: argon2Lib.argon2LibNumbers.`0` = js.native
  val argon2i: argon2Lib.argon2LibNumbers.`1` = js.native
  val argon2id: argon2Lib.argon2LibNumbers.`2` = js.native
  val defaults: argon2Lib.argon2Mod.Options = js.native
  val limits: argon2Lib.argon2Mod.OptionLimits = js.native
  def hash(plain: java.lang.String): js.Promise[java.lang.String] = js.native
  def hash(
    plain: java.lang.String,
    options: argon2Lib.argon2Mod.Options with (argon2Lib.Anon_False | argon2Lib.Anon_Raw)
  ): js.Promise[nodeLib.Buffer] = js.native
  def hash(plain: nodeLib.Buffer): js.Promise[java.lang.String] = js.native
  def hash(
    plain: nodeLib.Buffer,
    options: argon2Lib.argon2Mod.Options with (argon2Lib.Anon_False | argon2Lib.Anon_Raw)
  ): js.Promise[nodeLib.Buffer] = js.native
  def verify(hash: java.lang.String, plain: java.lang.String): js.Promise[scala.Boolean] = js.native
  def verify(hash: java.lang.String, plain: nodeLib.Buffer): js.Promise[scala.Boolean] = js.native
}

