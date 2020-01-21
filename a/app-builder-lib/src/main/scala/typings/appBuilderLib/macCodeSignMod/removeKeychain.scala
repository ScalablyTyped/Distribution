package typings.appBuilderLib.macCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/codeSign/macCodeSign", "removeKeychain")
@js.native
object removeKeychain extends js.Object {
  def apply(keychainFile: String): js.Promise[_] = js.native
  def apply(keychainFile: String, printWarn: Boolean): js.Promise[_] = js.native
}

