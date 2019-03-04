package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a graphic which can be embedded in {@link Text} . */
trait TextGraphicObject extends BaseFrame {
  /** contains the original size of the bitmap in the graphic object. */
  var ActualSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** changes the display of the blue color channel. It contains percentage values between -100 and +100. */
  var AdjustBlue: scala.Double
  /** changes the display of contrast. It contains percentage values between -100 and +100. */
  var AdjustContrast: scala.Double
  /** changes the display of the green color channel. It contains percentage values between -100 and +100. */
  var AdjustGreen: scala.Double
  /** changes the display of the luminance. It contains percentage values between -100 and +100. */
  var AdjustLuminance: scala.Double
  /** changes the display of the red color channel. It contains percentage values between -100 and +100. */
  var AdjustRed: scala.Double
  /** the text flows only around the contour of the object. */
  var ContourOutside: scala.Boolean
  /** contains the contour of the object as PolyPolygon. */
  var ContourPolyPolygon: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PointSequenceSequence
  /** determines the gamma value of the graphic. */
  var Gamma: scala.Double
  /** contains the graphic. */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /** contains the ColorMode as {@link com.sun.star.drawing.ColorMode} . */
  var GraphicColorMode: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorMode
  /**
    * contains the cropping of the object.
    * @see GraphicCrop
    */
  var GraphicCrop: GraphicCrop
  /** contains the name of the filter of the background graphic of the object. */
  var GraphicFilter: java.lang.String
  /** determines if the graphic is display in inverted colors. It contains percentage values between -100 and +100. */
  var GraphicIsInverted: scala.Boolean
  /** contains the URL of the background graphic of the object */
  var GraphicURL: java.lang.String
  /** determines if the object is horizontally mirrored on even pages. */
  var HoriMirroredOnEvenPages: scala.Boolean
  /** determines if the object is horizontally mirrored on odd pages. */
  var HoriMirroredOnOddPages: scala.Boolean
  /** returns the client-side image map if one is assigned to the object. */
  var ImageMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
  /** determines if the text wraps around the contour of the object. */
  var SurroundContour: scala.Boolean
  /** contains percentage values between -100 and +100. */
  var Transparency: scala.Double
  /** determines if the object is mirrored vertically. */
  var VertMirrored: scala.Boolean
}

