package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagram
  extends XDiagram
     with XCoordinateSystemContainer
     with XTitled
     with activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.X3DDefaultSetter {
  /** Draw connection lines for stacked bar charts. */
  var ConnectBars: scala.Boolean
  /** Chart Datatable flags */
  var DataTableHBorder: scala.Boolean
  var DataTableOutline: scala.Boolean
  var DataTableVBorder: scala.Boolean
  var ExternalData: java.lang.String
  /**
    * If bars of a bar or column chart are attached to different axis, this property determines how to display those. If `TRUE` , the bars are grouped
    * together in one block for each axis, thus they are painted one group over the other.
    *
    * If `FALSE` , the bars are displayed side-by-side, as if they were all attached to the same axis.
    *
    * If all data series of a bar or column chart are attached to only one axis, this property has no effect.
    */
  var GroupBarsPerAxis: scala.Boolean
  /**
    * specifies how empty or invalid cells in the provided data should be handled when displayed
    * @see com.sun.star.chart.MissingValueTreatment
    */
  var MissingValueTreatment: scala.Double
  /** Perspective of 3D charts ( [0,100] ). */
  var Perspective: scala.Double
  /**
    * The attributes {@link RelativePosition} and {@link RelativeSize} should be used for the inner coordinate region without axis labels and without data
    * labels.
    */
  var PosSizeExcludeLabels: scala.Boolean
  /**
    * The position is as a relative position on the page.
    *
    * If a relative position is given the diagram is not automatically placed, but instead is placed relative on the page.
    */
  var RelativePosition: RelativePosition
  /** The size of the diagram as relative size of the page size. */
  var RelativeSize: RelativeSize
  var RightAngledAxes: scala.Boolean
  /** Horizontal rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationHorizontal: scala.Double
  /** Vertical rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationVertical: scala.Double
  /** Sort data points by x values for rendering */
  var SortByXValues: scala.Boolean
  /** Starting angle in degrees for pie charts and doughnut charts. */
  var StartingAngle: scala.Double
}

