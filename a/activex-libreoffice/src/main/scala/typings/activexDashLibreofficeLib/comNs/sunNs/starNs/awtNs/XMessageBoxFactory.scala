package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a factory interface for creating message boxes. */
trait XMessageBoxFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a message box.
    * @param aParent a valid {@link XWindowPeer} reference which is used as a parent.  This parameter must not be null.
    * @param eType the message box type.
    * @param nButtons specifies which buttons should be available on the message box.  A combination of {@link com.sun.star.awt.MessageBoxButtons}  A com::sun
    * @param sTitle specifies the title of the message box.
    * @param sMessage specifies text which will be shown by the message box. Line-breaks must be added using 'CR' or 'CR+LF'.
    * @returns the created message box or a null reference if it cannot be created.
    */
  def createMessageBox(
    aParent: XWindowPeer,
    eType: MessageBoxType,
    nButtons: scala.Double,
    sTitle: java.lang.String,
    sMessage: java.lang.String
  ): XMessageBox
}

object XMessageBoxFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createMessageBox: js.Function5[XWindowPeer, MessageBoxType, scala.Double, java.lang.String, java.lang.String, XMessageBox],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMessageBoxFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createMessageBox")(createMessageBox)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMessageBoxFactory]
  }
}

