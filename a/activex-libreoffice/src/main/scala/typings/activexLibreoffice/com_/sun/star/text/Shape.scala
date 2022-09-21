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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the service of shapes in a text document */
trait Shape
  extends StObject
     with typings.activexLibreoffice.com_.sun.star.drawing.Shape {
  
  /**
    * contains the text frame the current frame is anchored to.
    *
    * The value is valid only if the AnchorType is TextContentAnchorType::AT_FRAME.
    */
  var AnchorFrame: XTextFrame
  
  /**
    * contains the number of the page where the objects are anchored.
    *
    * The value is valid only if the AnchorType is TextContentAnchorType::AT_PAGE.
    */
  var AnchorPageNo: Double
  
  /** specifies how the text content is attached to its surrounding {@link Text} . */
  var AnchorType: TextContentAnchorType
  
  /** contains the bottom margin of the object. */
  var BottomMargin: Double
  
  /** the text flows only around the contour of the object. */
  var ContourOutside: Boolean
  
  /**
    * determines the end position of the shape in horizontal left-to-right layout
    *
    * This property is needed for the export of the OASIS Open Office file format to the OpenOffice.org file format. It provides the end position property
    * of the included service {@link com.sun.star.drawing.Shape} converted to the horizontal left-to-right layout.
    * @since OOo 2.0
    */
  var EndPositionInHoriL2R: Point
  
  /**
    * determines the horizontal orientation of the object.
    * @see BaseFrame.HoriOrientation
    */
  var HoriOrient: Double
  
  /**
    * contains the horizontal position of the object (1/100 mm).
    *
    * It is only valid if "HoriOrient" is HoriOrientation_NONE.
    */
  var HoriOrientPosition: Double
  
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var HoriOrientRelation: Double
  
  /** contains the left margin of the object. */
  var LeftMargin: Double
  
  /** determines if the object is opaque or transparent for text. */
  var Opaque: Boolean
  
  /**
    * determines layout direction the position attributes of the shape is given
    *
    * Valid values are given by {@link PositionLayoutDir}
    * @since OOo 2.0
    */
  var PositionLayoutDir: Double
  
  /** contains the right margin of the object. */
  var RightMargin: Double
  
  /**
    * determines the start position of the shape in horizontal left-to-right layout
    *
    * This property is needed for the export of the OASIS Open Office file format to the OpenOffice.org file format. It provides the start position property
    * of the included service {@link com.sun.star.drawing.Shape} converted to the horizontal left-to-right layout.
    * @since OOo 2.0
    */
  var StartPositionInHoriL2R: Point
  
  /**
    * determines the type of the surrounding text.
    * @deprecated Deprecated
    */
  var Surround: WrapTextMode
  
  /** determines if the text of the paragraph in which the object is anchored, wraps around the object. */
  var SurroundAnchorOnly: Boolean
  
  /** determines if the text wraps around the contour of the object. */
  var SurroundContour: Boolean
  
  /**
    * contains a text range where the shape should be anchored to.
    *
    * There are two different ways to get newly created shapes into the text document. One of them is to use the insertTextContent() method of the {@link
    * com.sun.star.text.XSimpleText} . The other is to call the add() method of the {@link com.sun.star.drawing.XShapes} interface. To be able to determine
    * an anchor position for shape that are anchored at a certain text position the property {@link TextRange} is used.
    *
    * This property is used when the shape gets inserted/added and becomes invalid after that.
    */
  var TextRange: XTextRange
  
  /** contains the top margin of the object. */
  var TopMargin: Double
  
  /**
    * determines the transformation of the shape in horizontal left-to-right layout
    *
    * This property is needed for the export of the OASIS Open Office file format to the OpenOffice.org file format. It provides the transformation property
    * of the included service {@link com.sun.star.drawing.Shape} converted to the horizontal left-to-right layout.
    * @since OOo 2.0
    */
  var TransformationInHoriL2R: HomogenMatrix3
  
  /**
    * determines the vertical orientation of the object.
    * @see BaseFrame.VertOrientation
    */
  var VertOrient: Double
  
  /**
    * contains the vertical position of the object (1/100 mm).
    *
    * It is only valid if {@link TextEmbeddedObject.VertOrient} is {@link VertOrientation.NONE} .
    */
  var VertOrientPosition: Double
  
  /**
    * determines the environment of the object to which the orientation is related.
    * @see BaseFrame.RelOrientation
    */
  var VertOrientRelation: Double
  
  /**
    * determines the influence of the text wrap on the positioning of the shape
    *
    * The value of this property is only evaluated for the positioning of the shape, if the text document setting ConsiderTextWrapOnObjPos is `TRUE` . Valid
    * values are given by {@link WrapInfluenceOnPosition}
    * @since OOo 2.0
    */
  var WrapInfluenceOnPosition: Double
}
object Shape {
  
