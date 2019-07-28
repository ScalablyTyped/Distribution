package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Gradient
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.ColorMode
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.PointSequenceSequence
import typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs.XGraphic
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a graphic which can be embedded in {@link Text} . */
trait TextGraphicObject extends BaseFrame {
  /** contains the original size of the bitmap in the graphic object. */
  var ActualSize: Size
  /** changes the display of the blue color channel. It contains percentage values between -100 and +100. */
  var AdjustBlue: Double
  /** changes the display of contrast. It contains percentage values between -100 and +100. */
  var AdjustContrast: Double
  /** changes the display of the green color channel. It contains percentage values between -100 and +100. */
  var AdjustGreen: Double
  /** changes the display of the luminance. It contains percentage values between -100 and +100. */
  var AdjustLuminance: Double
  /** changes the display of the red color channel. It contains percentage values between -100 and +100. */
  var AdjustRed: Double
  /** the text flows only around the contour of the object. */
  var ContourOutside: Boolean
  /** contains the contour of the object as PolyPolygon. */
  var ContourPolyPolygon: PointSequenceSequence
  /** determines the gamma value of the graphic. */
  var Gamma: Double
  /** contains the graphic. */
  var Graphic: XGraphic
  /** contains the ColorMode as {@link com.sun.star.drawing.ColorMode} . */
  var GraphicColorMode: ColorMode
  /**
    * contains the cropping of the object.
    * @see GraphicCrop
    */
  var GraphicCrop: typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.GraphicCrop
  /** contains the name of the filter of the background graphic of the object. */
  var GraphicFilter: String
  /** determines if the graphic is display in inverted colors. It contains percentage values between -100 and +100. */
  var GraphicIsInverted: Boolean
  /** contains the URL of the background graphic of the object */
  var GraphicURL: String
  /** determines if the object is horizontally mirrored on even pages. */
  var HoriMirroredOnEvenPages: Boolean
  /** determines if the object is horizontally mirrored on odd pages. */
  var HoriMirroredOnOddPages: Boolean
  /** returns the client-side image map if one is assigned to the object. */
  var ImageMap: XIndexContainer
  /** determines if the text wraps around the contour of the object. */
  var SurroundContour: Boolean
  /** contains percentage values between -100 and +100. */
  var Transparency: Double
  /** determines if the object is mirrored vertically. */
  var VertMirrored: Boolean
}

object TextGraphicObject {
  @scala.inline
  def apply(
    ActualSize: Size,
    AdjustBlue: Double,
    AdjustContrast: Double,
    AdjustGreen: Double,
    AdjustLuminance: Double,
    AdjustRed: Double,
    Anchor: XTextRange,
    AnchorFrame: XTextFrame,
    AnchorPageNo: Double,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BottomMargin: Double,
    ContentProtected: Boolean,
    ContourOutside: Boolean,
    ContourPolyPolygon: PointSequenceSequence,
    Description: String,
    FillGradient: Gradient,
    FillGradientName: String,
    FillStyle: FillStyle,
    FrameInteropGrabBag: SafeArray[PropertyValue],
    FrameStyleName: String,
    Gamma: Double,
    Graphic: XGraphic,
    GraphicColorMode: ColorMode,
    GraphicCrop: GraphicCrop,
    GraphicFilter: String,
    GraphicIsInverted: Boolean,
    GraphicURL: String,
    Height: Double,
    HoriMirroredOnEvenPages: Boolean,
    HoriMirroredOnOddPages: Boolean,
    HoriOrient: Double,
    HoriOrientPosition: Double,
    HoriOrientRelation: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    ImageMap: XIndexContainer,
    IsSyncHeightToWidth: Boolean,
    IsSyncWidthToHeight: Boolean,
    LayoutSize: Size,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    Name: String,
    Opaque: Boolean,
    PageToggle: Boolean,
    Position: Point,
    PositionProtected: Boolean,
    Print: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RelativeHeight: Double,
    RelativeHeightRelation: Double,
    RelativeWidth: Double,
    RelativeWidthRelation: Double,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    ServerMap: Boolean,
    ShadowFormat: ShadowFormat,
    ShadowTransparence: Double,
    ShapeType: String,
    Size: Size,
    SizeProtected: Boolean,
    Surround: WrapTextMode,
    SurroundAnchorOnly: Boolean,
    SurroundContour: Boolean,
    TextWrap: WrapTextMode,
    Title: String,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    Transparency: Double,
    UserDefinedAttributes: XNameContainer,
    VertMirrored: Boolean,
    VertOrient: Double,
    VertOrientPosition: Double,
    VertOrientRelation: Double,
    Width: Double,
    WrapInfluenceOnPosition: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getName: () => String,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSize: Size => Unit
  ): TextGraphicObject = {
    val __obj = js.Dynamic.literal(ActualSize = ActualSize, AdjustBlue = AdjustBlue, AdjustContrast = AdjustContrast, AdjustGreen = AdjustGreen, AdjustLuminance = AdjustLuminance, AdjustRed = AdjustRed, Anchor = Anchor, AnchorFrame = AnchorFrame, AnchorPageNo = AnchorPageNo, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, ContentProtected = ContentProtected, ContourOutside = ContourOutside, ContourPolyPolygon = ContourPolyPolygon.asInstanceOf[js.Any], Description = Description, FillGradient = FillGradient, FillGradientName = FillGradientName, FillStyle = FillStyle, FrameInteropGrabBag = FrameInteropGrabBag, FrameStyleName = FrameStyleName, Gamma = Gamma, Graphic = Graphic, GraphicColorMode = GraphicColorMode, GraphicCrop = GraphicCrop, GraphicFilter = GraphicFilter, GraphicIsInverted = GraphicIsInverted, GraphicURL = GraphicURL, Height = Height, HoriMirroredOnEvenPages = HoriMirroredOnEvenPages, HoriMirroredOnOddPages = HoriMirroredOnOddPages, HoriOrient = HoriOrient, HoriOrientPosition = HoriOrientPosition, HoriOrientRelation = HoriOrientRelation, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, ImageMap = ImageMap, IsSyncHeightToWidth = IsSyncHeightToWidth, IsSyncWidthToHeight = IsSyncWidthToHeight, LayoutSize = LayoutSize, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, Name = Name, Opaque = Opaque, PageToggle = PageToggle, Position = Position, PositionProtected = PositionProtected, Print = Print, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, ServerMap = ServerMap, ShadowFormat = ShadowFormat, ShadowTransparence = ShadowTransparence, ShapeType = ShapeType, Size = Size, SizeProtected = SizeProtected, Surround = Surround, SurroundAnchorOnly = SurroundAnchorOnly, SurroundContour = SurroundContour, TextWrap = TextWrap, Title = Title, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, Transparency = Transparency, UserDefinedAttributes = UserDefinedAttributes, VertMirrored = VertMirrored, VertOrient = VertOrient, VertOrientPosition = VertOrientPosition, VertOrientRelation = VertOrientRelation, Width = Width, WrapInfluenceOnPosition = WrapInfluenceOnPosition, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[TextGraphicObject]
  }
}

