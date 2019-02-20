package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the base service for the diagram of the chart document.
  *
  * The diagram is the object that contains the actual plot.
  *
  * Different {@link Diagram} Types, e.g., {@link PieDiagram} or {@link LineDiagram} , can be instantiated by the {@link
  * com.sun.star.lang.XMultiServiceFactory} of the {@link XChartDocument} .
  */
trait Diagram
  extends XDiagram
     with XAxisSupplier
     with XSecondAxisTitleSupplier
     with XDiagramPositioning
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier {
  /**
    * If this property is `TRUE` the position is calculated by the application automatically. Setting this property to false will have no effect. Instead
    * use the interface {@link com.sun.star.drawing.XShape} to set a concrete position (note {@link com.sun.star.chart.XDiagram} is derived from {@link
    * com.sun.star.drawing.XShape} ).
    */
  var AutomaticPosition: scala.Boolean
  /**
    * If this property is `TRUE` the size is calculated by the application automatically. Setting this property to false will have no effect. Instead use
    * the interface {@link com.sun.star.drawing.XShape} to set a concrete size (note {@link com.sun.star.chart.XDiagram} is derived from {@link
    * com.sun.star.drawing.XShape} ).
    */
  var AutomaticSize: scala.Boolean
  /**
    * specifies how the caption of data points is displayed.
    * @see ChartDataCaption
    */
  var DataCaption: scala.Double
  /**
    * determines if the data for a data row is contained in the columns or in the rows of the data array.
    * @see ChartDataRowSource
    * @see ChartDataArray
    */
  var DataRowSource: ChartDataRowSource
  /**
    * specifies how empty or invalid cells in the provided data should be handled when displayed
    * @see MissingValueTreatment
    */
  var MissingValueTreatment: scala.Double
}

