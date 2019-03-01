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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Area")(Area)
    __obj.updateDynamic("Args")(Args)
    __obj.updateDynamic("CurrentController")(CurrentController)
    __obj.updateDynamic("CurrentSelection")(CurrentSelection)
    __obj.updateDynamic("Data")(Data)
    __obj.updateDynamic("Diagram")(Diagram)
    __obj.updateDynamic("DrawPage")(DrawPage)
    __obj.updateDynamic("HasLegend")(HasLegend)
    __obj.updateDynamic("HasMainTitle")(HasMainTitle)
    __obj.updateDynamic("HasSubTitle")(HasSubTitle)
    __obj.updateDynamic("Legend")(Legend)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("SubTitle")(SubTitle)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("URL")(URL)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("attachData")(attachData)
    __obj.updateDynamic("attachResource")(attachResource)
    __obj.updateDynamic("connectController")(connectController)
    __obj.updateDynamic("disconnectController")(disconnectController)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getArea")(getArea)
    __obj.updateDynamic("getArgs")(getArgs)
    __obj.updateDynamic("getCurrentController")(getCurrentController)
    __obj.updateDynamic("getCurrentSelection")(getCurrentSelection)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getDiagram")(getDiagram)
    __obj.updateDynamic("getDrawPage")(getDrawPage)
    __obj.updateDynamic("getLegend")(getLegend)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSubTitle")(getSubTitle)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getURL")(getURL)
    __obj.updateDynamic("hasControllersLocked")(hasControllersLocked)
    __obj.updateDynamic("lockControllers")(lockControllers)
    __obj.updateDynamic("queryAggregation")(queryAggregation)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setCurrentController")(setCurrentController)
    __obj.updateDynamic("setDelegator")(setDelegator)
    __obj.updateDynamic("setDiagram")(setDiagram)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("unlockControllers")(unlockControllers)
    __obj.asInstanceOf[ChartDocumentWrapper]
  }
}

