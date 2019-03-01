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
    CharInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
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
    CharStyleNames: activexDashInteropLib.SafeArray[java.lang.String],
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
    acquire: js.Function0[scala.Unit],
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
    getAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getMajorGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getMinorGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): ChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ArrangeOrder")(ArrangeOrder)
    __obj.updateDynamic("AutoMax")(AutoMax)
    __obj.updateDynamic("AutoMin")(AutoMin)
    __obj.updateDynamic("AutoOrigin")(AutoOrigin)
    __obj.updateDynamic("AutoStepHelp")(AutoStepHelp)
    __obj.updateDynamic("AutoStepMain")(AutoStepMain)
    __obj.updateDynamic("AxisTitle")(AxisTitle)
    __obj.updateDynamic("AxisType")(AxisType)
    __obj.updateDynamic("CharAutoKerning")(CharAutoKerning)
    __obj.updateDynamic("CharBackColor")(CharBackColor)
    __obj.updateDynamic("CharBackTransparent")(CharBackTransparent)
    __obj.updateDynamic("CharBorderDistance")(CharBorderDistance)
    __obj.updateDynamic("CharBottomBorder")(CharBottomBorder)
    __obj.updateDynamic("CharBottomBorderDistance")(CharBottomBorderDistance)
    __obj.updateDynamic("CharCaseMap")(CharCaseMap)
    __obj.updateDynamic("CharColor")(CharColor)
    __obj.updateDynamic("CharCombineIsOn")(CharCombineIsOn)
    __obj.updateDynamic("CharCombinePrefix")(CharCombinePrefix)
    __obj.updateDynamic("CharCombineSuffix")(CharCombineSuffix)
    __obj.updateDynamic("CharContoured")(CharContoured)
    __obj.updateDynamic("CharCrossedOut")(CharCrossedOut)
    __obj.updateDynamic("CharEmphasis")(CharEmphasis)
    __obj.updateDynamic("CharEscapement")(CharEscapement)
    __obj.updateDynamic("CharEscapementHeight")(CharEscapementHeight)
    __obj.updateDynamic("CharFlash")(CharFlash)
    __obj.updateDynamic("CharFontCharSet")(CharFontCharSet)
    __obj.updateDynamic("CharFontFamily")(CharFontFamily)
    __obj.updateDynamic("CharFontName")(CharFontName)
    __obj.updateDynamic("CharFontPitch")(CharFontPitch)
    __obj.updateDynamic("CharFontStyleName")(CharFontStyleName)
    __obj.updateDynamic("CharFontType")(CharFontType)
    __obj.updateDynamic("CharHeight")(CharHeight)
    __obj.updateDynamic("CharHidden")(CharHidden)
    __obj.updateDynamic("CharHighlight")(CharHighlight)
    __obj.updateDynamic("CharInteropGrabBag")(CharInteropGrabBag)
    __obj.updateDynamic("CharKeepTogether")(CharKeepTogether)
    __obj.updateDynamic("CharKerning")(CharKerning)
    __obj.updateDynamic("CharLeftBorder")(CharLeftBorder)
    __obj.updateDynamic("CharLeftBorderDistance")(CharLeftBorderDistance)
    __obj.updateDynamic("CharLocale")(CharLocale)
    __obj.updateDynamic("CharNoHyphenation")(CharNoHyphenation)
    __obj.updateDynamic("CharNoLineBreak")(CharNoLineBreak)
    __obj.updateDynamic("CharPosture")(CharPosture)
    __obj.updateDynamic("CharRelief")(CharRelief)
    __obj.updateDynamic("CharRightBorder")(CharRightBorder)
    __obj.updateDynamic("CharRightBorderDistance")(CharRightBorderDistance)
    __obj.updateDynamic("CharRotation")(CharRotation)
    __obj.updateDynamic("CharRotationIsFitToLine")(CharRotationIsFitToLine)
    __obj.updateDynamic("CharScaleWidth")(CharScaleWidth)
    __obj.updateDynamic("CharShadingValue")(CharShadingValue)
    __obj.updateDynamic("CharShadowFormat")(CharShadowFormat)
    __obj.updateDynamic("CharShadowed")(CharShadowed)
    __obj.updateDynamic("CharStrikeout")(CharStrikeout)
    __obj.updateDynamic("CharStyleName")(CharStyleName)
    __obj.updateDynamic("CharStyleNames")(CharStyleNames)
    __obj.updateDynamic("CharTopBorder")(CharTopBorder)
    __obj.updateDynamic("CharTopBorderDistance")(CharTopBorderDistance)
    __obj.updateDynamic("CharUnderline")(CharUnderline)
    __obj.updateDynamic("CharUnderlineColor")(CharUnderlineColor)
    __obj.updateDynamic("CharUnderlineHasColor")(CharUnderlineHasColor)
    __obj.updateDynamic("CharWeight")(CharWeight)
    __obj.updateDynamic("CharWordMode")(CharWordMode)
    __obj.updateDynamic("CrossoverPosition")(CrossoverPosition)
    __obj.updateDynamic("CrossoverValue")(CrossoverValue)
    __obj.updateDynamic("DisplayLabels")(DisplayLabels)
    __obj.updateDynamic("GapWidth")(GapWidth)
    __obj.updateDynamic("HelpMarks")(HelpMarks)
    __obj.updateDynamic("HyperLinkName")(HyperLinkName)
    __obj.updateDynamic("HyperLinkTarget")(HyperLinkTarget)
    __obj.updateDynamic("HyperLinkURL")(HyperLinkURL)
    __obj.updateDynamic("LabelPosition")(LabelPosition)
    __obj.updateDynamic("LineCap")(LineCap)
    __obj.updateDynamic("LineColor")(LineColor)
    __obj.updateDynamic("LineDash")(LineDash)
    __obj.updateDynamic("LineDashName")(LineDashName)
    __obj.updateDynamic("LineEnd")(LineEnd)
    __obj.updateDynamic("LineEndCenter")(LineEndCenter)
    __obj.updateDynamic("LineEndName")(LineEndName)
    __obj.updateDynamic("LineEndWidth")(LineEndWidth)
    __obj.updateDynamic("LineJoint")(LineJoint)
    __obj.updateDynamic("LineStart")(LineStart)
    __obj.updateDynamic("LineStartCenter")(LineStartCenter)
    __obj.updateDynamic("LineStartName")(LineStartName)
    __obj.updateDynamic("LineStartWidth")(LineStartWidth)
    __obj.updateDynamic("LineStyle")(LineStyle)
    __obj.updateDynamic("LineTransparence")(LineTransparence)
    __obj.updateDynamic("LineWidth")(LineWidth)
    __obj.updateDynamic("LinkNumberFormatToSource")(LinkNumberFormatToSource)
    __obj.updateDynamic("Logarithmic")(Logarithmic)
    __obj.updateDynamic("MajorGrid")(MajorGrid)
    __obj.updateDynamic("MarkPosition")(MarkPosition)
    __obj.updateDynamic("Marks")(Marks)
    __obj.updateDynamic("Max")(Max)
    __obj.updateDynamic("Min")(Min)
    __obj.updateDynamic("MinorGrid")(MinorGrid)
    __obj.updateDynamic("NumberFormat")(NumberFormat)
    __obj.updateDynamic("Origin")(Origin)
    __obj.updateDynamic("Overlap")(Overlap)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("ReverseDirection")(ReverseDirection)
    __obj.updateDynamic("RubyAdjust")(RubyAdjust)
    __obj.updateDynamic("RubyCharStyleName")(RubyCharStyleName)
    __obj.updateDynamic("RubyIsAbove")(RubyIsAbove)
    __obj.updateDynamic("RubyText")(RubyText)
    __obj.updateDynamic("StepHelp")(StepHelp)
    __obj.updateDynamic("StepHelpCount")(StepHelpCount)
    __obj.updateDynamic("StepMain")(StepMain)
    __obj.updateDynamic("TextBreak")(TextBreak)
    __obj.updateDynamic("TextCanOverlap")(TextCanOverlap)
    __obj.updateDynamic("TextRotation")(TextRotation)
    __obj.updateDynamic("TextUserDefinedAttributes")(TextUserDefinedAttributes)
    __obj.updateDynamic("TimeIncrement")(TimeIncrement)
    __obj.updateDynamic("UnvisitedCharStyleName")(UnvisitedCharStyleName)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("VisitedCharStyleName")(VisitedCharStyleName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getAxisTitle")(getAxisTitle)
    __obj.updateDynamic("getMajorGrid")(getMajorGrid)
    __obj.updateDynamic("getMinorGrid")(getMinorGrid)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[ChartAxis]
  }
}

