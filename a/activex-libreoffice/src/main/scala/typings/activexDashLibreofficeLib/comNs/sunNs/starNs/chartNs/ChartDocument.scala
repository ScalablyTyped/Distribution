package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPageSupplier {
  /** determines if the legend is shown or hidden. */
  var HasLegend: scala.Boolean
  /** determines if the main title is shown or hidden. */
  var HasMainTitle: scala.Boolean
  /** determines if the subtitle is shown or hidden. */
  var HasSubTitle: scala.Boolean
}

object ChartDocument {
  @scala.inline
  def apply(
    Area: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Args: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CurrentController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    CurrentSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Data: XChartData,
    Diagram: XDiagram,
    DrawPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    HasLegend: scala.Boolean,
    HasMainTitle: scala.Boolean,
    HasSubTitle: scala.Boolean,
    Legend: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SubTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    Title: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    URL: java.lang.String,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    attachData: XChartData => scala.Unit,
    attachResource: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Boolean,
    connectController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    disconnectController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    dispose: () => scala.Unit,
    getArea: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getArgs: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getCurrentController: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    getCurrentSelection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getData: () => XChartData,
    getDiagram: () => XDiagram,
    getDrawPage: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    getLegend: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSubTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getURL: () => java.lang.String,
    hasControllersLocked: () => scala.Boolean,
    lockControllers: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setCurrentController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController => scala.Unit,
    setDiagram: XDiagram => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    unlockControllers: () => scala.Unit
  ): ChartDocument = {
    val __obj = js.Dynamic.literal(Area = Area, Args = Args, CurrentController = CurrentController, CurrentSelection = CurrentSelection, Data = Data, Diagram = Diagram, DrawPage = DrawPage, HasLegend = HasLegend, HasMainTitle = HasMainTitle, HasSubTitle = HasSubTitle, Legend = Legend, PropertySetInfo = PropertySetInfo, SubTitle = SubTitle, Title = Title, URL = URL, UserDefinedAttributes = UserDefinedAttributes, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachData = js.Any.fromFunction1(attachData), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArea = js.Any.fromFunction0(getArea), getArgs = js.Any.fromFunction0(getArgs), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getData = js.Any.fromFunction0(getData), getDiagram = js.Any.fromFunction0(getDiagram), getDrawPage = js.Any.fromFunction0(getDrawPage), getLegend = js.Any.fromFunction0(getLegend), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSubTitle = js.Any.fromFunction0(getSubTitle), getTitle = js.Any.fromFunction0(getTitle), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setCurrentController = js.Any.fromFunction1(setCurrentController), setDiagram = js.Any.fromFunction1(setDiagram), setPropertyValue = js.Any.fromFunction2(setPropertyValue), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[ChartDocument]
  }
}

