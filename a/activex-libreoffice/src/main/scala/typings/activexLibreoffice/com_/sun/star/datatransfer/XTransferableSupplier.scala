package typings.activexLibreoffice.com_.sun.star.datatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XTransferableSupplier extends StObject {
  
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
  
  inline def apply(
    Transferable: XTransferable,
    getTransferable: () => XTransferable,
    insertTransferable: XTransferable => Unit
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal(Transferable = Transferable.asInstanceOf[js.Any], getTransferable = js.Any.fromFunction0(getTransferable), insertTransferable = js.Any.fromFunction1(insertTransferable))
    __obj.asInstanceOf[XTransferableSupplier]
  }
  
  extension [Self <: XTransferableSupplier](x: Self) {
    
    inline def setGetTransferable(value: () => XTransferable): Self = StObject.set(x, "getTransferable", js.Any.fromFunction0(value))
    
    inline def setInsertTransferable(value: XTransferable => Unit): Self = StObject.set(x, "insertTransferable", js.Any.fromFunction1(value))
    
    inline def setTransferable(value: XTransferable): Self = StObject.set(x, "Transferable", value.asInstanceOf[js.Any])
  }
}
