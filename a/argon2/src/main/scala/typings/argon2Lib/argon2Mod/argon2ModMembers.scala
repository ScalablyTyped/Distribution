package typings
package argon2Lib.argon2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2", JSImport.Namespace)
@js.native
object argon2ModMembers extends js.Object {
  val argon2d: argon2Lib.argon2LibNumbers.`0` = js.native
  val argon2i: argon2Lib.argon2LibNumbers.`1` = js.native
  val argon2id: argon2Lib.argon2LibNumbers.`2` = js.native
  val defaults: Options = js.native
  val limits: OptionLimits = js.native
  def hash(plain: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def hash(plain: java.lang.String, options: Options with (argon2Lib.Anon_Raw | argon2Lib.Anon_RawFalse)): stdLib.Promise[nodeLib.Buffer] = js.native
  def hash(plain: nodeLib.Buffer): stdLib.Promise[java.lang.String] = js.native
  def hash(plain: nodeLib.Buffer, options: Options with (argon2Lib.Anon_Raw | argon2Lib.Anon_RawFalse)): stdLib.Promise[nodeLib.Buffer] = js.native
  def verify(hash: java.lang.String, plain: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def verify(hash: java.lang.String, plain: nodeLib.Buffer): stdLib.Promise[scala.Boolean] = js.native
}

