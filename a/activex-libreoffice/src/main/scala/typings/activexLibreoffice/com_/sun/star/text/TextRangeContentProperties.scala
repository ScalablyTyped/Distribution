package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.table.XCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the structural properties to retrieve text contents.
  * @since OOo 3.3
  */
trait TextRangeContentProperties extends StObject {
  
  /** may contain a table cell. */
  var Cell: XCell
  
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
    Cell: XCell,
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
    val __obj = js.Dynamic.literal(Cell = Cell.asInstanceOf[js.Any], DocumentIndex = DocumentIndex.asInstanceOf[js.Any], DocumentIndexMark = DocumentIndexMark.asInstanceOf[js.Any], Endnote = Endnote.asInstanceOf[js.Any], Footnote = Footnote.asInstanceOf[js.Any], NestedTextContent = NestedTextContent.asInstanceOf[js.Any], ReferenceMark = ReferenceMark.asInstanceOf[js.Any], TextFrame = TextFrame.asInstanceOf[js.Any], TextSection = TextSection.asInstanceOf[js.Any], TextTable = TextTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRangeContentProperties]
  }
  
  @scala.inline
  implicit class TextRangeContentPropertiesMutableBuilder[Self <: TextRangeContentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: XCell): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIndex(value: XDocumentIndex): Self = StObject.set(x, "DocumentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIndexMark(value: XDocumentIndexMark): Self = StObject.set(x, "DocumentIndexMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndnote(value: XFootnote): Self = StObject.set(x, "Endnote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnote(value: XFootnote): Self = StObject.set(x, "Footnote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedTextContent(value: XTextContent): Self = StObject.set(x, "NestedTextContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceMark(value: XTextContent): Self = StObject.set(x, "ReferenceMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFrame(value: XTextFrame): Self = StObject.set(x, "TextFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSection(value: XTextSection): Self = StObject.set(x, "TextSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTable(value: XTextTable): Self = StObject.set(x, "TextTable", value.asInstanceOf[js.Any])
  }
}
