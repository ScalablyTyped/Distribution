package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a specialization of the canvas interface for bitmapped canvases.
  *
  * This interface is a specialization of the canvas interface for bitmapped canvases, where additional methods for accessing and moving of bitmap content
  * are provided.
  * @since OOo 2.0
  */
trait XBitmapCanvas extends XCanvas {
  /**
    * This method copies a rectangular area from a place of one canvas to a place on another.
    *
    * This method copies a rectangular area from a place of one canvas to a place on another. Source and destination areas are permitted to overlap. If the
    * source view or render state has a clipping set, the regions clipped away from the source rectangle are regarded fully transparent for the copy
    * operation. The device color for both source and destination render state is ignored, the compositing mode only for the source render state.
    * @param sourceCanvas {@link Canvas} from which to copy the bitmap data. Can be identical to the canvas this method is called on, but must be valid.
    * @param sourceRect Rectangle from which to copy the bitmap data. This rectangle is subject to both view and render transformation, before being applied.
    * @param sourceViewState The view state to apply to the source of this copy operation. The view transformation must be non-singular.
    * @param sourceRenderState The render state to apply to the source of this copy operation. The render transformation must be non-singular, and the composi
    * @param destRect Rectangle into which to copy the bitmap data. This rectangle is subject to both view and render transformation, before being applied. Th
    * @param destViewState The view state to apply to the destination of this copy operation. The view transformation must be non-singular.
    * @param destRenderState The render state to apply to the destination of this copy operation. The render transformation must be non-singular, and the comp
    * @throws com::sun::star::lang::IllegalArgumentException if one of the parameters are not within the specified range.
    */
  def copyRect(
    sourceCanvas: XBitmapCanvas,
    sourceRect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D,
    sourceViewState: ViewState,
    sourceRenderState: RenderState,
    destRect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D,
    destViewState: ViewState,
    destRenderState: RenderState
  ): scala.Unit
}

