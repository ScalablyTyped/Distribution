package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the main interface for a document index.
  *
  * Use {@link com.sun.star.util.XRefreshable} and {@link com.sun.star.lang.XServiceInfo} instead, if available.
  * @deprecated Deprecated
  * @see com.sun.star.util.XRefreshable
  * @see com.sun.star.lang.XServiceInfo
  */
trait XDocumentIndex
  extends StObject
     with XTextContent {
  
  /** returns the service name that was used to create this document index type. */
  val ServiceName: String
  
  /** returns the service name that was used to create this document index type. */
  def getServiceName(): String
  
  /** initiates an update to the document index. */
  def update(): Unit
}
object XDocumentIndex {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    ServiceName: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    update: () => Unit
  ): XDocumentIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[XDocumentIndex]
  }
  
  @scala.inline
  implicit class XDocumentIndexMutableBuilder[Self <: XDocumentIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetServiceName(value: () => String): Self = StObject.set(x, "getServiceName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
