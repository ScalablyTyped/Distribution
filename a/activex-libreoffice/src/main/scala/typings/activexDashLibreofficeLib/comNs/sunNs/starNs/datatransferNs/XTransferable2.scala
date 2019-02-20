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

