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

