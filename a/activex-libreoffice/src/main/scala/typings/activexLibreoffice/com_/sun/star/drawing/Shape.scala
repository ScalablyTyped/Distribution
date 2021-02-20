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
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XTolerantMultiPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.XStyle
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This abstract service specifies the general characteristics of all {@link Shapes} .
  * @see XShape
  * @see com.sun.star.lang.XComponent
  * @see com.sun.star.text.XText
  * @see ShapeDescriptor
  */
@js.native
trait Shape
  extends XShape
     with XPropertySet
     with XComponent
     with XGluePointsSupplier
     with XTolerantMultiPropertySet {
  
  /** this property lets you get and set a hyperlink for this shape. */
  var Hyperlink: String = js.native
  
  /**
    * Grab bag of shape properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var InteropGrabBag: SafeArray[PropertyValue] = js.native
  
  /** This is the ID of the {@link Layer} to which this {@link Shape} is attached. */
  var LayerID: Double = js.native
  
  /** This is the name of the {@link Layer} to which this {@link Shape} is attached. */
  var LayerName: String = js.native
  
  /** With this set to `TRUE` , this {@link Shape} cannot be moved interactively in the user interface. */
  var MoveProtect: Boolean = js.native
  
  /** This is the name of this {@link Shape} . */
  var Name: String = js.native
  
  /** this property stores the navigation order of this shape. If this value is negative, the navigation order for this shapes page is equal to the z-order. */
  var NavigationOrder: Double = js.native
  
  /** If this is `FALSE` , the {@link Shape} is not visible on printer outputs. */
  var Printable: Boolean = js.native
  
  /**
    * contains the relative height of the object.
    *
    * It is only valid if it is greater than zero.
    * @since LibreOffice 4.3
    */
  var RelativeHeight: Double = js.native
  
  /**
    * contains the relation of the relative height of the object.
    *
    * It is only valid if RelativeHeight is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeHeightRelation: Double = js.native
  
  /**
    * contains the relative width of the object.
    *
    * It is only valid if it is greater than zero.
    * @since LibreOffice 4.3
    */
  var RelativeWidth: Double = js.native
  
  /**
    * contains the relation of the relative width of the object.
    *
    * It is only valid if RelativeWidth is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeWidthRelation: Double = js.native
  
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var ShapeUserDefinedAttributes: XNameContainer = js.native
  
  /** With this set to `TRUE` , this {@link Shape} may not be sized interactively in the user interface. */
  var SizeProtect: Boolean = js.native
  
  /** this property lets you get and set a style for this shape. */
  var Style: XStyle = js.native
  
  /**
    * this property lets you get and set the transformation matrix for this shape.
    *
    * The transformation is a 3x3 homogeneous matrix and can contain translation, rotation, shearing and scaling.
    */
  var Transformation: HomogenMatrix3 = js.native
  
  /**
    * If this is `FALSE` , the {@link Shape} is not visible on screen outputs. Please note that the {@link Shape} may still be visible when printed, see
    * {@link Printable} .
    */
  var Visible: Boolean = js.native
  
  /** is used to query or change the ZOrder of this {@link Shape} . */
  var ZOrder: Double = js.native
}
object Shape {
  
  @scala.inline
  def apply(
    GluePoints: XIndexContainer,
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
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[_]) => SafeArray[SetPropertyTolerantFailed],
    setSize: Size => Unit
  ): Shape = {
    val __obj = js.Dynamic.literal(GluePoints = GluePoints.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], InteropGrabBag = InteropGrabBag.asInstanceOf[js.Any], LayerID = LayerID.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], MoveProtect = MoveProtect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NavigationOrder = NavigationOrder.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RelativeHeight = RelativeHeight.asInstanceOf[js.Any], RelativeHeightRelation = RelativeHeightRelation.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RelativeWidthRelation = RelativeWidthRelation.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], ShapeUserDefinedAttributes = ShapeUserDefinedAttributes.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SizeProtect = SizeProtect.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], ZOrder = ZOrder.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getGluePoints = js.Any.fromFunction0(getGluePoints), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit class ShapeMutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHyperlink(value: String): Self = StObject.set(x, "Hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "InteropGrabBag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerID(value: Double): Self = StObject.set(x, "LayerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerName(value: String): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveProtect(value: Boolean): Self = StObject.set(x, "MoveProtect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOrder(value: Double): Self = StObject.set(x, "NavigationOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintable(value: Boolean): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeHeight(value: Double): Self = StObject.set(x, "RelativeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeHeightRelation(value: Double): Self = StObject.set(x, "RelativeHeightRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeWidth(value: Double): Self = StObject.set(x, "RelativeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeWidthRelation(value: Double): Self = StObject.set(x, "RelativeWidthRelation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "ShapeUserDefinedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeProtect(value: Boolean): Self = StObject.set(x, "SizeProtect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: XStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformation(value: HomogenMatrix3): Self = StObject.set(x, "Transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZOrder(value: Double): Self = StObject.set(x, "ZOrder", value.asInstanceOf[js.Any])
  }
}
