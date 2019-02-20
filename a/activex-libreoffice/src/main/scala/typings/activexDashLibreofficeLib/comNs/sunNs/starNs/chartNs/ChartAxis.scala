package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the axes in a diagram.
  *
  * Note: The text properties correlate to all axis description elements, not to just a single text element.
  */
trait ChartAxis
  extends XAxis
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** The axis description may be arranged in a special order for a better placement. */
  var ArrangeOrder: ChartAxisArrangeOrderType
  /** The maximum value of the axis scale is calculated by the chart if this property is `TRUE` . */
  var AutoMax: scala.Boolean
  /** The minimum value of the axis scale is calculated by the chart if this property is `TRUE` . */
  var AutoMin: scala.Boolean
  /** The origin is calculated by the chart if this property is `TRUE` . */
  var AutoOrigin: scala.Boolean
  /** The number of help intervals within a main interval is calculated by the chart if this property is `TRUE` . */
  var AutoStepHelp: scala.Boolean
  /** The distance between the main tick marks is calculated by the chart if this property is `TRUE` . */
  var AutoStepMain: scala.Boolean
  /**
    * determines which type of axis this is, e.g. a date-axis or a category-axis
    * @see ChartAxisType
    * @since OOo 3.4
    */
  var AxisType: scala.Double
  /** Determines where the axis crosses the other axis. */
  var CrossoverPosition: ChartAxisPosition
  /** Determines the scale value on the other axis when CrossoverPosition is set to VALUE. */
  var CrossoverValue: scala.Double
  /** Properties for axes labels:Determines whether to display text at the axis or not. */
  var DisplayLabels: scala.Boolean
  /**
    * Specifies the width of the gaps between each set of data points in a bar chart.
    *
    * The value is given in percent of the width of a bar; the valid range is 0 to 600%.
    */
  var GapWidth: scala.Double
  /**
    * Determines the type of the help marks.
    * @see ChartAxisMarks
    */
  var HelpMarks: scala.Double
  /** Determines where the axis labels are placed. */
  var LabelPosition: ChartAxisLabelPosition
  /**
    * determines whether to use the number format given by the container application, e.g. a spreadsheet document, or from the own property {@link
    * NumberFormat} .
    */
  var LinkNumberFormatToSource: scala.Boolean
  /** Determines if the axis is scaled logarithmically or not (linear). */
  var Logarithmic: scala.Boolean
  /** Determines where the interval marks are placed. */
  var MarkPosition: ChartAxisMarkPosition
  /**
    * Properties for interval marks:Determines the type of the marks.
    * @see ChartAxisMarks
    */
  var Marks: scala.Double
  /** Properties for scaling:Contains the maximum value for the axis scale. */
  var Max: scala.Double
  /** Contains the minimum value for the axis scale. */
  var Min: scala.Double
  /**
    * Contains the type id for the number formatter of the axis.
    * @see com.sun.star.util.XNumberFormatter
    */
  var NumberFormat: scala.Double
  /**
    * Indicates the reference value where bars or areas have their grounding. This property has only an effect when the used ODF file format does not allow
    * for further axis positioning or the axis is a secondary y-axis.
    */
  var Origin: scala.Double
  /**
    * Properties related to bar charts:Determines the overlap of the bars in a bar-type chart.
    *
    * The value is given in percent of the width of the bars. The valid range is -100% to +100%. +100% means full overlap, -100% indicates a distance of one
    * bar between 2 neighboring bars.
    */
  var Overlap: scala.Double
  /** Determines if the axis orientation is mathematical or reversed. */
  var ReverseDirection: scala.Boolean
  /** @deprecated DeprecatedUser property StepHelpCount instead Contains the distance between the help tick marks. */
  var StepHelp: scala.Double
  /**
    * Contains the number of help intervals within a main interval. E.g. a StepHelpCount of 5 divides the main interval into 5 pieces and thus produces 4
    * help tick marks.
    */
  var StepHelpCount: scala.Double
  /** Contains the distance between the main tick marks. */
  var StepMain: scala.Double
  /** Determines if long text is broken into multiple lines. */
  var TextBreak: scala.Boolean
  /** Determines if certain labels are hidden, if they would otherwise overlap. In this case, the value of this property must be set to `FALSE` . */
  var TextCanOverlap: scala.Boolean
  /** Determines the rotation of the text elements (axis description) in 100th degrees. */
  var TextRotation: scala.Double
  /**
    * if the current axis is a date-axis the intervals are chosen as given with {@link TimeIncrement}
    * @since OOo 3.4
    */
  var TimeIncrement: TimeIncrement
}

