package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Gradient
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XBitmap
import typings.activexLibreoffice.com_.sun.star.beans.GetDirectPropertyTolerantResult
import typings.activexLibreoffice.com_.sun.star.beans.GetPropertyTolerantResult
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.SetPropertyTolerantFailed
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.XStyle
import typings.activexLibreoffice.com_.sun.star.text.GraphicCrop
import typings.activexLibreoffice.com_.sun.star.text.XText
import typings.activexLibreoffice.com_.sun.star.text.XTextContent
import typings.activexLibreoffice.com_.sun.star.text.XTextCursor
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link CaptionShape} represents a rectangular drawing shape with an additional set of lines. It can be used as a description for a fixed point
  * inside a drawing.
  */
@js.native
trait CaptionShape
  extends Shape
     with FillProperties
     with LineProperties
     with ShadowProperties
     with XText
     with TextProperties
     with RotationDescriptor {
  /** This property specifies the escape angle of the line of a caption. It is only used if `CaptionIsFixedAngle` is set to `TRUE` */
  var CaptionAngle: Double = js.native
  /** This property specifies the absolute escape distance for the line of a caption. */
  var CaptionEscapeAbsolute: Double = js.native
  /**
    * This property specifies the escape direction for the line of a caption.
    * @see CaptionEscapeDirection
    */
  var CaptionEscapeDirection: Double = js.native
  /** This property specifies the relative escape distance for the line of a caption. */
  var CaptionEscapeRelative: Double = js.native
  /** This property specifies the distance between the text area of the caption and the start of the line. */
  var CaptionGap: Double = js.native
  /** If this property is `TRUE` , the property `CaptionEscapeRelative` is used, else the property `CaptionEscapeAbsolute` is used. */
  var CaptionIsEscapeRelative: Boolean = js.native
  /** If this property is `TRUE` , the application determines the best possible length for the caption line. */
  var CaptionIsFitLineLength: Boolean = js.native
  /**
    * This property specifies if the escape angle of the line of a caption is fixed or free. If this is set to `FALSE` , the application can choose the best
    * possible angle. If not, the value in `CaptionAngle` is used.
    */
  var CaptionIsFixedAngle: Boolean = js.native
  /** This property specifies the length of the caption line. */
  var CaptionLineLength: Double = js.native
  /** The caption point property specify the position of the point that is captioned. A set of lines are rendered from the caption area. */
  var CaptionPoint: Point = js.native
  /**
    * This property specifies the geometry of the line of a caption.
    * @see CaptionType
    */
  var CaptionType: Double = js.native
  /** This is the radius of the caption area corners. */
  var CornerRadius: Double = js.native
}

