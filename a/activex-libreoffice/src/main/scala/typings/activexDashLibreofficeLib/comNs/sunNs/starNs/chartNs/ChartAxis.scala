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
  var TimeIncrement: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.TimeIncrement
}

object ChartAxis {
  @scala.inline
  def apply(
    ArrangeOrder: ChartAxisArrangeOrderType,
    AutoMax: scala.Boolean,
    AutoMin: scala.Boolean,
    AutoOrigin: scala.Boolean,
    AutoStepHelp: scala.Boolean,
    AutoStepMain: scala.Boolean,
    AxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    AxisType: scala.Double,
    CharAutoKerning: scala.Boolean,
    CharBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharBackTransparent: scala.Boolean,
    CharBorderDistance: scala.Double,
    CharBottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharBottomBorderDistance: scala.Double,
    CharCaseMap: scala.Double,
    CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharCombineIsOn: scala.Boolean,
    CharCombinePrefix: java.lang.String,
    CharCombineSuffix: java.lang.String,
    CharContoured: scala.Boolean,
    CharCrossedOut: scala.Boolean,
    CharEmphasis: scala.Double,
    CharEscapement: scala.Double,
    CharEscapementHeight: scala.Double,
    CharFlash: scala.Boolean,
    CharFontCharSet: scala.Double,
    CharFontFamily: scala.Double,
    CharFontName: java.lang.String,
    CharFontPitch: scala.Double,
    CharFontStyleName: java.lang.String,
    CharFontType: scala.Double,
    CharHeight: scala.Double,
    CharHidden: scala.Boolean,
    CharHighlight: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CharKeepTogether: scala.Boolean,
    CharKerning: scala.Double,
    CharLeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharLeftBorderDistance: scala.Double,
    CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharNoHyphenation: scala.Boolean,
    CharNoLineBreak: scala.Boolean,
    CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharRelief: scala.Double,
    CharRightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharRightBorderDistance: scala.Double,
    CharRotation: scala.Double,
    CharRotationIsFitToLine: scala.Boolean,
    CharScaleWidth: scala.Double,
    CharShadingValue: scala.Double,
    CharShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    CharShadowed: scala.Boolean,
    CharStrikeout: scala.Double,
    CharStyleName: java.lang.String,
    CharStyleNames: stdLib.SafeArray[java.lang.String],
    CharTopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharTopBorderDistance: scala.Double,
    CharUnderline: scala.Double,
    CharUnderlineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharUnderlineHasColor: scala.Boolean,
    CharWeight: scala.Double,
    CharWordMode: scala.Boolean,
    CrossoverPosition: ChartAxisPosition,
    CrossoverValue: scala.Double,
    DisplayLabels: scala.Boolean,
    GapWidth: scala.Double,
    HelpMarks: scala.Double,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    LabelPosition: ChartAxisLabelPosition,
    LineCap: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineCap,
    LineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    LineDash: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineDash,
    LineDashName: java.lang.String,
    LineEnd: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords,
    LineEndCenter: scala.Boolean,
    LineEndName: java.lang.String,
    LineEndWidth: scala.Double,
    LineJoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint,
    LineStart: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords,
    LineStartCenter: scala.Boolean,
    LineStartName: java.lang.String,
    LineStartWidth: scala.Double,
    LineStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle,
    LineTransparence: scala.Double,
    LineWidth: scala.Double,
    LinkNumberFormatToSource: scala.Boolean,
    Logarithmic: scala.Boolean,
    MajorGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    MarkPosition: ChartAxisMarkPosition,
    Marks: scala.Double,
    Max: scala.Double,
    Min: scala.Double,
    MinorGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    NumberFormat: scala.Double,
    Origin: scala.Double,
    Overlap: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReverseDirection: scala.Boolean,
    RubyAdjust: scala.Double,
    RubyCharStyleName: java.lang.String,
    RubyIsAbove: scala.Boolean,
    RubyText: java.lang.String,
    StepHelp: scala.Double,
    StepHelpCount: scala.Double,
    StepMain: scala.Double,
    TextBreak: scala.Boolean,
    TextCanOverlap: scala.Boolean,
    TextRotation: scala.Double,
    TextUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    TimeIncrement: TimeIncrement,
    UnvisitedCharStyleName: java.lang.String,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    VisitedCharStyleName: java.lang.String,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getMajorGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getMinorGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): ChartAxis = {
    val __obj = js.Dynamic.literal(ArrangeOrder = ArrangeOrder, AutoMax = AutoMax, AutoMin = AutoMin, AutoOrigin = AutoOrigin, AutoStepHelp = AutoStepHelp, AutoStepMain = AutoStepMain, AxisTitle = AxisTitle, AxisType = AxisType, CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontFamily = CharFontFamily, CharFontName = CharFontName, CharFontPitch = CharFontPitch, CharFontStyleName = CharFontStyleName, CharFontType = CharFontType, CharHeight = CharHeight, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWordMode = CharWordMode, CrossoverPosition = CrossoverPosition, CrossoverValue = CrossoverValue, DisplayLabels = DisplayLabels, GapWidth = GapWidth, HelpMarks = HelpMarks, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, LabelPosition = LabelPosition, LineCap = LineCap, LineColor = LineColor, LineDash = LineDash, LineDashName = LineDashName, LineEnd = LineEnd, LineEndCenter = LineEndCenter, LineEndName = LineEndName, LineEndWidth = LineEndWidth, LineJoint = LineJoint, LineStart = LineStart, LineStartCenter = LineStartCenter, LineStartName = LineStartName, LineStartWidth = LineStartWidth, LineStyle = LineStyle, LineTransparence = LineTransparence, LineWidth = LineWidth, LinkNumberFormatToSource = LinkNumberFormatToSource, Logarithmic = Logarithmic, MajorGrid = MajorGrid, MarkPosition = MarkPosition, Marks = Marks, Max = Max, Min = Min, MinorGrid = MinorGrid, NumberFormat = NumberFormat, Origin = Origin, Overlap = Overlap, PropertySetInfo = PropertySetInfo, ReverseDirection = ReverseDirection, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, StepHelp = StepHelp, StepHelpCount = StepHelpCount, StepMain = StepMain, TextBreak = TextBreak, TextCanOverlap = TextCanOverlap, TextRotation = TextRotation, TextUserDefinedAttributes = TextUserDefinedAttributes, TimeIncrement = TimeIncrement, UnvisitedCharStyleName = UnvisitedCharStyleName, UserDefinedAttributes = UserDefinedAttributes, VisitedCharStyleName = VisitedCharStyleName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getAxisTitle = js.Any.fromFunction0(getAxisTitle), getMajorGrid = js.Any.fromFunction0(getMajorGrid), getMinorGrid = js.Any.fromFunction0(getMinorGrid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ChartAxis]
  }
}

