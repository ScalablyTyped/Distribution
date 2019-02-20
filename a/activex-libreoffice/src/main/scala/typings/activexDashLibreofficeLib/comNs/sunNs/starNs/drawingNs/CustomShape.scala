package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for a {@link CustomShape} */
trait CustomShape
  extends Text
     with Shape
     with FillProperties
     with LineProperties
     with ShadowProperties
     with RotationDescriptor {
  /** This property can be used to store data that the {@link CustomShapeEngine} may use for rendering */
  var CustomShapeData: java.lang.String
  /** This property contains the {@link CustomShapeEngine} service name that has to be used for rendering. */
  var CustomShapeEngine: java.lang.String
  /**
    * This property describes the geometry of the {@link CustomShape} . The {@link CustomShapeEngine} that is used should be able to get on with the content
    * of this property.
    *
    * If the {@link CustomShapeEngine} property is "com.sun.star.drawing.EnhancedCustomShapeEngine", then this property is containing properties as they are
    * specified in the service {@link com.sun.star.drawing.EnhancedCustomShapeGeometry}
    */
  var CustomShapeGeometry: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** This property describes the URL to a replacement graphic that could be displayed if the {@link CustomShape} engine is not available. */
  var CustomShapeReplacementURL: java.lang.String
}

