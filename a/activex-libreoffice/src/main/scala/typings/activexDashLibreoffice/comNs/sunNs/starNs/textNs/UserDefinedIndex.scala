package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of user defined indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait UserDefinedIndex extends BaseIndex {
  /** determines if embedded objects are included in the index. */
  var CreateFromEmbeddedObjects: Boolean
  /** determines if graphic objects are included in the index. */
  var CreateFromGraphicObjects: Boolean
  /** determines if the document index marks are included in this index. */
  var CreateFromMarks: Boolean
  /** determines if tables are included in the index. */
  var CreateFromTables: Boolean
  /** determines if text frames are included in the index. */
  var CreateFromTextFrames: Boolean
  /** contains all index marks that are related to this index. */
  var DocumentIndexMarks: SafeArray[XDocumentIndexMark]
  /**
    * contains the interface to access the paragraph style names that are included in this index.
    * @see DocumentIndexParagraphStyles
    */
  var LevelParagraphStyles: XIndexReplace
  /** determines if the outline level of the location of the indexed object is used as index level of the index entry. */
  var UseLevelFromSource: Boolean
}

object UserDefinedIndex {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    ContentSection: XTextSection,
    CreateFromChapter: Boolean,
    CreateFromEmbeddedObjects: Boolean,
    CreateFromGraphicObjects: Boolean,
    CreateFromMarks: Boolean,
    CreateFromTables: Boolean,
    CreateFromTextFrames: Boolean,
    DocumentIndexMarks: SafeArray[XDocumentIndexMark],
    HeaderSection: XTextSection,
    IsProtected: Boolean,
    LevelFormat: XIndexReplace,
    LevelParagraphStyles: XIndexReplace,
    ParaStyleHeading: String,
    ParaStyleLevel1: String,
    ParaStyleLevel10: String,
    ParaStyleLevel2: String,
    ParaStyleLevel3: String,
    ParaStyleLevel4: String,
    ParaStyleLevel5: String,
    ParaStyleLevel6: String,
    ParaStyleLevel7: String,
    ParaStyleLevel8: String,
    ParaStyleLevel9: String,
    ParaStyleSeparator: String,
    ServiceName: String,
    TextColumns: XTextColumns,
    Title: String,
    UseLevelFromSource: Boolean,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addRefreshListener: XRefreshListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    update: () => Unit
  ): UserDefinedIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, ContentSection = ContentSection, CreateFromChapter = CreateFromChapter, CreateFromEmbeddedObjects = CreateFromEmbeddedObjects, CreateFromGraphicObjects = CreateFromGraphicObjects, CreateFromMarks = CreateFromMarks, CreateFromTables = CreateFromTables, CreateFromTextFrames = CreateFromTextFrames, DocumentIndexMarks = DocumentIndexMarks, HeaderSection = HeaderSection, IsProtected = IsProtected, LevelFormat = LevelFormat, LevelParagraphStyles = LevelParagraphStyles, ParaStyleHeading = ParaStyleHeading, ParaStyleLevel1 = ParaStyleLevel1, ParaStyleLevel10 = ParaStyleLevel10, ParaStyleLevel2 = ParaStyleLevel2, ParaStyleLevel3 = ParaStyleLevel3, ParaStyleLevel4 = ParaStyleLevel4, ParaStyleLevel5 = ParaStyleLevel5, ParaStyleLevel6 = ParaStyleLevel6, ParaStyleLevel7 = ParaStyleLevel7, ParaStyleLevel8 = ParaStyleLevel8, ParaStyleLevel9 = ParaStyleLevel9, ParaStyleSeparator = ParaStyleSeparator, ServiceName = ServiceName, TextColumns = TextColumns, Title = Title, UseLevelFromSource = UseLevelFromSource, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[UserDefinedIndex]
  }
}

