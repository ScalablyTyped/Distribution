package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to be implemented by objects used to provide system dependent data for a transfer operation. Those objects usually also implement {@link
  * XTransferable} .
  */
trait XSystemTransferable extends XInterface {
  /**
    * Called by a data consumer to obtain a system specific data object from the source. The data object is returned in an any. The contained type may
    * differ on different platforms.
    * @param aProcessId The argument aProcessId is a process identifier of the caller's process. The interface implementation must ensure that the system data
    * @returns The system dependent data object.; ;   **Notes:** Under Windows the returned any contains an unsigned long which represents a pointer to an IData
    */
  def getData(aProcessId: SeqEquiv[Double]): js.Any
}

object XSystemTransferable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getData: SeqEquiv[Double] => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSystemTransferable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction1(getData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSystemTransferable]
  }
}

