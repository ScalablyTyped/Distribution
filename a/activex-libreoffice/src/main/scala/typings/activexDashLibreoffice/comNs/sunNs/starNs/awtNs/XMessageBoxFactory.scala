package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a factory interface for creating message boxes. */
trait XMessageBoxFactory extends XInterface {
  /**
    * creates a message box.
    * @param aParent a valid {@link XWindowPeer} reference which is used as a parent.  This parameter must not be null.
    * @param eType the message box type.
    * @param nButtons specifies which buttons should be available on the message box.  A combination of {@link com.sun.star.awt.MessageBoxButtons}  A com::sun
    * @param sTitle specifies the title of the message box.
    * @param sMessage specifies text which will be shown by the message box. Line-breaks must be added using 'CR' or 'CR+LF'.
    * @returns the created message box or a null reference if it cannot be created.
    */
  def createMessageBox(aParent: XWindowPeer, eType: MessageBoxType, nButtons: Double, sTitle: String, sMessage: String): XMessageBox
}

object XMessageBoxFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createMessageBox: (XWindowPeer, MessageBoxType, Double, String, String) => XMessageBox,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMessageBoxFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createMessageBox = js.Any.fromFunction5(createMessageBox), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMessageBoxFactory]
  }
}

