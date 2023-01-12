package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows operating on a sub document of an {@link OfficeDatabaseDocument}
  * @since OOo 3.1
  */
trait XSubDocument extends StObject {
  
  /**
    * closes the sub document, if it had previously been opened in either mode
    * @returns `TRUE` if and only if the document could be closed, `FALSE` otherwise, e.g. if the closing has been vetoed by the user.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during closing the document
    */
  def close(): Boolean
  
  /**
    * opens the sub document
    *
    * Note that opening the document means it is displayed in an own top-level frame on the desktop.
    * @returns the sub document, usually an {@link com.sun.star.frame.XModel} , or an {@link com.sun.star.frame.XController} if the sub document does not have a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during opening the document
    */
  def open(): XComponent
  
  /**
    * opens the sub document in design mode
    * @returns the sub document, usually an {@link com.sun.star.frame.XModel} , or an {@link com.sun.star.frame.XController} if the sub document does not have a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during opening the document
    */
  def openDesign(): XComponent
  
  /**
    * stores the sub document, if it had previously been opened in either mode
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing the document
    */
  def store(): Unit
}
object XSubDocument {
  
  inline def apply(close: () => Boolean, open: () => XComponent, openDesign: () => XComponent, store: () => Unit): XSubDocument = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), openDesign = js.Any.fromFunction0(openDesign), store = js.Any.fromFunction0(store))
    __obj.asInstanceOf[XSubDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSubDocument] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Boolean): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => XComponent): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setOpenDesign(value: () => XComponent): Self = StObject.set(x, "openDesign", js.Any.fromFunction0(value))
    
    inline def setStore(value: () => Unit): Self = StObject.set(x, "store", js.Any.fromFunction0(value))
  }
}
