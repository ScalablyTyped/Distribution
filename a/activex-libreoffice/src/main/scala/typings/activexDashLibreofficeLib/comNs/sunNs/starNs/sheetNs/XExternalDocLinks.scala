package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Primary interface for the {@link com.sun.star.sheet.ExternalDocLinks} service.
  * @see com.sun.star.sheet.ExternalDocLinks
  * @since OOo 3.1
  */
trait XExternalDocLinks
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess {
  /**
    * This method adds a new external document link by its URL, and returns its instance. If a document instance already exists for the specified URL, then
    * that instance gets returned instead of creating a new one.
    * @param aDocName document URL (e.g. [file:///path/to/document.ods]{@link url="file:///path/to/document.ods"} )
    * @returns {@link com.sun.star.sheet.XExternalDocLink} external document link instance
    */
  def addDocLink(aDocName: java.lang.String): XExternalDocLink
}

