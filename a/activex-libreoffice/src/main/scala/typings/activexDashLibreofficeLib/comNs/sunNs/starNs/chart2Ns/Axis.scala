package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
     with XAxis
     with XTitled {
  /** Determines how to stagger the labels at the axis (side by side, even, odd, auto ) */
  var ArrangeOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisArrangeOrderType = js.native
  /**
    * Determines built in display unit value for axis
    * @since LibreOffice 4.3
    */
  var BuiltInUnit: java.lang.String = js.native
  /** Determines where the axis crosses the other axis. */
  var CrossoverPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisPosition = js.native
  /** Determines the scale value on the other axis when CrossoverPosition is set to VALUE. */
  var CrossoverValue: scala.Double = js.native
  /** Determines whether to display text at the axis or not. */
  var DisplayLabels: scala.Boolean = js.native
  /**
    * Determines display units are avaiblable for axis
    * @since LibreOffice 4.3
    */
  var DisplayUnits: scala.Boolean = js.native
  /** Determines where the axis labels are placed. */
  var LabelPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisLabelPosition = js.native
  /**
    * determines what kind of tickmarks should be shown for major ticks.
    * @see TickmarkStyle.
    */
  var MajorTickmarks: scala.Double = js.native
  /** Determines where the interval marks are placed. */
  var MarkPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartAxisMarkPosition = js.native
  /**
    * determines what kind of tickmarks should be shown for minor ticks.
    * @see TickmarkStyle.
    */
  var MinorTickmarks: scala.Double = js.native
  /**
    * A NumberFormat key.
    *
    * If this property is not set, it is treated as auto. This means linked to the source format.
    *
    * To determine a source format, the axis can query the XDataSequences used by the data series attached to it (see
    * XDataSequence::getNumberFormatKeyByIndex()).
    */
  var NumberFormat: scala.Double = js.native
  var ReferencePageSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size = js.native
  /** Determines, whether the axis should be rendered by the view. */
  var Show: scala.Boolean = js.native
  /** Determines whether the characters in a single labels should be stacked one upon each other */
  var StackCharacters: scala.Boolean = js.native
  /** Determines whether the labels are allowed to break into more than one line */
  var TextBreak: scala.Boolean = js.native
  /** Determines whether the labels are allowed to overlap */
  var TextOverlap: scala.Boolean = js.native
  /** Determines the rotation of the text labels in degrees */
  var TextRotation: scala.Double = js.native
  /**
    * Compatibility option: determines which strategy should be tried first for fixing axis labels overlapping issues
    * @since LibreOffice 5.1
    */
  var TryStaggeringFirst: scala.Boolean = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo = js.native
}

