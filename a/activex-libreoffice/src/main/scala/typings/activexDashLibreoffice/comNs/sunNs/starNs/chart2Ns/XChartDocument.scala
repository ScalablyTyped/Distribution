package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataProvider
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XChartDocument extends XModel {
  /** retrieves the component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  var ChartTypeManager: XChartTypeManager
  /**
    * Returns the currently set data provider. This may be an internal one, if {@link createInternalDataProvider()} has been called before, or an external
    * one if XDataReceiver::attachDataProvider() has been called.
    */
  val DataProvider: XDataProvider
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name getDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  var FirstDiagram: XDiagram
  /**
    * Gives access to the page background appearance.
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    */
  val PageBackground: XPropertySet
  /** Creates a default chart type for a brand-new chart object. */
  def createDefaultChart(): Unit
  /**
    * creates an internal com::sun::star::chart2::XDataProvider that is handled by the chart document itself.
    *
    * When the model is stored, the data provider will also be stored in a sub-storage.
    * @param bCloneExistingData if `TRUE` and a data provider was previously attached, its referred data will be copied to the new internal data provider. Not
    * @throws com::sun::star::util:CloseVetoException If the new data provider could not be created due to a failed removal of the former data provider.
    */
  def createInternalDataProvider(bCloneExistingData: Boolean): Unit
  /** retrieves the component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  def getChartTypeManager(): XChartTypeManager
  /**
    * Returns the currently set data provider. This may be an internal one, if {@link createInternalDataProvider()} has been called before, or an external
    * one if XDataReceiver::attachDataProvider() has been called.
    */
  def getDataProvider(): XDataProvider
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name getDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  def getFirstDiagram(): XDiagram
  /**
    * Gives access to the page background appearance.
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    */
  def getPageBackground(): XPropertySet
  /** @returns `TRUE` if the data provider set at the chart document is an internal one.  This is the case directly after {@link createInternalDataProvider()} h */
  def hasInternalDataProvider(): Boolean
  /** Returns true if the chart is based on OpenGL */
  def isOpenGLChart(): Boolean
  /** sets a new component that is able to create different chart type templates (components of type {@link ChartTypeTemplate} ) */
  def setChartTypeManager(xNewManager: XChartTypeManager): Unit
  /**
    * Notes: this is preliminary, we need an API that supports more than one diagram. The method name setDiagram exists in the css.chart API, so there is
    * would be no way to chose either this or the other method from Basic (it would chose one or the other by random).
    */
  def setFirstDiagram(xDiagram: XDiagram): Unit
}

object XChartDocument {
  @scala.inline
  def apply(
    Args: SafeArray[PropertyValue],
    ChartTypeManager: XChartTypeManager,
    CurrentController: XController,
    CurrentSelection: XInterface,
    DataProvider: XDataProvider,
    FirstDiagram: XDiagram,
    PageBackground: XPropertySet,
    URL: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
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
    getPageBackground: () => XPropertySet,
    getURL: () => String,
    hasControllersLocked: () => Boolean,
    hasInternalDataProvider: () => Boolean,
    isOpenGLChart: () => Boolean,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setChartTypeManager: XChartTypeManager => Unit,
    setCurrentController: XController => Unit,
    setFirstDiagram: XDiagram => Unit,
    unlockControllers: () => Unit
  ): XChartDocument = {
    val __obj = js.Dynamic.literal(Args = Args, ChartTypeManager = ChartTypeManager, CurrentController = CurrentController, CurrentSelection = CurrentSelection, DataProvider = DataProvider, FirstDiagram = FirstDiagram, PageBackground = PageBackground, URL = URL, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), createDefaultChart = js.Any.fromFunction0(createDefaultChart), createInternalDataProvider = js.Any.fromFunction1(createInternalDataProvider), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArgs = js.Any.fromFunction0(getArgs), getChartTypeManager = js.Any.fromFunction0(getChartTypeManager), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getDataProvider = js.Any.fromFunction0(getDataProvider), getFirstDiagram = js.Any.fromFunction0(getFirstDiagram), getPageBackground = js.Any.fromFunction0(getPageBackground), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), hasInternalDataProvider = js.Any.fromFunction0(hasInternalDataProvider), isOpenGLChart = js.Any.fromFunction0(isOpenGLChart), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setChartTypeManager = js.Any.fromFunction1(setChartTypeManager), setCurrentController = js.Any.fromFunction1(setCurrentController), setFirstDiagram = js.Any.fromFunction1(setFirstDiagram), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[XChartDocument]
  }
}

