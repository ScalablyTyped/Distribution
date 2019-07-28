package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineCap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineDash
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineJoint
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
import typings.std.SafeArray
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
     with LineProperties
     with CharacterProperties
     with UserDefinedAttributesSupplier
     with XPropertySet {
  /** The axis description may be arranged in a special order for a better placement. */
  var ArrangeOrder: ChartAxisArrangeOrderType
  /** The maximum value of the axis scale is calculated by the chart if this property is `TRUE` . */
  var AutoMax: Boolean
  /** The minimum value of the axis scale is calculated by the chart if this property is `TRUE` . */
  var AutoMin: Boolean
  /** The origin is calculated by the chart if this property is `TRUE` . */
  var AutoOrigin: Boolean
  /** The number of help intervals within a main interval is calculated by the chart if this property is `TRUE` . */
  var AutoStepHelp: Boolean
  /** The distance between the main tick marks is calculated by the chart if this property is `TRUE` . */
  var AutoStepMain: Boolean
  /**
    * determines which type of axis this is, e.g. a date-axis or a category-axis
    * @see ChartAxisType
    * @since OOo 3.4
    */
  var AxisType: Double
  /** Determines where the axis crosses the other axis. */
  var CrossoverPosition: ChartAxisPosition
  /** Determines the scale value on the other axis when CrossoverPosition is set to VALUE. */
  var CrossoverValue: Double
  /** Properties for axes labels:Determines whether to display text at the axis or not. */
  var DisplayLabels: Boolean
  /**
    * Specifies the width of the gaps between each set of data points in a bar chart.
    *
    * The value is given in percent of the width of a bar; the valid range is 0 to 600%.
    */
  var GapWidth: Double
  /**
    * Determines the type of the help marks.
    * @see ChartAxisMarks
    */
  var HelpMarks: Double
  /** Determines where the axis labels are placed. */
  var LabelPosition: ChartAxisLabelPosition
  /**
    * determines whether to use the number format given by the container application, e.g. a spreadsheet document, or from the own property {@link
    * NumberFormat} .
    */
  var LinkNumberFormatToSource: Boolean
  /** Determines if the axis is scaled logarithmically or not (linear). */
  var Logarithmic: Boolean
  /** Determines where the interval marks are placed. */
  var MarkPosition: ChartAxisMarkPosition
  /**
    * Properties for interval marks:Determines the type of the marks.
    * @see ChartAxisMarks
    */
  var Marks: Double
  /** Properties for scaling:Contains the maximum value for the axis scale. */
  var Max: Double
  /** Contains the minimum value for the axis scale. */
  var Min: Double
  /**
    * Contains the type id for the number formatter of the axis.
    * @see com.sun.star.util.XNumberFormatter
    */
  var NumberFormat: Double
  /**
    * Indicates the reference value where bars or areas have their grounding. This property has only an effect when the used ODF file format does not allow
    * for further axis positioning or the axis is a secondary y-axis.
    */
  var Origin: Double
  /**
    * Properties related to bar charts:Determines the overlap of the bars in a bar-type chart.
    *
    * The value is given in percent of the width of the bars. The valid range is -100% to +100%. +100% means full overlap, -100% indicates a distance of one
    * bar between 2 neighboring bars.
    */
  var Overlap: Double
  /** Determines if the axis orientation is mathematical or reversed. */
  var ReverseDirection: Boolean
  /** @deprecated DeprecatedUser property StepHelpCount instead Contains the distance between the help tick marks. */
  var StepHelp: Double
  /**
    * Contains the number of help intervals within a main interval. E.g. a StepHelpCount of 5 divides the main interval into 5 pieces and thus produces 4
    * help tick marks.
    */
  var StepHelpCount: Double
  /** Contains the distance between the main tick marks. */
  var StepMain: Double
  /** Determines if long text is broken into multiple lines. */
  var TextBreak: Boolean
  /** Determines if certain labels are hidden, if they would otherwise overlap. In this case, the value of this property must be set to `FALSE` . */
  var TextCanOverlap: Boolean
  /** Determines the rotation of the text elements (axis description) in 100th degrees. */
  var TextRotation: Double
  /**
    * if the current axis is a date-axis the intervals are chosen as given with {@link TimeIncrement}
    * @since OOo 3.4
    */
  var TimeIncrement: typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.TimeIncrement
}

