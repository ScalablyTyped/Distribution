package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains information considered the view state.
  *
  * This structure contains information considered the view state, i.e. the invariant setup used when painting a whole view of something.
  * @since OOo 2.0
  */
trait ViewState extends js.Object {
  /**
    * The affine transform associated with the view.
    *
    * This member is used to transform coordinates of draw operations from user space to screen space.
    */
  var AffineTransform: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D
  /**
    * The clipping area associated with the view.
    *
    * This clipping is interpreted in the view coordinate systems, i.e. subject to the view transform before mapping to the device coordinate space.
    *
    * Specifying an empty interface denotes no clipping, i.e. everything rendered to the canvas will be visible (subject to device-dependent constraints, of
    * course). Specifying an empty {@link XPolyPolygon2D} , i.e. a poly-polygon containing zero polygons, or an {@link XPolyPolygon2D} with any number of
    * empty sub-polygons, denotes the NULL clip. That means, nothing rendered to the canvas will be visible.
    */
  var Clip: XPolyPolygon2D
}

object ViewState {
  @scala.inline
  def apply(
    AffineTransform: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D,
    Clip: XPolyPolygon2D
  ): ViewState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AffineTransform")(AffineTransform)
    __obj.updateDynamic("Clip")(Clip)
    __obj.asInstanceOf[ViewState]
  }
}

