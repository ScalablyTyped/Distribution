package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the basic service of different indexes within a document.
  * @see com.sun.star.text.DocumentIndex
  * @see com.sun.star.text.ContentIndex
  * @see com.sun.star.text.UserDefinedIndex
  * @see com.sun.star.text.IllustrationsIndex
  * @see com.sun.star.text.TableIndex
  * @see com.sun.star.text.ObjectIndex
  */
trait BaseIndex
  extends XDocumentIndex
     with XRefreshable {
  /** specifies the color of the background. */
  var BackColor: Color
  /** contains the name of the filter of the graphic file that is displayed as background graphic */
  var BackGraphicFilter: String
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: GraphicLocation
  /** contains the URL of a graphic file that is displayed as background graphic */
  var BackGraphicURL: String
  /** If `TRUE` , the background color value in "BackColor" is not visible. */
  var BackTransparent: Boolean
  /** the text section containing the content of the index */
  var ContentSection: XTextSection
  /**
    * determines if the content of the document index is created from the complete document content or from the current chapter only.
    *
    * It is not available in the bibliography
    */
  var CreateFromChapter: Boolean
  /** the text section containing the header of the index */
  var HeaderSection: XTextSection
  /** determines if the index is protected. */
  var IsProtected: Boolean
  /**
    * returns the interface of the level format of the index.
    *
    * The description of the format of the levels depends on the type of the document index.
    * @see DocumentIndexLevelFormat
    */
  var LevelFormat: XIndexReplace
  /** contains the name of the paragraph style that is applied to the heading. */
  var ParaStyleHeading: String
  /** contains the name of the paragraph style that is applied to the 1st level. */
  var ParaStyleLevel1: String
  /** contains the name of the paragraph style that is applied to the 10th level. */
  var ParaStyleLevel10: String
  /** contains the name of the paragraph style that is applied to the 2nd level. */
  var ParaStyleLevel2: String
  /** contains the name of the paragraph style that is applied to the 3rd level. */
  var ParaStyleLevel3: String
  /** contains the name of the paragraph style that is applied to the 4th level. */
  var ParaStyleLevel4: String
  /** contains the name of the paragraph style that is applied to the 5th level. */
  var ParaStyleLevel5: String
  /** contains the name of the paragraph style that is applied to the 6th level. */
  var ParaStyleLevel6: String
  /** contains the name of the paragraph style that is applied to the 7th level. */
  var ParaStyleLevel7: String
  /** contains the name of the paragraph style that is applied to the 8th level. */
  var ParaStyleLevel8: String
  /** contains the name of the paragraph style that is applied to the 9th level. */
  var ParaStyleLevel9: String
  /** contains the name of the paragraph style that is applied to the separator level. */
  var ParaStyleSeparator: String
  /** contains the column interface. */
  var TextColumns: XTextColumns
  /** contains the title of the index. */
  var Title: String
}

object BaseIndex {
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
    HeaderSection: XTextSection,
    IsProtected: Boolean,
    LevelFormat: XIndexReplace,
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
  ): BaseIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, ContentSection = ContentSection, CreateFromChapter = CreateFromChapter, HeaderSection = HeaderSection, IsProtected = IsProtected, LevelFormat = LevelFormat, ParaStyleHeading = ParaStyleHeading, ParaStyleLevel1 = ParaStyleLevel1, ParaStyleLevel10 = ParaStyleLevel10, ParaStyleLevel2 = ParaStyleLevel2, ParaStyleLevel3 = ParaStyleLevel3, ParaStyleLevel4 = ParaStyleLevel4, ParaStyleLevel5 = ParaStyleLevel5, ParaStyleLevel6 = ParaStyleLevel6, ParaStyleLevel7 = ParaStyleLevel7, ParaStyleLevel8 = ParaStyleLevel8, ParaStyleLevel9 = ParaStyleLevel9, ParaStyleSeparator = ParaStyleSeparator, ServiceName = ServiceName, TextColumns = TextColumns, Title = Title, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[BaseIndex]
  }
}

