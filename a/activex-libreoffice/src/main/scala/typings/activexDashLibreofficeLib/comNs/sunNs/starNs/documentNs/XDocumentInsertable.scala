package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to import a document from a given URL into this document. */
trait XDocumentInsertable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** inserts the document that is specified by the URL. */
  def insertDocumentFromURL(
    aURL: java.lang.String,
    aOptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

