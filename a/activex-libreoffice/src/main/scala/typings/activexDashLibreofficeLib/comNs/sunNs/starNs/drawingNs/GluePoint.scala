package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

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
  var Alignment: scala.Double
  /** This is the direction in which the connector line leaves the {@link GluePoint} . */
  var EscapeDirection: scala.Double
  /** This is the position of this {@link GluePoint} . */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** If this is `TRUE` , then the position of this {@link GluePoint} is absolute on a page and is not relative to a shape. */
  var PositionAbsolute: scala.Boolean
}

