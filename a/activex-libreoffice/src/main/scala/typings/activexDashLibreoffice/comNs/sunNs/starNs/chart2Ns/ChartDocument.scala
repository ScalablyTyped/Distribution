package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataReceiver
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XRangeHighlighter
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XNumberFormats
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartDocument
  extends XChartDocument
     with XDataReceiver
     with XTitled
     with XStyleFamiliesSupplier
     with XNumberFormatsSupplier
     with XInitialization

object ChartDocument {
  @scala.inline
  def apply(
    Args: SafeArray[PropertyValue],
    ChartTypeManager: XChartTypeManager,
    CurrentController: XController,
    CurrentSelection: XInterface,
    DataProvider: XDataProvider,
    FirstDiagram: XDiagram,
    NumberFormatSettings: XPropertySet,
    NumberFormats: XNumberFormats,
    PageBackground: XPropertySet,
    RangeHighlighter: XRangeHighlighter,
    StyleFamilies: XNameAccess,
    TitleObject: XTitle,
    URL: String,
    UsedData: XDataSource,
    UsedRangeRepresentations: SafeArray[String],
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attachDataProvider: XDataProvider => Unit,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => Unit,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Unit,
    createDefaultChart: () => Unit,
    createInternalDataProvider: Boolean => Unit,
    disconnectController: XController => Unit,
    dispose: () => Unit,
    getArgs: () => SafeArray[PropertyValue],
    getChartTypeManager: () => XChartTypeManager,
    getCurrentController: () => XController,
    getCurrentSelection: () => XInterface,
    getDataProvider: () => XDataProvider,
    getFirstDiagram: () => XDiagram,
    getNumberFormatSettings: () => XPropertySet,
    getNumberFormats: () => XNumberFormats,
    getPageBackground: () => XPropertySet,
    getRangeHighlighter: () => XRangeHighlighter,
    getStyleFamilies: () => XNameAccess,
    getTitleObject: () => XTitle,
    getURL: () => String,
    getUsedData: () => XDataSource,
    getUsedRangeRepresentations: () => SafeArray[String],
    hasControllersLocked: () => Boolean,
    hasInternalDataProvider: () => Boolean,
    initialize: SeqEquiv[_] => Unit,
    isOpenGLChart: () => Boolean,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setArguments: SeqEquiv[PropertyValue] => Unit,
    setChartTypeManager: XChartTypeManager => Unit,
    setCurrentController: XController => Unit,
    setFirstDiagram: XDiagram => Unit,
    setTitleObject: XTitle => Unit,
    unlockControllers: () => Unit
  ): ChartDocument = {
    val __obj = js.Dynamic.literal(Args = Args, ChartTypeManager = ChartTypeManager, CurrentController = CurrentController, CurrentSelection = CurrentSelection, DataProvider = DataProvider, FirstDiagram = FirstDiagram, NumberFormatSettings = NumberFormatSettings, NumberFormats = NumberFormats, PageBackground = PageBackground, RangeHighlighter = RangeHighlighter, StyleFamilies = StyleFamilies, TitleObject = TitleObject, URL = URL, UsedData = UsedData, UsedRangeRepresentations = UsedRangeRepresentations, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachDataProvider = js.Any.fromFunction1(attachDataProvider), attachNumberFormatsSupplier = js.Any.fromFunction1(attachNumberFormatsSupplier), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), createDefaultChart = js.Any.fromFunction0(createDefaultChart), createInternalDataProvider = js.Any.fromFunction1(createInternalDataProvider), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArgs = js.Any.fromFunction0(getArgs), getChartTypeManager = js.Any.fromFunction0(getChartTypeManager), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getDataProvider = js.Any.fromFunction0(getDataProvider), getFirstDiagram = js.Any.fromFunction0(getFirstDiagram), getNumberFormatSettings = js.Any.fromFunction0(getNumberFormatSettings), getNumberFormats = js.Any.fromFunction0(getNumberFormats), getPageBackground = js.Any.fromFunction0(getPageBackground), getRangeHighlighter = js.Any.fromFunction0(getRangeHighlighter), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), getTitleObject = js.Any.fromFunction0(getTitleObject), getURL = js.Any.fromFunction0(getURL), getUsedData = js.Any.fromFunction0(getUsedData), getUsedRangeRepresentations = js.Any.fromFunction0(getUsedRangeRepresentations), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), hasInternalDataProvider = js.Any.fromFunction0(hasInternalDataProvider), initialize = js.Any.fromFunction1(initialize), isOpenGLChart = js.Any.fromFunction0(isOpenGLChart), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setArguments = js.Any.fromFunction1(setArguments), setChartTypeManager = js.Any.fromFunction1(setChartTypeManager), setCurrentController = js.Any.fromFunction1(setCurrentController), setFirstDiagram = js.Any.fromFunction1(setFirstDiagram), setTitleObject = js.Any.fromFunction1(setTitleObject), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[ChartDocument]
  }
}

