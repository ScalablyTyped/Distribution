package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTransferable2 extends XTransferable {
  /**
    * This is equivalent of getTransferData of {@link XTransferable} , but takes an additional parameter that specifies the destination document type.
    * @param aFlavor requested data format
    * @param aDestShellID destination document shell ID. The ID of each individual shell must be unique.
    * @returns data in specified data format.
    * @throws com::sun::star::io::IOException if the data is no longer available in the requested flavor.
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the requested {@link DataFlavor} is not supported.
    */
  def getTransferData2(aFlavor: DataFlavor, aDestShellID: java.lang.String): js.Any
}

object XTransferable2 {
  @scala.inline
  def apply(
    TransferDataFlavors: stdLib.SafeArray[DataFlavor],
    acquire: () => scala.Unit,
    getTransferData: DataFlavor => js.Any,
    getTransferData2: (DataFlavor, java.lang.String) => js.Any,
    getTransferDataFlavors: () => stdLib.SafeArray[DataFlavor],
    isDataFlavorSupported: DataFlavor => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTransferable2 = {
    val __obj = js.Dynamic.literal(TransferDataFlavors = TransferDataFlavors, acquire = js.Any.fromFunction0(acquire), getTransferData = js.Any.fromFunction1(getTransferData), getTransferData2 = js.Any.fromFunction2(getTransferData2), getTransferDataFlavors = js.Any.fromFunction0(getTransferDataFlavors), isDataFlavorSupported = js.Any.fromFunction1(isDataFlavorSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTransferable2]
  }
}