  inline def apply(
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
    getPropertyValue: String => Any,
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, Any) => Unit,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[Any]) => SafeArray[SetPropertyTolerantFailed],
    setSize: Size => Unit
  ): Shape = {
    val __obj = js.Dynamic.literal(AnchorFrame = AnchorFrame.asInstanceOf[js.Any], AnchorPageNo = AnchorPageNo.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], ContourOutside = ContourOutside.asInstanceOf[js.Any], EndPositionInHoriL2R = EndPositionInHoriL2R.asInstanceOf[js.Any], GluePoints = GluePoints.asInstanceOf[js.Any], HoriOrient = HoriOrient.asInstanceOf[js.Any], HoriOrientPosition = HoriOrientPosition.asInstanceOf[js.Any], HoriOrientRelation = HoriOrientRelation.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], InteropGrabBag = InteropGrabBag.asInstanceOf[js.Any], LayerID = LayerID.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], MoveProtect = MoveProtect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Opaque = Opaque.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionLayoutDir = PositionLayoutDir.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], ShapeUserDefinedAttributes = ShapeUserDefinedAttributes.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtect = SizeProtect.asInstanceOf[js.Any], StartPositionInHoriL2R = StartPositionInHoriL2R.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Surround = Surround.asInstanceOf[js.Any], SurroundAnchorOnly = SurroundAnchorOnly.asInstanceOf[js.Any], SurroundContour = SurroundContour.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], TransformationInHoriL2R = TransformationInHoriL2R.asInstanceOf[js.Any], VertOrient = VertOrient.asInstanceOf[js.Any], VertOrientPosition = VertOrientPosition.asInstanceOf[js.Any], VertOrientRelation = VertOrientRelation.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], WrapInfluenceOnPosition = WrapInfluenceOnPosition.asInstanceOf[js.Any], ZOrder = ZOrder.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getGluePoints = js.Any.fromFunction0(getGluePoints), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[Shape]
  }
  
  extension [Self <: Shape](x: Self) {
    
    inline def setAnchorFrame(value: XTextFrame): Self = StObject.set(x, "AnchorFrame", value.asInstanceOf[js.Any])
    
    inline def setAnchorPageNo(value: Double): Self = StObject.set(x, "AnchorPageNo", value.asInstanceOf[js.Any])
    
    inline def setAnchorType(value: TextContentAnchorType): Self = StObject.set(x, "AnchorType", value.asInstanceOf[js.Any])
    
    inline def setBottomMargin(value: Double): Self = StObject.set(x, "BottomMargin", value.asInstanceOf[js.Any])
    
    inline def setContourOutside(value: Boolean): Self = StObject.set(x, "ContourOutside", value.asInstanceOf[js.Any])
    
    inline def setEndPositionInHoriL2R(value: Point): Self = StObject.set(x, "EndPositionInHoriL2R", value.asInstanceOf[js.Any])
    
    inline def setHoriOrient(value: Double): Self = StObject.set(x, "HoriOrient", value.asInstanceOf[js.Any])
    
    inline def setHoriOrientPosition(value: Double): Self = StObject.set(x, "HoriOrientPosition", value.asInstanceOf[js.Any])
    
    inline def setHoriOrientRelation(value: Double): Self = StObject.set(x, "HoriOrientRelation", value.asInstanceOf[js.Any])
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    inline def setOpaque(value: Boolean): Self = StObject.set(x, "Opaque", value.asInstanceOf[js.Any])
    
    inline def setPositionLayoutDir(value: Double): Self = StObject.set(x, "PositionLayoutDir", value.asInstanceOf[js.Any])
    
    inline def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
    
    inline def setStartPositionInHoriL2R(value: Point): Self = StObject.set(x, "StartPositionInHoriL2R", value.asInstanceOf[js.Any])
    
    inline def setSurround(value: WrapTextMode): Self = StObject.set(x, "Surround", value.asInstanceOf[js.Any])
    
    inline def setSurroundAnchorOnly(value: Boolean): Self = StObject.set(x, "SurroundAnchorOnly", value.asInstanceOf[js.Any])
    
    inline def setSurroundContour(value: Boolean): Self = StObject.set(x, "SurroundContour", value.asInstanceOf[js.Any])
    
    inline def setTextRange(value: XTextRange): Self = StObject.set(x, "TextRange", value.asInstanceOf[js.Any])
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
    
    inline def setTransformationInHoriL2R(value: HomogenMatrix3): Self = StObject.set(x, "TransformationInHoriL2R", value.asInstanceOf[js.Any])
    
    inline def setVertOrient(value: Double): Self = StObject.set(x, "VertOrient", value.asInstanceOf[js.Any])
    
    inline def setVertOrientPosition(value: Double): Self = StObject.set(x, "VertOrientPosition", value.asInstanceOf[js.Any])
    
    inline def setVertOrientRelation(value: Double): Self = StObject.set(x, "VertOrientRelation", value.asInstanceOf[js.Any])
    
    inline def setWrapInfluenceOnPosition(value: Double): Self = StObject.set(x, "WrapInfluenceOnPosition", value.asInstanceOf[js.Any])
  }
}
