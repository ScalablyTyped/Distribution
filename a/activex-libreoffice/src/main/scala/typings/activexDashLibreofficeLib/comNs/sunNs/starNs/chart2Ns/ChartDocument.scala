package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDocument
  extends XChartDocument
     with activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataReceiver
     with XTitled
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object ChartDocument {
  @scala.inline
  def apply(
    Args: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    ChartTypeManager: XChartTypeManager,
    CurrentController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    CurrentSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    DataProvider: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider,
    FirstDiagram: XDiagram,
    NumberFormatSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    NumberFormats: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormats,
    PageBackground: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    RangeHighlighter: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XRangeHighlighter,
    StyleFamilies: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    TitleObject: XTitle,
    URL: java.lang.String,
    UsedData: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource,
    UsedRangeRepresentations: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attachDataProvider: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider, 
      scala.Unit
    ],
    attachNumberFormatsSupplier: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier, 
      scala.Unit
    ],
    attachResource: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    connectController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    createDefaultChart: js.Function0[scala.Unit],
    createInternalDataProvider: js.Function1[scala.Boolean, scala.Unit],
    disconnectController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getArgs: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getChartTypeManager: js.Function0[XChartTypeManager],
    getCurrentController: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController],
    getCurrentSelection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getDataProvider: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider],
    getFirstDiagram: js.Function0[XDiagram],
    getNumberFormatSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getNumberFormats: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormats],
    getPageBackground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getRangeHighlighter: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XRangeHighlighter],
    getStyleFamilies: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getTitleObject: js.Function0[XTitle],
    getURL: js.Function0[java.lang.String],
    getUsedData: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource],
    getUsedRangeRepresentations: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    hasControllersLocked: js.Function0[scala.Boolean],
    hasInternalDataProvider: js.Function0[scala.Boolean],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    isOpenGLChart: js.Function0[scala.Boolean],
    lockControllers: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setArguments: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    setChartTypeManager: js.Function1[XChartTypeManager, scala.Unit],
    setCurrentController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    setFirstDiagram: js.Function1[XDiagram, scala.Unit],
    setTitleObject: js.Function1[XTitle, scala.Unit],
    unlockControllers: js.Function0[scala.Unit]
  ): ChartDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Args")(Args)
    __obj.updateDynamic("ChartTypeManager")(ChartTypeManager)
    __obj.updateDynamic("CurrentController")(CurrentController)
    __obj.updateDynamic("CurrentSelection")(CurrentSelection)
    __obj.updateDynamic("DataProvider")(DataProvider)
    __obj.updateDynamic("FirstDiagram")(FirstDiagram)
    __obj.updateDynamic("NumberFormatSettings")(NumberFormatSettings)
    __obj.updateDynamic("NumberFormats")(NumberFormats)
    __obj.updateDynamic("PageBackground")(PageBackground)
    __obj.updateDynamic("RangeHighlighter")(RangeHighlighter)
    __obj.updateDynamic("StyleFamilies")(StyleFamilies)
    __obj.updateDynamic("TitleObject")(TitleObject)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("UsedData")(UsedData)
    __obj.updateDynamic("UsedRangeRepresentations")(UsedRangeRepresentations)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("attachDataProvider")(attachDataProvider)
    __obj.updateDynamic("attachNumberFormatsSupplier")(attachNumberFormatsSupplier)
    __obj.updateDynamic("attachResource")(attachResource)
    __obj.updateDynamic("connectController")(connectController)
    __obj.updateDynamic("createDefaultChart")(createDefaultChart)
    __obj.updateDynamic("createInternalDataProvider")(createInternalDataProvider)
    __obj.updateDynamic("disconnectController")(disconnectController)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getArgs")(getArgs)
    __obj.updateDynamic("getChartTypeManager")(getChartTypeManager)
    __obj.updateDynamic("getCurrentController")(getCurrentController)
    __obj.updateDynamic("getCurrentSelection")(getCurrentSelection)
    __obj.updateDynamic("getDataProvider")(getDataProvider)
    __obj.updateDynamic("getFirstDiagram")(getFirstDiagram)
    __obj.updateDynamic("getNumberFormatSettings")(getNumberFormatSettings)
    __obj.updateDynamic("getNumberFormats")(getNumberFormats)
    __obj.updateDynamic("getPageBackground")(getPageBackground)
    __obj.updateDynamic("getRangeHighlighter")(getRangeHighlighter)
    __obj.updateDynamic("getStyleFamilies")(getStyleFamilies)
    __obj.updateDynamic("getTitleObject")(getTitleObject)
    __obj.updateDynamic("getURL")(getURL)
    __obj.updateDynamic("getUsedData")(getUsedData)
    __obj.updateDynamic("getUsedRangeRepresentations")(getUsedRangeRepresentations)
    __obj.updateDynamic("hasControllersLocked")(hasControllersLocked)
    __obj.updateDynamic("hasInternalDataProvider")(hasInternalDataProvider)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isOpenGLChart")(isOpenGLChart)
    __obj.updateDynamic("lockControllers")(lockControllers)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setArguments")(setArguments)
    __obj.updateDynamic("setChartTypeManager")(setChartTypeManager)
    __obj.updateDynamic("setCurrentController")(setCurrentController)
    __obj.updateDynamic("setFirstDiagram")(setFirstDiagram)
    __obj.updateDynamic("setTitleObject")(setTitleObject)
    __obj.updateDynamic("unlockControllers")(unlockControllers)
    __obj.asInstanceOf[ChartDocument]
  }
}

