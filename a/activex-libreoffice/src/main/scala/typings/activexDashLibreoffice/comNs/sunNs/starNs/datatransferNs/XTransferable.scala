package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to be implemented by objects used to provide data for a data transfer operation.
  * @see com.sun.star.datatransfer.DataFlavor
  */
trait XTransferable extends XInterface {
  /**
    * Returns a sequence of supported {@link DataFlavor} .
    * @returns The sequence of supported {@link DataFlavor} .
    * @see com.sun.star.datatransfer.DataFlavor
    */
  val TransferDataFlavors: SafeArray[DataFlavor]
  /**
    * Called by a data consumer to obtain data from the source in a specified format.
    * @param aFlavor Describes the requested data format
    * @returns The data in the specified {@link DataFlavor} .
    * @throws com::sun::star::io::IOException if the data is no longer available in the requested flavor.
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the requested {@link DataFlavor} is not supported.
    */
  def getTransferData(aFlavor: DataFlavor): js.Any
  /**
    * Returns a sequence of supported {@link DataFlavor} .
    * @returns The sequence of supported {@link DataFlavor} .
    * @see com.sun.star.datatransfer.DataFlavor
    */
  def getTransferDataFlavors(): SafeArray[DataFlavor]
  /**
    * Checks if the data object supports the specified data flavor.
    * @param aFlavor Describes the format that should be checked
    * @returns A value of `TRUE` if the {@link DataFlavor} is supported by the transfer source. A value of `FALSE` if the {@link DataFlavor} is unsupported by t
    */
  def isDataFlavorSupported(aFlavor: DataFlavor): Boolean
}

object XTransferable {
  @scala.inline
  def apply(
    TransferDataFlavors: SafeArray[DataFlavor],
    acquire: () => Unit,
    getTransferData: DataFlavor => js.Any,
    getTransferDataFlavors: () => SafeArray[DataFlavor],
    isDataFlavorSupported: DataFlavor => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransferable = {
    val __obj = js.Dynamic.literal(TransferDataFlavors = TransferDataFlavors, acquire = js.Any.fromFunction0(acquire), getTransferData = js.Any.fromFunction1(getTransferData), getTransferDataFlavors = js.Any.fromFunction0(getTransferDataFlavors), isDataFlavorSupported = js.Any.fromFunction1(isDataFlavorSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTransferable]
  }
}

