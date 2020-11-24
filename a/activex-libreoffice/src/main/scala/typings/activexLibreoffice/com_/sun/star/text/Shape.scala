package typings.activexLibreoffice.com_.sun.star.text

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
import typings.activexLibreoffice.com_.sun.star.drawing.HomogenMatrix3
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.XStyle
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the service of shapes in a text document */
@js.native
trait Shape
  extends typings.activexLibreoffice.com_.sun.star.drawing.Shape {
  
  /**
    * contains the text frame the current frame is anchored to.
    *
    * The value is valid only if the AnchorType is TextContentAnchorType::AT_FRAME.
    */
  var AnchorFrame: XTextFrame = js.native
  
  /**
    * contains the number of the page where the objects are anchored.
    *
    * The value is valid only if the AnchorType is TextContentAnchorType::AT_PAGE.
    */
  var AnchorPageNo: Double = js.native
  
  /** specifies how the text content is attached to its surrounding {@link Text} . */
  var AnchorType: TextContentAnchorType = js.native
  
  /** contains the bottom margin of the object. */
  var BottomMargin: Double = js.native
  
  /** the text flows only around the contour of the object. */
  var ContourOutside: Boolean = js.native
  
  /**
    * determines the end position of the shape in horizontal left-to-right layout
    *
    * This property is needed for the export of the OASIS Open Office file format to the OpenOffice.org file format. It provides the end position property
    * of the included service {@link com.sun.star.drawing.Shape} converted to the horizontal left-to-right layout.
    * @since OOo 2.0
    */
  var EndPositionInHoriL2R: Point = js.native
  
  /**
    * determines the horizontal orientation of the object.
    * @see BaseFrame.HoriOrientation
    */
  var HoriOrient: Double = js.native
  
  /**
    * contains the horizontal position of the object (1/100 mm).
    *
    * It is only valid if "HoriOrient" is HoriOrientation_NONE.
    */
  var HoriOrientPosition: Double = js.native
  
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var HoriOrientRelation: Double = js.native
  
  /** contains the left margin of the object. */
  var LeftMargin: Double = js.native
  
  /** determines if the object is opaque or transparent for text. */
  var Opaque: Boolean = js.native
  
  /**
    * determines layout direction the position attributes of the shape is given
    *
    * Valid values are given by {@link PositionLayoutDir}
    * @since OOo 2.0
    */
  var PositionLayoutDir: Double = js.native
  
  /** contains the right margin of the object. */
  var RightMargin: Double = js.native
  
  /**
    * determines the start position of the shape in horizontal left-to-right layout
    *
    * This property is needed for the export of the OASIS Open Office file format to the OpenOffice.org file format. It provides the start position property
    * of the included service {@link com.sun.star.drawing.Shape} converted to the horizontal left-to-right layout.
    * @since OOo 2.0
    */
  var StartPositionInHoriL2R: Point = js.native
  
  /**
    * determines the type of the surrounding text.
    * @deprecated Deprecated
    */
  var Surround: WrapTextMode = js.native
  
  /** determines if the text of the paragraph in which the object is anchored, wraps around the object. */
  var SurroundAnchorOnly: Boolean = js.native
  
  /** determines if the text wraps around the contour of the object. */
  var SurroundContour: Boolean = js.native
  
  /**
    * contains a text range where the shape should be anchored to.
    *
    * There are two different ways to get newly created shapes into the text document. One of them is to use the insertTextContent() method of the {@link
    * com.sun.star.text.XSimpleText} . The other is to call the add() method of the {@link com.sun.star.drawing.XShapes} interface. To be able to determine
    * an anchor position for shape that are anchored at a certain text position the property {@link TextRange} is used.
    *
    * This property is used when the shape gets inserted/added and becomes invalid after that.
    */
  var TextRange: XTextRange = js.native
  
  /** contains the top margin of the object. */
  var TopMargin: Double = js.native
  
  /**
    * determines the transformation of the shape in horizontal left-to-right layout
    *
    * This property is needed for the export of the OASIS Open Office file format to the OpenOffice.org file format. It provides the transformation property
    * of the included service {@link com.sun.star.drawing.Shape} converted to the horizontal left-to-right layout.
    * @since OOo 2.0
    */
  var TransformationInHoriL2R: HomogenMatrix3 = js.native
  
  /**
    * determines the vertical orientation of the object.
    * @see BaseFrame.VertOrientation
    */
  var VertOrient: Double = js.native
  
  /**
    * contains the vertical position of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.VertOrient} is {@link VertOrientation.NONE} .
    */
  var VertOrientPosition: Double = js.native
  
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var VertOrientRelation: Double = js.native
  
  /**
    * determines the influence of the text wrap on the positioning of the shape
    *
    * The value of this property is only evaluated for the positioning of the shape, if the text document setting ConsiderTextWrapOnObjPos is `TRUE` . Valid
    * values are given by {@link WrapInfluenceOnPosition}
    * @since OOo 2.0
    */
  var WrapInfluenceOnPosition: Double = js.native
}
object Shape {
  
