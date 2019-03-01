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
    TransferDataFlavors: activexDashInteropLib.SafeArray[DataFlavor],
    acquire: js.Function0[scala.Unit],
    getTransferData: js.Function1[DataFlavor, js.Any],
    getTransferData2: js.Function2[DataFlavor, java.lang.String, js.Any],
    getTransferDataFlavors: js.Function0[activexDashInteropLib.SafeArray[DataFlavor]],
    isDataFlavorSupported: js.Function1[DataFlavor, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTransferable2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TransferDataFlavors")(TransferDataFlavors)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getTransferData")(getTransferData)
    __obj.updateDynamic("getTransferData2")(getTransferData2)
    __obj.updateDynamic("getTransferDataFlavors")(getTransferDataFlavors)
    __obj.updateDynamic("isDataFlavorSupported")(isDataFlavorSupported)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTransferable2]
  }
}

