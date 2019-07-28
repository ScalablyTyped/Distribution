package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.std.SafeArray
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
  var CustomShapeData: String
  /** This property contains the {@link CustomShapeEngine} service name that has to be used for rendering. */
  var CustomShapeEngine: String
  /**
    * This property describes the geometry of the {@link CustomShape} . The {@link CustomShapeEngine} that is used should be able to get on with the content
    * of this property.
    *
    * If the {@link CustomShapeEngine} property is "com.sun.star.drawing.EnhancedCustomShapeEngine", then this property is containing properties as they are
    * specified in the service {@link com.sun.star.drawing.EnhancedCustomShapeGeometry}
    */
  var CustomShapeGeometry: SafeArray[PropertyValue]
  /** This property describes the URL to a replacement graphic that could be displayed if the {@link CustomShape} engine is not available. */
  var CustomShapeReplacementURL: String
}

object CustomShape {
  @scala.inline
  def apply(
    CustomShapeData: String,
    CustomShapeEngine: String,
    CustomShapeGeometry: SafeArray[PropertyValue],
    CustomShapeReplacementURL: String,
    FillProperties: FillProperties = null,
    LineProperties: LineProperties = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    Text: Text = null
  ): CustomShape = {
    val __obj = js.Dynamic.literal(CustomShapeData = CustomShapeData, CustomShapeEngine = CustomShapeEngine, CustomShapeGeometry = CustomShapeGeometry, CustomShapeReplacementURL = CustomShapeReplacementURL)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, FillProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[CustomShape]
  }
}