object ChartAxis {
  @scala.inline
  def apply(
    ArrangeOrder: ChartAxisArrangeOrderType,
    AutoMax: Boolean,
    AutoMin: Boolean,
    AutoOrigin: Boolean,
    AutoStepHelp: Boolean,
    AutoStepMain: Boolean,
    AxisTitle: XPropertySet,
    AxisType: Double,
    CharAutoKerning: Boolean,
    CharBackColor: Color,
    CharBackTransparent: Boolean,
    CharBorderDistance: Double,
    CharBottomBorder: BorderLine2,
    CharBottomBorderDistance: Double,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
    CharCrossedOut: Boolean,
    CharEmphasis: Double,
    CharEscapement: Double,
    CharEscapementHeight: Double,
    CharFlash: Boolean,
    CharFontCharSet: Double,
    CharFontFamily: Double,
    CharFontName: String,
    CharFontPitch: Double,
    CharFontStyleName: String,
    CharFontType: Double,
    CharHeight: Double,
    CharHidden: Boolean,
    CharHighlight: Color,
    CharInteropGrabBag: SafeArray[PropertyValue],
    CharKeepTogether: Boolean,
    CharKerning: Double,
    CharLeftBorder: BorderLine2,
    CharLeftBorderDistance: Double,
    CharLocale: Locale,
    CharNoHyphenation: Boolean,
    CharNoLineBreak: Boolean,
    CharPosture: FontSlant,
    CharRelief: Double,
    CharRightBorder: BorderLine2,
    CharRightBorderDistance: Double,
    CharRotation: Double,
    CharRotationIsFitToLine: Boolean,
    CharScaleWidth: Double,
    CharShadingValue: Double,
    CharShadowFormat: ShadowFormat,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharStyleName: String,
    CharStyleNames: SafeArray[String],
    CharTopBorder: BorderLine2,
    CharTopBorderDistance: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharUnderlineHasColor: Boolean,
    CharWeight: Double,
    CharWordMode: Boolean,
    CrossoverPosition: ChartAxisPosition,
    CrossoverValue: Double,
    DisplayLabels: Boolean,
    GapWidth: Double,
    HelpMarks: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    LabelPosition: ChartAxisLabelPosition,
    LineCap: LineCap,
    LineColor: Color,
    LineDash: LineDash,
    LineDashName: String,
    LineEnd: PolyPolygonBezierCoords,
    LineEndCenter: Boolean,
    LineEndName: String,
    LineEndWidth: Double,
    LineJoint: LineJoint,
    LineStart: PolyPolygonBezierCoords,
    LineStartCenter: Boolean,
    LineStartName: String,
    LineStartWidth: Double,
    LineStyle: LineStyle,
    LineTransparence: Double,
    LineWidth: Double,
    LinkNumberFormatToSource: Boolean,
    Logarithmic: Boolean,
    MajorGrid: XPropertySet,
    MarkPosition: ChartAxisMarkPosition,
    Marks: Double,
    Max: Double,
    Min: Double,
    MinorGrid: XPropertySet,
    NumberFormat: Double,
    Origin: Double,
    Overlap: Double,
    PropertySetInfo: XPropertySetInfo,
    ReverseDirection: Boolean,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    StepHelp: Double,
    StepHelpCount: Double,
    StepMain: Double,
    TextBreak: Boolean,
    TextCanOverlap: Boolean,
    TextRotation: Double,
    TextUserDefinedAttributes: XNameContainer,
    TimeIncrement: TimeIncrement,
    UnvisitedCharStyleName: String,
    UserDefinedAttributes: XNameContainer,
    VisitedCharStyleName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getAxisTitle: () => XPropertySet,
    getMajorGrid: () => XPropertySet,
    getMinorGrid: () => XPropertySet,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ChartAxis = {
    val __obj = js.Dynamic.literal(ArrangeOrder = ArrangeOrder, AutoMax = AutoMax, AutoMin = AutoMin, AutoOrigin = AutoOrigin, AutoStepHelp = AutoStepHelp, AutoStepMain = AutoStepMain, AxisTitle = AxisTitle, AxisType = AxisType, CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontFamily = CharFontFamily, CharFontName = CharFontName, CharFontPitch = CharFontPitch, CharFontStyleName = CharFontStyleName, CharFontType = CharFontType, CharHeight = CharHeight, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWordMode = CharWordMode, CrossoverPosition = CrossoverPosition, CrossoverValue = CrossoverValue, DisplayLabels = DisplayLabels, GapWidth = GapWidth, HelpMarks = HelpMarks, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, LabelPosition = LabelPosition, LineCap = LineCap, LineColor = LineColor, LineDash = LineDash, LineDashName = LineDashName, LineEnd = LineEnd, LineEndCenter = LineEndCenter, LineEndName = LineEndName, LineEndWidth = LineEndWidth, LineJoint = LineJoint, LineStart = LineStart, LineStartCenter = LineStartCenter, LineStartName = LineStartName, LineStartWidth = LineStartWidth, LineStyle = LineStyle, LineTransparence = LineTransparence, LineWidth = LineWidth, LinkNumberFormatToSource = LinkNumberFormatToSource, Logarithmic = Logarithmic, MajorGrid = MajorGrid, MarkPosition = MarkPosition, Marks = Marks, Max = Max, Min = Min, MinorGrid = MinorGrid, NumberFormat = NumberFormat, Origin = Origin, Overlap = Overlap, PropertySetInfo = PropertySetInfo, ReverseDirection = ReverseDirection, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, StepHelp = StepHelp, StepHelpCount = StepHelpCount, StepMain = StepMain, TextBreak = TextBreak, TextCanOverlap = TextCanOverlap, TextRotation = TextRotation, TextUserDefinedAttributes = TextUserDefinedAttributes, TimeIncrement = TimeIncrement, UnvisitedCharStyleName = UnvisitedCharStyleName, UserDefinedAttributes = UserDefinedAttributes, VisitedCharStyleName = VisitedCharStyleName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getAxisTitle = js.Any.fromFunction0(getAxisTitle), getMajorGrid = js.Any.fromFunction0(getMajorGrid), getMinorGrid = js.Any.fromFunction0(getMinorGrid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ChartAxis]
  }
}

