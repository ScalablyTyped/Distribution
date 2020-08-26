package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataProvider
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataReceiver
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typings.activexLibreoffice.com_.sun.star.chart2.data.XRangeHighlighter
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.style.XStyleFamiliesSupplier
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormats
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], ChartTypeManager = ChartTypeManager.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], DataProvider = DataProvider.asInstanceOf[js.Any], FirstDiagram = FirstDiagram.asInstanceOf[js.Any], NumberFormatSettings = NumberFormatSettings.asInstanceOf[js.Any], NumberFormats = NumberFormats.asInstanceOf[js.Any], PageBackground = PageBackground.asInstanceOf[js.Any], RangeHighlighter = RangeHighlighter.asInstanceOf[js.Any], StyleFamilies = StyleFamilies.asInstanceOf[js.Any], TitleObject = TitleObject.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UsedData = UsedData.asInstanceOf[js.Any], UsedRangeRepresentations = UsedRangeRepresentations.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachDataProvider = js.Any.fromFunction1(attachDataProvider), attachNumberFormatsSupplier = js.Any.fromFunction1(attachNumberFormatsSupplier), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), createDefaultChart = js.Any.fromFunction0(createDefaultChart), createInternalDataProvider = js.Any.fromFunction1(createInternalDataProvider), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArgs = js.Any.fromFunction0(getArgs), getChartTypeManager = js.Any.fromFunction0(getChartTypeManager), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getDataProvider = js.Any.fromFunction0(getDataProvider), getFirstDiagram = js.Any.fromFunction0(getFirstDiagram), getNumberFormatSettings = js.Any.fromFunction0(getNumberFormatSettings), getNumberFormats = js.Any.fromFunction0(getNumberFormats), getPageBackground = js.Any.fromFunction0(getPageBackground), getRangeHighlighter = js.Any.fromFunction0(getRangeHighlighter), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), getTitleObject = js.Any.fromFunction0(getTitleObject), getURL = js.Any.fromFunction0(getURL), getUsedData = js.Any.fromFunction0(getUsedData), getUsedRangeRepresentations = js.Any.fromFunction0(getUsedRangeRepresentations), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), hasInternalDataProvider = js.Any.fromFunction0(hasInternalDataProvider), initialize = js.Any.fromFunction1(initialize), isOpenGLChart = js.Any.fromFunction0(isOpenGLChart), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setArguments = js.Any.fromFunction1(setArguments), setChartTypeManager = js.Any.fromFunction1(setChartTypeManager), setCurrentController = js.Any.fromFunction1(setCurrentController), setFirstDiagram = js.Any.fromFunction1(setFirstDiagram), setTitleObject = js.Any.fromFunction1(setTitleObject), unlockControllers = js.Any.fromFunction0(unlockControllers))
    __obj.asInstanceOf[ChartDocument]
  }
}

