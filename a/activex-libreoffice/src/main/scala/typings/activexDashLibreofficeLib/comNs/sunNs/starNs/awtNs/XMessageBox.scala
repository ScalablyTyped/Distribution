package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a message box. */
trait XMessageBox extends js.Object {
  /** the caption text. */
  var CaptionText: java.lang.String
  /** the message text. */
  var MessageText: java.lang.String
  /**
    * shows the message box.
    * @returns one of {@link MessageBoxResults} .
    */
  def execute(): scala.Double
}

