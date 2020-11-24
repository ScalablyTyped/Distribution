package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.com_.sun.star.table.XCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the structural properties to retrieve text contents.
  * @since OOo 3.3
  */
@js.native
trait TextRangeContentProperties extends js.Object {
  
  /** may contain a table cell. */
  var Cell: XCell = js.native
  
  /** may contain a document index. */
  var DocumentIndex: XDocumentIndex = js.native
  
  /** may contain a document index mark. */
  var DocumentIndexMark: XDocumentIndexMark = js.native
  
  /** may contain a endnote. */
  var Endnote: XFootnote = js.native
  
  /** may contain a footnote. */
  var Footnote: XFootnote = js.native
  
  /**
    * may contain a nested text content.
    *
    * For example, may contain an {@link InContentMetadata} or a {@link com.sun.star.text.textfield.MetadataField} .
    */
  var NestedTextContent: XTextContent = js.native
  
  /** may contain a reference mark. */
  var ReferenceMark: XTextContent = js.native
  
  /** may contain a text frame. */
  var TextFrame: XTextFrame = js.native
  
  /** may contain a text section. */
  var TextSection: XTextSection = js.native
  
  /** may contain a text table. */
  var TextTable: XTextTable = js.native
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
  implicit class TextRangeContentPropertiesOps[Self <: TextRangeContentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCell(value: XCell): Self = this.set("Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIndex(value: XDocumentIndex): Self = this.set("DocumentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIndexMark(value: XDocumentIndexMark): Self = this.set("DocumentIndexMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndnote(value: XFootnote): Self = this.set("Endnote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnote(value: XFootnote): Self = this.set("Footnote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedTextContent(value: XTextContent): Self = this.set("NestedTextContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceMark(value: XTextContent): Self = this.set("ReferenceMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFrame(value: XTextFrame): Self = this.set("TextFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSection(value: XTextSection): Self = this.set("TextSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTable(value: XTextTable): Self = this.set("TextTable", value.asInstanceOf[js.Any])
  }
}
