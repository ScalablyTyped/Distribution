package typings
package agDashGridLib.distLibInterfacesIViewportDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewportDatasource extends js.Object {
  /** Gets called once when viewPort is no longer used. If you need to do any cleanup, do it here. */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** Gets called exactly once before viewPort is used. Passes methods to be used to tell viewPort of data loads / changes. */
  def init(params: IViewportDatasourceParams): scala.Unit
  /** Tell the viewport what the scroll position of the grid is, so it knows what rows it has to get */
  def setViewportRange(firstRow: scala.Double, lastRow: scala.Double): scala.Unit
}

object IViewportDatasource {
  @scala.inline
  def apply(
    init: IViewportDatasourceParams => scala.Unit,
    setViewportRange: (scala.Double, scala.Double) => scala.Unit,
    destroy: () => scala.Unit = null
  ): IViewportDatasource = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), setViewportRange = js.Any.fromFunction2(setViewportRange))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IViewportDatasource]
  }
}

