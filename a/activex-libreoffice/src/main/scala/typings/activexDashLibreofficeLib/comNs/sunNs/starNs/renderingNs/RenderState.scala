package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains information passed to each {@link XCanvas} render operation.
  *
  * This structure contains information considered as the render state, i.e. the common setup required to render each individual {@link XCanvas}
  * primitive.
  * @since OOo 2.0
  */
trait RenderState extends js.Object {
  /**
    * The affine transform associated with this render operation.
    *
    * This is used to transform coordinates of canvas primitives from user space to view space (from which they are subsequently transformed to device space
    * by the view transform).
    */
  var AffineTransform: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D
  /**
    * The clipping area associated with this render operation.
    *
    * This clipping is interpreted in the user coordinate system, i.e. subject to the render state transform followed by the view transform before mapped to
    * device coordinate space.
    *
    * Specifying an empty interface denotes no clipping, i.e. everything rendered to the canvas will be visible (subject to device-dependent constraints, of
    * course). Specifying an empty {@link XPolyPolygon2D} , i.e. a poly-polygon containing zero polygons, or an {@link XPolyPolygon2D} with any number of
    * empty sub-polygons, denotes the NULL clip. That means, nothing rendered to the canvas will be visible.
    */
  var Clip: XPolyPolygon2D
  /**
    * The composition mode associated with this render operation.
    *
    * The composite mode determines in which way the primitive and possibly existing background is combined. The permissible values must be one out of the
    * {@link CompositeOperation} constants.
    */
  var CompositeOperation: scala.Double
  /**
    * The device color associated with this render operation.
    *
    * Note that this need not be RGB here, but depends on the active device color space.
    * @see XGraphicDevice
    * @see XColorSpace
    */
  var DeviceColor: activexDashInteropLib.SafeArray[ColorComponent]
}

