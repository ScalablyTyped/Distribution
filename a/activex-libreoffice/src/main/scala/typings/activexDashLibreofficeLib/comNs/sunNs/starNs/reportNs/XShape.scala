package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XShape extends XReportControlModel {
  /** This property can be used to store data that the CustomShapeEngine may use for rendering */
  var CustomShapeData: java.lang.String
  /** This property contains the CustomShapeEngine service name that has to be used for rendering. */
  var CustomShapeEngine: java.lang.String
  /**
    * This property describes the geometry of the CustomShape. The CustomShapeEngine that is used should be able to get on with the content of this
    * property.
    *
    * If the CustomShapeEngine property is "com.sun.star.drawing.EnhancedCustomShapeEngine", then this property is containing properties as they are
    * specified in the service {@link com.sun.star.drawing.EnhancedCustomShapeGeometry}
    */
  var CustomShapeGeometry: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** determines if the object is opaque or transparent for text. */
  var Opaque: scala.Boolean
  /**
    * this property lets you get and set the transformation matrix for this shape.
    *
    * The transformation is a 3x3 homogeneous matrix and can contain translation, rotation, shearing and scaling.
    */
  var Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HomogenMatrix3
  /** is used to query or change the ZOrder of this {@link Shape} . */
  var ZOrder: scala.Double
}

