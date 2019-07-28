package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages the chart document.
  * @see XDiagram
  * @see XChartData
  */
trait XChartDocument extends XModel {
  /**
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    * @see ChartArea
    * @see X3DDisplay
    */
  val Area: XPropertySet
  /**
    * @returns the data of the chart.  The returned object supports interface {@link XChartDataArray} which can be used to access the concrete data.  Since OOo
    * @see XChartData
    * @see XChartDataArray
    * @see XComplexDescriptionAccess
    * @see XDateCategories
    */
  val Data: XChartData
  /**
    * @returns the diagram of the chart document.
    * @see Diagram
    */
  var Diagram: XDiagram
  /**
    * @returns the shape of the legend of the chart document.
    * @see ChartLegend
    */
  val Legend: XShape
  /**
    * @returns the shape of the subtitle of the chart document.  Usually the subtitle is smaller than the main title by default. And it is most commonly placed
    * @see ChartTitle
    */
  val SubTitle: XShape
  /**
    * @returns the shape of the main title of the chart document.
    * @see ChartTitle
    */
  val Title: XShape
  /**
    * attaches data to the chart.
    *
    * The given object needs to support interface {@link XChartDataArray} .
    *
    * Since OOo 3.3 if the given object might support interface {@link XComplexDescriptionAccess} which allows to set complex hierarchical axis
    * descriptions.
    *
    * Since OOo 3.4 if the given object might support interface {@link XDateCategories} which allows to set date values as x values for category charts.
    *
    * The given data is copied before it is applied to the chart. So changing xData after this call will have no effect on the chart.
    * @param xData the object that provides the new data.
    * @see XChartData
    * @see XChartDataArray
    * @see XComplexDescriptionAccess
    * @see XDateCategories
    */
  def attachData(xData: XChartData): Unit
  /**
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    * @see ChartArea
    * @see X3DDisplay
    */
  def getArea(): XPropertySet
  /**
    * @returns the data of the chart.  The returned object supports interface {@link XChartDataArray} which can be used to access the concrete data.  Since OOo
    * @see XChartData
    * @see XChartDataArray
    * @see XComplexDescriptionAccess
    * @see XDateCategories
    */
  def getData(): XChartData
  /**
    * @returns the diagram of the chart document.
    * @see Diagram
    */
  def getDiagram(): XDiagram
  /**
    * @returns the shape of the legend of the chart document.
    * @see ChartLegend
    */
  def getLegend(): XShape
  /**
    * @returns the shape of the subtitle of the chart document.  Usually the subtitle is smaller than the main title by default. And it is most commonly placed
    * @see ChartTitle
    */
  def getSubTitle(): XShape
  /**
    * @returns the shape of the main title of the chart document.
    * @see ChartTitle
    */
  def getTitle(): XShape
  /**
    * sets the diagram for the chart document.
    *
    * Setting a new diagram implicitly disposes the previous diagram.
    * @param xDiagram the new diagram that should be set for the chart. To create such a diagram component, you can use the {@link com.sun.star.lang.XMultiSer
    */
  def setDiagram(xDiagram: XDiagram): Unit
}

object XChartDocument {
  @scala.inline
  def apply(
    Area: XPropertySet,
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    Data: XChartData,
    Diagram: XDiagram,
    Legend: XShape,
    SubTitle: XShape,
    Title: XShape,
    URL: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
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
    getLegend: () => XShape,
    getSubTitle: () => XShape,
    getTitle: () => XShape,
    getURL: () => String,
    hasControllersLocked: () => Boolean,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setCurrentController: XController => Unit,
    setDiagram: XDiagram => Unit,
    unlockControllers: () => Unit
  ): XChartDocument = {
    val __obj = js.Dynamic.literal(Area = Area, Args = Args, CurrentController = CurrentController, CurrentSelection = CurrentSelection, Data = Data, Diagram = Diagram, Legend = Legend, SubTitle = SubTitle, Title = Title, URL = URL, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachData = js.Any.fromFunction1(attachData), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArea = js.Any.fromFunction0(getArea), getArgs = js.Any.fromFunction0(getArgs), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getData = js.Any.fromFunction0(getData), getDiagram = js.Any.fromFunction0(getDiagram), getLegend = js.Any.fromFunction0(getLegend), getSubTitle = js.Any.fromFunction0(getSubTitle), getTitle = js.Any.fromFunction0(getTitle), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setCurrentController = js.Any.fromFunction1(setCurrentController), setDiagram = js.Any.fromFunction1(setDiagram), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[XChartDocument]
  }
}

