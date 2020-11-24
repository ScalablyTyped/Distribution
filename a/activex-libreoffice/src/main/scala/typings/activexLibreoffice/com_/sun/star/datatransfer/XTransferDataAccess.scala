package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides direct access to the data in all data flavors. It can be used by the clipboard implementation to optimize data transport on
  * flush operations.
  * @see com.sun.star.datatransfer.XTransferable
  */
@js.native
trait XTransferDataAccess extends XInterface {
  
  /**
    * To get all the data of a sequence of {@link DataFlavor} .
    * @param aFlavorList The sequence of requested {@link DataFlavor} . An unsupported {@link DataFlavor} will be ignored.
    * @returns The data in the requested {@link DataFlavor} . For unsupported {@link DataFlavor} an empty any will be returned.
    */
  def getData(aFlavorList: SeqEquiv[DataFlavor]): SafeArray[_] = js.native
  
  /**
    * To query for the summarized data size in bytes of a sequence of {@link DataFlavor} .
    * @param aFlavorList A sequence of requested {@link DataFlavor} . An unsupported {@link DataFlavor} will be ignored.
    * @returns The number of bytes of the transfer data in the specified sequence of {@link DataFlavor} .
    */
  def queryDataSize(aFlavorList: SeqEquiv[DataFlavor]): Double = js.native
}
object XTransferDataAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getData: SeqEquiv[DataFlavor] => SafeArray[_],
    queryDataSize: SeqEquiv[DataFlavor] => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransferDataAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction1(getData), queryDataSize = js.Any.fromFunction1(queryDataSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransferDataAccess]
  }
  
  @scala.inline
  implicit class XTransferDataAccessOps[Self <: XTransferDataAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetData(value: SeqEquiv[DataFlavor] => SafeArray[_]): Self = this.set("getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryDataSize(value: SeqEquiv[DataFlavor] => Double): Self = this.set("queryDataSize", js.Any.fromFunction1(value))
  }
}
