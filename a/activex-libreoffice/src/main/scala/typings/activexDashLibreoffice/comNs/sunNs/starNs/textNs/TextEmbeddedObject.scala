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
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XEmbeddedObjectSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the properties and methods of an embedded object. */
trait TextEmbeddedObject
  extends BaseFrame
     with XEmbeddedObjectSupplier {
  var CLSID: String
  /** This is the component for the OLE2 object. */
  var Component: XComponent
  /**
    * This is the model for the OLE2 object.
    *
    * This property if void if the OLE2 is not an Office component.
    */
  var Model: XModel
}

object TextEmbeddedObject {
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
    CLSID: String,
    Component: XComponent,
    ContentProtected: Boolean,
    Description: String,
    EmbeddedObject: XComponent,
    FillGradient: Gradient,
    FillGradientName: String,
    FillStyle: FillStyle,
    FrameInteropGrabBag: SafeArray[PropertyValue],
    FrameStyleName: String,
    Height: Double,
    HoriOrient: Double,
    HoriOrientPosition: Double,
    HoriOrientRelation: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    IsSyncHeightToWidth: Boolean,
    IsSyncWidthToHeight: Boolean,
    LayoutSize: Size,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    Model: XModel,
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
    WrapInfluenceOnPosition: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getEmbeddedObject: () => XComponent,
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
  ): TextEmbeddedObject = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorFrame = AnchorFrame, AnchorPageNo = AnchorPageNo, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, CLSID = CLSID, Component = Component, ContentProtected = ContentProtected, Description = Description, EmbeddedObject = EmbeddedObject, FillGradient = FillGradient, FillGradientName = FillGradientName, FillStyle = FillStyle, FrameInteropGrabBag = FrameInteropGrabBag, FrameStyleName = FrameStyleName, Height = Height, HoriOrient = HoriOrient, HoriOrientPosition = HoriOrientPosition, HoriOrientRelation = HoriOrientRelation, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, IsSyncHeightToWidth = IsSyncHeightToWidth, IsSyncWidthToHeight = IsSyncWidthToHeight, LayoutSize = LayoutSize, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, Model = Model, Name = Name, Opaque = Opaque, PageToggle = PageToggle, Position = Position, PositionProtected = PositionProtected, Print = Print, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, ServerMap = ServerMap, ShadowFormat = ShadowFormat, ShadowTransparence = ShadowTransparence, ShapeType = ShapeType, Size = Size, SizeProtected = SizeProtected, Surround = Surround, SurroundAnchorOnly = SurroundAnchorOnly, TextWrap = TextWrap, Title = Title, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, VertOrient = VertOrient, VertOrientPosition = VertOrientPosition, VertOrientRelation = VertOrientRelation, Width = Width, WrapInfluenceOnPosition = WrapInfluenceOnPosition, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[TextEmbeddedObject]
  }
}

