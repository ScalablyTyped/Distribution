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
    Args: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
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
    UsedRangeRepresentations: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attachDataProvider: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider => scala.Unit,
    attachNumberFormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier => scala.Unit,
    attachResource: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Boolean,
    connectController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    createDefaultChart: () => scala.Unit,
    createInternalDataProvider: scala.Boolean => scala.Unit,
    disconnectController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    dispose: () => scala.Unit,
    getArgs: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getChartTypeManager: () => XChartTypeManager,
    getCurrentController: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    getCurrentSelection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getDataProvider: () => activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider,
    getFirstDiagram: () => XDiagram,
    getNumberFormatSettings: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getNumberFormats: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormats,
    getPageBackground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getRangeHighlighter: () => activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XRangeHighlighter,
    getStyleFamilies: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getTitleObject: () => XTitle,
    getURL: () => java.lang.String,
    getUsedData: () => activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource,
    getUsedRangeRepresentations: () => stdLib.SafeArray[java.lang.String],
    hasControllersLocked: () => scala.Boolean,
    hasInternalDataProvider: () => scala.Boolean,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    isOpenGLChart: () => scala.Boolean,
    lockControllers: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Unit,
    setChartTypeManager: XChartTypeManager => scala.Unit,
    setCurrentController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    setFirstDiagram: XDiagram => scala.Unit,
    setTitleObject: XTitle => scala.Unit,
    unlockControllers: () => scala.Unit
  ): ChartDocument = {
    val __obj = js.Dynamic.literal(Args = Args, ChartTypeManager = ChartTypeManager, CurrentController = CurrentController, CurrentSelection = CurrentSelection, DataProvider = DataProvider, FirstDiagram = FirstDiagram, NumberFormatSettings = NumberFormatSettings, NumberFormats = NumberFormats, PageBackground = PageBackground, RangeHighlighter = RangeHighlighter, StyleFamilies = StyleFamilies, TitleObject = TitleObject, URL = URL, UsedData = UsedData, UsedRangeRepresentations = UsedRangeRepresentations, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachDataProvider = js.Any.fromFunction1(attachDataProvider), attachNumberFormatsSupplier = js.Any.fromFunction1(attachNumberFormatsSupplier), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), createDefaultChart = js.Any.fromFunction0(createDefaultChart), createInternalDataProvider = js.Any.fromFunction1(createInternalDataProvider), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArgs = js.Any.fromFunction0(getArgs), getChartTypeManager = js.Any.fromFunction0(getChartTypeManager), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getDataProvider = js.Any.fromFunction0(getDataProvider), getFirstDiagram = js.Any.fromFunction0(getFirstDiagram), getNumberFormatSettings = js.Any.fromFunction0(getNumberFormatSettings), getNumberFormats = js.Any.fromFunction0(getNumberFormats), getPageBackground = js.Any.fromFunction0(getPageBackground), getRangeHighlighter = js.Any.fromFunction0(getRangeHighlighter), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), getTitleObject = js.Any.fromFunction0(getTitleObject), getURL = js.Any.fromFunction0(getURL), getUsedData = js.Any.fromFunction0(getUsedData), getUsedRangeRepresentations = js.Any.fromFunction0(getUsedRangeRepresentations), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), hasInternalDataProvider = js.Any.fromFunction0(hasInternalDataProvider), initialize = js.Any.fromFunction1(initialize), isOpenGLChart = js.Any.fromFunction0(isOpenGLChart), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setArguments = js.Any.fromFunction1(setArguments), setChartTypeManager = js.Any.fromFunction1(setChartTypeManager), setCurrentController = js.Any.fromFunction1(setCurrentController), setFirstDiagram = js.Any.fromFunction1(setFirstDiagram), setTitleObject = js.Any.fromFunction1(setTitleObject), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[ChartDocument]
  }
}

