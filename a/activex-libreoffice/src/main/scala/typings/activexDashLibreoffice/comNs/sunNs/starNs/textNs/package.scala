package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object textNs {
  import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XDispatchProvider
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XTableColumns
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XTableRows
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XSortable

  /** provides access to groups of text blocks. */
  type AutoTextContainer = XAutoTextContainer2
  /** provides access to language dependent numbering types and supports formatting of those numberings. */
  type DefaultNumberingProvider = XDefaultNumberingProvider
  /**
    * This service provides access to the structure of the levels of document indexes.
    *
    * The element type is Sequence< PropertyValues >. Each element in this sequence represents a member of an index line. The following properties are part
    * of such an element.
    *
    *
    *
    * TokenType
    *
    *
    *
    * Values:
    *
    *
    *
    * TokenEntryNumber - chapter number, used in content indexes only
    *
    *
    *
    * TokenEntryText - text of the entry
    *
    *
    *
    * TokenTabStop - tab stop
    *
    *
    *
    * TokenText - user defined text
    *
    *
    *
    * TokenPageNumber - page number
    *
    *
    *
    * TokenChapterInfo - chapter info, in illustration indexes, table indexes, user indexes, table of objects and alphabetical indexes only
    *
    *
    *
    * TokenHyperlinkStart - start of a hyperlink
    *
    *
    *
    * TokenHyperlinkEnd - end of a hyperlink
    *
    *
    *
    * TokenBibliographyDataField - bibliographic data field
    *
    *
    *
    * CharacterStyleName
    *
    *
    *
    * Name of the character style applied to the element. Invalid in tab stops.
    *
    *
    *
    * TabStopRightAligned
    *
    *
    *
    * Tab stop is right aligned. Only valid for tab stops.
    *
    *
    *
    * TabStopPosition
    *
    *
    *
    * Position of the tab stop. Only valid for tab stops.
    *
    *
    *
    * TabStopFillCharacter
    *
    *
    *
    * Fill character in tab stops. Only valid for tab stops.
    *
    *
    *
    * WithTab
    *
    *
    *
    * If true insert tab character.
    *
    *
    *
    * {@link Text}
    *
    *
    *
    * {@link Text} . Only valid in user defined text.
    *
    *
    *
    * {@link ChapterFormat}
    *
    *
    *
    * Valid in chapter info and entry number only. See {@link ChapterFormat} .
    *
    *
    *
    * Other information.
    *
    *
    *
    * In chapter info only {@link com.sun.star.text.ChapterFormat.NUMBER} , {@link com.sun.star.text.ChapterFormat.NAME} , and {@link
    * com.sun.star.text.ChapterFormat.NAME_NUMBER} constants are allowed.
    *
    *
    *
    * In entry number only {@link com.sun.star.text.ChapterFormat.NUMBER} and {@link com.sun.star.text.ChapterFormat.DIGIT} constants are allowed.
    *
    *
    *
    * ChapterLevel
    *
    *
    *
    * Valid in chapter info and entry number only. Denotes the level up to which the chapter information is given. Values permitted 1 to 10 inclusive.
    */
  type DocumentIndexLevelFormat = XIndexReplace
  /** provides access to the names of paragraph styles that are included in content indexes of user defined indexes. The element type is sequence of string. */
  type DocumentIndexParagraphStyles = XIndexReplace
  /** This service specifies a an endnote in a {@link TextDocument} . */
  type Endnote = Footnote
  /** provides access to the settings of footnotes or endnotes in a (text) document. */
  type EndnoteSettings = FootnoteSettings
  /** provides access to the footnotes or endnotes of a (text) document. */
  type Footnotes = XIndexAccess
  /**
    * Specify the document service of the global text module.
    * @deprecated Deprecated
    */
  type GlobalDocument = GenericTextDocument
  /** @since LibreOffice 4.1 */
  type ModuleDispatcher = XDispatchProvider
  /** provides access to the paragraphs of an {@link XText} interface. */
  type ParagraphEnumeration = XEnumeration
  /**
    * represents a collection of all columns of a table.
    * @see com.sun.star.table.TableColumn
    * @see com.sun.star.text.TextTable
    * @since OOo 1.1.2
    */
  type TableColumns = XTableColumns
  /**
    * represents a collection of all rows of a text table.
    * @see com.sun.star.table.TableRow
    * @see com.sun.star.text.TextTable
    * @since OOo 1.1.2
    */
  type TableRows = XTableRows
  type TextColumnSequence = SeqEquiv[TextColumn]
  /** Specify the document service of the text module. */
  type TextDocument = GenericTextDocument
  /** This interface creates an enumeration of all text fields within a text document. */
  type TextFieldEnumeration = XEnumeration
  /** This is a collection of instances of {@link TextFieldMaster} , defined in a context (e.g. in a document). */
  type TextFieldMasters = XNameAccess
  /**
    * This interface creates an enumeration of paragraph within a text document. The elements created by this enumeration contains either parts of text with
    * equal properties or text content elements like text fields, reference marks or bookmarks.
    */
  type TextPortionEnumeration = XEnumeration
  /** provides a container for {@link XTextRange} objects. */
  type TextRanges = XIndexAccess
  /**
    * provides an interface for sorting.
    * @deprecated Deprecated
    * @since OOo 1.1.2
    */
  type TextSortable = XSortable
  /**
    * Specify the document service of the web module.
    * @deprecated Deprecated
    */
  type WebDocument = GenericTextDocument
}
