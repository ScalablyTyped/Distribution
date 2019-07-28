package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Gradient
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XBitmap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.BitmapMode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.Hatch
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineCap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineDash
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineJoint
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.RectanglePoint
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.GraphicCrop
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies all the properties for the graphic object of a data point (e.g., a single bar in a bar chart).
  *
  * Text properties correlate to the data description of the data point. There is a similar service for a group of graphic elements called {@link
  * ChartDataRowProperties} for the properties of whole data rows.
  * @see ChartDataRowProperties
  */
trait ChartDataPointProperties
  extends Chart3DBarProperties
     with FillProperties
     with LineProperties
     with CharacterProperties
     with UserDefinedAttributesSupplier {
  /**
    * specifies how the captions of data points are displayed.
    * @see ChartDataCaption
    */
  var DataCaption: Double
  /**
    * specifies a relative position for the data label
    * @see DataLabelPlacement
    */
  var LabelPlacement: Double
  /** specifies a string that is used to separate the parts of a data label (caption) */
  var LabelSeparator: String
  /** specifies a number format for the display of the value in the data label */
  var NumberFormat: Double
  /** specifies a number format for the display of the percentage value in the data label */
  var PercentageNumberFormat: Double
  /** the offset by which pie segments in a {@link PieDiagram} are dragged outside from the center. This value is given in percent of the radius. */
  var SegmentOffset: Double
  /**
    * In charts that support symbols, you can set this property to any valid URL that points to a graphic file. This graphic is then used as symbol for each
    * data point.
    *
    * When you query this value you get an internal URL of the embedded graphic.
    * @see ChartSymbolType
    */
  var SymbolBitmapURL: String
  /**
    * specifies the type of symbols if the current chart type supports the usage of symbols.
    * @see ChartSymbolType
    */
  var SymbolType: Double
  /**
    * specifies if the text of a data label (caption) must be wrapped
    * @since LibreOffice 5.1
    */
  var TextWordWrap: Boolean
}

object ChartDataPointProperties {
  @scala.inline
  def apply(
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
    DataCaption: Double,
    FillBackground: Boolean,
    FillBitmap: XBitmap,
    FillBitmapLogicalSize: Boolean,
    FillBitmapMode: BitmapMode,
    FillBitmapName: String,
    FillBitmapOffsetX: Double,
    FillBitmapOffsetY: Double,
    FillBitmapPositionOffsetX: Double,
    FillBitmapPositionOffsetY: Double,
    FillBitmapRectanglePoint: RectanglePoint,
    FillBitmapSizeX: Double,
    FillBitmapSizeY: Double,
    FillBitmapStretch: Boolean,
    FillBitmapTile: Boolean,
    FillBitmapURL: String,
    FillColor: Color,
    FillGradient: Gradient,
    FillGradientName: String,
    FillHatch: Hatch,
    FillHatchName: String,
    FillStyle: FillStyle,
    FillTransparence: Double,
    FillTransparenceGradient: Gradient,
    FillTransparenceGradientName: String,
    GraphicCrop: GraphicCrop,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    LabelPlacement: Double,
    LabelSeparator: String,
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
    NumberFormat: Double,
    PercentageNumberFormat: Double,
    PropertySetInfo: XPropertySetInfo,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    SegmentOffset: Double,
    SolidType: Double,
    SymbolBitmapURL: String,
    SymbolType: Double,
    TextUserDefinedAttributes: XNameContainer,
    TextWordWrap: Boolean,
    UnvisitedCharStyleName: String,
    UserDefinedAttributes: XNameContainer,
    VisitedCharStyleName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ChartDataPointProperties = {
    val __obj = js.Dynamic.literal(CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontFamily = CharFontFamily, CharFontName = CharFontName, CharFontPitch = CharFontPitch, CharFontStyleName = CharFontStyleName, CharFontType = CharFontType, CharHeight = CharHeight, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWordMode = CharWordMode, DataCaption = DataCaption, FillBackground = FillBackground, FillBitmap = FillBitmap, FillBitmapLogicalSize = FillBitmapLogicalSize, FillBitmapMode = FillBitmapMode, FillBitmapName = FillBitmapName, FillBitmapOffsetX = FillBitmapOffsetX, FillBitmapOffsetY = FillBitmapOffsetY, FillBitmapPositionOffsetX = FillBitmapPositionOffsetX, FillBitmapPositionOffsetY = FillBitmapPositionOffsetY, FillBitmapRectanglePoint = FillBitmapRectanglePoint, FillBitmapSizeX = FillBitmapSizeX, FillBitmapSizeY = FillBitmapSizeY, FillBitmapStretch = FillBitmapStretch, FillBitmapTile = FillBitmapTile, FillBitmapURL = FillBitmapURL, FillColor = FillColor, FillGradient = FillGradient, FillGradientName = FillGradientName, FillHatch = FillHatch, FillHatchName = FillHatchName, FillStyle = FillStyle, FillTransparence = FillTransparence, FillTransparenceGradient = FillTransparenceGradient, FillTransparenceGradientName = FillTransparenceGradientName, GraphicCrop = GraphicCrop, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, LabelPlacement = LabelPlacement, LabelSeparator = LabelSeparator, LineCap = LineCap, LineColor = LineColor, LineDash = LineDash, LineDashName = LineDashName, LineEnd = LineEnd, LineEndCenter = LineEndCenter, LineEndName = LineEndName, LineEndWidth = LineEndWidth, LineJoint = LineJoint, LineStart = LineStart, LineStartCenter = LineStartCenter, LineStartName = LineStartName, LineStartWidth = LineStartWidth, LineStyle = LineStyle, LineTransparence = LineTransparence, LineWidth = LineWidth, NumberFormat = NumberFormat, PercentageNumberFormat = PercentageNumberFormat, PropertySetInfo = PropertySetInfo, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, SegmentOffset = SegmentOffset, SolidType = SolidType, SymbolBitmapURL = SymbolBitmapURL, SymbolType = SymbolType, TextUserDefinedAttributes = TextUserDefinedAttributes, TextWordWrap = TextWordWrap, UnvisitedCharStyleName = UnvisitedCharStyleName, UserDefinedAttributes = UserDefinedAttributes, VisitedCharStyleName = VisitedCharStyleName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ChartDataPointProperties]
  }
}

