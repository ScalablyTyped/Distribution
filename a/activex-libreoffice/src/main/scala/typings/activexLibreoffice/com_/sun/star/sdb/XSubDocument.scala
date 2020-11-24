package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows operating on a sub document of an {@link OfficeDatabaseDocument}
  * @since OOo 3.1
  */
@js.native
trait XSubDocument extends js.Object {
  
  /**
    * closes the sub document, if it had previously been opened in either mode
    * @returns `TRUE` if and only if the document could be closed, `FALSE` otherwise, e.g. if the closing has been vetoed by the user.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during closing the document
    */
  def close(): Boolean = js.native
  
  /**
    * opens the sub document
    *
    * Note that opening the document means it is displayed in an own top-level frame on the desktop.
    * @returns the sub document, usually an {@link com.sun.star.frame.XModel} , or an {@link com.sun.star.frame.XController} if the sub document does not have a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during opening the document
    */
  def open(): XComponent = js.native
  
  /**
    * opens the sub document in design mode
    * @returns the sub document, usually an {@link com.sun.star.frame.XModel} , or an {@link com.sun.star.frame.XController} if the sub document does not have a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during opening the document
    */
  def openDesign(): XComponent = js.native
  
  /**
    * stores the sub document, if it had previously been opened in either mode
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during storing the document
    */
  def store(): Unit = js.native
}
object XSubDocument {
  
  @scala.inline
  def apply(close: () => Boolean, open: () => XComponent, openDesign: () => XComponent, store: () => Unit): XSubDocument = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), openDesign = js.Any.fromFunction0(openDesign), store = js.Any.fromFunction0(store))
    __obj.asInstanceOf[XSubDocument]
  }
  
  @scala.inline
  implicit class XSubDocumentOps[Self <: XSubDocument] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Boolean): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => XComponent): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenDesign(value: () => XComponent): Self = this.set("openDesign", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStore(value: () => Unit): Self = this.set("store", js.Any.fromFunction0(value))
  }
}
