package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XBitmap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.GetDirectPropertyTolerantResult
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.GetPropertyTolerantResult
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.SetPropertyTolerantFailed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs.XGraphic
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.BreakType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.DropCapFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.LineSpacing
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphAdjust
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.TabStop
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.XStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.WritingMode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XText
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextContent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextCursor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for a graphic shape. */
trait GraphicObjectShape
  extends Text
     with Shape
     with ShadowProperties
     with RotationDescriptor {
  /** If this property is set, the blue channel of this graphic shape is adjusted by the given signed percent value. */
  var AdjustBlue: Double
  /** If this property is set, the contrast of this graphic shape is adjusted by the given signed percent value. */
  var AdjustContrast: Double
  /** If this property is set, the green channel of this graphic shape is adjusted by the given signed percent value. */
  var AdjustGreen: Double
  /** If this property is set, the luminance of this graphic shape is adjusted by the given signed percent value. */
  var AdjustLuminance: Double
  /** If this property is set, the red channel of this graphic shape is adjusted by the given signed percent value. */
  var AdjustRed: Double
  /** If this property is set, the gamma value of this graphic shape is adjusted by the given value. */
  var Gamma: Double
  /** This is the graphic that represents this graphic shape */
  var Graphic: XGraphic
  /** This property selects the color mode that is used for rendering. */
  var GraphicColorMode: ColorMode
  /** Deprecated. Use graphic property instead! This is the bitmap that represents this graphic shape. */
  var GraphicObjectFillBitmap: XBitmap
  /** This is an url to the stream ("in document" or linked graphic) for this graphic shape. */
  var GraphicStreamURL: String
  /** This is an url to the source bitmap for this graphic shape. */
  var GraphicURL: String
  /**
    * This property contains a image map for this graphic.
    * @see com.sun.star.image.ImageMap
    */
  var ImageMap: XIndexContainer
  /**
    * If this property is set, the transparency value of this graphic shape is adjusted by the given unsigned percent value. 100% is fully transparent, 0%
    * is fully opaque.
    */
  var Transparency: Double
}

