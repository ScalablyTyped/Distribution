package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.clipboardNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Should be implemented by a clipboard factory that simplifies the creation of multiple clipboard instances.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
trait XClipboardFactory extends XInterface {
  /**
    * Creates a new named clipboard instance.
    * @param aName The name the clipboard should have.
    * @returns A newly created instance of a {@link GenericClipboard} implementation.
    * @throws com::sun::star::lang::IllegalArgumentException If an empty string is passed as clipboard name.
    */
  def createClipboard(aName: String): XClipboard
}

object XClipboardFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createClipboard: String => XClipboard,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XClipboardFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createClipboard = js.Any.fromFunction1(createClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XClipboardFactory]
  }
}

