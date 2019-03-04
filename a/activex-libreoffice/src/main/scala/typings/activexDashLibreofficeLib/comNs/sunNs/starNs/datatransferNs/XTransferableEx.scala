package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to be implemented by objects used to provide data for a transfer operation.
  * @see com.sun.star.datatransfer.DataFlavor
  * @see com.sun.star.datatransfer.XTransferable
  */
trait XTransferableEx
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param requestedFlavors Sequence of {@link DataFlavor} of interest. Specify an empty sequence for interest in all data flavors with top-level MIME conte
    * @returns The list of the matching supported {@link DataFlavor} that were requested. For each requested top-level MIME content-type, all supported subtypes
    */
  def queryTransferDataFlavors(requestedFlavors: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor]): activexDashInteropLib.SafeArray[DataFlavor]
}

object XTransferableEx {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryTransferDataFlavors: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor], 
      activexDashInteropLib.SafeArray[DataFlavor]
    ],
    release: js.Function0[scala.Unit]
  ): XTransferableEx = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, queryTransferDataFlavors = queryTransferDataFlavors, release = release)
  
    __obj.asInstanceOf[XTransferableEx]
  }
}

