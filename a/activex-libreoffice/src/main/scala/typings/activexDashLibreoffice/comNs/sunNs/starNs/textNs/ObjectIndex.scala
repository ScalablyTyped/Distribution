package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of object indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait ObjectIndex extends BaseIndex {
  /** Determines if external embedded objects are included in the office. */
  var CreateFromOtherEmbeddedObjects: Boolean
  /** Determines if star office calc objects are included in the office. */
  var CreateFromStarCalc: Boolean
  /** Determines if star office chart objects are included in the office. */
  var CreateFromStarChart: Boolean
  /** Determines if star office draw objects are included in the office. */
  var CreateFromStarDraw: Boolean
  /** Determines if star office image objects are included in the office. */
  var CreateFromStarImage: Boolean
  /** Determines if star office math objects are included in the office. */
  var CreateFromStarMath: Boolean
}

object ObjectIndex {
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
    CreateFromOtherEmbeddedObjects: Boolean,
    CreateFromStarCalc: Boolean,
    CreateFromStarChart: Boolean,
    CreateFromStarDraw: Boolean,
    CreateFromStarImage: Boolean,
    CreateFromStarMath: Boolean,
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
  ): ObjectIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, ContentSection = ContentSection, CreateFromChapter = CreateFromChapter, CreateFromOtherEmbeddedObjects = CreateFromOtherEmbeddedObjects, CreateFromStarCalc = CreateFromStarCalc, CreateFromStarChart = CreateFromStarChart, CreateFromStarDraw = CreateFromStarDraw, CreateFromStarImage = CreateFromStarImage, CreateFromStarMath = CreateFromStarMath, HeaderSection = HeaderSection, IsProtected = IsProtected, LevelFormat = LevelFormat, ParaStyleHeading = ParaStyleHeading, ParaStyleLevel1 = ParaStyleLevel1, ParaStyleLevel10 = ParaStyleLevel10, ParaStyleLevel2 = ParaStyleLevel2, ParaStyleLevel3 = ParaStyleLevel3, ParaStyleLevel4 = ParaStyleLevel4, ParaStyleLevel5 = ParaStyleLevel5, ParaStyleLevel6 = ParaStyleLevel6, ParaStyleLevel7 = ParaStyleLevel7, ParaStyleLevel8 = ParaStyleLevel8, ParaStyleLevel9 = ParaStyleLevel9, ParaStyleSeparator = ParaStyleSeparator, ServiceName = ServiceName, TextColumns = TextColumns, Title = Title, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[ObjectIndex]
  }
}

