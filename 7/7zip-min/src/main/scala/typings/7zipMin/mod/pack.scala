package typings.`7zipMin`.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("7zip-min", "pack")
@js.native
object pack extends js.Object {
  
  def apply(
    pathToDirOrFile: String,
    pathToArchive: String,
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
}
