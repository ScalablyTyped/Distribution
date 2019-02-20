package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the view of a {@link TextDocument} . */
trait TextDocumentView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.OfficeDocumentView
     with XTextViewCursorSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * specifies if spell checking should be done while typing.
    * @since OOo 2.0
    */
  var IsConstantSpellcheck: scala.Boolean
  /**
    * specifies if the marks for misspelled text should be displayed.
    * @since OOo 2.0
    */
  var IsHideSpellMarks: scala.Boolean
  /**
    * returns the number of lines in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    *
    * Empty paragraphs are not counted.
    * @since OOo 2.0
    */
  var LineCount: scala.Double
  /**
    * returns the number of pages in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    * @since OOo 2.0
    */
  var PageCount: scala.Double
}

