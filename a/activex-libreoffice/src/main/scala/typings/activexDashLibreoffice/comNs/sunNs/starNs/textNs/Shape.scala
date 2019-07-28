package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.GetDirectPropertyTolerantResult
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.GetPropertyTolerantResult
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.SetPropertyTolerantFailed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.HomogenMatrix3
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.XStyle
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the service of shapes in a text document */
trait Shape
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.Shape {
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
    val __obj = js.Dynamic.literal(AnchorFrame = AnchorFrame, AnchorPageNo = AnchorPageNo, AnchorType = AnchorType, BottomMargin = BottomMargin, ContourOutside = ContourOutside, EndPositionInHoriL2R = EndPositionInHoriL2R, GluePoints = GluePoints, HoriOrient = HoriOrient, HoriOrientPosition = HoriOrientPosition, HoriOrientRelation = HoriOrientRelation, Hyperlink = Hyperlink, InteropGrabBag = InteropGrabBag, LayerID = LayerID, LayerName = LayerName, LeftMargin = LeftMargin, MoveProtect = MoveProtect, Name = Name, NavigationOrder = NavigationOrder, Opaque = Opaque, Position = Position, PositionLayoutDir = PositionLayoutDir, Printable = Printable, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, RightMargin = RightMargin, ShapeType = ShapeType, ShapeUserDefinedAttributes = ShapeUserDefinedAttributes, Size = Size, SizeProtect = SizeProtect, StartPositionInHoriL2R = StartPositionInHoriL2R, Style = Style, Surround = Surround, SurroundAnchorOnly = SurroundAnchorOnly, SurroundContour = SurroundContour, TextRange = TextRange, TopMargin = TopMargin, Transformation = Transformation, TransformationInHoriL2R = TransformationInHoriL2R, VertOrient = VertOrient, VertOrientPosition = VertOrientPosition, VertOrientRelation = VertOrientRelation, Visible = Visible, WrapInfluenceOnPosition = WrapInfluenceOnPosition, ZOrder = ZOrder, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getGluePoints = js.Any.fromFunction0(getGluePoints), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[Shape]
  }
}

