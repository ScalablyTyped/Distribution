package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Should be implemented by a clipboard factory that simplifies the creation of multiple clipboard instances.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
trait XClipboardFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates a new named clipboard instance.
    * @param aName The name the clipboard should have.
    * @returns A newly created instance of a {@link GenericClipboard} implementation.
    * @throws com::sun::star::lang::IllegalArgumentException If an empty string is passed as clipboard name.
    */
  def createClipboard(aName: java.lang.String): XClipboard
}

object XClipboardFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createClipboard: js.Function1[java.lang.String, XClipboard],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XClipboardFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createClipboard")(createClipboard)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XClipboardFactory]
  }
}

