package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides direct access to the data in all data flavors. It can be used by the clipboard implementation to optimize data transport on
  * flush operations.
  * @see com.sun.star.datatransfer.XTransferable
  */
trait XTransferDataAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * To get all the data of a sequence of {@link DataFlavor} .
    * @param aFlavorList The sequence of requested {@link DataFlavor} . An unsupported {@link DataFlavor} will be ignored.
    * @returns The data in the requested {@link DataFlavor} . For unsupported {@link DataFlavor} an empty any will be returned.
    */
  def getData(aFlavorList: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor]): activexDashInteropLib.SafeArray[_]
  /**
    * To query for the summarized data size in bytes of a sequence of {@link DataFlavor} .
    * @param aFlavorList A sequence of requested {@link DataFlavor} . An unsupported {@link DataFlavor} will be ignored.
    * @returns The number of bytes of the transfer data in the specified sequence of {@link DataFlavor} .
    */
  def queryDataSize(aFlavorList: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor]): scala.Double
}

object XTransferDataAccess {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getData: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor], 
      activexDashInteropLib.SafeArray[_]
    ],
    queryDataSize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor], scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTransferDataAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire, getData = getData, queryDataSize = queryDataSize, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTransferDataAccess]
  }
}

