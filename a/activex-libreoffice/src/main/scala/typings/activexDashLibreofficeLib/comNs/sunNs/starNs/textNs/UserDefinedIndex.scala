package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of user defined indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait UserDefinedIndex extends BaseIndex {
  /** determines if embedded objects are included in the index. */
  var CreateFromEmbeddedObjects: scala.Boolean
  /** determines if graphic objects are included in the index. */
  var CreateFromGraphicObjects: scala.Boolean
  /** determines if the document index marks are included in this index. */
  var CreateFromMarks: scala.Boolean
  /** determines if tables are included in the index. */
  var CreateFromTables: scala.Boolean
  /** determines if text frames are included in the index. */
  var CreateFromTextFrames: scala.Boolean
  /** contains all index marks that are related to this index. */
  var DocumentIndexMarks: activexDashInteropLib.SafeArray[XDocumentIndexMark]
  /**
    * contains the interface to access the paragraph style names that are included in this index.
    * @see DocumentIndexParagraphStyles
    */
  var LevelParagraphStyles: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
  /** determines if the outline level of the location of the indexed object is used as index level of the index entry. */
  var UseLevelFromSource: scala.Boolean
}

object UserDefinedIndex {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    ContentSection: XTextSection,
    CreateFromChapter: scala.Boolean,
    CreateFromEmbeddedObjects: scala.Boolean,
    CreateFromGraphicObjects: scala.Boolean,
    CreateFromMarks: scala.Boolean,
    CreateFromTables: scala.Boolean,
    CreateFromTextFrames: scala.Boolean,
    DocumentIndexMarks: activexDashInteropLib.SafeArray[XDocumentIndexMark],
    HeaderSection: XTextSection,
    IsProtected: scala.Boolean,
    LevelFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace,
    LevelParagraphStyles: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace,
    ParaStyleHeading: java.lang.String,
    ParaStyleLevel1: java.lang.String,
    ParaStyleLevel10: java.lang.String,
    ParaStyleLevel2: java.lang.String,
    ParaStyleLevel3: java.lang.String,
    ParaStyleLevel4: java.lang.String,
    ParaStyleLevel5: java.lang.String,
    ParaStyleLevel6: java.lang.String,
    ParaStyleLevel7: java.lang.String,
    ParaStyleLevel8: java.lang.String,
    ParaStyleLevel9: java.lang.String,
    ParaStyleSeparator: java.lang.String,
    ServiceName: java.lang.String,
    TextColumns: XTextColumns,
    Title: java.lang.String,
    UseLevelFromSource: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getServiceName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    update: js.Function0[scala.Unit]
  ): UserDefinedIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, ContentSection = ContentSection, CreateFromChapter = CreateFromChapter, CreateFromEmbeddedObjects = CreateFromEmbeddedObjects, CreateFromGraphicObjects = CreateFromGraphicObjects, CreateFromMarks = CreateFromMarks, CreateFromTables = CreateFromTables, CreateFromTextFrames = CreateFromTextFrames, DocumentIndexMarks = DocumentIndexMarks, HeaderSection = HeaderSection, IsProtected = IsProtected, LevelFormat = LevelFormat, LevelParagraphStyles = LevelParagraphStyles, ParaStyleHeading = ParaStyleHeading, ParaStyleLevel1 = ParaStyleLevel1, ParaStyleLevel10 = ParaStyleLevel10, ParaStyleLevel2 = ParaStyleLevel2, ParaStyleLevel3 = ParaStyleLevel3, ParaStyleLevel4 = ParaStyleLevel4, ParaStyleLevel5 = ParaStyleLevel5, ParaStyleLevel6 = ParaStyleLevel6, ParaStyleLevel7 = ParaStyleLevel7, ParaStyleLevel8 = ParaStyleLevel8, ParaStyleLevel9 = ParaStyleLevel9, ParaStyleSeparator = ParaStyleSeparator, ServiceName = ServiceName, TextColumns = TextColumns, Title = Title, UseLevelFromSource = UseLevelFromSource, acquire = acquire, addEventListener = addEventListener, addRefreshListener = addRefreshListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getServiceName = getServiceName, queryInterface = queryInterface, refresh = refresh, release = release, removeEventListener = removeEventListener, removeRefreshListener = removeRefreshListener, update = update)
  
    __obj.asInstanceOf[UserDefinedIndex]
  }
}

