package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typings.activexLibreoffice.com_.sun.star.util.XRefreshable
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
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], ContentSection = ContentSection.asInstanceOf[js.Any], CreateFromChapter = CreateFromChapter.asInstanceOf[js.Any], HeaderSection = HeaderSection.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], LevelFormat = LevelFormat.asInstanceOf[js.Any], ParaStyleHeading = ParaStyleHeading.asInstanceOf[js.Any], ParaStyleLevel1 = ParaStyleLevel1.asInstanceOf[js.Any], ParaStyleLevel10 = ParaStyleLevel10.asInstanceOf[js.Any], ParaStyleLevel2 = ParaStyleLevel2.asInstanceOf[js.Any], ParaStyleLevel3 = ParaStyleLevel3.asInstanceOf[js.Any], ParaStyleLevel4 = ParaStyleLevel4.asInstanceOf[js.Any], ParaStyleLevel5 = ParaStyleLevel5.asInstanceOf[js.Any], ParaStyleLevel6 = ParaStyleLevel6.asInstanceOf[js.Any], ParaStyleLevel7 = ParaStyleLevel7.asInstanceOf[js.Any], ParaStyleLevel8 = ParaStyleLevel8.asInstanceOf[js.Any], ParaStyleLevel9 = ParaStyleLevel9.asInstanceOf[js.Any], ParaStyleSeparator = ParaStyleSeparator.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[BaseIndex]
  }
}

