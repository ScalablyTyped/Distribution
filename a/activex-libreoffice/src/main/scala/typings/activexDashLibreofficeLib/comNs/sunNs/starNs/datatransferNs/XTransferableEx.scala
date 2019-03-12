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
  def queryTransferDataFlavors(requestedFlavors: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor]): stdLib.SafeArray[DataFlavor]
}

object XTransferableEx {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    queryTransferDataFlavors: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DataFlavor] => stdLib.SafeArray[DataFlavor],
    release: () => scala.Unit
  ): XTransferableEx = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), queryTransferDataFlavors = js.Any.fromFunction1(queryTransferDataFlavors), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTransferableEx]
  }
}

