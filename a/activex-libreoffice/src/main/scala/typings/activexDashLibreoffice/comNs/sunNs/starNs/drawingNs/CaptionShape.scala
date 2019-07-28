package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link CaptionShape} represents a rectangular drawing shape with an additional set of lines. It can be used as a description for a fixed point
  * inside a drawing.
  */
trait CaptionShape
  extends Text
     with Shape
     with FillProperties
     with LineProperties
     with ShadowProperties
     with RotationDescriptor {
  /** This property specifies the escape angle of the line of a caption. It is only used if `CaptionIsFixedAngle` is set to `TRUE` */
  var CaptionAngle: Double
  /** This property specifies the absolute escape distance for the line of a caption. */
  var CaptionEscapeAbsolute: Double
  /**
    * This property specifies the escape direction for the line of a caption.
    * @see CaptionEscapeDirection
    */
  var CaptionEscapeDirection: Double
  /** This property specifies the relative escape distance for the line of a caption. */
  var CaptionEscapeRelative: Double
  /** This property specifies the distance between the text area of the caption and the start of the line. */
  var CaptionGap: Double
  /** If this property is `TRUE` , the property `CaptionEscapeRelative` is used, else the property `CaptionEscapeAbsolute` is used. */
  var CaptionIsEscapeRelative: Boolean
  /** If this property is `TRUE` , the application determines the best possible length for the caption line. */
  var CaptionIsFitLineLength: Boolean
  /**
    * This property specifies if the escape angle of the line of a caption is fixed or free. If this is set to `FALSE` , the application can choose the best
    * possible angle. If not, the value in `CaptionAngle` is used.
    */
  var CaptionIsFixedAngle: Boolean
  /** This property specifies the length of the caption line. */
  var CaptionLineLength: Double
  /** The caption point property specify the position of the point that is captioned. A set of lines are rendered from the caption area. */
  var CaptionPoint: Point
  /**
    * This property specifies the geometry of the line of a caption.
    * @see CaptionType
    */
  var CaptionType: Double
  /** This is the radius of the caption area corners. */
  var CornerRadius: Double
}

object CaptionShape {
  @scala.inline
  def apply(
    CaptionAngle: Double,
    CaptionEscapeAbsolute: Double,
    CaptionEscapeDirection: Double,
    CaptionEscapeRelative: Double,
    CaptionGap: Double,
    CaptionIsEscapeRelative: Boolean,
    CaptionIsFitLineLength: Boolean,
    CaptionIsFixedAngle: Boolean,
    CaptionLineLength: Double,
    CaptionPoint: Point,
    CaptionType: Double,
    CornerRadius: Double,
    FillProperties: FillProperties = null,
    LineProperties: LineProperties = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    Text: Text = null
  ): CaptionShape = {
    val __obj = js.Dynamic.literal(CaptionAngle = CaptionAngle, CaptionEscapeAbsolute = CaptionEscapeAbsolute, CaptionEscapeDirection = CaptionEscapeDirection, CaptionEscapeRelative = CaptionEscapeRelative, CaptionGap = CaptionGap, CaptionIsEscapeRelative = CaptionIsEscapeRelative, CaptionIsFitLineLength = CaptionIsFitLineLength, CaptionIsFixedAngle = CaptionIsFixedAngle, CaptionLineLength = CaptionLineLength, CaptionPoint = CaptionPoint, CaptionType = CaptionType, CornerRadius = CornerRadius)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, FillProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[CaptionShape]
  }
}

