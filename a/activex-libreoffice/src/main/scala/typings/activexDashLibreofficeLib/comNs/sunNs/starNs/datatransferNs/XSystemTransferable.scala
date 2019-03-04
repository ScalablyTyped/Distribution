package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to be implemented by objects used to provide system dependent data for a transfer operation. Those objects usually also implement {@link
  * XTransferable} .
  */
trait XSystemTransferable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Called by a data consumer to obtain a system specific data object from the source. The data object is returned in an any. The contained type may
    * differ on different platforms.
    * @param aProcessId The argument aProcessId is a process identifier of the caller's process. The interface implementation must ensure that the system data
    * @returns The system dependent data object.; ;   **Notes:** Under Windows the returned any contains an unsigned long which represents a pointer to an IData
    */
  def getData(aProcessId: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): js.Any
}

object XSystemTransferable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getData: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSystemTransferable = {
    val __obj = js.Dynamic.literal(acquire = acquire, getData = getData, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSystemTransferable]
  }
}

