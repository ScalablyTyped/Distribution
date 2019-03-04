package typings
package angularDashClipboardLib.angularDashClipboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardService extends js.Object {
  /**
    * tells us whether or not angular-clipboard is supported
    */
  var supported: scala.Boolean
  /**
    * copies text to a clipboard
    * @param text the text to be copied to the clipboard
    */
  def copyText(text: java.lang.String): scala.Unit
}

object ClipboardService {
  @scala.inline
  def apply(copyText: js.Function1[java.lang.String, scala.Unit], supported: scala.Boolean): ClipboardService = {
    val __obj = js.Dynamic.literal(copyText = copyText, supported = supported)
  
    __obj.asInstanceOf[ClipboardService]
  }
}

