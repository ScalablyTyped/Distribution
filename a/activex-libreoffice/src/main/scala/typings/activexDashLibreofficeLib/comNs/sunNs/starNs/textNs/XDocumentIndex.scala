package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

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
trait XDocumentIndex extends XTextContent {
  /** returns the service name that was used to create this document index type. */
  val ServiceName: java.lang.String
  /** returns the service name that was used to create this document index type. */
  def getServiceName(): java.lang.String
  /** initiates an update to the document index. */
  def update(): scala.Unit
}

object XDocumentIndex {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    ServiceName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getServiceName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    update: js.Function0[scala.Unit]
  ): XDocumentIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, ServiceName = ServiceName, acquire = acquire, addEventListener = addEventListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getServiceName = getServiceName, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, update = update)
  
    __obj.asInstanceOf[XDocumentIndex]
  }
}

