package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Gradient
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a rectangular shape which contains a {@link Text} object and is attached to a piece of surrounding {@link Text} .
  * @see Text  This example shows how to create a {@link TextFrame} and insert it at the very beginning of {@link Text} component. The macro is ready to r
  */
trait TextFrame
  extends BaseFrame
     with XTextFrame {
  /** determines if the text frame should be editable in a read-only document. (This is usually used in forms.) */
  var EditInReadonly: Boolean
  /** contains the metric height value of the frame. */
  var FrameHeightAbsolute: Double
  /**
    * specifies a width relative to the width of the surrounding text.
    *
    * If the value for "HeightPercent" is 0, the absolute value from is used.
    */
  var FrameHeightPercent: Double
  /** If "AutomaticHeight" is set, then the object grows if it is required by the frame content. */
  var FrameIsAutomaticHeight: Boolean
  /** contains the metric width value of the frame. */
  var FrameWidthAbsolute: Double
  /**
    * specifies a width relative to the width of the surrounding text.
    *
    * If the value for "WidthPercent" is 0, the absolute value from is used.
    */
  var FrameWidthPercent: Double
  /**
    * controls, if the frame follows the text flow or can leave its layout environment
    *
    * If set, the frame follows the text flow and doesn't leaves the layout environment, which is given by its anchor, above and below. E.g.: Anchor resides
    * in the document body then the frame doesn't leave the document body above and below and follows the text flow through the document bodies of the
    * different pages.
    *
    * If not set, the frame doesn't follow the text flow and stays on the page, on which its anchor is found, but it may leave the layout environment, which
    * is given by its anchor. E.g.: Anchor resides in the document body then the frame stays on page, where this document body is, but it could leave the
    * document body above and below, e.g. overlapping with the page header.
    *
    * Note: The areas for the vertical orientation relation at page areas are interpreted in dependence to this property (
    * @see BaseFrameProperties.VertOrientRelation). If property is set, the page area is interpreted as the layout environment, given by its anchor. E.g.: A
    */
  var IsFollowingTextFlow: Boolean
  /**
    * determines the interpretation of the height and relative height properties.
    * @@see SizeType
    */
  var SizeType: Double
  /**
    * adjusts the vertical position of the text inside of the frame.
    * @see com.sun.star.drawing.TextVerticalAdjust
    * @since LibreOffice 4.3
    */
  var TextVerticalAdjust: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust
  /**
    * determines the interpretation of the width and relative width properties.
    * @see SizeType
    * @since OOo 2.4
    */
  var WidthType: Double
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double
}

object TextFrame {
  @scala.inline
  def apply(
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
    Description: String,
    EditInReadonly: Boolean,
    FillGradient: Gradient,
    FillGradientName: String,
    FillStyle: FillStyle,
    FrameHeightAbsolute: Double,
    FrameHeightPercent: Double,
    FrameInteropGrabBag: SafeArray[PropertyValue],
    FrameIsAutomaticHeight: Boolean,
    FrameStyleName: String,
    FrameWidthAbsolute: Double,
    FrameWidthPercent: Double,
    Height: Double,
    HoriOrient: Double,
    HoriOrientPosition: Double,
    HoriOrientRelation: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    IsFollowingTextFlow: Boolean,
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
    SizeType: Double,
    Surround: WrapTextMode,
    SurroundAnchorOnly: Boolean,
    Text: XText,
    TextVerticalAdjust: TextVerticalAdjust,
    TextWrap: WrapTextMode,
    Title: String,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    VertOrient: Double,
    VertOrientPosition: Double,
    VertOrientRelation: Double,
    Width: Double,
    WidthType: Double,
    WrapInfluenceOnPosition: Double,
    WritingMode: Double,
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
    getText: () => XText,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSize: Size => Unit
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorFrame = AnchorFrame, AnchorPageNo = AnchorPageNo, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, ContentProtected = ContentProtected, Description = Description, EditInReadonly = EditInReadonly, FillGradient = FillGradient, FillGradientName = FillGradientName, FillStyle = FillStyle, FrameHeightAbsolute = FrameHeightAbsolute, FrameHeightPercent = FrameHeightPercent, FrameInteropGrabBag = FrameInteropGrabBag, FrameIsAutomaticHeight = FrameIsAutomaticHeight, FrameStyleName = FrameStyleName, FrameWidthAbsolute = FrameWidthAbsolute, FrameWidthPercent = FrameWidthPercent, Height = Height, HoriOrient = HoriOrient, HoriOrientPosition = HoriOrientPosition, HoriOrientRelation = HoriOrientRelation, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, IsFollowingTextFlow = IsFollowingTextFlow, IsSyncHeightToWidth = IsSyncHeightToWidth, IsSyncWidthToHeight = IsSyncWidthToHeight, LayoutSize = LayoutSize, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, Name = Name, Opaque = Opaque, PageToggle = PageToggle, Position = Position, PositionProtected = PositionProtected, Print = Print, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, ServerMap = ServerMap, ShadowFormat = ShadowFormat, ShadowTransparence = ShadowTransparence, ShapeType = ShapeType, Size = Size, SizeProtected = SizeProtected, SizeType = SizeType, Surround = Surround, SurroundAnchorOnly = SurroundAnchorOnly, Text = Text, TextVerticalAdjust = TextVerticalAdjust, TextWrap = TextWrap, Title = Title, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, VertOrient = VertOrient, VertOrientPosition = VertOrientPosition, VertOrientRelation = VertOrientRelation, Width = Width, WidthType = WidthType, WrapInfluenceOnPosition = WrapInfluenceOnPosition, WritingMode = WritingMode, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[TextFrame]
  }
}

