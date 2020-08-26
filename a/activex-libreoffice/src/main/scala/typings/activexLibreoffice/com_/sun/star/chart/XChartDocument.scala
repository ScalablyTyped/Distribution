package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages the chart document.
  * @see XDiagram
  * @see XChartData
  */
@js.native
trait XChartDocument extends XModel {
  /**
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    * @see ChartArea
    * @see X3DDisplay
    */
  val Area: XPropertySet = js.native
  /**
    * @returns the data of the chart.  The returned object supports interface {@link XChartDataArray} which can be used to access the concrete data.  Since OOo
    * @see XChartData
    * @see XChartDataArray
    * @see XComplexDescriptionAccess
    * @see XDateCategories
    */
  val Data: XChartData = js.native
  /**
    * @returns the diagram of the chart document.
    * @see Diagram
    */
  var Diagram: XDiagram = js.native
  /**
    * @returns the shape of the legend of the chart document.
    * @see ChartLegend
    */
  val Legend: XShape = js.native
  /**
    * @returns the shape of the subtitle of the chart document.  Usually the subtitle is smaller than the main title by default. And it is most commonly placed
    * @see ChartTitle
    */
  val SubTitle: XShape = js.native
  /**
    * @returns the shape of the main title of the chart document.
    * @see ChartTitle
    */
  val Title: XShape = js.native
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
  def attachData(xData: XChartData): Unit = js.native
  /**
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    * @see ChartArea
    * @see X3DDisplay
    */
  def getArea(): XPropertySet = js.native
  /**
    * @returns the data of the chart.  The returned object supports interface {@link XChartDataArray} which can be used to access the concrete data.  Since OOo
    * @see XChartData
    * @see XChartDataArray
    * @see XComplexDescriptionAccess
    * @see XDateCategories
    */
  def getData(): XChartData = js.native
  /**
    * @returns the diagram of the chart document.
    * @see Diagram
    */
  def getDiagram(): XDiagram = js.native
  /**
    * @returns the shape of the legend of the chart document.
    * @see ChartLegend
    */
  def getLegend(): XShape = js.native
  /**
    * @returns the shape of the subtitle of the chart document.  Usually the subtitle is smaller than the main title by default. And it is most commonly placed
    * @see ChartTitle
    */
  def getSubTitle(): XShape = js.native
  /**
    * @returns the shape of the main title of the chart document.
    * @see ChartTitle
    */
  def getTitle(): XShape = js.native
  /**
    * sets the diagram for the chart document.
    *
    * Setting a new diagram implicitly disposes the previous diagram.
    * @param xDiagram the new diagram that should be set for the chart. To create such a diagram component, you can use the {@link com.sun.star.lang.XMultiSer
    */
  def setDiagram(xDiagram: XDiagram): Unit = js.native
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
    val __obj = js.Dynamic.literal(Area = Area.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Diagram = Diagram.asInstanceOf[js.Any], Legend = Legend.asInstanceOf[js.Any], SubTitle = SubTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachData = js.Any.fromFunction1(attachData), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArea = js.Any.fromFunction0(getArea), getArgs = js.Any.fromFunction0(getArgs), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getData = js.Any.fromFunction0(getData), getDiagram = js.Any.fromFunction0(getDiagram), getLegend = js.Any.fromFunction0(getLegend), getSubTitle = js.Any.fromFunction0(getSubTitle), getTitle = js.Any.fromFunction0(getTitle), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setCurrentController = js.Any.fromFunction1(setCurrentController), setDiagram = js.Any.fromFunction1(setDiagram), unlockControllers = js.Any.fromFunction0(unlockControllers))
    __obj.asInstanceOf[XChartDocument]
  }
  @scala.inline
  implicit class XChartDocumentOps[Self <: XChartDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArea(value: XPropertySet): Self = this.set("Area", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: XChartData): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagram(value: XDiagram): Self = this.set("Diagram", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegend(value: XShape): Self = this.set("Legend", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubTitle(value: XShape): Self = this.set("SubTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: XShape): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachData(value: XChartData => Unit): Self = this.set("attachData", js.Any.fromFunction1(value))
    @scala.inline
    def setGetArea(value: () => XPropertySet): Self = this.set("getArea", js.Any.fromFunction0(value))
    @scala.inline
    def setGetData(value: () => XChartData): Self = this.set("getData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDiagram(value: () => XDiagram): Self = this.set("getDiagram", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLegend(value: () => XShape): Self = this.set("getLegend", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSubTitle(value: () => XShape): Self = this.set("getSubTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => XShape): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDiagram(value: XDiagram => Unit): Self = this.set("setDiagram", js.Any.fromFunction1(value))
  }
  
}

