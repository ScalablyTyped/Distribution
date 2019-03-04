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
    val __obj = js.Dynamic.literal(Args = Args, ChartTypeManager = ChartTypeManager, CurrentController = CurrentController, CurrentSelection = CurrentSelection, DataProvider = DataProvider, FirstDiagram = FirstDiagram, NumberFormatSettings = NumberFormatSettings, NumberFormats = NumberFormats, PageBackground = PageBackground, RangeHighlighter = RangeHighlighter, StyleFamilies = StyleFamilies, TitleObject = TitleObject, URL = URL, UsedData = UsedData, UsedRangeRepresentations = UsedRangeRepresentations, acquire = acquire, addEventListener = addEventListener, attachDataProvider = attachDataProvider, attachNumberFormatsSupplier = attachNumberFormatsSupplier, attachResource = attachResource, connectController = connectController, createDefaultChart = createDefaultChart, createInternalDataProvider = createInternalDataProvider, disconnectController = disconnectController, dispose = dispose, getArgs = getArgs, getChartTypeManager = getChartTypeManager, getCurrentController = getCurrentController, getCurrentSelection = getCurrentSelection, getDataProvider = getDataProvider, getFirstDiagram = getFirstDiagram, getNumberFormatSettings = getNumberFormatSettings, getNumberFormats = getNumberFormats, getPageBackground = getPageBackground, getRangeHighlighter = getRangeHighlighter, getStyleFamilies = getStyleFamilies, getTitleObject = getTitleObject, getURL = getURL, getUsedData = getUsedData, getUsedRangeRepresentations = getUsedRangeRepresentations, hasControllersLocked = hasControllersLocked, hasInternalDataProvider = hasInternalDataProvider, initialize = initialize, isOpenGLChart = isOpenGLChart, lockControllers = lockControllers, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setArguments = setArguments, setChartTypeManager = setChartTypeManager, setCurrentController = setCurrentController, setFirstDiagram = setFirstDiagram, setTitleObject = setTitleObject, unlockControllers = unlockControllers)
  
    __obj.asInstanceOf[ChartDocument]
  }
}

