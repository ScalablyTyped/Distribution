package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawPage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawPageSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the service for a chart document.
  *
  * A chart document consists of a reference to the data source, the diagram and some additional elements like a main title, a sub-title or a legend.
  * @see Diagram
  * @see ChartLegend
  * @see ChartTitle
  * @see ChartDataArray
  */
trait ChartDocument
  extends XChartDocument
     with UserDefinedAttributesSupplier
     with XPropertySet
     with XDrawPageSupplier {
  /** determines if the legend is shown or hidden. */
  var HasLegend: Boolean
  /** determines if the main title is shown or hidden. */
  var HasMainTitle: Boolean
  /** determines if the subtitle is shown or hidden. */
  var HasSubTitle: Boolean
}

object ChartDocument {
  @scala.inline
  def apply(
    Area: XPropertySet,
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    Data: XChartData,
    Diagram: XDiagram,
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
    getDiagram: () => XDiagram,
    getDrawPage: () => XDrawPage,
    getLegend: () => XShape,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSubTitle: () => XShape,
    getTitle: () => XShape,
    getURL: () => String,
    hasControllersLocked: () => Boolean,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setCurrentController: XController => Unit,
    setDiagram: XDiagram => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    unlockControllers: () => Unit
  ): ChartDocument = {
    val __obj = js.Dynamic.literal(Area = Area, Args = Args, CurrentController = CurrentController, CurrentSelection = CurrentSelection, Data = Data, Diagram = Diagram, DrawPage = DrawPage, HasLegend = HasLegend, HasMainTitle = HasMainTitle, HasSubTitle = HasSubTitle, Legend = Legend, PropertySetInfo = PropertySetInfo, SubTitle = SubTitle, Title = Title, URL = URL, UserDefinedAttributes = UserDefinedAttributes, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachData = js.Any.fromFunction1(attachData), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArea = js.Any.fromFunction0(getArea), getArgs = js.Any.fromFunction0(getArgs), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getData = js.Any.fromFunction0(getData), getDiagram = js.Any.fromFunction0(getDiagram), getDrawPage = js.Any.fromFunction0(getDrawPage), getLegend = js.Any.fromFunction0(getLegend), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSubTitle = js.Any.fromFunction0(getSubTitle), getTitle = js.Any.fromFunction0(getTitle), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setCurrentController = js.Any.fromFunction1(setCurrentController), setDiagram = js.Any.fromFunction1(setDiagram), setPropertyValue = js.Any.fromFunction2(setPropertyValue), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[ChartDocument]
  }
}

