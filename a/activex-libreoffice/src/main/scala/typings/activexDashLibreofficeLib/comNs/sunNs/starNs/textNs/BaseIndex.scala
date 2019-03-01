package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable {
  /** specifies the color of the background. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the filter of the graphic file that is displayed as background graphic */
  var BackGraphicFilter: java.lang.String
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL of a graphic file that is displayed as background graphic */
  var BackGraphicURL: java.lang.String
  /** If `TRUE` , the background color value in "BackColor" is not visible. */
  var BackTransparent: scala.Boolean
  /** the text section containing the content of the index */
  var ContentSection: XTextSection
  /**
    * determines if the content of the document index is created from the complete document content or from the current chapter only.
    *
    * It is not available in the bibliography
    */
  var CreateFromChapter: scala.Boolean
  /** the text section containing the header of the index */
  var HeaderSection: XTextSection
  /** determines if the index is protected. */
  var IsProtected: scala.Boolean
  /**
    * returns the interface of the level format of the index.
    *
    * The description of the format of the levels depends on the type of the document index.
    * @see DocumentIndexLevelFormat
    */
  var LevelFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
  /** contains the name of the paragraph style that is applied to the heading. */
  var ParaStyleHeading: java.lang.String
  /** contains the name of the paragraph style that is applied to the 1st level. */
  var ParaStyleLevel1: java.lang.String
  /** contains the name of the paragraph style that is applied to the 10th level. */
  var ParaStyleLevel10: java.lang.String
  /** contains the name of the paragraph style that is applied to the 2nd level. */
  var ParaStyleLevel2: java.lang.String
  /** contains the name of the paragraph style that is applied to the 3rd level. */
  var ParaStyleLevel3: java.lang.String
  /** contains the name of the paragraph style that is applied to the 4th level. */
  var ParaStyleLevel4: java.lang.String
  /** contains the name of the paragraph style that is applied to the 5th level. */
  var ParaStyleLevel5: java.lang.String
  /** contains the name of the paragraph style that is applied to the 6th level. */
  var ParaStyleLevel6: java.lang.String
  /** contains the name of the paragraph style that is applied to the 7th level. */
  var ParaStyleLevel7: java.lang.String
  /** contains the name of the paragraph style that is applied to the 8th level. */
  var ParaStyleLevel8: java.lang.String
  /** contains the name of the paragraph style that is applied to the 9th level. */
  var ParaStyleLevel9: java.lang.String
  /** contains the name of the paragraph style that is applied to the separator level. */
  var ParaStyleSeparator: java.lang.String
  /** contains the column interface. */
  var TextColumns: XTextColumns
  /** contains the title of the index. */
  var Title: java.lang.String
}

object BaseIndex {
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
    HeaderSection: XTextSection,
    IsProtected: scala.Boolean,
    LevelFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace,
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
  ): BaseIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("BackColor")(BackColor)
    __obj.updateDynamic("BackGraphicFilter")(BackGraphicFilter)
    __obj.updateDynamic("BackGraphicLocation")(BackGraphicLocation)
    __obj.updateDynamic("BackGraphicURL")(BackGraphicURL)
    __obj.updateDynamic("BackTransparent")(BackTransparent)
    __obj.updateDynamic("ContentSection")(ContentSection)
    __obj.updateDynamic("CreateFromChapter")(CreateFromChapter)
    __obj.updateDynamic("HeaderSection")(HeaderSection)
    __obj.updateDynamic("IsProtected")(IsProtected)
    __obj.updateDynamic("LevelFormat")(LevelFormat)
    __obj.updateDynamic("ParaStyleHeading")(ParaStyleHeading)
    __obj.updateDynamic("ParaStyleLevel1")(ParaStyleLevel1)
    __obj.updateDynamic("ParaStyleLevel10")(ParaStyleLevel10)
    __obj.updateDynamic("ParaStyleLevel2")(ParaStyleLevel2)
    __obj.updateDynamic("ParaStyleLevel3")(ParaStyleLevel3)
    __obj.updateDynamic("ParaStyleLevel4")(ParaStyleLevel4)
    __obj.updateDynamic("ParaStyleLevel5")(ParaStyleLevel5)
    __obj.updateDynamic("ParaStyleLevel6")(ParaStyleLevel6)
    __obj.updateDynamic("ParaStyleLevel7")(ParaStyleLevel7)
    __obj.updateDynamic("ParaStyleLevel8")(ParaStyleLevel8)
    __obj.updateDynamic("ParaStyleLevel9")(ParaStyleLevel9)
    __obj.updateDynamic("ParaStyleSeparator")(ParaStyleSeparator)
    __obj.updateDynamic("ServiceName")(ServiceName)
    __obj.updateDynamic("TextColumns")(TextColumns)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addRefreshListener")(addRefreshListener)
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAnchor")(getAnchor)
    __obj.updateDynamic("getServiceName")(getServiceName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeRefreshListener")(removeRefreshListener)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[BaseIndex]
  }
}

