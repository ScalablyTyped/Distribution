package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to be implemented by objects used to provide data for a transfer operation.
  * @see com.sun.star.datatransfer.DataFlavor
  * @see com.sun.star.datatransfer.XTransferable
  */
trait XTransferableEx extends XInterface {
  /**
    * @param requestedFlavors Sequence of {@link DataFlavor} of interest. Specify an empty sequence for interest in all data flavors with top-level MIME conte
    * @returns The list of the matching supported {@link DataFlavor} that were requested. For each requested top-level MIME content-type, all supported subtypes
    */
  def queryTransferDataFlavors(requestedFlavors: SeqEquiv[DataFlavor]): SafeArray[DataFlavor]
}

object XTransferableEx {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    queryTransferDataFlavors: SeqEquiv[DataFlavor] => SafeArray[DataFlavor],
    release: () => Unit
  ): XTransferableEx = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), queryTransferDataFlavors = js.Any.fromFunction1(queryTransferDataFlavors), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTransferableEx]
  }
}

