package typings.agGrid.iViewportDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewportDatasource extends js.Object {
  /** Gets called once when viewPort is no longer used. If you need to do any cleanup, do it here. */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** Gets called exactly once before viewPort is used. Passes methods to be used to tell viewPort of data loads / changes. */
  def init(params: IViewportDatasourceParams): Unit = js.native
  /** Tell the viewport what the scroll position of the grid is, so it knows what rows it has to get */
  def setViewportRange(firstRow: Double, lastRow: Double): Unit = js.native
}

object IViewportDatasource {
  @scala.inline
  def apply(init: IViewportDatasourceParams => Unit, setViewportRange: (Double, Double) => Unit): IViewportDatasource = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), setViewportRange = js.Any.fromFunction2(setViewportRange))
    __obj.asInstanceOf[IViewportDatasource]
  }
  @scala.inline
  implicit class IViewportDatasourceOps[Self <: IViewportDatasource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInit(value: IViewportDatasourceParams => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setSetViewportRange(value: (Double, Double) => Unit): Self = this.set("setViewportRange", js.Any.fromFunction2(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
  }
  
}

