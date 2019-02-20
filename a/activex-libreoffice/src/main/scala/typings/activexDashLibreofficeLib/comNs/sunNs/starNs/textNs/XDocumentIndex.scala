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

