package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for a {@link ConnectorShape} , a specialized {@link Shape} , which can be connected to other {@link Shapes} or GluePoints. */
trait ConnectorShape
  extends Text
     with Shape
     with LineProperties
     with ConnectorProperties
     with ShadowProperties
     with RotationDescriptor {
  /** This property contains the distance of line 1. */
  var EdgeLine1Delta: scala.Double
  /** This property contains the distance of line 2. */
  var EdgeLine2Delta: scala.Double
  /** This property contains the distance of line 3. */
  var EdgeLine3Delta: scala.Double
  /**
    * this is the position of the connectors end point in 100th/mm. For unconnected end points you can get and set the position. For connected end points
    * you can only get the position.
    */
  var EndGluePointIndex: scala.Double
  /** this property holds the index of the glue point the end point of this connector is glued on. */
  var EndPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * this property either holds the shape that the end point of this connector is connected to, or is empty when the end point of the connector is not
    * connected to a shape.
    */
  var EndShape: XShape
  /** this property holds the index of the glue point the start point of this connector is glued on. */
  var StartGluePointIndex: scala.Double
  /**
    * this is the position of the connectors start point in 100th/mm. For unconnected start points you can get and set the position. For connected start
    * points you can only get the position.
    */
  var StartPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * this property either holds the shape that the start point of this connector is connected to, or is empty when the start point of the connector is not
    * connected to a shape.
    */
  var StartShape: XShape
}

object ConnectorShape {
  @scala.inline
  def apply(
    ConnectorProperties: ConnectorProperties = null,
    EdgeLine1Delta: scala.Double,
    EdgeLine2Delta: scala.Double,
    EdgeLine3Delta: scala.Double,
    EndGluePointIndex: scala.Double,
    EndPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    EndShape: XShape,
    LineProperties: LineProperties = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    StartGluePointIndex: scala.Double,
    StartPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    StartShape: XShape,
    Text: Text = null
  ): ConnectorShape = {
    val __obj = js.Dynamic.literal(EdgeLine1Delta = EdgeLine1Delta, EdgeLine2Delta = EdgeLine2Delta, EdgeLine3Delta = EdgeLine3Delta, EndGluePointIndex = EndGluePointIndex, EndPosition = EndPosition, EndShape = EndShape, StartGluePointIndex = StartGluePointIndex, StartPosition = StartPosition, StartShape = StartShape)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ConnectorProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[ConnectorShape]
  }
}

