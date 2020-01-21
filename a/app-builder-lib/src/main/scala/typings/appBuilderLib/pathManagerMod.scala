package typings.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/pathManager", JSImport.Namespace)
@js.native
object pathManagerMod extends js.Object {
  def getTemplatePath(file: String): String = js.native
  def getVendorPath(): String = js.native
  def getVendorPath(file: String): String = js.native
}