  @scala.inline
  def apply(
    AnchorFrame: XTextFrame,
    AnchorPageNo: Double,
    AnchorType: TextContentAnchorType,
    BottomMargin: Double,
    ContourOutside: Boolean,
    EndPositionInHoriL2R: Point,
    GluePoints: XIndexContainer,
    HoriOrient: Double,
    HoriOrientPosition: Double,
    HoriOrientRelation: Double,
    Hyperlink: String,
    InteropGrabBag: SafeArray[PropertyValue],
    LayerID: Double,
    LayerName: String,
    LeftMargin: Double,
    MoveProtect: Boolean,
    Name: String,
    NavigationOrder: Double,
    Opaque: Boolean,
    Position: Point,
    PositionLayoutDir: Double,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RelativeHeight: Double,
    RelativeHeightRelation: Double,
    RelativeWidth: Double,
    RelativeWidthRelation: Double,
    RightMargin: Double,
    ShapeType: String,
    ShapeUserDefinedAttributes: XNameContainer,
    Size: Size,
    SizeProtect: Boolean,
    StartPositionInHoriL2R: Point,
    Style: XStyle,
    Surround: WrapTextMode,
    SurroundAnchorOnly: Boolean,
    SurroundContour: Boolean,
    TextRange: XTextRange,
    TopMargin: Double,
    Transformation: HomogenMatrix3,
    TransformationInHoriL2R: HomogenMatrix3,
    VertOrient: Double,
    VertOrientPosition: Double,
    VertOrientRelation: Double,
    Visible: Boolean,
    WrapInfluenceOnPosition: Double,
    ZOrder: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    dispose: () => Unit,
    getDirectPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult],
    getGluePoints: () => XIndexContainer,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[_]) => SafeArray[SetPropertyTolerantFailed],
    setSize: Size => Unit
  ): Shape = {
    val __obj = js.Dynamic.literal(AnchorFrame = AnchorFrame.asInstanceOf[js.Any], AnchorPageNo = AnchorPageNo.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], ContourOutside = ContourOutside.asInstanceOf[js.Any], EndPositionInHoriL2R = EndPositionInHoriL2R.asInstanceOf[js.Any], GluePoints = GluePoints.asInstanceOf[js.Any], HoriOrient = HoriOrient.asInstanceOf[js.Any], HoriOrientPosition = HoriOrientPosition.asInstanceOf[js.Any], HoriOrientRelation = HoriOrientRelation.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], InteropGrabBag = InteropGrabBag.asInstanceOf[js.Any], LayerID = LayerID.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], MoveProtect = MoveProtect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Opaque = Opaque.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionLayoutDir = PositionLayoutDir.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], ShapeUserDefinedAttributes = ShapeUserDefinedAttributes.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtect = SizeProtect.asInstanceOf[js.Any], StartPositionInHoriL2R = StartPositionInHoriL2R.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Surround = Surround.asInstanceOf[js.Any], SurroundAnchorOnly = SurroundAnchorOnly.asInstanceOf[js.Any], SurroundContour = SurroundContour.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], TransformationInHoriL2R = TransformationInHoriL2R.asInstanceOf[js.Any], VertOrient = VertOrient.asInstanceOf[js.Any], VertOrientPosition = VertOrientPosition.asInstanceOf[js.Any], VertOrientRelation = VertOrientRelation.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], WrapInfluenceOnPosition = WrapInfluenceOnPosition.asInstanceOf[js.Any], ZOrder = ZOrder.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getGluePoints = js.Any.fromFunction0(getGluePoints), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
    
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
    def setAnchorFrame(value: XTextFrame): Self = this.set("AnchorFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPageNo(value: Double): Self = this.set("AnchorPageNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorType(value: TextContentAnchorType): Self = this.set("AnchorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMargin(value: Double): Self = this.set("BottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContourOutside(value: Boolean): Self = this.set("ContourOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPositionInHoriL2R(value: Point): Self = this.set("EndPositionInHoriL2R", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoriOrient(value: Double): Self = this.set("HoriOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoriOrientPosition(value: Double): Self = this.set("HoriOrientPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoriOrientRelation(value: Double): Self = this.set("HoriOrientRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("LeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpaque(value: Boolean): Self = this.set("Opaque", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionLayoutDir(value: Double): Self = this.set("PositionLayoutDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("RightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPositionInHoriL2R(value: Point): Self = this.set("StartPositionInHoriL2R", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurround(value: WrapTextMode): Self = this.set("Surround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundAnchorOnly(value: Boolean): Self = this.set("SurroundAnchorOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundContour(value: Boolean): Self = this.set("SurroundContour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRange(value: XTextRange): Self = this.set("TextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("TopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationInHoriL2R(value: HomogenMatrix3): Self = this.set("TransformationInHoriL2R", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOrient(value: Double): Self = this.set("VertOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOrientPosition(value: Double): Self = this.set("VertOrientPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOrientRelation(value: Double): Self = this.set("VertOrientRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapInfluenceOnPosition(value: Double): Self = this.set("WrapInfluenceOnPosition", value.asInstanceOf[js.Any])
  }
}
