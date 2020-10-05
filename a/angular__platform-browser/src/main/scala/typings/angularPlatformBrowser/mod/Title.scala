package typings.angularPlatformBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "Title")
@js.native
class Title protected () extends js.Object {
  def this(_doc: js.Any) = this()
  var _doc: js.Any = js.native
  /**
    * Get the title of the current HTML document.
    */
  def getTitle(): String = js.native
  /**
    * Set the title of the current HTML document.
    * @param newTitle
    */
  def setTitle(newTitle: String): Unit = js.native
}

