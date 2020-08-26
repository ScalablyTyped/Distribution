package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the main interface for a document index.
  *
  * Use {@link com.sun.star.util.XRefreshable} and {@link com.sun.star.lang.XServiceInfo} instead, if available.
  * @deprecated Deprecated
  * @see com.sun.star.util.XRefreshable
  * @see com.sun.star.lang.XServiceInfo
  */
@js.native
trait XDocumentIndex extends XTextContent {
  /** returns the service name that was used to create this document index type. */
  val ServiceName: String = js.native
  /** returns the service name that was used to create this document index type. */
  def getServiceName(): String = js.native
  /** initiates an update to the document index. */
  def update(): Unit = js.native
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
  implicit class XDocumentIndexOps[Self <: XDocumentIndex] (val x: Self) extends AnyVal {
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
    def setServiceName(value: String): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetServiceName(value: () => String): Self = this.set("getServiceName", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

