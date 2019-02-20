package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter for importing Basic macros from the OpenOffice.org file format.
  *
  * The {@link XImporter.setTargetDocument()} method must be called in order to provide the import component with the target document to which the data
  * should be imported. The {@link com.sun.star.xml.sax.XDocumentHandler} interface is used to stream the XML data into the filter.
  * @since OOo 2.0
  */
trait XMLBasicImporter
  extends XImporter
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler

