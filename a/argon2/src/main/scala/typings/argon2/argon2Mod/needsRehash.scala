package typings.argon2.argon2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("argon2", "needsRehash")
@js.native
object needsRehash extends js.Object {
  def apply(hash: String): Boolean = js.native
  def apply(hash: String, options: Options): Boolean = js.native
}