object GraphicObjectShape {
  @scala.inline
  def apply(
    AdjustBlue: Double,
    AdjustContrast: Double,
    AdjustGreen: Double,
    AdjustLuminance: Double,
    AdjustRed: Double,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BreakType: BreakType,
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
    CharFontCharSetAsian: Double,
    CharFontCharSetComplex: Double,
    CharFontFamily: Double,
    CharFontFamilyAsian: Double,
    CharFontFamilyComplex: Double,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: Double,
    CharFontPitchAsian: Double,
    CharFontPitchComplex: Double,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharFontType: Double,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharHighlight: Color,
    CharInteropGrabBag: SafeArray[PropertyValue],
    CharKeepTogether: Boolean,
    CharKerning: Double,
    CharLeftBorder: BorderLine2,
    CharLeftBorderDistance: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharNoHyphenation: Boolean,
    CharNoLineBreak: Boolean,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
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
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    End: XTextRange,
    Gamma: Double,
    GluePoints: XIndexContainer,
    Graphic: XGraphic,
    GraphicColorMode: ColorMode,
    GraphicObjectFillBitmap: XBitmap,
    GraphicStreamURL: String,
    GraphicURL: String,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    Hyperlink: String,
    ImageMap: XIndexContainer,
    InteropGrabBag: SafeArray[PropertyValue],
    IsNumbering: Boolean,
    LayerID: Double,
    LayerName: String,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    ListId: String,
    MoveProtect: Boolean,
    Name: String,
    NavigationOrder: Double,
    NumberingIsNumber: Boolean,
    NumberingLevel: Double,
    NumberingRules: XIndexReplace,
    NumberingStartValue: Double,
    NumberingStyleName: String,
    OutlineLevel: Double,
    PageDescName: String,
    PageNumberOffset: Double,
    PageStyleName: String,
    ParaAdjust: ParagraphAdjust,
    ParaBackColor: Color,
    ParaBackGraphicFilter: String,
    ParaBackGraphicLocation: GraphicLocation,
    ParaBackGraphicURL: String,
    ParaBackTransparent: Boolean,
    ParaBottomMargin: Double,
    ParaContextMargin: Boolean,
    ParaExpandSingleWord: Boolean,
    ParaFirstLineIndent: Double,
    ParaHyphenationMaxHyphens: Double,
    ParaHyphenationMaxLeadingChars: Double,
    ParaHyphenationMaxTrailingChars: Double,
    ParaInteropGrabBag: SafeArray[PropertyValue],
    ParaIsAutoFirstLineIndent: Boolean,
    ParaIsCharacterDistance: Boolean,
    ParaIsConnectBorder: Boolean,
    ParaIsForbiddenRules: Boolean,
    ParaIsHangingPunctuation: Boolean,
    ParaIsHyphenation: Boolean,
    ParaIsNumberingRestart: Boolean,
    ParaKeepTogether: Boolean,
    ParaLastLineAdjust: Double,
    ParaLeftMargin: Double,
    ParaLineNumberCount: Boolean,
    ParaLineNumberStartValue: Double,
    ParaLineSpacing: LineSpacing,
    ParaOrphans: Double,
    ParaRegisterModeActive: Boolean,
    ParaRightMargin: Double,
    ParaShadowFormat: ShadowFormat,
    ParaSplit: Boolean,
    ParaStyleName: String,
    ParaTabStops: SafeArray[TabStop],
    ParaTopMargin: Double,
    ParaUserDefinedAttributes: XNameContainer,
    ParaVertAlignment: Double,
    ParaWidows: Double,
    Position: Point,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RelativeHeight: Double,
    RelativeHeightRelation: Double,
    RelativeWidth: Double,
    RelativeWidthRelation: Double,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RotateAngle: Double,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    Shadow: Boolean,
    ShadowColor: Color,
    ShadowTransparence: Double,
    ShadowXDistance: Double,
    ShadowYDistance: Double,
    ShapeType: String,
    ShapeUserDefinedAttributes: XNameContainer,
    ShearAngle: Double,
    Size: Size,
    SizeProtect: Boolean,
    Start: XTextRange,
    String: String,
    Style: XStyle,
    TextAnimationAmount: Double,
    TextAnimationCount: Double,
    TextAnimationDelay: Double,
    TextAnimationDirection: TextAnimationDirection,
    TextAnimationKind: TextAnimationKind,
    TextAnimationStartInside: Boolean,
    TextAnimationStopInside: Boolean,
    TextAutoGrowHeight: Boolean,
    TextAutoGrowWidth: Boolean,
    TextContourFrame: Boolean,
    TextFitToSize: TextFitToSizeType,
    TextHorizontalAdjust: TextHorizontalAdjust,
    TextLeftDistance: Double,
    TextLowerDistance: Double,
    TextMaximumFrameHeight: Double,
    TextMaximumFrameWidth: Double,
    TextMinimumFrameHeight: Double,
    TextMinimumFrameWidth: Double,
    TextRightDistance: Double,
    TextUpperDistance: Double,
    TextUserDefinedAttributes: XNameContainer,
    TextVerticalAdjust: TextVerticalAdjust,
    TextWritingMode: WritingMode,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    Transformation: HomogenMatrix3,
    Transparency: Double,
    UnvisitedCharStyleName: String,
    Visible: Boolean,
    VisitedCharStyleName: String,
    WritingMode: Double,
    ZOrder: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    dispose: () => Unit,
    getDirectPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult],
    getEnd: () => XTextRange,
    getGluePoints: () => XIndexContainer,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    getShapeType: () => String,
    getSize: () => Size,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeTextContent: XTextContent => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[_]) => SafeArray[SetPropertyTolerantFailed],
    setSize: Size => Unit,
    setString: String => Unit
  ): GraphicObjectShape = {
    val __obj = js.Dynamic.literal(AdjustBlue = AdjustBlue, AdjustContrast = AdjustContrast, AdjustGreen = AdjustGreen, AdjustLuminance = AdjustLuminance, AdjustRed = AdjustRed, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BreakType = BreakType, CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharFontType = CharFontType, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, CharWordMode = CharWordMode, DropCapCharStyleName = DropCapCharStyleName, DropCapFormat = DropCapFormat, DropCapWholeWord = DropCapWholeWord, End = End, Gamma = Gamma, GluePoints = GluePoints, Graphic = Graphic, GraphicColorMode = GraphicColorMode, GraphicObjectFillBitmap = GraphicObjectFillBitmap, GraphicStreamURL = GraphicStreamURL, GraphicURL = GraphicURL, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, Hyperlink = Hyperlink, ImageMap = ImageMap, InteropGrabBag = InteropGrabBag, IsNumbering = IsNumbering, LayerID = LayerID, LayerName = LayerName, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, ListId = ListId, MoveProtect = MoveProtect, Name = Name, NavigationOrder = NavigationOrder, NumberingIsNumber = NumberingIsNumber, NumberingLevel = NumberingLevel, NumberingRules = NumberingRules, NumberingStartValue = NumberingStartValue, NumberingStyleName = NumberingStyleName, OutlineLevel = OutlineLevel, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, PageStyleName = PageStyleName, ParaAdjust = ParaAdjust, ParaBackColor = ParaBackColor, ParaBackGraphicFilter = ParaBackGraphicFilter, ParaBackGraphicLocation = ParaBackGraphicLocation, ParaBackGraphicURL = ParaBackGraphicURL, ParaBackTransparent = ParaBackTransparent, ParaBottomMargin = ParaBottomMargin, ParaContextMargin = ParaContextMargin, ParaExpandSingleWord = ParaExpandSingleWord, ParaFirstLineIndent = ParaFirstLineIndent, ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars, ParaInteropGrabBag = ParaInteropGrabBag, ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent, ParaIsCharacterDistance = ParaIsCharacterDistance, ParaIsConnectBorder = ParaIsConnectBorder, ParaIsForbiddenRules = ParaIsForbiddenRules, ParaIsHangingPunctuation = ParaIsHangingPunctuation, ParaIsHyphenation = ParaIsHyphenation, ParaIsNumberingRestart = ParaIsNumberingRestart, ParaKeepTogether = ParaKeepTogether, ParaLastLineAdjust = ParaLastLineAdjust, ParaLeftMargin = ParaLeftMargin, ParaLineNumberCount = ParaLineNumberCount, ParaLineNumberStartValue = ParaLineNumberStartValue, ParaLineSpacing = ParaLineSpacing, ParaOrphans = ParaOrphans, ParaRegisterModeActive = ParaRegisterModeActive, ParaRightMargin = ParaRightMargin, ParaShadowFormat = ParaShadowFormat, ParaSplit = ParaSplit, ParaStyleName = ParaStyleName, ParaTabStops = ParaTabStops, ParaTopMargin = ParaTopMargin, ParaUserDefinedAttributes = ParaUserDefinedAttributes, ParaVertAlignment = ParaVertAlignment, ParaWidows = ParaWidows, Position = Position, Printable = Printable, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RotateAngle = RotateAngle, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, Shadow = Shadow, ShadowColor = ShadowColor, ShadowTransparence = ShadowTransparence, ShadowXDistance = ShadowXDistance, ShadowYDistance = ShadowYDistance, ShapeType = ShapeType, ShapeUserDefinedAttributes = ShapeUserDefinedAttributes, ShearAngle = ShearAngle, Size = Size, SizeProtect = SizeProtect, Start = Start, String = String, Style = Style, TextAnimationAmount = TextAnimationAmount, TextAnimationCount = TextAnimationCount, TextAnimationDelay = TextAnimationDelay, TextAnimationDirection = TextAnimationDirection, TextAnimationKind = TextAnimationKind, TextAnimationStartInside = TextAnimationStartInside, TextAnimationStopInside = TextAnimationStopInside, TextAutoGrowHeight = TextAutoGrowHeight, TextAutoGrowWidth = TextAutoGrowWidth, TextContourFrame = TextContourFrame, TextFitToSize = TextFitToSize, TextHorizontalAdjust = TextHorizontalAdjust, TextLeftDistance = TextLeftDistance, TextLowerDistance = TextLowerDistance, TextMaximumFrameHeight = TextMaximumFrameHeight, TextMaximumFrameWidth = TextMaximumFrameWidth, TextMinimumFrameHeight = TextMinimumFrameHeight, TextMinimumFrameWidth = TextMinimumFrameWidth, TextRightDistance = TextRightDistance, TextUpperDistance = TextUpperDistance, TextUserDefinedAttributes = TextUserDefinedAttributes, TextVerticalAdjust = TextVerticalAdjust, TextWritingMode = TextWritingMode, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, Transformation = Transformation, Transparency = Transparency, UnvisitedCharStyleName = UnvisitedCharStyleName, Visible = Visible, VisitedCharStyleName = VisitedCharStyleName, WritingMode = WritingMode, ZOrder = ZOrder, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), dispose = js.Any.fromFunction0(dispose), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getEnd = js.Any.fromFunction0(getEnd), getGluePoints = js.Any.fromFunction0(getGluePoints), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1(setSize), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[GraphicObjectShape]
  }
}

