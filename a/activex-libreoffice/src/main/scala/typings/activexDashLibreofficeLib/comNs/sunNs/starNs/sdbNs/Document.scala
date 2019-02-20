package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies documents which belong to a database source.
  *
  * These documents typically process information from a connected data source. A {@link Document} could be a form or a report.
  * @deprecated Deprecated
  */
trait Document
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** is the URL of the document. */
  var DocumentLocation: java.lang.String
  /** is the name of the document. If the document is part of the container, it is not possible to alter the name. */
  var Name: java.lang.String
}

