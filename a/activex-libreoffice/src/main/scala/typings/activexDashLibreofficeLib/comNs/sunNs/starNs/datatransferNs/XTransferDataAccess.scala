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
  def getData(aFlavorList: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor]): stdLib.SafeArray[_]
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
    acquire: () => scala.Unit,
    getData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor] => stdLib.SafeArray[_],
    queryDataSize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor] => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTransferDataAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction1(getData), queryDataSize = js.Any.fromFunction1(queryDataSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTransferDataAccess]
  }
}

