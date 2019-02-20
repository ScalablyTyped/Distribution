package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a link to a document associated with a database document
  * @deprecated Deprecated
  * @since OOo 2.0
  */
trait DatabaseDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XDataDescriptorFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XRename {
  /** is the name of the document. */
  var Name: java.lang.String
  /** is the URL of the document. */
  var URL: java.lang.String
}

