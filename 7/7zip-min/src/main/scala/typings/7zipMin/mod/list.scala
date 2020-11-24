package typings.`7zipMin`.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("7zip-min", "list")
@js.native
object list extends js.Object {
  
  def apply(
    pathToArchive: String,
    callback: js.Function2[/* err */ js.Any, /* result */ js.Array[Result], Unit]
  ): Unit = js.native
}
