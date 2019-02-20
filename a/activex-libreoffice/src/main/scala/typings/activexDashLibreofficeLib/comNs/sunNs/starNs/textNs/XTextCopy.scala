package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables a text object to copy attributed text from another text object. */
trait XTextCopy
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * copies the content from another text object.
    * @param xSource specifies the source text object.
    */
  def copyText(xSource: XTextCopy): scala.Unit
}

