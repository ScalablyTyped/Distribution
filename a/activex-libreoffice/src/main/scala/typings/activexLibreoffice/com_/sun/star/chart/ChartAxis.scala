package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.drawing.LineCap
import typings.activexLibreoffice.com_.sun.star.drawing.LineDash
import typings.activexLibreoffice.com_.sun.star.drawing.LineJoint
import typings.activexLibreoffice.com_.sun.star.drawing.LineProperties
import typings.activexLibreoffice.com_.sun.star.drawing.LineStyle
import typings.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typings.activexLibreoffice.com_.sun.star.table.BorderLine2
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the axes in a diagram.
  *
  * Note: The text properties correlate to all axis description elements, not to just a single text element.
  */
trait ChartAxis
  extends StObject
     with LineProperties
     with CharacterProperties
     with UserDefinedAttributesSupplier
     with XAxis
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
  var TimeIncrement: typings.activexLibreoffice.com_.sun.star.chart.TimeIncrement
}
object ChartAxis {
  
  inline def apply(
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
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): ChartAxis = {
    val __obj = js.Dynamic.literal(ArrangeOrder = ArrangeOrder.asInstanceOf[js.Any], AutoMax = AutoMax.asInstanceOf[js.Any], AutoMin = AutoMin.asInstanceOf[js.Any], AutoOrigin = AutoOrigin.asInstanceOf[js.Any], AutoStepHelp = AutoStepHelp.asInstanceOf[js.Any], AutoStepMain = AutoStepMain.asInstanceOf[js.Any], AxisTitle = AxisTitle.asInstanceOf[js.Any], AxisType = AxisType.asInstanceOf[js.Any], CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], CrossoverPosition = CrossoverPosition.asInstanceOf[js.Any], CrossoverValue = CrossoverValue.asInstanceOf[js.Any], DisplayLabels = DisplayLabels.asInstanceOf[js.Any], GapWidth = GapWidth.asInstanceOf[js.Any], HelpMarks = HelpMarks.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], LabelPosition = LabelPosition.asInstanceOf[js.Any], LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], LinkNumberFormatToSource = LinkNumberFormatToSource.asInstanceOf[js.Any], Logarithmic = Logarithmic.asInstanceOf[js.Any], MajorGrid = MajorGrid.asInstanceOf[js.Any], MarkPosition = MarkPosition.asInstanceOf[js.Any], Marks = Marks.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], MinorGrid = MinorGrid.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], Overlap = Overlap.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReverseDirection = ReverseDirection.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], StepHelp = StepHelp.asInstanceOf[js.Any], StepHelpCount = StepHelpCount.asInstanceOf[js.Any], StepMain = StepMain.asInstanceOf[js.Any], TextBreak = TextBreak.asInstanceOf[js.Any], TextCanOverlap = TextCanOverlap.asInstanceOf[js.Any], TextRotation = TextRotation.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TimeIncrement = TimeIncrement.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getAxisTitle = js.Any.fromFunction0(getAxisTitle), getMajorGrid = js.Any.fromFunction0(getMajorGrid), getMinorGrid = js.Any.fromFunction0(getMinorGrid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ChartAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartAxis] (val x: Self) extends AnyVal {
    
    inline def setArrangeOrder(value: ChartAxisArrangeOrderType): Self = StObject.set(x, "ArrangeOrder", value.asInstanceOf[js.Any])
    
    inline def setAutoMax(value: Boolean): Self = StObject.set(x, "AutoMax", value.asInstanceOf[js.Any])
    
    inline def setAutoMin(value: Boolean): Self = StObject.set(x, "AutoMin", value.asInstanceOf[js.Any])
    
    inline def setAutoOrigin(value: Boolean): Self = StObject.set(x, "AutoOrigin", value.asInstanceOf[js.Any])
    
    inline def setAutoStepHelp(value: Boolean): Self = StObject.set(x, "AutoStepHelp", value.asInstanceOf[js.Any])
    
    inline def setAutoStepMain(value: Boolean): Self = StObject.set(x, "AutoStepMain", value.asInstanceOf[js.Any])
    
    inline def setAxisType(value: Double): Self = StObject.set(x, "AxisType", value.asInstanceOf[js.Any])
    
    inline def setCrossoverPosition(value: ChartAxisPosition): Self = StObject.set(x, "CrossoverPosition", value.asInstanceOf[js.Any])
    
    inline def setCrossoverValue(value: Double): Self = StObject.set(x, "CrossoverValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabels(value: Boolean): Self = StObject.set(x, "DisplayLabels", value.asInstanceOf[js.Any])
    
    inline def setGapWidth(value: Double): Self = StObject.set(x, "GapWidth", value.asInstanceOf[js.Any])
    
    inline def setHelpMarks(value: Double): Self = StObject.set(x, "HelpMarks", value.asInstanceOf[js.Any])
    
    inline def setLabelPosition(value: ChartAxisLabelPosition): Self = StObject.set(x, "LabelPosition", value.asInstanceOf[js.Any])
    
    inline def setLinkNumberFormatToSource(value: Boolean): Self = StObject.set(x, "LinkNumberFormatToSource", value.asInstanceOf[js.Any])
    
    inline def setLogarithmic(value: Boolean): Self = StObject.set(x, "Logarithmic", value.asInstanceOf[js.Any])
    
    inline def setMarkPosition(value: ChartAxisMarkPosition): Self = StObject.set(x, "MarkPosition", value.asInstanceOf[js.Any])
    
    inline def setMarks(value: Double): Self = StObject.set(x, "Marks", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Double): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOverlap(value: Double): Self = StObject.set(x, "Overlap", value.asInstanceOf[js.Any])
    
    inline def setReverseDirection(value: Boolean): Self = StObject.set(x, "ReverseDirection", value.asInstanceOf[js.Any])
    
    inline def setStepHelp(value: Double): Self = StObject.set(x, "StepHelp", value.asInstanceOf[js.Any])
    
    inline def setStepHelpCount(value: Double): Self = StObject.set(x, "StepHelpCount", value.asInstanceOf[js.Any])
    
    inline def setStepMain(value: Double): Self = StObject.set(x, "StepMain", value.asInstanceOf[js.Any])
    
    inline def setTextBreak(value: Boolean): Self = StObject.set(x, "TextBreak", value.asInstanceOf[js.Any])
    
    inline def setTextCanOverlap(value: Boolean): Self = StObject.set(x, "TextCanOverlap", value.asInstanceOf[js.Any])
    
    inline def setTextRotation(value: Double): Self = StObject.set(x, "TextRotation", value.asInstanceOf[js.Any])
    
    inline def setTimeIncrement(value: TimeIncrement): Self = StObject.set(x, "TimeIncrement", value.asInstanceOf[js.Any])
  }
}