object TextGraphicObject {
  @scala.inline
  def apply(
    ActualSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    AdjustBlue: scala.Double,
    AdjustContrast: scala.Double,
    AdjustGreen: scala.Double,
    AdjustLuminance: scala.Double,
    AdjustRed: scala.Double,
    Anchor: XTextRange,
    AnchorFrame: XTextFrame,
    AnchorPageNo: scala.Double,
    AnchorType: TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType],
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BorderDistance: scala.Double,
    BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    BottomBorderDistance: scala.Double,
    BottomMargin: scala.Double,
    ContentProtected: scala.Boolean,
    ContourOutside: scala.Boolean,
    ContourPolyPolygon: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PointSequenceSequence,
    Description: java.lang.String,
    FillGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient,
    FillGradientName: java.lang.String,
    FillStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle,
    FrameInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    FrameStyleName: java.lang.String,
    Gamma: scala.Double,
    Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic,
    GraphicColorMode: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ColorMode,
    GraphicCrop: GraphicCrop,
    GraphicFilter: java.lang.String,
    GraphicIsInverted: scala.Boolean,
    GraphicURL: java.lang.String,
    Height: scala.Double,
    HoriMirroredOnEvenPages: scala.Boolean,
    HoriMirroredOnOddPages: scala.Boolean,
    HoriOrient: scala.Double,
    HoriOrientPosition: scala.Double,
    HoriOrientRelation: scala.Double,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    ImageMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    IsSyncHeightToWidth: scala.Boolean,
    IsSyncWidthToHeight: scala.Boolean,
    LayoutSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    LeftBorderDistance: scala.Double,
    LeftMargin: scala.Double,
    Name: java.lang.String,
    Opaque: scala.Boolean,
    PageToggle: scala.Boolean,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PositionProtected: scala.Boolean,
    Print: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RelativeHeight: scala.Double,
    RelativeHeightRelation: scala.Double,
    RelativeWidth: scala.Double,
    RelativeWidthRelation: scala.Double,
    RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    RightBorderDistance: scala.Double,
    RightMargin: scala.Double,
    ServerMap: scala.Boolean,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    ShadowTransparence: scala.Double,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SizeProtected: scala.Boolean,
    Surround: WrapTextMode,
    SurroundAnchorOnly: scala.Boolean,
    SurroundContour: scala.Boolean,
    TextWrap: WrapTextMode,
    Title: java.lang.String,
    TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    TopBorderDistance: scala.Double,
    TopMargin: scala.Double,
    Transparency: scala.Double,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    VertMirrored: scala.Boolean,
    VertOrient: scala.Double,
    VertOrientPosition: scala.Double,
    VertOrientRelation: scala.Double,
    Width: scala.Double,
    WrapInfluenceOnPosition: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getName: js.Function0[java.lang.String],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
    setName: js.Function1[java.lang.String, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): TextGraphicObject = {
    val __obj = js.Dynamic.literal(ActualSize = ActualSize, AdjustBlue = AdjustBlue, AdjustContrast = AdjustContrast, AdjustGreen = AdjustGreen, AdjustLuminance = AdjustLuminance, AdjustRed = AdjustRed, Anchor = Anchor, AnchorFrame = AnchorFrame, AnchorPageNo = AnchorPageNo, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, ContentProtected = ContentProtected, ContourOutside = ContourOutside, ContourPolyPolygon = ContourPolyPolygon.asInstanceOf[js.Any], Description = Description, FillGradient = FillGradient, FillGradientName = FillGradientName, FillStyle = FillStyle, FrameInteropGrabBag = FrameInteropGrabBag, FrameStyleName = FrameStyleName, Gamma = Gamma, Graphic = Graphic, GraphicColorMode = GraphicColorMode, GraphicCrop = GraphicCrop, GraphicFilter = GraphicFilter, GraphicIsInverted = GraphicIsInverted, GraphicURL = GraphicURL, Height = Height, HoriMirroredOnEvenPages = HoriMirroredOnEvenPages, HoriMirroredOnOddPages = HoriMirroredOnOddPages, HoriOrient = HoriOrient, HoriOrientPosition = HoriOrientPosition, HoriOrientRelation = HoriOrientRelation, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, ImageMap = ImageMap, IsSyncHeightToWidth = IsSyncHeightToWidth, IsSyncWidthToHeight = IsSyncWidthToHeight, LayoutSize = LayoutSize, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, Name = Name, Opaque = Opaque, PageToggle = PageToggle, Position = Position, PositionProtected = PositionProtected, Print = Print, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, ServerMap = ServerMap, ShadowFormat = ShadowFormat, ShadowTransparence = ShadowTransparence, ShapeType = ShapeType, Size = Size, SizeProtected = SizeProtected, Surround = Surround, SurroundAnchorOnly = SurroundAnchorOnly, SurroundContour = SurroundContour, TextWrap = TextWrap, Title = Title, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, Transparency = Transparency, UserDefinedAttributes = UserDefinedAttributes, VertMirrored = VertMirrored, VertOrient = VertOrient, VertOrientPosition = VertOrientPosition, VertOrientRelation = VertOrientRelation, Width = Width, WrapInfluenceOnPosition = WrapInfluenceOnPosition, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getName = getName, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getShapeType = getShapeType, getSize = getSize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setName = setName, setPosition = setPosition, setPropertyValue = setPropertyValue, setSize = setSize)
  
    __obj.asInstanceOf[TextGraphicObject]
  }
}

