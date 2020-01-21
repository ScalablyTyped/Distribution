package typings.appModulePath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-module-path", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addPath(path: String): Unit = js.native
  def addPath(path: String, parent: js.Any): Unit = js.native
  def enableForDir(dir: String): Unit = js.native
  def removePath(path: String): Unit = js.native
}

