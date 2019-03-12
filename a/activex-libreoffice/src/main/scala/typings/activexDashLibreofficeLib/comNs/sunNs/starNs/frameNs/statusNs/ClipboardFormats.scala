package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a list of format IDs and names which are part of the system clipboard.
  * @since OOo 2.0
  */
trait ClipboardFormats extends js.Object {
  /** specifies a sequence of format IDs which are contained in the system clipboard. */
  var Identifiers: stdLib.SafeArray[scala.Double]
  /** specifies a sequence of format names which are contained in the system clipboard. */
  var Names: stdLib.SafeArray[java.lang.String]
}

object ClipboardFormats {
  @scala.inline
  def apply(Identifiers: stdLib.SafeArray[scala.Double], Names: stdLib.SafeArray[java.lang.String]): ClipboardFormats = {
    val __obj = js.Dynamic.literal(Identifiers = Identifiers, Names = Names)
  
    __obj.asInstanceOf[ClipboardFormats]
  }
}

