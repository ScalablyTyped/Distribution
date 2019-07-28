package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables a text object to copy attributed text from another text object. */
trait XTextCopy extends XInterface {
  /**
    * copies the content from another text object.
    * @param xSource specifies the source text object.
    */
  def copyText(xSource: XTextCopy): Unit
}

object XTextCopy {
  @scala.inline
  def apply(
    acquire: () => Unit,
    copyText: XTextCopy => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextCopy = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copyText = js.Any.fromFunction1(copyText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextCopy]
  }
}

