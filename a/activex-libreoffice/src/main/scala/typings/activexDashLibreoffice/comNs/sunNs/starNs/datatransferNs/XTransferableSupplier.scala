package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTransferableSupplier extends js.Object {
  /**
    * To get access to a transferable representation of a selected part of an object.
    * @returns The transferable object representing the selection inside the supplying object
    * @see com.sun.star.datatransfer.XTransferable
    */
  val Transferable: XTransferable
  /**
    * To get access to a transferable representation of a selected part of an object.
    * @returns The transferable object representing the selection inside the supplying object
    * @see com.sun.star.datatransfer.XTransferable
    */
  def getTransferable(): XTransferable
  /**
    * Hands over a transferable object that shall be inserted.
    * @param xTrans The transferable object to be inserted A NULL value is not allowed.
    * @see com.sun.star.datatransfer.XTransferable
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException if the given {@link com.sun.star.datatransfer.XTransferable} has no {@link com.sun.star.
    */
  def insertTransferable(xTrans: XTransferable): Unit
}

object XTransferableSupplier {
  @scala.inline
  def apply(
    Transferable: XTransferable,
    getTransferable: () => XTransferable,
    insertTransferable: XTransferable => Unit
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal(Transferable = Transferable, getTransferable = js.Any.fromFunction0(getTransferable), insertTransferable = js.Any.fromFunction1(insertTransferable))
  
    __obj.asInstanceOf[XTransferableSupplier]
  }
}

