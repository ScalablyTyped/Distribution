package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XTransferable2
  extends StObject
     with XTransferable {
  
  /**
    * This is equivalent of getTransferData of {@link XTransferable} , but takes an additional parameter that specifies the destination document type.
    * @param aFlavor requested data format
    * @param aDestShellID destination document shell ID. The ID of each individual shell must be unique.
    * @returns data in specified data format.
    * @throws com::sun::star::io::IOException if the data is no longer available in the requested flavor.
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the requested {@link DataFlavor} is not supported.
    */
  def getTransferData2(aFlavor: DataFlavor, aDestShellID: String): js.Any
}
object XTransferable2 {
  
  @scala.inline
  def apply(
    TransferDataFlavors: SafeArray[DataFlavor],
    acquire: () => Unit,
    getTransferData: DataFlavor => js.Any,
    getTransferData2: (DataFlavor, String) => js.Any,
    getTransferDataFlavors: () => SafeArray[DataFlavor],
    isDataFlavorSupported: DataFlavor => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransferable2 = {
    val __obj = js.Dynamic.literal(TransferDataFlavors = TransferDataFlavors.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTransferData = js.Any.fromFunction1(getTransferData), getTransferData2 = js.Any.fromFunction2(getTransferData2), getTransferDataFlavors = js.Any.fromFunction0(getTransferDataFlavors), isDataFlavorSupported = js.Any.fromFunction1(isDataFlavorSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransferable2]
  }
  
  @scala.inline
  implicit class XTransferable2MutableBuilder[Self <: XTransferable2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTransferData2(value: (DataFlavor, String) => js.Any): Self = StObject.set(x, "getTransferData2", js.Any.fromFunction2(value))
  }
}
