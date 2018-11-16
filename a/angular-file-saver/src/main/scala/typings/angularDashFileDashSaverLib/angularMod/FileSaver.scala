package typings
package angularDashFileDashSaverLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSaver extends js.Object {
  /**
           * Immediately starts saving a file
           * @param data: a Blob instance;
           * @param filename: a String custom filename (an extension is optional);
           * @param disableAutoBOM : (optional) Boolean Disable automatically provided Unicode text encoding hints;
           */
  def saveAs(blob: stdLib.Blob, fileName: java.lang.String): scala.Unit = js.native
  /**
           * Immediately starts saving a file
           * @param data: a Blob instance;
           * @param filename: a String custom filename (an extension is optional);
           * @param disableAutoBOM : (optional) Boolean Disable automatically provided Unicode text encoding hints;
           */
  def saveAs(blob: stdLib.Blob, fileName: java.lang.String, disableBOM: scala.Boolean): scala.Unit = js.native
}

