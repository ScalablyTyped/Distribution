package typings.`7zipMin`.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("7zip-min", "unpack")
@js.native
object unpack extends js.Object {
  def apply(pathToArchive: String, whereToUnpack: String, errorCallback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

