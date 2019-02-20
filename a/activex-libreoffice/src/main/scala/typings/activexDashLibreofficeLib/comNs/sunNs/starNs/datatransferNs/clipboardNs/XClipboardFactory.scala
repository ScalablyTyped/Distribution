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

