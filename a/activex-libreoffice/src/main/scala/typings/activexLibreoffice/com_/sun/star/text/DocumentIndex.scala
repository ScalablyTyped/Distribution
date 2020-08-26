package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of content indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
@js.native
trait DocumentIndex extends BaseIndex {
  /** contains all index marks that are related to this index. */
  var DocumentIndexMarks: SafeArray[XDocumentIndexMark] = js.native
  /** determines if the similarity of index entries is checked case sensitively. */
  var IsCaseSensitive: Boolean = js.native
  /** contains the locale of the index. */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /** determines the name of the character style that is applied to the number of a page where main index entry is located. */
  var MainEntryCharacterStyleName: String = js.native
  /** contains the name of the sort algorithm that is used to sort the entries. */
  var SortAlgorithm: String = js.native
  /** determines if alphabetical separators are generated. */
  var UseAlphabeticalSeparators: Boolean = js.native
  /** determines if same entries on different pages are combined into one index entry. */
  var UseCombinedEntries: Boolean = js.native
  /** determines if following page numbers are displayed using a dash. */
  var UseDash: Boolean = js.native
  /** determines if a index entry is generated for each primary/secondary key. */
  var UseKeyAsEntry: Boolean = js.native
  /** determines if following page numbers are displayed using a "pp.". */
  var UsePP: Boolean = js.native
  /** determines if all entries start with a capital letter. */
  var UseUpperCase: Boolean = js.native
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
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], ContentSection = ContentSection.asInstanceOf[js.Any], CreateFromChapter = CreateFromChapter.asInstanceOf[js.Any], DocumentIndexMarks = DocumentIndexMarks.asInstanceOf[js.Any], HeaderSection = HeaderSection.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], LevelFormat = LevelFormat.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], MainEntryCharacterStyleName = MainEntryCharacterStyleName.asInstanceOf[js.Any], ParaStyleHeading = ParaStyleHeading.asInstanceOf[js.Any], ParaStyleLevel1 = ParaStyleLevel1.asInstanceOf[js.Any], ParaStyleLevel10 = ParaStyleLevel10.asInstanceOf[js.Any], ParaStyleLevel2 = ParaStyleLevel2.asInstanceOf[js.Any], ParaStyleLevel3 = ParaStyleLevel3.asInstanceOf[js.Any], ParaStyleLevel4 = ParaStyleLevel4.asInstanceOf[js.Any], ParaStyleLevel5 = ParaStyleLevel5.asInstanceOf[js.Any], ParaStyleLevel6 = ParaStyleLevel6.asInstanceOf[js.Any], ParaStyleLevel7 = ParaStyleLevel7.asInstanceOf[js.Any], ParaStyleLevel8 = ParaStyleLevel8.asInstanceOf[js.Any], ParaStyleLevel9 = ParaStyleLevel9.asInstanceOf[js.Any], ParaStyleSeparator = ParaStyleSeparator.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], SortAlgorithm = SortAlgorithm.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], UseAlphabeticalSeparators = UseAlphabeticalSeparators.asInstanceOf[js.Any], UseCombinedEntries = UseCombinedEntries.asInstanceOf[js.Any], UseDash = UseDash.asInstanceOf[js.Any], UseKeyAsEntry = UseKeyAsEntry.asInstanceOf[js.Any], UsePP = UsePP.asInstanceOf[js.Any], UseUpperCase = UseUpperCase.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[DocumentIndex]
  }
  @scala.inline
  implicit class DocumentIndexOps[Self <: DocumentIndex] (val x: Self) extends AnyVal {
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
    def setDocumentIndexMarks(value: SafeArray[XDocumentIndexMark]): Self = this.set("DocumentIndexMarks", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = this.set("IsCaseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMainEntryCharacterStyleName(value: String): Self = this.set("MainEntryCharacterStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortAlgorithm(value: String): Self = this.set("SortAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseAlphabeticalSeparators(value: Boolean): Self = this.set("UseAlphabeticalSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCombinedEntries(value: Boolean): Self = this.set("UseCombinedEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseDash(value: Boolean): Self = this.set("UseDash", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseKeyAsEntry(value: Boolean): Self = this.set("UseKeyAsEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsePP(value: Boolean): Self = this.set("UsePP", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseUpperCase(value: Boolean): Self = this.set("UseUpperCase", value.asInstanceOf[js.Any])
  }
  
}

