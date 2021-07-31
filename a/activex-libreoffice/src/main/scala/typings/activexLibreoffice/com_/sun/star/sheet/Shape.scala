package typings.activexLibreoffice.com_.sun.star.sheet

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
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the service of shapes in a spreadsheet document */
trait Shape
  extends StObject
     with typings.activexLibreoffice.com_.sun.star.drawing.Shape {
  
  /**
    * contains the object where this shape is anchored on.
    *
    * Possible objects are {@link XSpreadsheet} and XCell.
    */
  var Anchor: XInterface
  
  /**
    * contains the horizontal position of the object (1/100 mm).
    *
    * The position is relative to the anchor object.
    *
    * If the underlying table layout direction is left to right the position is the difference of the left top edge of the anchor object and the left top
    * edge of the drawing object.
    *
    * If the underlying table layout direction is right to left the position is the difference of the right top edge of the anchor object and the right top
    * edge of the drawing object.
    */
  var HoriOrientPosition: Double
  
  /**
    * contains the vertical position of the object (1/100 mm).
    *
    * The position is relative to the anchor object.
    *
    * If the underlying table layout direction is left to right the position is the difference of the left top edge of the anchor object and the left top
    * edge of the drawing object.
    *
    * If the underlying table layout direction is right to left the position is the difference of the right top edge of the anchor object and the right top
    * edge of the drawing object.
    */
  var VertOrientPosition: Double
}
object Shape {
  
  @scala.inline
  def apply(
    Anchor: XInterface,
    GluePoints: XIndexContainer,
    HoriOrientPosition: Double,
    Hyperlink: String,
    InteropGrabBag: SafeArray[PropertyValue],
    LayerID: Double,
    LayerName: String,
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
    ShapeType: String,
    ShapeUserDefinedAttributes: XNameContainer,
    Size: Size,
    SizeProtect: Boolean,
    Style: XStyle,
    Transformation: HomogenMatrix3,
    VertOrientPosition: Double,
    Visible: Boolean,
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
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[js.Any]) => SafeArray[SetPropertyTolerantFailed],
    setSize: Size => Unit
  ): Shape = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], GluePoints = GluePoints.asInstanceOf[js.Any], HoriOrientPosition = HoriOrientPosition.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], InteropGrabBag = InteropGrabBag.asInstanceOf[js.Any], LayerID = LayerID.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], MoveProtect = MoveProtect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], ShapeUserDefinedAttributes = ShapeUserDefinedAttributes.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtect = SizeProtect.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], VertOrientPosition = VertOrientPosition.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], ZOrder = ZOrder.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getGluePoints = js.Any.fromFunction0(getGluePoints), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: XInterface): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoriOrientPosition(value: Double): Self = StObject.set(x, "HoriOrientPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOrientPosition(value: Double): Self = StObject.set(x, "VertOrientPosition", value.asInstanceOf[js.Any])
  }
}
