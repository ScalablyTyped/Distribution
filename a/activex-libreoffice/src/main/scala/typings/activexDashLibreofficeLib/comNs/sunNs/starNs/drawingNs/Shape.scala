package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This abstract service specifies the general characteristics of all {@link Shapes} .
  * @see XShape
  * @see com.sun.star.lang.XComponent
  * @see com.sun.star.text.XText
  * @see ShapeDescriptor
  */
trait Shape
  extends XShape
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XGluePointsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet {
  /** this property lets you get and set a hyperlink for this shape. */
  var Hyperlink: java.lang.String
  /**
    * Grab bag of shape properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var InteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** This is the ID of the {@link Layer} to which this {@link Shape} is attached. */
  var LayerID: scala.Double
  /** This is the name of the {@link Layer} to which this {@link Shape} is attached. */
  var LayerName: java.lang.String
  /** With this set to `TRUE` , this {@link Shape} cannot be moved interactively in the user interface. */
  var MoveProtect: scala.Boolean
  /** This is the name of this {@link Shape} . */
  var Name: java.lang.String
  /** this property stores the navigation order of this shape. If this value is negative, the navigation order for this shapes page is equal to the z-order. */
  var NavigationOrder: scala.Double
  /** If this is `FALSE` , the {@link Shape} is not visible on printer outputs. */
  var Printable: scala.Boolean
  /**
    * contains the relative height of the object.
    *
    * It is only valid if it is greater than zero.
    * @since LibreOffice 4.3
    */
  var RelativeHeight: scala.Double
  /**
    * contains the relation of the relative height of the object.
    *
    * It is only valid if RelativeHeight is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeHeightRelation: scala.Double
  /**
    * contains the relative width of the object.
    *
    * It is only valid if it is greater than zero.
    * @since LibreOffice 4.3
    */
  var RelativeWidth: scala.Double
  /**
    * contains the relation of the relative width of the object.
    *
    * It is only valid if RelativeWidth is greater than zero.
    * @see com.sun.star.text.RelOrientation
    * @since LibreOffice 4.3
    */
  var RelativeWidthRelation: scala.Double
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var ShapeUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** With this set to `TRUE` , this {@link Shape} may not be sized interactively in the user interface. */
  var SizeProtect: scala.Boolean
  /** this property lets you get and set a style for this shape. */
  var Style: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyle
  /**
    * this property lets you get and set the transformation matrix for this shape.
    *
    * The transformation is a 3x3 homogeneous matrix and can contain translation, rotation, shearing and scaling.
    */
  var Transformation: HomogenMatrix3
  /**
    * If this is `FALSE` , the {@link Shape} is not visible on screen outputs. Please note that the {@link Shape} may still be visible when printed, see
    * {@link Printable} .
    */
  var Visible: scala.Boolean
  /** is used to query or change the ZOrder of this {@link Shape} . */
  var ZOrder: scala.Double
}

object Shape {
  @scala.inline
  def apply(
    GluePoints: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer,
    Hyperlink: java.lang.String,
    InteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    LayerID: scala.Double,
    LayerName: java.lang.String,
    MoveProtect: scala.Boolean,
    Name: java.lang.String,
    NavigationOrder: scala.Double,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RelativeHeight: scala.Double,
    RelativeHeightRelation: scala.Double,
    RelativeWidth: scala.Double,
    RelativeWidthRelation: scala.Double,
    ShapeType: java.lang.String,
    ShapeUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SizeProtect: scala.Boolean,
    Style: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyle,
    Transformation: HomogenMatrix3,
    Visible: scala.Boolean,
    ZOrder: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    getDirectPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[
        activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.GetDirectPropertyTolerantResult
      ]
    ],
    getGluePoints: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.GetPropertyTolerantResult]
    ],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValuesTolerant: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.SetPropertyTolerantFailed]
    ],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): Shape = {
    val __obj = js.Dynamic.literal(GluePoints = GluePoints, Hyperlink = Hyperlink, InteropGrabBag = InteropGrabBag, LayerID = LayerID, LayerName = LayerName, MoveProtect = MoveProtect, Name = Name, NavigationOrder = NavigationOrder, Position = Position, Printable = Printable, PropertySetInfo = PropertySetInfo, RelativeHeight = RelativeHeight, RelativeHeightRelation = RelativeHeightRelation, RelativeWidth = RelativeWidth, RelativeWidthRelation = RelativeWidthRelation, ShapeType = ShapeType, ShapeUserDefinedAttributes = ShapeUserDefinedAttributes, Size = Size, SizeProtect = SizeProtect, Style = Style, Transformation = Transformation, Visible = Visible, ZOrder = ZOrder, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, dispose = dispose, getDirectPropertyValuesTolerant = getDirectPropertyValuesTolerant, getGluePoints = getGluePoints, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValuesTolerant = getPropertyValuesTolerant, getShapeType = getShapeType, getSize = getSize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPosition = setPosition, setPropertyValue = setPropertyValue, setPropertyValuesTolerant = setPropertyValuesTolerant, setSize = setSize)
  
    __obj.asInstanceOf[Shape]
  }
}

