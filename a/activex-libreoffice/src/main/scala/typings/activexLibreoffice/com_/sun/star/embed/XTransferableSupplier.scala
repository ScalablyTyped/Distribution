package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provide access to a {@link com.sun.star.datatransfer.XTransferable} implementation from the object. */
trait XTransferableSupplier
  extends StObject
     with XInterface {
  
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns implementation
    */
  val Transferable: XTransferable
  
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns implementation
    */
  def getTransferable(): XTransferable
}
object XTransferableSupplier {
  
  inline def apply(
    Transferable: XTransferable,
    acquire: () => Unit,
    getTransferable: () => XTransferable,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal(Transferable = Transferable.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTransferable = js.Any.fromFunction0(getTransferable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTransferableSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTransferableSupplier] (val x: Self) extends AnyVal {
    
    inline def setGetTransferable(value: () => XTransferable): Self = StObject.set(x, "getTransferable", js.Any.fromFunction0(value))
    
    inline def setTransferable(value: XTransferable): Self = StObject.set(x, "Transferable", value.asInstanceOf[js.Any])
  }
}
