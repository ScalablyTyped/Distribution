package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.statusNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a list of format IDs and names which are part of the system clipboard.
  * @since OOo 2.0
  */
trait ClipboardFormats extends js.Object {
  /** specifies a sequence of format IDs which are contained in the system clipboard. */
  var Identifiers: SafeArray[Double]
  /** specifies a sequence of format names which are contained in the system clipboard. */
  var Names: SafeArray[String]
}

object ClipboardFormats {
  @scala.inline
  def apply(Identifiers: SafeArray[Double], Names: SafeArray[String]): ClipboardFormats = {
    val __obj = js.Dynamic.literal(Identifiers = Identifiers, Names = Names)
  
    __obj.asInstanceOf[ClipboardFormats]
  }
}

