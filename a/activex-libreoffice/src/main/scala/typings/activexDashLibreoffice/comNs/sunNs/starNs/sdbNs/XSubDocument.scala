package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows operating on a sub document of an {@link OfficeDatabaseDocument}
  * @since OOo 3.1
  */
trait XSubDocument extends js.Object {
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
  @scala.inline
  def apply(close: () => Boolean, open: () => XComponent, openDesign: () => XComponent, store: () => Unit): XSubDocument = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), openDesign = js.Any.fromFunction0(openDesign), store = js.Any.fromFunction0(store))
  
    __obj.asInstanceOf[XSubDocument]
  }
}

