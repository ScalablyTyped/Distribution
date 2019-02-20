package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages the chart document.
  * @see XDiagram
  * @see XChartData
  */
trait XChartDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel {
  /**
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    * @see ChartArea
    * @see X3DDisplay
    */
  val Area: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
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
  val Legend: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the shape of the subtitle of the chart document.  Usually the subtitle is smaller than the main title by default. And it is most commonly placed
    * @see ChartTitle
    */
  val SubTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the shape of the main title of the chart document.
    * @see ChartTitle
    */
  val Title: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
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
  def attachData(xData: XChartData): scala.Unit
  /**
    * @returns the properties of the background area of the chart document.  The area's extent is equal to the document size. If you want to access properties o
    * @see ChartArea
    * @see X3DDisplay
    */
  def getArea(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
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
  def getLegend(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the shape of the subtitle of the chart document.  Usually the subtitle is smaller than the main title by default. And it is most commonly placed
    * @see ChartTitle
    */
  def getSubTitle(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * @returns the shape of the main title of the chart document.
    * @see ChartTitle
    */
  def getTitle(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  /**
    * sets the diagram for the chart document.
    *
    * Setting a new diagram implicitly disposes the previous diagram.
    * @param xDiagram the new diagram that should be set for the chart. To create such a diagram component, you can use the {@link com.sun.star.lang.XMultiSer
    */
  def setDiagram(xDiagram: XDiagram): scala.Unit
}

