package typings.activexLibreoffice.com_.sun.star.datatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XTransferableSupplier extends js.Object {
  
  /**
    * To get access to a transferable representation of a selected part of an object.
    * @returns The transferable object representing the selection inside the supplying object
    * @see com.sun.star.datatransfer.XTransferable
    */
  val Transferable: XTransferable = js.native
  
  /**
    * To get access to a transferable representation of a selected part of an object.
    * @returns The transferable object representing the selection inside the supplying object
    * @see com.sun.star.datatransfer.XTransferable
    */
  def getTransferable(): XTransferable = js.native
  
  /**
    * Hands over a transferable object that shall be inserted.
    * @param xTrans The transferable object to be inserted A NULL value is not allowed.
    * @see com.sun.star.datatransfer.XTransferable
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the given {@link com.sun.star.datatransfer.XTransferable} has no {@link com.sun.star.
    */
  def insertTransferable(xTrans: XTransferable): Unit = js.native
}
object XTransferableSupplier {
  
  @scala.inline
  def apply(
    Transferable: XTransferable,
    getTransferable: () => XTransferable,
    insertTransferable: XTransferable => Unit
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal(Transferable = Transferable.asInstanceOf[js.Any], getTransferable = js.Any.fromFunction0(getTransferable), insertTransferable = js.Any.fromFunction1(insertTransferable))
    __obj.asInstanceOf[XTransferableSupplier]
  }
  
  @scala.inline
  implicit class XTransferableSupplierOps[Self <: XTransferableSupplier] (val x: Self) extends AnyVal {
    
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
    def setTransferable(value: XTransferable): Self = this.set("Transferable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTransferable(value: () => XTransferable): Self = this.set("getTransferable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertTransferable(value: XTransferable => Unit): Self = this.set("insertTransferable", js.Any.fromFunction1(value))
  }
}
