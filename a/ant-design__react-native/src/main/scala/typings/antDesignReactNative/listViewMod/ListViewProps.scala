package typings.antDesignReactNative.listViewMod

import typings.antDesignReactNative.anon.Highlight
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewProps[T] extends UltimateListViewProps {
  var children: js.UndefOr[ReactNode] = js.native
  var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, String]] = js.native
  @JSName("numColumns")
  var numColumns_ListViewProps: js.UndefOr[Double] = js.native
  def onFetch(currentPage: Double, startFetch: js.Function0[_], abortFetch: js.Function0[Unit]): Unit = js.native
  def renderItem(item: T, index: Double, separators: Highlight): ReactElement | Null = js.native
}

object ListViewProps {
  @scala.inline
  def apply[T](
    onFetch: (Double, js.Function0[_], js.Function0[Unit]) => Unit,
    renderItem: (T, Double, Highlight) => ReactElement | Null
  ): ListViewProps[T] = {
    val __obj = js.Dynamic.literal(onFetch = js.Any.fromFunction3(onFetch), renderItem = js.Any.fromFunction3(renderItem))
    __obj.asInstanceOf[ListViewProps[T]]
  }
  @scala.inline
  implicit class ListViewPropsOps[Self <: ListViewProps[_], T] (val x: Self with ListViewProps[T]) extends AnyVal {
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
    def setOnFetch(value: (Double, js.Function0[_], js.Function0[Unit]) => Unit): Self = this.set("onFetch", js.Any.fromFunction3(value))
    @scala.inline
    def setRenderItem(value: (T, Double, Highlight) => ReactElement | Null): Self = this.set("renderItem", js.Any.fromFunction3(value))
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setKeyExtractor(value: (/* item */ T, /* index */ Double) => String): Self = this.set("keyExtractor", js.Any.fromFunction2(value))
    @scala.inline
    def deleteKeyExtractor: Self = this.set("keyExtractor", js.undefined)
    @scala.inline
    def setNumColumns(value: Double): Self = this.set("numColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumColumns: Self = this.set("numColumns", js.undefined)
  }
  
}

