package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component that implements the {@link com.sun.star.chart.ChartDocument} service and is initialized with a {@link com.sun.star.chart2.ChartDocument}
  * via the {@link com.sun.star.uno.XAggregation} interface.
  */
trait ChartDocumentWrapper
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDocument
     with activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XAggregation

object ChartDocumentWrapper {
  @scala.inline
  def apply(
    Area: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Args: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CurrentController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    CurrentSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Data: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartData,
    Diagram: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XDiagram,
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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    attachData: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartData, scala.Unit],
    attachResource: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    connectController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    disconnectController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getArea: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getArgs: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getCurrentController: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController],
    getCurrentSelection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getData: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartData],
    getDiagram: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XDiagram],
    getDrawPage: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage],
    getLegend: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSubTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getURL: js.Function0[java.lang.String],
    hasControllersLocked: js.Function0[scala.Boolean],
    lockControllers: js.Function0[scala.Unit],
    queryAggregation: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setCurrentController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, scala.Unit],
    setDelegator: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDiagram: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XDiagram, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    unlockControllers: js.Function0[scala.Unit]
  ): ChartDocumentWrapper = {
    val __obj = js.Dynamic.literal(Area = Area, Args = Args, CurrentController = CurrentController, CurrentSelection = CurrentSelection, Data = Data, Diagram = Diagram, DrawPage = DrawPage, HasLegend = HasLegend, HasMainTitle = HasMainTitle, HasSubTitle = HasSubTitle, Legend = Legend, PropertySetInfo = PropertySetInfo, SubTitle = SubTitle, Title = Title, URL = URL, UserDefinedAttributes = UserDefinedAttributes, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, attachData = attachData, attachResource = attachResource, connectController = connectController, disconnectController = disconnectController, dispose = dispose, getArea = getArea, getArgs = getArgs, getCurrentController = getCurrentController, getCurrentSelection = getCurrentSelection, getData = getData, getDiagram = getDiagram, getDrawPage = getDrawPage, getLegend = getLegend, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSubTitle = getSubTitle, getTitle = getTitle, getURL = getURL, hasControllersLocked = hasControllersLocked, lockControllers = lockControllers, queryAggregation = queryAggregation, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setCurrentController = setCurrentController, setDelegator = setDelegator, setDiagram = setDiagram, setPropertyValue = setPropertyValue, unlockControllers = unlockControllers)
  
    __obj.asInstanceOf[ChartDocumentWrapper]
  }
}

