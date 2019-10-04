package typings.`7zipDashMin`.`7zipDashMinMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("7zip-min", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def cmd(command: js.Array[String], errorCallback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def list(
    pathToArchive: String,
    callback: js.Function2[/* err */ js.Any, /* result */ js.Array[Result], Unit]
  ): Unit = js.native
  def pack(
    pathToDirOrFile: String,
    pathToArchive: String,
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def unpack(pathToArchive: String, whereToUnpack: String, errorCallback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

