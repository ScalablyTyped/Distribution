package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Gradient
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.drawing.FillStyle
import typings.activexLibreoffice.com_.sun.star.drawing.TextVerticalAdjust
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a rectangular shape which contains a {@link Text} object and is attached to a piece of surrounding {@link Text} .
  * @see Text  This example shows how to create a {@link TextFrame} and insert it at the very beginning of {@link Text} component. The macro is ready to r
  */
@js.native
trait TextFrame
  extends BaseFrame
     with XTextFrame {
  
  /** determines if the text frame should be editable in a read-only document. (This is usually used in forms.) */
  var EditInReadonly: Boolean = js.native
  
  /** contains the metric height value of the frame. */
  var FrameHeightAbsolute: Double = js.native
  
  /**
    * specifies a width relative to the width of the surrounding text.
    *
    * If the value for "HeightPercent" is 0, the absolute value from is used.
    */
  var FrameHeightPercent: Double = js.native
  
  /** If "AutomaticHeight" is set, then the object grows if it is required by the frame content. */
  var FrameIsAutomaticHeight: Boolean = js.native
  
  /** contains the metric width value of the frame. */
  var FrameWidthAbsolute: Double = js.native
  
  /**
    * specifies a width relative to the width of the surrounding text.
    *
    * If the value for "WidthPercent" is 0, the absolute value from is used.
    */
  var FrameWidthPercent: Double = js.native
  
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
  var IsFollowingTextFlow: Boolean = js.native
  
  /**
    * determines the interpretation of the height and relative height properties.
    * @@see SizeType
    */
  var SizeType: Double = js.native
  
  /**
    * adjusts the vertical position of the text inside of the frame.
    * @see com.sun.star.drawing.TextVerticalAdjust
    * @since LibreOffice 4.3
    */
  var TextVerticalAdjust: typings.activexLibreoffice.com_.sun.star.drawing.TextVerticalAdjust = js.native
  
  /**
    * determines the interpretation of the width and relative width properties.
    * @see SizeType
    * @since OOo 2.4
    */
  var WidthType: Double = js.native
  
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double = js.native
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
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorFrame = AnchorFrame.asInstanceOf[js.Any], AnchorPageNo = AnchorPageNo.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], ContentProtected = ContentProtected.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], EditInReadonly = EditInReadonly.asInstanceOf[js.Any], FillGradient = FillGradient.asInstanceOf[js.Any], FillGradientName = FillGradientName.asInstanceOf[js.Any], FillStyle = FillStyle.asInstanceOf[js.Any], FrameHeightAbsolute = FrameHeightAbsolute.asInstanceOf[js.Any], FrameHeightPercent = FrameHeightPercent.asInstanceOf[js.Any], FrameInteropGrabBag = FrameInteropGrabBag.asInstanceOf[js.Any], FrameIsAutomaticHeight = FrameIsAutomaticHeight.asInstanceOf[js.Any], FrameStyleName = FrameStyleName.asInstanceOf[js.Any], FrameWidthAbsolute = FrameWidthAbsolute.asInstanceOf[js.Any], FrameWidthPercent = FrameWidthPercent.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HoriOrient = HoriOrient.asInstanceOf[js.Any], HoriOrientPosition = HoriOrientPosition.asInstanceOf[js.Any], HoriOrientRelation = HoriOrientRelation.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], IsFollowingTextFlow = IsFollowingTextFlow.asInstanceOf[js.Any], IsSyncHeightToWidth = IsSyncHeightToWidth.asInstanceOf[js.Any], IsSyncWidthToHeight = IsSyncWidthToHeight.asInstanceOf[js.Any], LayoutSize = LayoutSize.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Opaque = Opaque.asInstanceOf[js.Any], PageToggle = PageToggle.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionProtected = PositionProtected.asInstanceOf[js.Any], Print = Print.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ServerMap = ServerMap.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtected = SizeProtected.asInstanceOf[js.Any], SizeType = SizeType.asInstanceOf[js.Any], Surround = Surround.asInstanceOf[js.Any], SurroundAnchorOnly = SurroundAnchorOnly.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextVerticalAdjust = TextVerticalAdjust.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VertOrient = VertOrient.asInstanceOf[js.Any], VertOrientPosition = VertOrientPosition.asInstanceOf[js.Any], VertOrientRelation = VertOrientRelation.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WidthType = WidthType.asInstanceOf[js.Any], WrapInfluenceOnPosition = WrapInfluenceOnPosition.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[TextFrame]
  }
  
  @scala.inline
  implicit class TextFrameOps[Self <: TextFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEditInReadonly(value: Boolean): Self = this.set("EditInReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameHeightAbsolute(value: Double): Self = this.set("FrameHeightAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameHeightPercent(value: Double): Self = this.set("FrameHeightPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIsAutomaticHeight(value: Boolean): Self = this.set("FrameIsAutomaticHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameWidthAbsolute(value: Double): Self = this.set("FrameWidthAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameWidthPercent(value: Double): Self = this.set("FrameWidthPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFollowingTextFlow(value: Boolean): Self = this.set("IsFollowingTextFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeType(value: Double): Self = this.set("SizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVerticalAdjust(value: TextVerticalAdjust): Self = this.set("TextVerticalAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthType(value: Double): Self = this.set("WidthType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingMode(value: Double): Self = this.set("WritingMode", value.asInstanceOf[js.Any])
  }
}
