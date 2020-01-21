package typings.appBuilderLib.integrityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/asar/integrity", "computeData")
@js.native
object computeData extends js.Object {
  def apply(resourcesPath: String): js.Promise[AsarIntegrity] = js.native
  def apply(resourcesPath: String, options: AsarIntegrityOptions): js.Promise[AsarIntegrity] = js.native
}

