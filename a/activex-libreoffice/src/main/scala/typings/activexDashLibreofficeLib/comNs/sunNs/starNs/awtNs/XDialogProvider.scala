package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides dialogs implementing the {@link com.sun.star.awt.XDialog} interface. */
trait XDialogProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a dialog for the given URL.
    * @param URL is the URL.
    * @returns a dialog implementing the {@link com.sun.star.awt.XDialog} interface.
    * @throws com::sun::star::lang::IllegalArgumentException if no dialog for the given URL is found or if the URL is invalid.
    */
  def createDialog(URL: java.lang.String): XDialog
}

object XDialogProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createDialog: js.Function1[java.lang.String, XDialog],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDialogProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createDialog")(createDialog)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDialogProvider]
  }
}