object CaptionShape {
  @scala.inline
  def apply(
    CaptionAngle: Double,
    CaptionEscapeAbsolute: Double,
    CaptionEscapeDirection: Double,
    CaptionEscapeRelative: Double,
    CaptionGap: Double,
    CaptionIsEscapeRelative: Boolean,
    CaptionIsFitLineLength: Boolean,
    CaptionIsFixedAngle: Boolean,
    CaptionLineLength: Double,
    CaptionPoint: Point,
    CaptionType: Double,
    CornerRadius: Double,
    End: XTextRange,
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
    GluePoints: XIndexContainer,
    GraphicCrop: GraphicCrop,
    Hyperlink: String,
    InteropGrabBag: SafeArray[PropertyValue],
    LayerID: Double,
    LayerName: String,
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
    MoveProtect: Boolean,
    Name: String,
    NavigationOrder: Double,
    Position: Point,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RelativeHeight: Double,
    RelativeHeightRelation: Double,
    RelativeWidth: Double,
    RelativeWidthRelation: Double,
    RotationDescriptor: RotationDescriptor,
    Shadow: Boolean,
    ShadowColor: Color,
    ShadowTransparence: Double,
    ShadowXDistance: Double,
    ShadowYDistance: Double,
    ShapeType: String,
    ShapeUserDefinedAttributes: XNameContainer,
    Size: Size,
    SizeProtect: Boolean,
    Start: XTextRange,
    String: String,
    Style: XStyle,
    TextProperties: TextProperties,
    Transformation: HomogenMatrix3,
    Visible: Boolean,
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
  ): CaptionShape = {
    val __obj = js.Dynamic.literal(CaptionAngle = CaptionAngle.asInstanceOf[js.Any], CaptionEscapeAbsolute = CaptionEscapeAbsolute.asInstanceOf[js.Any], CaptionEscapeDirection = CaptionEscapeDirection.asInstanceOf[js.Any], CaptionEscapeRelative = CaptionEscapeRelative.asInstanceOf[js.Any], CaptionGap = CaptionGap.asInstanceOf[js.Any], CaptionIsEscapeRelative = CaptionIsEscapeRelative.asInstanceOf[js.Any], CaptionIsFitLineLength = CaptionIsFitLineLength.asInstanceOf[js.Any], CaptionIsFixedAngle = CaptionIsFixedAngle.asInstanceOf[js.Any], CaptionLineLength = CaptionLineLength.asInstanceOf[js.Any], CaptionPoint = CaptionPoint.asInstanceOf[js.Any], CaptionType = CaptionType.asInstanceOf[js.Any], CornerRadius = CornerRadius.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], FillBackground = FillBackground.asInstanceOf[js.Any], FillBitmap = FillBitmap.asInstanceOf[js.Any], FillBitmapLogicalSize = FillBitmapLogicalSize.asInstanceOf[js.Any], FillBitmapMode = FillBitmapMode.asInstanceOf[js.Any], FillBitmapName = FillBitmapName.asInstanceOf[js.Any], FillBitmapOffsetX = FillBitmapOffsetX.asInstanceOf[js.Any], FillBitmapOffsetY = FillBitmapOffsetY.asInstanceOf[js.Any], FillBitmapPositionOffsetX = FillBitmapPositionOffsetX.asInstanceOf[js.Any], FillBitmapPositionOffsetY = FillBitmapPositionOffsetY.asInstanceOf[js.Any], FillBitmapRectanglePoint = FillBitmapRectanglePoint.asInstanceOf[js.Any], FillBitmapSizeX = FillBitmapSizeX.asInstanceOf[js.Any], FillBitmapSizeY = FillBitmapSizeY.asInstanceOf[js.Any], FillBitmapStretch = FillBitmapStretch.asInstanceOf[js.Any], FillBitmapTile = FillBitmapTile.asInstanceOf[js.Any], FillBitmapURL = FillBitmapURL.asInstanceOf[js.Any], FillColor = FillColor.asInstanceOf[js.Any], FillGradient = FillGradient.asInstanceOf[js.Any], FillGradientName = FillGradientName.asInstanceOf[js.Any], FillHatch = FillHatch.asInstanceOf[js.Any], FillHatchName = FillHatchName.asInstanceOf[js.Any], FillStyle = FillStyle.asInstanceOf[js.Any], FillTransparence = FillTransparence.asInstanceOf[js.Any], FillTransparenceGradient = FillTransparenceGradient.asInstanceOf[js.Any], FillTransparenceGradientName = FillTransparenceGradientName.asInstanceOf[js.Any], GluePoints = GluePoints.asInstanceOf[js.Any], GraphicCrop = GraphicCrop.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], InteropGrabBag = InteropGrabBag.asInstanceOf[js.Any], LayerID = LayerID.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], MoveProtect = MoveProtect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], ShadowColor = ShadowColor.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], ShadowXDistance = ShadowXDistance.asInstanceOf[js.Any], ShadowYDistance = ShadowYDistance.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], ShapeUserDefinedAttributes = ShapeUserDefinedAttributes.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtect = SizeProtect.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], ZOrder = ZOrder.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), dispose = js.Any.fromFunction0(dispose), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getEnd = js.Any.fromFunction0(getEnd), getGluePoints = js.Any.fromFunction0(getGluePoints), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1(setSize), setString = js.Any.fromFunction1(setString))
    js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    js.Dynamic.global.Object.assign(__obj, TextProperties)
    __obj.asInstanceOf[CaptionShape]
  }
  @scala.inline
  implicit class CaptionShapeOps[Self <: CaptionShape] (val x: Self) extends AnyVal {
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
    def setCaptionAngle(value: Double): Self = this.set("CaptionAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionEscapeAbsolute(value: Double): Self = this.set("CaptionEscapeAbsolute", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionEscapeDirection(value: Double): Self = this.set("CaptionEscapeDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionEscapeRelative(value: Double): Self = this.set("CaptionEscapeRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionGap(value: Double): Self = this.set("CaptionGap", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionIsEscapeRelative(value: Boolean): Self = this.set("CaptionIsEscapeRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionIsFitLineLength(value: Boolean): Self = this.set("CaptionIsFitLineLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionIsFixedAngle(value: Boolean): Self = this.set("CaptionIsFixedAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionLineLength(value: Double): Self = this.set("CaptionLineLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionPoint(value: Point): Self = this.set("CaptionPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptionType(value: Double): Self = this.set("CaptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("CornerRadius", value.asInstanceOf[js.Any])
  }
  
}

