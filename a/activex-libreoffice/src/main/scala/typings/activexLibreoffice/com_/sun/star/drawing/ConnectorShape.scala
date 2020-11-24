package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
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
import typings.activexLibreoffice.com_.sun.star.text.XText
import typings.activexLibreoffice.com_.sun.star.text.XTextContent
import typings.activexLibreoffice.com_.sun.star.text.XTextCursor
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service is for a {@link ConnectorShape} , a specialized {@link Shape} , which can be connected to other {@link Shapes} or GluePoints. */
@js.native
trait ConnectorShape
  extends Shape
     with LineProperties
     with ConnectorProperties
     with ShadowProperties
     with XText
     with TextProperties
     with RotationDescriptor {
  
  /** This property contains the distance of line 1. */
  var EdgeLine1Delta: Double = js.native
  
  /** This property contains the distance of line 2. */
  var EdgeLine2Delta: Double = js.native
  
  /** This property contains the distance of line 3. */
  var EdgeLine3Delta: Double = js.native
  
  /**
    * this is the position of the connectors end point in 100th/mm. For unconnected end points you can get and set the position. For connected end points
    * you can only get the position.
    */
  var EndGluePointIndex: Double = js.native
  
  /** this property holds the index of the glue point the end point of this connector is glued on. */
  var EndPosition: Point = js.native
  
  /**
    * this property either holds the shape that the end point of this connector is connected to, or is empty when the end point of the connector is not
    * connected to a shape.
    */
  var EndShape: XShape = js.native
  
  /** this property holds the index of the glue point the start point of this connector is glued on. */
  var StartGluePointIndex: Double = js.native
  
  /**
    * this is the position of the connectors start point in 100th/mm. For unconnected start points you can get and set the position. For connected start
    * points you can only get the position.
    */
  var StartPosition: Point = js.native
  
  /**
    * this property either holds the shape that the start point of this connector is connected to, or is empty when the start point of the connector is not
    * connected to a shape.
    */
  var StartShape: XShape = js.native
}
object ConnectorShape {
  
  @scala.inline
  def apply(
    EdgeKind: ConnectorType,
    EdgeLine1Delta: Double,
    EdgeLine2Delta: Double,
    EdgeLine3Delta: Double,
    EdgeNode1HorzDist: Double,
    EdgeNode1VertDist: Double,
    EdgeNode2HorzDist: Double,
    EdgeNode2VertDist: Double,
    End: XTextRange,
    EndGluePointIndex: Double,
    EndPosition: Point,
    EndShape: XShape,
    GluePoints: XIndexContainer,
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
    StartGluePointIndex: Double,
    StartPosition: Point,
    StartShape: XShape,
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
  ): ConnectorShape = {
    val __obj = js.Dynamic.literal(EdgeKind = EdgeKind.asInstanceOf[js.Any], EdgeLine1Delta = EdgeLine1Delta.asInstanceOf[js.Any], EdgeLine2Delta = EdgeLine2Delta.asInstanceOf[js.Any], EdgeLine3Delta = EdgeLine3Delta.asInstanceOf[js.Any], EdgeNode1HorzDist = EdgeNode1HorzDist.asInstanceOf[js.Any], EdgeNode1VertDist = EdgeNode1VertDist.asInstanceOf[js.Any], EdgeNode2HorzDist = EdgeNode2HorzDist.asInstanceOf[js.Any], EdgeNode2VertDist = EdgeNode2VertDist.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndGluePointIndex = EndGluePointIndex.asInstanceOf[js.Any], EndPosition = EndPosition.asInstanceOf[js.Any], EndShape = EndShape.asInstanceOf[js.Any], GluePoints = GluePoints.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], InteropGrabBag = InteropGrabBag.asInstanceOf[js.Any], LayerID = LayerID.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], MoveProtect = MoveProtect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], ShadowColor = ShadowColor.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], ShadowXDistance = ShadowXDistance.asInstanceOf[js.Any], ShadowYDistance = ShadowYDistance.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], ShapeUserDefinedAttributes = ShapeUserDefinedAttributes.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtect = SizeProtect.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], StartGluePointIndex = StartGluePointIndex.asInstanceOf[js.Any], StartPosition = StartPosition.asInstanceOf[js.Any], StartShape = StartShape.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], ZOrder = ZOrder.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), dispose = js.Any.fromFunction0(dispose), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getEnd = js.Any.fromFunction0(getEnd), getGluePoints = js.Any.fromFunction0(getGluePoints), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1(setSize), setString = js.Any.fromFunction1(setString))
    js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    js.Dynamic.global.Object.assign(__obj, TextProperties)
    __obj.asInstanceOf[ConnectorShape]
  }
  
  @scala.inline
  implicit class ConnectorShapeOps[Self <: ConnectorShape] (val x: Self) extends AnyVal {
    
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
    def setEdgeLine1Delta(value: Double): Self = this.set("EdgeLine1Delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeLine2Delta(value: Double): Self = this.set("EdgeLine2Delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeLine3Delta(value: Double): Self = this.set("EdgeLine3Delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndGluePointIndex(value: Double): Self = this.set("EndGluePointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPosition(value: Point): Self = this.set("EndPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndShape(value: XShape): Self = this.set("EndShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartGluePointIndex(value: Double): Self = this.set("StartGluePointIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPosition(value: Point): Self = this.set("StartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartShape(value: XShape): Self = this.set("StartShape", value.asInstanceOf[js.Any])
  }
}
