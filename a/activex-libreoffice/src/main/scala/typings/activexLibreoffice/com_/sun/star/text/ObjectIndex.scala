package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XRefreshListener
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
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], ContentSection = ContentSection.asInstanceOf[js.Any], CreateFromChapter = CreateFromChapter.asInstanceOf[js.Any], CreateFromOtherEmbeddedObjects = CreateFromOtherEmbeddedObjects.asInstanceOf[js.Any], CreateFromStarCalc = CreateFromStarCalc.asInstanceOf[js.Any], CreateFromStarChart = CreateFromStarChart.asInstanceOf[js.Any], CreateFromStarDraw = CreateFromStarDraw.asInstanceOf[js.Any], CreateFromStarImage = CreateFromStarImage.asInstanceOf[js.Any], CreateFromStarMath = CreateFromStarMath.asInstanceOf[js.Any], HeaderSection = HeaderSection.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], LevelFormat = LevelFormat.asInstanceOf[js.Any], ParaStyleHeading = ParaStyleHeading.asInstanceOf[js.Any], ParaStyleLevel1 = ParaStyleLevel1.asInstanceOf[js.Any], ParaStyleLevel10 = ParaStyleLevel10.asInstanceOf[js.Any], ParaStyleLevel2 = ParaStyleLevel2.asInstanceOf[js.Any], ParaStyleLevel3 = ParaStyleLevel3.asInstanceOf[js.Any], ParaStyleLevel4 = ParaStyleLevel4.asInstanceOf[js.Any], ParaStyleLevel5 = ParaStyleLevel5.asInstanceOf[js.Any], ParaStyleLevel6 = ParaStyleLevel6.asInstanceOf[js.Any], ParaStyleLevel7 = ParaStyleLevel7.asInstanceOf[js.Any], ParaStyleLevel8 = ParaStyleLevel8.asInstanceOf[js.Any], ParaStyleLevel9 = ParaStyleLevel9.asInstanceOf[js.Any], ParaStyleSeparator = ParaStyleSeparator.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[ObjectIndex]
  }
}

