package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of content indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait DocumentIndex extends BaseIndex {
  /** contains all index marks that are related to this index. */
  var DocumentIndexMarks: SafeArray[XDocumentIndexMark]
  /** determines if the similarity of index entries is checked case sensitively. */
  var IsCaseSensitive: Boolean
  /** contains the locale of the index. */
  var Locale: typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
  /** determines the name of the character style that is applied to the number of a page where main index entry is located. */
  var MainEntryCharacterStyleName: String
  /** contains the name of the sort algorithm that is used to sort the entries. */
  var SortAlgorithm: String
  /** determines if alphabetical separators are generated. */
  var UseAlphabeticalSeparators: Boolean
  /** determines if same entries on different pages are combined into one index entry. */
  var UseCombinedEntries: Boolean
  /** determines if following page numbers are displayed using a dash. */
  var UseDash: Boolean
  /** determines if a index entry is generated for each primary/secondary key. */
  var UseKeyAsEntry: Boolean
  /** determines if following page numbers are displayed using a "pp.". */
  var UsePP: Boolean
  /** determines if all entries start with a capital letter. */
  var UseUpperCase: Boolean
}

object DocumentIndex {
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
    DocumentIndexMarks: SafeArray[XDocumentIndexMark],
    HeaderSection: XTextSection,
    IsCaseSensitive: Boolean,
    IsProtected: Boolean,
    LevelFormat: XIndexReplace,
    Locale: Locale,
    MainEntryCharacterStyleName: String,
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
    SortAlgorithm: String,
    TextColumns: XTextColumns,
    Title: String,
    UseAlphabeticalSeparators: Boolean,
    UseCombinedEntries: Boolean,
    UseDash: Boolean,
    UseKeyAsEntry: Boolean,
    UsePP: Boolean,
    UseUpperCase: Boolean,
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
  ): DocumentIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, ContentSection = ContentSection, CreateFromChapter = CreateFromChapter, DocumentIndexMarks = DocumentIndexMarks, HeaderSection = HeaderSection, IsCaseSensitive = IsCaseSensitive, IsProtected = IsProtected, LevelFormat = LevelFormat, Locale = Locale, MainEntryCharacterStyleName = MainEntryCharacterStyleName, ParaStyleHeading = ParaStyleHeading, ParaStyleLevel1 = ParaStyleLevel1, ParaStyleLevel10 = ParaStyleLevel10, ParaStyleLevel2 = ParaStyleLevel2, ParaStyleLevel3 = ParaStyleLevel3, ParaStyleLevel4 = ParaStyleLevel4, ParaStyleLevel5 = ParaStyleLevel5, ParaStyleLevel6 = ParaStyleLevel6, ParaStyleLevel7 = ParaStyleLevel7, ParaStyleLevel8 = ParaStyleLevel8, ParaStyleLevel9 = ParaStyleLevel9, ParaStyleSeparator = ParaStyleSeparator, ServiceName = ServiceName, SortAlgorithm = SortAlgorithm, TextColumns = TextColumns, Title = Title, UseAlphabeticalSeparators = UseAlphabeticalSeparators, UseCombinedEntries = UseCombinedEntries, UseDash = UseDash, UseKeyAsEntry = UseKeyAsEntry, UsePP = UsePP, UseUpperCase = UseUpperCase, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[DocumentIndex]
  }
}

