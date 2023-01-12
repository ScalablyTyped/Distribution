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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * manages the chart document.
  * @see XDiagram
  * @see XChartData
  */
trait XChartDocument
  extends StObject
     with XModel {
  
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
  
  inline def apply(
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
    queryInterface: `type` => Any,
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
  implicit open class MutableBuilder[Self <: XChartDocument] (val x: Self) extends AnyVal {
    
    inline def setArea(value: XPropertySet): Self = StObject.set(x, "Area", value.asInstanceOf[js.Any])
    
    inline def setAttachData(value: XChartData => Unit): Self = StObject.set(x, "attachData", js.Any.fromFunction1(value))
    
    inline def setData(value: XChartData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDiagram(value: XDiagram): Self = StObject.set(x, "Diagram", value.asInstanceOf[js.Any])
    
    inline def setGetArea(value: () => XPropertySet): Self = StObject.set(x, "getArea", js.Any.fromFunction0(value))
    
    inline def setGetData(value: () => XChartData): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetDiagram(value: () => XDiagram): Self = StObject.set(x, "getDiagram", js.Any.fromFunction0(value))
    
    inline def setGetLegend(value: () => XShape): Self = StObject.set(x, "getLegend", js.Any.fromFunction0(value))
    
    inline def setGetSubTitle(value: () => XShape): Self = StObject.set(x, "getSubTitle", js.Any.fromFunction0(value))
    
    inline def setGetTitle(value: () => XShape): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setLegend(value: XShape): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    inline def setSetDiagram(value: XDiagram => Unit): Self = StObject.set(x, "setDiagram", js.Any.fromFunction1(value))
    
    inline def setSubTitle(value: XShape): Self = StObject.set(x, "SubTitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: XShape): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
