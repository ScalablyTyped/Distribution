package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of content indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait DocumentIndex extends BaseIndex {
  /** contains all index marks that are related to this index. */
  var DocumentIndexMarks: stdLib.SafeArray[XDocumentIndexMark]
  /** determines if the similarity of index entries is checked case sensitively. */
  var IsCaseSensitive: scala.Boolean
  /** contains the locale of the index. */
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** determines the name of the character style that is applied to the number of a page where main index entry is located. */
  var MainEntryCharacterStyleName: java.lang.String
  /** contains the name of the sort algorithm that is used to sort the entries. */
  var SortAlgorithm: java.lang.String
  /** determines if alphabetical separators are generated. */
  var UseAlphabeticalSeparators: scala.Boolean
  /** determines if same entries on different pages are combined into one index entry. */
  var UseCombinedEntries: scala.Boolean
  /** determines if following page numbers are displayed using a dash. */
  var UseDash: scala.Boolean
  /** determines if a index entry is generated for each primary/secondary key. */
  var UseKeyAsEntry: scala.Boolean
  /** determines if following page numbers are displayed using a "pp.". */
  var UsePP: scala.Boolean
  /** determines if all entries start with a capital letter. */
  var UseUpperCase: scala.Boolean
}

object DocumentIndex {
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
    DocumentIndexMarks: stdLib.SafeArray[XDocumentIndexMark],
    HeaderSection: XTextSection,
    IsCaseSensitive: scala.Boolean,
    IsProtected: scala.Boolean,
    LevelFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    MainEntryCharacterStyleName: java.lang.String,
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
    SortAlgorithm: java.lang.String,
    TextColumns: XTextColumns,
    Title: java.lang.String,
    UseAlphabeticalSeparators: scala.Boolean,
    UseCombinedEntries: scala.Boolean,
    UseDash: scala.Boolean,
    UseKeyAsEntry: scala.Boolean,
    UsePP: scala.Boolean,
    UseUpperCase: scala.Boolean,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    attach: XTextRange => scala.Unit,
    dispose: () => scala.Unit,
    getAnchor: () => XTextRange,
    getServiceName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refresh: () => scala.Unit,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    update: () => scala.Unit
  ): DocumentIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, ContentSection = ContentSection, CreateFromChapter = CreateFromChapter, DocumentIndexMarks = DocumentIndexMarks, HeaderSection = HeaderSection, IsCaseSensitive = IsCaseSensitive, IsProtected = IsProtected, LevelFormat = LevelFormat, Locale = Locale, MainEntryCharacterStyleName = MainEntryCharacterStyleName, ParaStyleHeading = ParaStyleHeading, ParaStyleLevel1 = ParaStyleLevel1, ParaStyleLevel10 = ParaStyleLevel10, ParaStyleLevel2 = ParaStyleLevel2, ParaStyleLevel3 = ParaStyleLevel3, ParaStyleLevel4 = ParaStyleLevel4, ParaStyleLevel5 = ParaStyleLevel5, ParaStyleLevel6 = ParaStyleLevel6, ParaStyleLevel7 = ParaStyleLevel7, ParaStyleLevel8 = ParaStyleLevel8, ParaStyleLevel9 = ParaStyleLevel9, ParaStyleSeparator = ParaStyleSeparator, ServiceName = ServiceName, SortAlgorithm = SortAlgorithm, TextColumns = TextColumns, Title = Title, UseAlphabeticalSeparators = UseAlphabeticalSeparators, UseCombinedEntries = UseCombinedEntries, UseDash = UseDash, UseKeyAsEntry = UseKeyAsEntry, UsePP = UsePP, UseUpperCase = UseUpperCase, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[DocumentIndex]
  }
}

