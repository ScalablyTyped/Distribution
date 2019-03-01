package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of bibliography within a text document.
  * @see com.sun.star.text.BaseIndex
  */
trait Bibliography extends BaseIndex {
  /** contains the locale of the index. */
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** contains the name of the sort algorithm that is used to sort the entries. */
  var SortAlgorithm: java.lang.String
}

object Bibliography {
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
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
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
  ): Bibliography = {
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
    __obj.updateDynamic("Locale")(Locale)
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
    __obj.updateDynamic("SortAlgorithm")(SortAlgorithm)
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
    __obj.asInstanceOf[Bibliography]
  }
}

