package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the structural properties to retrieve text contents.
  * @since OOo 3.3
  */
trait TextRangeContentProperties extends js.Object {
  /** may contain a table cell. */
  var Cell: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell
  /** may contain a document index. */
  var DocumentIndex: XDocumentIndex
  /** may contain a document index mark. */
  var DocumentIndexMark: XDocumentIndexMark
  /** may contain a endnote. */
  var Endnote: XFootnote
  /** may contain a footnote. */
  var Footnote: XFootnote
  /**
    * may contain a nested text content.
    *
    * For example, may contain an {@link InContentMetadata} or a {@link com.sun.star.text.textfield.MetadataField} .
    */
  var NestedTextContent: XTextContent
  /** may contain a reference mark. */
  var ReferenceMark: XTextContent
  /** may contain a text frame. */
  var TextFrame: XTextFrame
  /** may contain a text section. */
  var TextSection: XTextSection
  /** may contain a text table. */
  var TextTable: XTextTable
}

object TextRangeContentProperties {
  @scala.inline
  def apply(
    Cell: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell,
    DocumentIndex: XDocumentIndex,
    DocumentIndexMark: XDocumentIndexMark,
    Endnote: XFootnote,
    Footnote: XFootnote,
    NestedTextContent: XTextContent,
    ReferenceMark: XTextContent,
    TextFrame: XTextFrame,
    TextSection: XTextSection,
    TextTable: XTextTable
  ): TextRangeContentProperties = {
    val __obj = js.Dynamic.literal(Cell = Cell, DocumentIndex = DocumentIndex, DocumentIndexMark = DocumentIndexMark, Endnote = Endnote, Footnote = Footnote, NestedTextContent = NestedTextContent, ReferenceMark = ReferenceMark, TextFrame = TextFrame, TextSection = TextSection, TextTable = TextTable)
  
    __obj.asInstanceOf[TextRangeContentProperties]
  }
}

