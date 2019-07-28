package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link GluePoint} could be attached to a shape or to a page.
  *
  * If a {@link GluePoint} is attached to a shape, it is moved when the shape moves. The ends of connectors can be attached to {@link GluePoint} .
  * @deprecated Deprecated
  * @see GluePoint2
  */
trait GluePoint extends js.Object {
  /** The alignment of a `GluePoint` defines how the position of the point is affected by resizing the parent `Shape` . */
  var Alignment: Double
  /** This is the direction in which the connector line leaves the {@link GluePoint} . */
  var EscapeDirection: Double
  /** This is the position of this {@link GluePoint} . */
  var Position: Point
  /** If this is `TRUE` , then the position of this {@link GluePoint} is absolute on a page and is not relative to a shape. */
  var PositionAbsolute: Boolean
}

object GluePoint {
  @scala.inline
  def apply(Alignment: Double, EscapeDirection: Double, Position: Point, PositionAbsolute: Boolean): GluePoint = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, EscapeDirection = EscapeDirection, Position = Position, PositionAbsolute = PositionAbsolute)
  
    __obj.asInstanceOf[GluePoint]
  }
}

