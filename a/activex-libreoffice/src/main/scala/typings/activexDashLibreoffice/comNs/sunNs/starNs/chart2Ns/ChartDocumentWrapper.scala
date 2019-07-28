package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.XChartData
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawPage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XAggregation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component that implements the {@link com.sun.star.chart.ChartDocument} service and is initialized with a {@link com.sun.star.chart2.ChartDocument}
  * via the {@link com.sun.star.uno.XAggregation} interface.
  */
trait ChartDocumentWrapper
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.ChartDocument
     with XAggregation

object ChartDocumentWrapper {
  @scala.inline
  def apply(
    Area: XPropertySet,
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    Data: XChartData,
    Diagram: typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.XDiagram,
    DrawPage: XDrawPage,
    HasLegend: Boolean,
    HasMainTitle: Boolean,
    HasSubTitle: Boolean,
    Legend: XShape,
    PropertySetInfo: XPropertySetInfo,
    SubTitle: XShape,
    Title: XShape,
    URL: String,
    UserDefinedAttributes: XNameContainer,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attachData: XChartData => Unit,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Unit,
    disconnectController: XController => Unit,
    dispose: () => Unit,
    getArea: () => XPropertySet,
    getArgs: () => SafeArray[PropertyValue],
    getCurrentController: () => XController,
    getCurrentSelection: () => XInterface,
    getData: () => XChartData,
    getDiagram: () => typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.XDiagram,
    getDrawPage: () => XDrawPage,
    getLegend: () => XShape,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSubTitle: () => XShape,
    getTitle: () => XShape,
    getURL: () => String,
    hasControllersLocked: () => Boolean,
    lockControllers: () => Unit,
    queryAggregation: `type` => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setCurrentController: XController => Unit,
    setDelegator: XInterface => Unit,
    setDiagram: typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.XDiagram => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    unlockControllers: () => Unit
  ): ChartDocumentWrapper = {
    val __obj = js.Dynamic.literal(Area = Area, Args = Args, CurrentController = CurrentController, CurrentSelection = CurrentSelection, Data = Data, Diagram = Diagram, DrawPage = DrawPage, HasLegend = HasLegend, HasMainTitle = HasMainTitle, HasSubTitle = HasSubTitle, Legend = Legend, PropertySetInfo = PropertySetInfo, SubTitle = SubTitle, Title = Title, URL = URL, UserDefinedAttributes = UserDefinedAttributes, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachData = js.Any.fromFunction1(attachData), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArea = js.Any.fromFunction0(getArea), getArgs = js.Any.fromFunction0(getArgs), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getData = js.Any.fromFunction0(getData), getDiagram = js.Any.fromFunction0(getDiagram), getDrawPage = js.Any.fromFunction0(getDrawPage), getLegend = js.Any.fromFunction0(getLegend), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSubTitle = js.Any.fromFunction0(getSubTitle), getTitle = js.Any.fromFunction0(getTitle), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryAggregation = js.Any.fromFunction1(queryAggregation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setCurrentController = js.Any.fromFunction1(setCurrentController), setDelegator = js.Any.fromFunction1(setDelegator), setDiagram = js.Any.fromFunction1(setDiagram), setPropertyValue = js.Any.fromFunction2(setPropertyValue), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[ChartDocumentWrapper]
  }
}

