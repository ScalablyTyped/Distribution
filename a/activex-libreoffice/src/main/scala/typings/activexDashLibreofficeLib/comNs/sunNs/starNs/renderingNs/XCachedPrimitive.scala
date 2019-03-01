package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for cached repaint of already drawn {@link XCanvas} primitives.
  *
  * This interface provides a method to quickly redraw some {@link XCanvas} primitives, using cached data.
  * @since OOo 2.0
  */
trait XCachedPrimitive
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Redraw the cached primitive.
    *
    * Redraw the cached primitive, with a possibly new view state.
    * @param aState The view state to be used when redrawing the primitive. The view state is of course permitted to differ from the one used for initial rend
    * @returns a value of type {@link RepaintResult} , denoting the result of this operation.
    * @throws com::sun::star::lang::IllegalArgumentException if the view transformation matrix is singular.
    */
  def redraw(aState: ViewState): scala.Double
}

object XCachedPrimitive {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    redraw: js.Function1[ViewState, scala.Double],
    release: js.Function0[scala.Unit]
  ): XCachedPrimitive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("redraw")(redraw)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCachedPrimitive]
  }
}

