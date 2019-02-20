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

