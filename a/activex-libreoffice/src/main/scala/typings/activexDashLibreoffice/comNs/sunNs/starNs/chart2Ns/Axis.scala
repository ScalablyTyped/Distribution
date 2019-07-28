package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.ChartAxisArrangeOrderType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.ChartAxisLabelPosition
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.ChartAxisMarkPosition
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.ChartAxisPosition
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axis
  extends PropertySet
     with LineProperties
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with XAxis
     with XTitled {
  /** Determines how to stagger the labels at the axis (side by side, even, odd, auto ) */
  var ArrangeOrder: ChartAxisArrangeOrderType = js.native
  /**
    * Determines built in display unit value for axis
    * @since LibreOffice 4.3
    */
  var BuiltInUnit: String = js.native
  /** Determines where the axis crosses the other axis. */
  var CrossoverPosition: ChartAxisPosition = js.native
  /** Determines the scale value on the other axis when CrossoverPosition is set to VALUE. */
  var CrossoverValue: Double = js.native
  /** Determines whether to display text at the axis or not. */
  var DisplayLabels: Boolean = js.native
  /**
    * Determines display units are avaiblable for axis
    * @since LibreOffice 4.3
    */
  var DisplayUnits: Boolean = js.native
  /** Determines where the axis labels are placed. */
  var LabelPosition: ChartAxisLabelPosition = js.native
  /**
    * determines what kind of tickmarks should be shown for major ticks.
    * @see TickmarkStyle.
    */
  var MajorTickmarks: Double = js.native
  /** Determines where the interval marks are placed. */
  var MarkPosition: ChartAxisMarkPosition = js.native
  /**
    * determines what kind of tickmarks should be shown for minor ticks.
    * @see TickmarkStyle.
    */
  var MinorTickmarks: Double = js.native
  /**
    * A NumberFormat key.
    *
    * If this property is not set, it is treated as auto. This means linked to the source format.
    *
    * To determine a source format, the axis can query the XDataSequences used by the data series attached to it (see
    * XDataSequence::getNumberFormatKeyByIndex()).
    */
  var NumberFormat: Double = js.native
  var ReferencePageSize: Size = js.native
  /** Determines, whether the axis should be rendered by the view. */
  var Show: Boolean = js.native
  /** Determines whether the characters in a single labels should be stacked one upon each other */
  var StackCharacters: Boolean = js.native
  /** Determines whether the labels are allowed to break into more than one line */
  var TextBreak: Boolean = js.native
  /** Determines whether the labels are allowed to overlap */
  var TextOverlap: Boolean = js.native
  /** Determines the rotation of the text labels in degrees */
  var TextRotation: Double = js.native
  /**
    * Compatibility option: determines which strategy should be tried first for fixing axis labels overlapping issues
    * @since LibreOffice 5.1
    */
  var TryStaggeringFirst: Boolean = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

