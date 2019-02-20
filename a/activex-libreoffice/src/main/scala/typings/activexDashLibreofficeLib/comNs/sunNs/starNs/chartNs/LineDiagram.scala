package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies line, spline and symbol diagrams. */
trait LineDiagram
  extends Diagram
     with ChartStatistics
     with ChartAxisXSupplier
     with ChartTwoAxisYSupplier
     with ChartAxisZSupplier
     with Dim3DDiagram
     with StackableDiagram {
  /** determines if the chart type has lines connecting the data points or contains just symbols. */
  var Lines: scala.Boolean
  /**
    * specifies the power of the polynomials used for spline calculation
    *
    * This property is only valid for B-splines
    */
  var SplineOrder: scala.Double
  /** determines the number of sampling points of a spline */
  var SplineResolution: scala.Double
  /**
    * determines if the chart is a spline-chart type and specifies the type of splines.
    * @see CurveStyle You can set the following values: {{table here, see documentation}}
    */
  var SplineType: scala.Double
  /**
    * Set this property to any valid URL that points to a graphic file. This graphic is then used as symbol for all series.
    *
    * When you query this value you get an internal URL of the embedded graphic.
    * @deprecated Deprecated
    * @see ChartSymbolType
    */
  var SymbolBitmapURL: java.lang.String
  /** specifies the size of symbols in 1/100th of a millimeter. */
  var SymbolSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * determines which type of symbols are displayed.
    *
    * In this interface, only the two values {@link ChartSymbolType.NONE} and {@link ChartSymbolType.AUTO} are supported. Later versions may support the
    * selection of the symbols shape.
    *
    * If you set this property to {@link ChartSymbolType.AUTO} , you can change the symbol shape for objects supporting the service {@link
    * ChartDataPointProperties} or {@link ChartDataRowProperties} .
    * @see ChartDataPointProperties
    * @see ChartDataRowProperties
    */
  var SymbolType: scala.Double
}

